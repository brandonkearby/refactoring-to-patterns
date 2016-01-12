package refactorings.embellishmentToDecorator;

/**
 * @author Brandon Kearby
 *         January 05, 2016
 */
public class HtmlDoc {
    private boolean bold;
    private boolean italic;
    private boolean strikeout;

    private String text;

    public HtmlDoc(HtmlContext htmlContext) {
        this.bold = htmlContext.isBold();
        this.italic = htmlContext.isItalic();
        this.strikeout = htmlContext.isStrikeout();
        this.text = htmlContext.getText();
    }

    public String toHtml() {
        StringBuilder builder = new StringBuilder("<html>");

        if (bold) {
            builder.append("<b>");
        }
        if (italic) {
            builder.append("<i>");
        }
        if (strikeout) {
            builder.append("<strike>");
        }
        builder.append(text);
        if (strikeout) {
            builder.append("</strike>");
        }
        if (italic) {
            builder.append("</i>");
        }
        if (bold) {
            builder.append("</b>");
        }
        builder.append("</html>");
        return builder.toString();
    }

    @Override
    public String toString() {
        return toHtml();
    }
}
