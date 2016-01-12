package refactorings.embellishmentToDecorator;

public class HtmlContextBuilder {
    private boolean bold;
    private boolean italic;
    private boolean strikeout;
    private String text;

    public HtmlContextBuilder bold(boolean bold) {
        this.bold = bold;
        return this;
    }

    public HtmlContextBuilder italic(boolean italic) {
        this.italic = italic;
        return this;
    }

    public HtmlContextBuilder strikeout(boolean strikeout) {
        this.strikeout = strikeout;
        return this;
    }

    public HtmlContextBuilder text(String text) {
        this.text = text;
        return this;
    }

    public HtmlContext createHtmlContext() {
        return new HtmlContext(bold, italic, strikeout, text);
    }
}