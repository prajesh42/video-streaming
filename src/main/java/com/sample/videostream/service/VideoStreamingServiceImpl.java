package com.sample.videostream.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class VideoStreamingServiceImpl implements VideoStreamingService {

	private static final String FORMAT="classpath:video/%s.mp4";
	
	@Autowired
	private ResourceLoader resourceLoader;
	
	@Override
	public Mono<Resource> getVideo(String title) {
		return Mono.fromSupplier(()-> resourceLoader.getResource(String.format(FORMAT,title)));
	}

}
