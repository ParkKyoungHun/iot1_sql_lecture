package com.iot1sql.lecture;

class Item {
	private String name;

	public Item(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class ExamTag {
	public static void passOne(Item item) {
		item.setName("SmartPhone");
	}

	public static void passTwo(Item item) {
		item.setName("NoteBook");
	}

	public static void main(String[] args) {
//		Item item = new Item("Car");
//		passOne(item);
//		System.out.print(item.getName() + "'");
//		passTwo(item);
//		System.out.print(item.getName());
	}

}
