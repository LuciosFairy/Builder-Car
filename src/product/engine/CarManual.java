package product.engine;

public class CarManual {
    private String content;

    public static String getContent() {
        return content;
    }

    public static void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CarManual{" +
                "content='" + content + '\'' +
                '}';
    }
}
