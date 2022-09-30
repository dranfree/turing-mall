package com.burndy.turingmall.lock;

import java.util.function.Supplier;

/**
 * 分布式锁客户端
 *
 * @author RanYeah
 * @since 2022/9/30
 */
public interface DistributeLockClient {

    default void lock(String lockKey, long waitTime, long holdTime) {
        if (!tryLock(lockKey, waitTime, holdTime)) {
            throw new DistributeLockException();
        }
    }

    boolean tryLock(String lockKey, long waitTime, long holdTime);

    void unlock();

    <R> R execute(String lockKey, long waitTime, long holdTime, Supplier<R> action);

    default void execute(String lockKey, long waitTime, long holdTime, Runnable action) {
        execute(lockKey, waitTime, holdTime, () -> {
            action.run();
            return null;
        });
    }
}
