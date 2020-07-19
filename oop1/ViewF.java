package by.htp.less.oop1;

public class ViewF {

	public void printContent(File file) {

		System.out.println(
				file.getFileName() + " file size = " + file.getFileSize() + " file content: " + file.getFileContent());

	}

}
