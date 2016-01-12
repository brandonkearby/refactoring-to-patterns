package refactorings.embellishmentToDecorator.refactored;

/**
 * @author Brandon Kearby
 *         January 05, 2016
 */
public class Text extends Element {
    private String text;

    public Text(String text) {
        super("unused");
        this.text = text;
    }

    @Override
    public String toHtml() {
        return text;
    }
}
