package observerCode;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * 具体观察者--- 大学生
 * @author hello
 *
 */
public class UniversityStudent implements Observer {
	Subject subject;
	File myFile;
	
	public UniversityStudent(Subject subject, String fileName) {
		this.subject = subject;
		subject.addObserver(this);
		myFile = new File(fileName);
	}

	@Override
	public void hearTelPhone(String mString) {
		try{ RandomAccessFile out=new RandomAccessFile(myFile,"rw");  
	        out.seek(out.length());
	        byte [] b=mString.getBytes();
	        out.write(b);                               //更新文件中的内容
	        System.out.print("我是一个大学生,"); 
	        System.out.println("我向文件"+myFile.getName()+"写入如下内容:");
	        System.out.println(mString); 
	   }
	   catch(IOException exp){
	       System.out.println(exp.toString());
	   }

	}

}
