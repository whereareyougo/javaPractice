package observerCode;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * ����۲���--- ��ѧ��
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
	        out.write(b);                               //�����ļ��е�����
	        System.out.print("����һ����ѧ��,"); 
	        System.out.println("�����ļ�"+myFile.getName()+"д����������:");
	        System.out.println(mString); 
	   }
	   catch(IOException exp){
	       System.out.println(exp.toString());
	   }

	}

}
