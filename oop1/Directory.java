package by.htp.less.oop1;


import java.util.ArrayList;
import java.util.List;

public class Directory {

	private String directoryName;
	private List<File> directory = new ArrayList<File>();

	public Directory() {

	}

	public Directory(String directoryName) {

		this.directoryName = directoryName;
		this.directory = null;

	}

	public Directory(String directoryName, File newFile) {

		this.directoryName = directoryName;
		this.directory.add(newFile);

	}

	public Directory(String directoryName, List<File> directory) {
		super();
		this.directoryName = directoryName;
		this.directory = directory;
	}

	public String getDirectoryName() {
		return directoryName;
	}

	public void setDirectoryName(String directoryName) {
		this.directoryName = directoryName;
	}

	public List<File> getDirectory() {
		return directory;
	}

	public void setDirectory(List<File> directory) {
		this.directory = directory;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((directory == null) ? 0 : directory.hashCode());
		result = prime * result + ((directoryName == null) ? 0 : directoryName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directory other = (Directory) obj;
		if (directory == null) {
			if (other.directory != null)
				return false;
		} else if (!directory.equals(other.directory))
			return false;
		if (directoryName == null) {
			if (other.directoryName != null)
				return false;
		} else if (!directoryName.equals(other.directoryName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Directory [directoryName=" + directoryName + ", directory=" + directory + "]";
	}


}
