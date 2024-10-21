package markup;

import java.util.List;

public class Strong implements MarkdownElement {
    private final List<MarkdownElement> elements;

    public Strong(List<MarkdownElement> elements) {
        this.elements = elements;
    }

    @Override
    public void toMarkdown(StringBuilder sb) {
        sb.append("__");
        for (MarkdownElement el: elements) {
            el.toMarkdown(sb);
        }
        sb.append("__");
    }
}