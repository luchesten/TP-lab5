package culturemedia.service.impl;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.model.View;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.ViewsRepository;
import culturemedia.service.CulturemediaService;

import java.util.ArrayList;
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
        if (videos.isEmpty()) {
            throw new VideoNotFoundException();
        } else {
            return videos;
        }
    }

    @Override
    public Video save(Video video) {
        videoRepository.save(video);
        return video;
    }

    @Override
    public View save(View view) {
        viewsRepository.save(view);
        return view;
    }

    public List<Video> findByTitle(String title) throws VideoNotFoundException {
        List<Video> videos = videoRepository.findAll();
        List<Video> matchingVideos = new ArrayList<>();
        for (Video video : videos) {
            if (video.title().toLowerCase().contains(title.toLowerCase())) {
                matchingVideos.add(video);
            }
        }
        if(matchingVideos.isEmpty()) {
            throw new VideoNotFoundException(title);
        }
        return matchingVideos;
    }

    public List<Video> findByDuration(Double duration) throws VideoNotFoundException {
        List<Video> videos = videoRepository.findAll();
        List<Video> savedVideos = new ArrayList<>();
        for (Video video : videos) {
            if (video.duration().equals(duration)) {
                savedVideos.add(video);
            }
        }
        if (savedVideos.isEmpty()){
            throw new VideoNotFoundException();
        }
        return savedVideos;
    }
}
