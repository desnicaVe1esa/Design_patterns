/**
 * Приложение не зависит от сложного фреймворка конвертации видео. Кстати, если вы вдруг решите сменить фреймворк, вам
 * нужно будет переписать только класс фасада.
 */
public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}