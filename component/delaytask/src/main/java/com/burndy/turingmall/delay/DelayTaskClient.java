package com.burndy.turingmall.delay;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * 延时任务客户端
 *
 * @author RanYeah
 * @since 2022/9/30
 */
public interface DelayTaskClient {

    DelayTaskResult schedule(String payload, long delayTime, TimeUnit timeUnit);

    CompletableFuture<DelayTaskResult> scheduleAsync(String payload, long delayTime, TimeUnit timeUnit);
}
