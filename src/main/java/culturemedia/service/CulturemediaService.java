package culturemedia.service;

import culturemedia.model.Video;
import culturemedia.model.View;

import java.util.List;

public interface CulturemediaService {
    List<Video> findAll();
    Video save(Video save);
    View save(View save);
}
