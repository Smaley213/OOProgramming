package by.htp.less.oop1;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {

		LogicF logicFile = new LogicF();
		ViewF fileView = new ViewF();
		LogicD logicDirectory = new LogicD();
		ViewD directoryView = new ViewD();

		File newTextFile = logicFile.createTextFile("Text-1", " Hi my Friend ");
		File newTextFile2 = logicFile.createTextFile("Text-2", " It is my life ");

		fileView.printContent(newTextFile);

		logicFile.addContent(newTextFile, " a good Day ");

		fileView.printContent(newTextFile);

		logicFile.renameFile(newTextFile, " World ");

		fileView.printContent(newTextFile);

		Directory newDirectory = logicDirectory.createDirectory(" my life ");

		List<File> list = new ArrayList<File>();

		list.add(newTextFile);
		list.add(newTextFile2);

		logicDirectory.addFileToDirectory(newDirectory, list);

		directoryView.printDirectory(newDirectory);

		logicDirectory.deleteFileFromDirectory(newDirectory, newTextFile);

		directoryView.printDirectory(newDirectory);

		logicDirectory.renameDirectory(newDirectory, " how are you ?");

		directoryView.printDirectory(newDirectory);

	}

}
