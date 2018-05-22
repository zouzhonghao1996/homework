package homework.javaoopch15;

public class CPShop {
	static int[] zjhm = new int[7];

	public static double duiJiang(CP cp) {
		int red = 0;
		int blue = 0;
		CPShop.kaiJiang();
		int[] cpnum = cp.getCpnum();
		for (int i = 0; i < 6; i++) {
			for (int y = 0; y < 6; y++) {
				if (zjhm[i] == cpnum[y]) {
					red++;
				}
			}
		}
		if (zjhm[6] == cpnum[6]) {
			blue++;
		}
		if (red == 6 && blue == 1) {
			System.out.println("恭喜你中了10000000元！");
			return 10000000;
		} else if (red == 6) {
			System.out.println("恭喜你中了5000000元！");
			return 5000000;
		} else if (red == 5 && blue == 1) {
			System.out.println("恭喜你中了3000元！");
			return 3000;
		} else if (red == 4 && blue == 1) {
			System.out.println("恭喜你中了200元！");
			return 200;
		} else if ((red == 3 && blue == 1) || red == 4) {
			System.out.println("恭喜你中了10元！");
			return 10;
		} else if (0 < red && red < 3 && blue == 1) {
			System.out.println("恭喜你中了5元！");
			return 5;
		}
		return 0;
	}

	public static void kaiJiang() {
		for (int i = 0; i < zjhm.length - 1; i++) {
			while (true) {
				int x = (int) Math.round(Math.random() * (32) + 1);
				int y = 0;
				for (; y < i + 1; y++) {
					if (zjhm[y] == x) {
						break;
					}
				}
				if (y - 1 == i && zjhm[y - 1] != x) {
					zjhm[y - 1] = x;
					break;
				}
			}
		}
		zjhm[zjhm.length - 1] = (int) Math.round(Math.random() * (15) + 1);
	}
}
