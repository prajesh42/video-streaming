package com.sample.videostream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.sample.videostream.service.VideoStreamingService;

import reactor.core.publisher.Mono;

@RestController
public class VideoStreamingController {

	@Autowired
	private VideoStreamingService streamingService;
	
	@GetMapping(value = "video/{title}", produces = "video/mp4")
	public Mono<Resource> getStreamingVideo(@PathVariable String title, @RequestHeader("Range") String range){
		return streamingService.getVideo(title);
	}
}
