package homework.javaoopch15;

import java.util.Scanner;

public class CP {
	private int[] cpnum = new int[7];
	private int xz;
	Scanner scanner = new Scanner(System.in);

	public CP() {

		System.out.println("\n请输入彩票生成方式  1：随机生成   2：自定义");
		//int i = scanner.nextInt();
		int i=1;
		switch (i) {
		case 1:
			suiji();
			break;
		case 2:
			diy();
			break;
		default:
			System.out.println("输入有误");
			break;
		}
	}

	public void suiji() {
		for (int i = 0; i < cpnum.length - 1; i++) {
			while (true) {
				int x = (int) Math.round(Math.random() * (32) + 1);
				int y = 0;
				for (; y < i + 1; y++) {
					if (cpnum[y] == x) {
						break;
					}
				}
				if (y - 1 == i && cpnum[y - 1] != x) {
					cpnum[y - 1] = x;
					break;
				}
			}
		}
		cpnum[cpnum.length - 1] = (int) Math.round(Math.random() * (15) + 1);
	}

	public void diy() {
		for (int i = 0; i < cpnum.length - 1; i++) {
			while (true) {
				System.out.println("请输入红球号码 1-33");
				int x = scanner.nextInt();
				int y = 0;
				for (; y < i + 1; y++) {
					if (cpnum[y] == x) {
						System.out.println("有重复的号码 请重新输入：");			
						break;
					}					
				}
				if (y - 1 == i && cpnum[y - 1] != x) {
					cpnum[y - 1] = x;
					break;
				}
			}
		}
		System.out.println("请输入蓝球号码 1-16");
		cpnum[cpnum.length - 1] = scanner.nextInt();
		
	}

	public boolean check() {
		for (int i = 0; i < cpnum.length - 1; i++) {
			if (cpnum[i] < 1 || cpnum[i] > 33 || cpnum[cpnum.length - 1] < 1 || cpnum[cpnum.length - 1] > 16) {
				return false;
			}
		}
		return true;
	}

	public int[] getCpnum() {
		return cpnum;
	}

	public void setCpnum(int[] cpnum) {
		this.cpnum = cpnum;
	}

	public int getXz() {
		return xz;
	}

	public void setXz(int xz) {
		this.xz = xz;
	}

}
