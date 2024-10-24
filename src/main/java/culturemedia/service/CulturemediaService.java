package culturemedia.service;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.model.View;

import java.util.List;

public interface CulturemediaService {
    List<Video> findAll() throws VideoNotFoundException;
    Video save(Video video);
    View save(View view);
    List<Video> findByDuration(Double duration) throws VideoNotFoundException;
    List<Video> findByTitle(String title) throws VideoNotFoundException;
}
