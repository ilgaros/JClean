package ru.khasang.jclean.module;

/**
 ����� � ������� ����� ���������� ���� � ���, ������� ���� �� �������� ��� ���,
 ��� ���������, ����� ���������� �����, ����� � ���� ������.
 */
public class JCFilePropertie {

    private boolean isMarked = false;
    private long size;
    private String path;
    private String fileType;

    public boolean isMarked() {
        return isMarked;
    }

    public void setIsMarked(boolean isMarked) {
        this.isMarked = isMarked;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}
