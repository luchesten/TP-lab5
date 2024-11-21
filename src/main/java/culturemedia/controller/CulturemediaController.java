package culturemedia.controller;

import java.util.List;
import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.service.CulturemediaService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class CulturemediaController {

    CulturemediaService culturemediaService;

    public CulturemediaController(CulturemediaService culturemediaService) {
        this.culturemediaService = culturemediaService;
    }

    @GetMapping("/videos")
    public List<Video> findAllVideos() throws VideoNotFoundException {
        List<Video> videos = culturemediaService.findAll();
            return videos;
    }
    @PostMapping("/videos")
    public Video save(@RequestBody Video video){
        culturemediaService.save(video);
        return video;
    }
}