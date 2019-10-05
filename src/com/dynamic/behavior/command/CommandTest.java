package com.dynamic.behavior.command;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.command
 * @Date 2019/10/2 10:27
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class CommandTest {
    public static void main(String[] args) {
        AbstractReceiver receiver2 = new Receiver2();
        AbstractReceiver receiver = new Receiver();

        Command command = new ConcreteCommandA(receiver);
        ConcreteCommandB commandB = new ConcreteCommandB(receiver2);

        Invoker invoker = new Invoker(command);
        invoker.invoke();

        command.setAbstractReceiver(receiver2);
        invoker.invoke();
        System.out.println("***************");
        invoker.setCommand(commandB);
        invoker.invoke();

    }
}
