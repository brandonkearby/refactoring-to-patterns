package embellishmentToDecorator;

import refactorings.embellishmentToDecorator.HtmlContextBuilder;
import refactorings.embellishmentToDecorator.HtmlDoc;
import refactorings.embellishmentToDecorator.refactored.Html;

/**
 * @author Brandon Kearby
 *         January 05, 2016
 */
public class NewClientText {

    public static void main(String[] args) {
        new NewClientText().newTest();
    }

    public void oldTest() {
        //html = <b><strike>foo</strike></b>
        HtmlDoc html = new HtmlDoc(new HtmlContextBuilder().bold(true).italic(false).strikeout(true).text("foo").createHtmlContext());
        System.out.println("html = " + html);


    }
    public void newTest() {
        Html html = new Html();
        html.bold().strike().text("foo");
        System.out.println("html = " + html);

    }

}
