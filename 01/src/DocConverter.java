public abstract class DocConverter {
    private String ext;

    public DocConverter(String extension) {
        ext = extension;
    }

    public String getExtension() {
        return ext;
    }

    public void save(String fileName) { }
}

