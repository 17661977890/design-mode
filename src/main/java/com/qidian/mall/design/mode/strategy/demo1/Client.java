package com.qidian.mall.design.mode.strategy.demo1;

/**
 * 简单策略模式
 * @Author binsun
 * @Date
 * @Description
 */
public class Client {


    public static void main(String[] args) {

        // 具体使用什么策略， 可以通过前端传参数，可以利用枚举或者 注入Map 来获取对应的策略类
        /**
         *   注入抽线策略接口
         *   @Resource(name = "executorServices")
         *   private Map<String, IExecutorService> executorServices;
         *
         *  具体策略实现类
         *   @Service("xdbconvert")
         *  public class XdbConvertServiceImpl extends AbstractExecutorService
         *
         *  策略抽象类（实现策略接口）
         *  public abstract class AbstractExecutorService implements IExecutorService
         *
         *   // 根据任务类型获取对应的任务 （taskType 就是 @Service("xdbconvert") 注解里的value）
         *   IExecutorService executor = executorServices.get(taskType);
         */
        Strategy strategyA = new SmsStrategy();
        Strategy strategyB = new EmailStrategy();
        Strategy strategyC = new PushMesStrategy();

        // 将不同得具体策略类传入 环境类， 实现不同得发送消息方式
        Context context = new Context(strategyA);
        Context context1 = new Context(strategyB);
        Context context2 = new Context(strategyC);
        context.sendMessage();
        context1.sendMessage();
        context2.sendMessage();


    }
}
