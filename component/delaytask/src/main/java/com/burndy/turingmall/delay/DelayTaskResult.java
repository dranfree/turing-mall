package com.burndy.turingmall.delay;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * @author RanYeah
 * @since 2022/9/30
 */
@Getter
@Builder
@ToString
public class DelayTaskResult {

    private final String taskId;

    private final String payload;

    private final boolean success;
}
