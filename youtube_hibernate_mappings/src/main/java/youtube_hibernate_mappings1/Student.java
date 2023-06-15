package youtube_hibernate_mappings1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	private int marks;
	
	/* @OneToOne
	private Laptop loptop; */
	
	//@OneToMany(mappedBy="student")       //--->this is for onetomany and manytoone
	
	@ManyToMany(mappedBy="student")
	private List<Laptop> loptop=new ArrayList<Laptop>();
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	public List<Laptop> getLoptop() {
		return loptop;
	}
	public void setLoptop(List<Laptop> loptop) {
		this.loptop = loptop;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
