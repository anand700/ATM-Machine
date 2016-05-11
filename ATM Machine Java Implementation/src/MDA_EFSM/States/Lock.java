package MDA_EFSM.States;

import MDA_EFSM.MDA_EFSM;

public class Lock extends State{
MDA_EFSM me = null;
	
	public Lock(MDA_EFSM me) {
		this.me = me;
	}
	@Override
		public void unlock() {
			// TODO Auto-generated method stub
			super.unlock();
			me.setState(me.getS1());
		}
	
	@Override
		public void IncorrectUnlock() {
			// TODO Auto-generated method stub
			super.IncorrectUnlock();
			me.o.incorrectUnLockMsg();
		}
}
