package by.htp.less.oop1;

public class File {

	private String fileName;
	private String fileContent;
	private int fileSize;

	public File() {

	}

	public File(String fileName, String fileContent) {
		super();
		this.fileName = fileName;
		this.fileContent = fileContent;
		this.fileSize = fileContent.length();
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileContent() {
		return fileContent;
	}

	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}

	public int getFileSize() {
		return fileSize;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fileContent == null) ? 0 : fileContent.hashCode());
		result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
		result = prime * result + fileSize;
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
		File other = (File) obj;
		if (fileContent == null) {
			if (other.fileContent != null)
				return false;
		} else if (!fileContent.equals(other.fileContent))
			return false;
		if (fileName == null) {
			if (other.fileName != null)
				return false;
		} else if (!fileName.equals(other.fileName))
			return false;
		if (fileSize != other.fileSize)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[fileName=" + fileName + ", fileContent=" + fileContent + ", fileSize=" + fileSize + "]";
	}


}
