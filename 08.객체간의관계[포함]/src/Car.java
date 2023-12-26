public class Car {
	private int no;      //차량번호
	private String model;//차량모델명
	private  Engine engine; //엔진객체주소를 저장할 멤버필드	
	public Car() {
	}
	public Car(int no, String model, Engine engine) {
		this.no = no;
		this.model = model;
		this.engine = engine;
	}
	
	public void print() {
		System.out.print(no+"\t"+model+"\t");
		engine.print();
	}
	//getter setter
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	public Engine getEngine() {
		return this.engine;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
