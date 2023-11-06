package com.sample.videostream.service;

import org.springframework.core.io.Resource;
import reactor.core.publisher.Mono;

public interface VideoStreamingService {

	public Mono<Resource> getVideo(String title);	
}
