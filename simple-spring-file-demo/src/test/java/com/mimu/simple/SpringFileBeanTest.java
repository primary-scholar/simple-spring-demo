package com.mimu.simple;

import com.alibaba.fastjson.JSONObject;
import com.mimu.simple.spring.bean.lifecycle.ClassBean;
import com.mimu.simple.spring.bean.cycledependency.ConstructorCycleDependencyAB_A;
import com.mimu.simple.spring.bean.cycledependency.ConstructorCycleDependencyAB_B;
import com.mimu.simple.spring.bean.cycledependency.NoneConstructorCycleDependencyAB_A;
import com.mimu.simple.spring.bean.cycledependency.NoneConstructorCycleDependencyAB_B;
import com.mimu.simple.spring.bean.factorybean.ModelDemoFactoryBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringFileBeanTest {

    @Test
    public void beanCycleDependency_name_test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println(JSONObject.toJSON(beanDefinitionNames));

    }

    /**
     * 对于 singleton 的实例解析，spring 不能解决 构造函数的循环依赖
     */
    @Test
    public void beanCycleDependency_constructor_test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(applicationContext.getBean(ConstructorCycleDependencyAB_A.class));
        System.out.println(applicationContext.getBean(ConstructorCycleDependencyAB_B.class));
    }

    /**
     * 对于 singleton 的实例解析，spring 可以解决 get set 方法的循环依赖
     */
    @Test
    public void beanCycleDependency_test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(applicationContext.getBean(NoneConstructorCycleDependencyAB_A.class));
        System.out.println(applicationContext.getBean(NoneConstructorCycleDependencyAB_B.class));
    }

    /**
     * 对于 非 singleton 的实例解析，spring 不能解决 get set 方法的循环依赖
     */
    @Test
    public void beanCycleDependency_prototype_test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(applicationContext.getBean("noneConstructorCycleDependencyAB_A_P"));
        System.out.println(applicationContext.getBean("noneConstructorCycleDependencyAB_B_P"));
    }

    @Test
    public void beanCycleDependency_factory_bean_test() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        ModelDemoFactoryBean bean = applicationContext.getBean("&modelDemoFactoryBean", ModelDemoFactoryBean.class);
        System.out.println(JSONObject.toJSON(bean));
        System.out.println(JSONObject.toJSON(bean.getObject()));
    }

    @Test
    public void beanCycleDependency_life_cycle_test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        ClassBean classBean = applicationContext.getBean(ClassBean.class);
        System.out.println(JSONObject.toJSON(classBean));
    }

}
