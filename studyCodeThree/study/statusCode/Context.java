package statusCode;
/**
 * »·¾³
 * @author hello
 *
 */
public class Context {
	State state,stateOne,stateTwo,stateNull;
	
	public Context() {
		stateTwo = new StateTwo(this);
		stateOne = new StateOne(this);
		stateNull = new StateNull(this);
		state = stateTwo;
	}
	
	public void fire(){
		state.fire();
	}
	
	public void loadBullet(){
		state.loadBullet();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getStateOne() {
		return stateOne;
	}

	public void setStateOne(State stateOne) {
		this.stateOne = stateOne;
	}

	public State getStateTwo() {
		return stateTwo;
	}

	public void setStateTwo(State stateTwo) {
		this.stateTwo = stateTwo;
	}

	public State getStateNull() {
		return stateNull;
	}

	public void setStateNull(State stateNull) {
		this.stateNull = stateNull;
	}
	
}
