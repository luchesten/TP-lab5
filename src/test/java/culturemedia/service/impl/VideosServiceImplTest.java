package culturemedia.service.impl;

import java.util.List;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.repository.impl.VideoRepositoryImpl;
import culturemedia.repository.impl.ViewsRepositoryImpl;
import culturemedia.service.CulturemediaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import culturemedia.model.Video;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class VideosServiceImplTest {

    private CulturemediaService culturemediaService;

    @BeforeEach
    void init() {
        culturemediaService = new CulturemediaServiceImpl(new ViewsRepositoryImpl(),new VideoRepositoryImpl());
    }

    void saveVideos(){
        List<Video> videos = List.of(new Video("01", "Título 1", "----", 4.5),
                new Video("02", "Título 2", "----", 5.5),
                new Video("03", "Título 3", "----", 4.4),
                new Video("04", "Título 4", "----", 3.5),
                new Video("05", "Clic 5", "----", 5.7),
                new Video("06", "Clic 6", "----", 5.1));


        for (Video video : videos) {
            culturemediaService.save(video);
        }
    }
    @Test
    void when_FindAll_all_videos_should_be_returned_successfully() throws VideoNotFoundException {
        saveVideos();
        List<Video> videos = culturemediaService.findAll();
        assertEquals(6, videos.size());
    }

    @Test
    void when_FindAll_does_not_find_any_video_an_VideoNotFoundException_should_be_thrown_successfully() {
        assertThrows(VideoNotFoundException.class, () -> {
            culturemediaService.findAll();
        });
    }
}
