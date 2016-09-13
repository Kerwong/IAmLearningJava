package facede;

/**
 * Project: IAmLearningJava
 * Comments: <对此类的描述，可以引用系统设计中的描述>
 * JDK Version Used: JDK 1.8
 * Author: Wang Wenchao
 * Create Date: 2016-9-5 17:23
 * Version: <版本号>
 * *************************************
 * Modified By: <修改人中文名或拼音缩写>
 * Modified Date：<修改日期，格式:YYYY-MM-DD>
 * Reason：<修改原因描述>
 * Version：<版本号>
 */

public class Computer {
	private CPU cpu = new CPU();
	private Memory memory = new Memory();
	private HardDriver hardDriver = new HardDriver();

	public void start() {
		cpu.jump();
		hardDriver.read();
		memory.load();
		cpu.execute();
	}
}
