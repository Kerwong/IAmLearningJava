package command;

import command.command.AddFunctionCommand;
import command.command.Command;
import command.command.DesignNewPageCommand;

/**
 * Project: IAmLearningJava
 * Comments: <对此类的描述，可以引用系统设计中的描述>
 * JDK Version Used: JDK 1.8
 * Author: Wang Wenchao
 * Create Date: 2016-8-22 20:28
 * Version: <版本号>
 * *************************************
 * Modified By: <修改人中文名或拼音缩写>
 * Modified Date：<修改日期，格式:YYYY-MM-DD>
 * Reason：<修改原因描述>
 * Version：<版本号>
 */

public class Client {
	public static void main(String[] args) {
		Invoker teamLeader = new Invoker();
		System.out.println("==== add a function ===");
		Command addCommand = new AddFunctionCommand();
		teamLeader.setCommand(addCommand);
		teamLeader.action();

		System.out.println("==== design a new page ===");
		Command designCommand = new DesignNewPageCommand();
		teamLeader.setCommand(designCommand);
		teamLeader.action();
	}
}
