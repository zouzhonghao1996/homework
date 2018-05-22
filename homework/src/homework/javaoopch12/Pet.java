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

	public Pet(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;	
	}
	public static void canMarry(Pet pet1, Pet pet2) {
		if (pet1.gender == pet2.gender) {
			System.out.println("同性不能结婚！");
		} else if (pet1.partner != null && pet2.partner != null) {
			System.out.println("有配偶不能结婚！");
		} else if ((pet1.gender == "雄性" && pet1.age < 5) || (pet1.gender == "雌性" && pet1.age < 4)) {
			System.out.println("年龄未到不能结婚！");
		} else if ((pet2.gender == "雄性" && pet2.age < 5) || (pet2.gender == "雌性" && pet2.age < 4)) {
			System.out.println("年龄未到不能结婚！");
		} else {
			System.out.println(pet1.name + "和" + pet2.name + "满足条件恭喜你们结婚！");
			pet1.partner = pet2.name;
			pet2.partner = pet1.name;
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
