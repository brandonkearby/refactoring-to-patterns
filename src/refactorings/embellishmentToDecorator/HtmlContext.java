package refactorings.embellishmentToDecorator;

public class HtmlContext {
    private final boolean bold;
    private final boolean italic;
    private final boolean strikeout;
    private final String text;

    public HtmlContext(boolean bold, boolean italic, boolean strikeout, String text) {
        this.bold = bold;
        this.italic = italic;
        this.strikeout = strikeout;
        this.text = text;
    }

    public boolean isBold() {
        return bold;
    }

    public boolean isItalic() {
        return italic;
    }

    public boolean isStrikeout() {
        return strikeout;
    }

    public String getText() {
        return text;
    }
}
