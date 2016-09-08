package facede;

/**
 * Project: IAmLearningJava
 * Comments: <对此类的描述，可以引用系统设计中的描述>
 * JDK Version Used: JDK 1.8
 * Author: Wang Wenchao
 * Create Date: 2016-9-5 17:38
 * Version: <版本号>
 * *************************************
 * Modified By: <修改人中文名或拼音缩写>
 * Modified Date：<修改日期，格式:YYYY-MM-DD>
 * Reason：<修改原因描述>
 * Version：<版本号>
 */

public class Client {
	private Computer computer = new Computer();

	public Computer getComputer() {
		return computer;
	}

	public static void main(String[] args) {
		Client client = new Client();
		Computer computer = client.getComputer();
		computer.start();
	}

}



