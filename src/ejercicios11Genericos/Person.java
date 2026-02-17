package ejercicios11Genericos;
public class Person {
	private String name;
    private int age;
    private float height;
    private String work;
    private float salary;
    public Person () {
    	this("unnamed",0,0.0f,"unemployment", 0f);
    }
    public Person (String name, int age, float height, String work, float salary) {
    	this.name = name;
    	this.age=age;
    	this.height=height;
    	this.work = work;
    	this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getAge() {
    	return age;
    }
    public float getHeight() {
    	return height;
    }
    public String getWork() {
    	return work;
    }
    public float getSalary() {
    	return salary;
    }
    public String toString() {
    	return String.format("El nombre de la persona es %s, su edad es %d, mide %.2fm, es %s y su salario es de %.2f€", name, age, height, work, salary);
    }
    
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age) {
    	this.age = age;
    }
    public void setHeight(float height) {
    	this.height = height;
    }
    public void setWork (String work) {
    	this.work = work;
    }
    public void setSalary (float salary) {
    	this.salary = salary;
    }
    public float addSalary (Person persona) {
    	salary+=persona.salary;
    	return salary;
    }
    public void doubleSalary () {
    	salary = addSalary(this);
    }
}