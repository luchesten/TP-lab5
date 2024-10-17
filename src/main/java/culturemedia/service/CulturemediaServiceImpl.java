package culturemedia.service;

import culturemedia.model.Video;
import culturemedia.model.View;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.ViewsRepository;

import java.util.List;

public class CulturemediaServiceImpl implements CulturemediaService{

    private VideoRepository videoRepository;
    private ViewsRepository viewsRepository;

    @Override
    public List<Video> findAll(){
        return videoRepository.findAll();
    }
    @Override
    public Video save(Video save){
        videoRepository.save(save);
        return save;
    }
    @Override
    public View save(View save){
        viewsRepository.save(save);
        return save;
    }
}
