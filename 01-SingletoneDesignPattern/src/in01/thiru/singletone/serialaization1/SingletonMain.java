package in01.thiru.singletone.serialaization1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonMain {
	
	public static void main(String[] args) throws Exception {
		
	SingletonDesignPattern instance1 = SingletonDesignPattern.getInstance();
	SingletonDesignPattern instance2 = SingletonDesignPattern.getInstance();
	SingletonDesignPattern instance3 = SingletonDesignPattern.getInstance();
	SingletonDesignPattern instance4 = SingletonDesignPattern.getInstance();
	SingletonDesignPattern instance5 = SingletonDesignPattern.getInstance();
	
	System.out.println(instance1.hashCode());
	System.out.println(instance2.hashCode());
	System.out.println(instance3.hashCode());
	System.out.println(instance4.hashCode());
	System.out.println(instance5.hashCode());
	
	
	//Serialaization  NOTE :: FOW
	FileOutputStream fos=new FileOutputStream("C:\\Users\\hp\\Desktop\\thiru.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(instance1);
	System.out.println("serialazation is completed");
	oos.close();
    fos.close();
	
	//Deserialaization  NOTE ::FOR
	
	FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\thiru.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Object readObject = ois.readObject();
	SingletonDesignPattern sdp=(SingletonDesignPattern)readObject;
	System.out.println(sdp.name);
	System.out.println(sdp.hashCode());
	System.out.println("here hash code is different so we can break singleton design principle");
	
	
	
	
	
	
	
	}

}
