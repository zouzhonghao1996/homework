package homework.javaoopch12;

public class Pet {
	private String name;
	private int age;
	private String gender;
	private String partner;

	public Pet(String name, int age, String gender, String partner) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.partner = partner;
	}

	public void canMarry(String name, String gender) {
		if (this.gender == gender) {
			System.out.println("同性不能结婚！");
		} else if (this.partner != null) {
			System.out.println("有配偶不能结婚！");
		} else if ((this.gender == "雄性" && this.age < 5) || (this.gender == "雌性" && this.age < 4)) {
			System.out.println("年龄未到不能结婚！");
		} else {
			System.out.println(this.name + "和" + name + "满足条件恭喜你们结婚！");
			this.partner = name;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

}
