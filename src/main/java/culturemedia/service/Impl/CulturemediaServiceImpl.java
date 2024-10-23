package culturemedia.service.Impl;

import culturemedia.model.Video;
import culturemedia.model.View;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.ViewsRepository;
import culturemedia.service.CulturemediaService;

import java.util.List;

public class CulturemediaServiceImpl implements CulturemediaService {

    private VideoRepository videoRepository;
    private ViewsRepository viewsRepository;

    @Override
    public List<Video> findAll(){
        return videoRepository.findAll();
    }
    @Override
    public Video save(Video video){
        videoRepository.save(video);
        return video;
    }
    @Override
    public View save(View view){
        viewsRepository.save(view);
        return view;
    }
}
