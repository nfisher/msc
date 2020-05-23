package com.github.nfisher.msc.consumer;

import static com.github.nfisher.msc.proto.Metrics.Metric;

import java.time.Instant;

public class App {
    public static void main(String []args) {
        Metric.Builder builder = Metric.newBuilder();
        builder
            .setUid(543212345)
            .setTimestamp(Instant.now().toEpochMilli())
            .addValues(1.0)
            .addValues(2.0)
            .addValues(3.0);

        Metric metric = builder.build();

        System.out.println(metric.toString());
    }
}