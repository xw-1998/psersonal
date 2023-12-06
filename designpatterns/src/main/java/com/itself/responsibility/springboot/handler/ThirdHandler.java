package com.itself.responsibility.springboot.handler;

import com.itself.responsibility.springboot.Handler;
import com.itself.responsibility.springboot.HandlerRequest;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * @Author duJi
 * @Date 2023/12/06
 */
@Slf4j
public class ThirdHandler implements Handler {
    private Handler handler;
    @Override
    public void handleRequest(HandlerRequest request) {
        //自身业务处理
        log.info("third handler");
        if (request.getCount() < 5) {
            request.setContent(request.getCount() * 6);
        }
        //判断是否有下一处理节点
        if (Objects.nonNull(handler)){
            log.info("next handler");
            handler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.handler = nextHandler;
    }
}
