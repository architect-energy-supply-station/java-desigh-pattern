package com.dynamic.behavior.command;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.command
 * @Date 2019/10/2 10:25
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class ConcreteCommandA extends Command{


    public ConcreteCommandA(AbstractReceiver abstractReceiver) {
        super(abstractReceiver);
    }

    @Override
    void execute() {
    super.abstractReceiver.action();
    }
}
