package markup;

import java.util.List;

public class Emphasis implements MarkdownElement {
    private final List<MarkdownElement> elements;

    public Emphasis(List<MarkdownElement> elements) {
        this.elements = elements;
    }

    @Override
    public void toMarkdown(StringBuilder sb) {
        sb.append("*");
        for (MarkdownElement el: elements) {
            el.toMarkdown(sb);
        }
        sb.append("*");
    }
}