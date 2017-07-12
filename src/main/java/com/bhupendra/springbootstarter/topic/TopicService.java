package com.bhupendra.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("spring", "spring framework","spring framework description"),
			new Topic("java", "Core Java", "Core Java description"),
			new Topic("js", "javascript", "javascript description")));

	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id){
	  return 	topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic){
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		// TODO Auto-generated method stub
		for(int i=0;i<topics.size(); i++){
			if(topics.get(i).getId().equals(id)){
				topics.set(i,topic);
				return;
			}
		}
		
		
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topics.removeIf(t -> t.getId().equals(id));
	}
	
	
	
}
