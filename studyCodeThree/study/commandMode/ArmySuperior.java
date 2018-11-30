package commandMode;

/**
 * «Î«Û’ﬂ(invoker)
 * @author hello
 *
 */
public class ArmySuperior {
	Commend commend;
	
	public ArmySuperior(Commend commend) {
		this.commend = commend;
	}
	
	public void startExcuteCommand(){
		commend.execute();
	}

	public Commend getCommend() {
		return commend;
	}

	public void setCommend(Commend commend) {
		this.commend = commend;
	}
	
	
	
}
