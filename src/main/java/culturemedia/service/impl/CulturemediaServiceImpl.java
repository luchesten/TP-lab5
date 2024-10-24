package culturemedia.service.impl;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.model.View;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.ViewsRepository;
import culturemedia.service.CulturemediaService;

import java.util.List;

public class CulturemediaServiceImpl implements CulturemediaService {

    private VideoRepository videoRepository;
    private ViewsRepository viewsRepository;

    public CulturemediaServiceImpl(ViewsRepository viewsRepository, VideoRepository videoRepository) {
        this.viewsRepository = viewsRepository;
        this.videoRepository = videoRepository;
    }

    @Override
    public List<Video> findAll() throws VideoNotFoundException {
        List<Video> videos = videoRepository.findAll();
        if(videos.isEmpty()){
            throw new VideoNotFoundException();}
        else{
            return videos;
        }
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
