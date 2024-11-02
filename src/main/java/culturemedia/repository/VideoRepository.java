package culturemedia.repository;

import java.util.List;
import culturemedia.model.Video;

public interface VideoRepository {
    List<Video> findAll();
    Video save(Video video);
    List<Video> findByTitle(String title);
    List<Video> findByDuration(Double fromDuration, Double toDuration);
}
