/*
 * Copyright 2016-2021 Amdocs Software Systems Limited.
 *
 */

package com.kaviddiss.streamkafka.config;

import java.util.Collection;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.common.TopicPartition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.binder.kafka.KafkaBindingRebalanceListener;


public class LoggingChannelInterceptor implements KafkaBindingRebalanceListener {

	private static final Logger logger = LoggerFactory.getLogger(LoggingChannelInterceptor.class);


	@Override
	public void onPartitionsAssigned(String bindingName, Consumer<?, ?> consumer, Collection<TopicPartition> partitions,
			boolean initial) {
		logger.info("Hello from interceptors");
	}
}
