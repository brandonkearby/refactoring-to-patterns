package refactorings.embellishmentToDecorator.refactored;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Brandon Kearby
 *         January 05, 2016
 */
public abstract class Element {
    private String tag;

    private List<Element> childElements = Collections.emptyList();

    protected Element(String tag) {
        this.tag = tag;
    }

    public Element add(String text) {
        return add(new Text(text));
    }

    public Element add(Element element) {
        if (childElements.equals(Collections.emptyList())) {
            childElements = new ArrayList<Element>();
        }
        childElements.add(element);
        return element;
    }

    public String toHtml() {
        StringBuilder html = new StringBuilder();
        html.append("<").append(tag).append(">");
        for (Element children : this.childElements) {
            html.append(children.toHtml());
        }
        html.append("</").append(tag).append(">");
        return html.toString();
    }

    @Override
    public String toString() {
        return toHtml();
    }

    public Element bold() {
        return add(new Bold());
    }

    public Element italic() {
        return add(new Italic());
    }

    public Element strike() {
        return add(new Strike());
    }

    public Element text(String text) {
        return add(new Text(text));
    }
}
