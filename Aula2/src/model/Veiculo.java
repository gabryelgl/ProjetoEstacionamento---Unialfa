package model;

public class Veiculo {
	
	private int id, age, typeVehicleId;
	private String plate, mark;
		
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setTypeVehicleId(int typeVehicleId) {
		this.typeVehicleId = typeVehicleId;
	}
	
	public int getTypeVehicleId() {
		return typeVehicleId;
	}
	
	public void setPlate(String plate) {
		this.plate = plate;
	}
	
	public String getPlate() {
		return plate;
	}
	
	public void setMark(String mark) {
		this.mark = mark;
	}
	
	public String getMark() {
		return mark;
	}
	
}