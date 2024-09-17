/**
 * Классы сложного стороннего фреймворка конвертации видео. Мы не контролируем этот код, поэтому не можем его упростить.
 */
public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }

    public String getCodecType() {
        return codecType;
    }

    public String getName() {
        return name;
    }
}