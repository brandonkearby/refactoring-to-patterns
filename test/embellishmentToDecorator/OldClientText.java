package embellishmentToDecorator;

import refactorings.embellishmentToDecorator.HtmlContextBuilder;
import refactorings.embellishmentToDecorator.HtmlDoc;

/**
 * @author Brandon Kearby
 *         January 05, 2016
 */
public class OldClientText {

    public static void main(String[] args) {
        new OldClientText().test();
    }
    public void test() {
        HtmlDoc html = new HtmlDoc(new HtmlContextBuilder().bold(true).italic(false).strikeout(true).text("foo").createHtmlContext());
        System.out.println("html = " + html);


    }

}
