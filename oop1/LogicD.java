package by.htp.less.oop1;

import java.util.List;

public class LogicD {
	
    public Directory createDirectory(String directoryName) {
		
		Directory newDirectory = new Directory(directoryName);
		
		return newDirectory;
		
	}
	
	public Directory renameDirectory(Directory directory, String newNameDirectory) {
		
		directory.setDirectoryName(newNameDirectory);
		
		return directory;
	}
	
	public Directory addFileToDirectory(Directory directory, List<File> list) {
		
		directory.setDirectory(list);
		
		return directory;
		
	}
	
	public Directory deleteFileFromDirectory(Directory directory, File file) {
		
		directory.getDirectory().removeIf(p -> file.equals(p));
		
		return directory;
		
	}

}
