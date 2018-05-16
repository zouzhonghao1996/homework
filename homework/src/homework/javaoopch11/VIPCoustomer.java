package homework.javaoopch11;

public class VIPCoustomer extends Coustomer {

	private int level;

	public VIPCoustomer(String name, int level) {
		super(name);
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void touSu() {
		System.out.println("投诉信息：\nVIP" + level + "级别" + super.getName() + "先生/女士正在投诉中...");
	}
}
