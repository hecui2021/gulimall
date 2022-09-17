package com.study.gulimall.product.exception;

import com.study.common.exception.BizCodeEnume;
import com.study.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice(basePackages = "com.study.gulimall.product.controller")
@Slf4j
public class GulimallExceptionControllerAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleVaildException(MethodArgumentNotValidException e){
        log.error("数据校验出现异常了:{}",e.getMessage());
        BindingResult result = e.getBindingResult();

        Map<String,String> map = new HashMap<>();
        if(result.hasErrors()){
            result.getFieldErrors().forEach(item -> {
                String defaultMessage = item.getDefaultMessage();
                String field = item.getField();
                map.put(field,defaultMessage);
            });
            return R.error(BizCodeEnume.VAILD_EXCEPTOION.getCode(),BizCodeEnume.VAILD_EXCEPTOION.getMessage()).put("data",map);
        }
        return R.error();
    }

    @ExceptionHandler(value = Throwable.class)
    public R handleException(Throwable e){
        return R.error(BizCodeEnume.UNKNOW_EXCEPTOION.getCode(), BizCodeEnume.UNKNOW_EXCEPTOION.getMessage());
    }
}
