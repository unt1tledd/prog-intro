package markup;

import java.util.List;

public class Paragraph implements MarkdownElement {
    private final List<MarkdownElement> elements;

    public Paragraph(List<MarkdownElement> elements) {
        this.elements = elements;
    }

    @Override
    public void toMarkdown(StringBuilder sb) {
        for (MarkdownElement el: elements) {
            el.toMarkdown(sb);
        }
    }
}