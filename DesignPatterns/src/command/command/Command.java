package command.command;

import command.recevier.DesignGroupReceiver;
import command.recevier.DevGroupReceiver;

/**
 * Project: IAmLearningJava
 * Comments: <对此类的描述，可以引用系统设计中的描述>
 * JDK Version Used: JDK 1.8
 * Author: Wang Wenchao
 * Create Date: 2016-8-22 20:23
 * Version: <版本号>
 * *************************************
 * Modified By: <修改人中文名或拼音缩写>
 * Modified Date：<修改日期，格式:YYYY-MM-DD>
 * Reason：<修改原因描述>
 * Version：<版本号>
 */

public abstract class Command {
	protected DevGroupReceiver dev = new DevGroupReceiver();
	protected DesignGroupReceiver design = new DesignGroupReceiver();

	public abstract void execute();
}
