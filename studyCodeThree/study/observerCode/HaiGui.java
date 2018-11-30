package observerCode;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class HaiGui implements Observer {
	Subject subject;
	File myFile;

	HaiGui(Subject subject, String fileName) {
		this.subject = subject;
		subject.addObserver(this); // ʹ��ǰʵ����Ϊsubject�����õľ�������Ĺ۲���
		myFile = new File(fileName);
	}

	@Override
	public void hearTelPhone(String heardMess) {
		try {
			boolean boo = heardMess.contains("java����Ա") || heardMess.contains("���");
			if (boo) {
				RandomAccessFile out = new RandomAccessFile(myFile, "rw");
				out.seek(out.length());
				byte[] b = heardMess.getBytes();
				out.write(b);
				System.out.print("����һ������,");
				System.out.println("�����ļ�" + myFile.getName() + "д����������:");
				System.out.println(heardMess);
			} else {
				System.out.println("���Ǻ���,��ε���Ϣ��û������Ҫ����Ϣ");
			}
		} catch (IOException exp) {
			System.out.println(exp.toString());
		}
	}

}
