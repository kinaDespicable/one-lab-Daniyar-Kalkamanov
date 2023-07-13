package one.lab.firstpractice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Objects;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class News {

    private Long id;
    private String title;
    private String content;
    private LocalDate publishedAt;
    private User author; // Many-to-one
    private Topic topic; // Many-to-one

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof News news)) return false;
        return Objects.equals(id, news.id) &&
                Objects.equals(title, news.title) &&
                Objects.equals(content, news.content) &&
                Objects.equals(publishedAt, news.publishedAt) &&
                Objects.equals(author, news.author) &&
                Objects.equals(topic, news.topic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, content, publishedAt, author, topic);
    }
}