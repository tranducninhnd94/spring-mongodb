package com.example.demo.repository.predicate;

import com.example.demo.models.QTopic;
import com.querydsl.core.types.Predicate;

public class TopicPredicate {

	public static Predicate findAll(String nameTopic) {

		QTopic qTopic = new QTopic("topic");

		Predicate predicate = qTopic.name.eq(nameTopic);

		return predicate;
	}
}
