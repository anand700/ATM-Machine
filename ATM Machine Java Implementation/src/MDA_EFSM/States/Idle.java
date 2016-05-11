package MDA_EFSM.States;

import MDA_EFSM.MDA_EFSM;

public class Idle extends State{
	
	static final int defaultAttempts = 0;
MDA_EFSM me = null;
	
	public Idle(MDA_EFSM me) {
		this.me = me;
	}
	
	@Override
		public void IncorrectLogin() {
			// TODO Auto-generated method stub
			super.IncorrectLogin();
			me.o.incorrectIdMsg();
		}
	
	@Override
		public void Login() {
			// TODO Auto-generated method stub
			super.Login();
			me.noOfAttempts = defaultAttempts;
			me.o.promptForPin();
			me.setState(me.getCheckPin());
		}
}
