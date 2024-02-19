package com.example.springcore.xml;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.DeferredImportSelector;

import java.util.ArrayList;
import java.util.List;

public class BeanProcessor implements BeanPostProcessor, BeanFactoryAware, DisposableBean {

    private BeanFactory beanFactory;
    private List<Object> prototypeBeans = new ArrayList<>();
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void destroy() throws Exception {
      for(Object bean:prototypeBeans){
          if(bean instanceof DisposableBean disposableBean) disposableBean.destroy();
      }
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanFactory.isPrototype(beanName)) prototypeBeans.add(bean);
        return bean;
    }
}
