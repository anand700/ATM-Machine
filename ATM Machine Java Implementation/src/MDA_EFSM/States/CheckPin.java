package MDA_EFSM.States;

import MDA_EFSM.MDA_EFSM;

public class CheckPin extends State{
	
	MDA_EFSM me = null;
	
	public CheckPin(MDA_EFSM me) {
		this.me = me;
	}
	
	@Override
	public void CorrectPinBelowMin() {
		// TODO Auto-generated method stub
		super.CorrectPinBelowMin();
		me.o.displayMenu();
		me.setState(me.getOverdrawn());
	}
	@Override
	public void CorrectPinAboveMin() {
		// TODO Auto-generated method stub
		super.CorrectPinAboveMin();
		me.o.displayMenu();
		me.setState(me.getReady());
	}
	
	public void IncorrectPin(int max) {
		// TODO Auto-generated method stub
		super.IncorrectPin(max);
		if(me.noOfAttempts >= max ){
    		me.o.incorrectPinMsg();
    		me.o.tooManyAttemptsMsg();
    		me.setState(me.getIdle());
    	}else if( me.noOfAttempts < max ){
    		me.noOfAttempts++;
    		me.o.incorrectPinMsg();
    	}
	}
}


