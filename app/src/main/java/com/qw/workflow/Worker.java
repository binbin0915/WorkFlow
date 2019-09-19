package com.qw.workflow;

/**
 * @author cd5160866
 * @date 2019-09-03
 */
public interface Worker {

    /**
     * 执行任务
     *
     * @param current 当前节点
     */
    void doWork(Node current);

}