package MDA_EFSM.States;

import MDA_EFSM.MDA_EFSM;

public class Ready extends State{
MDA_EFSM me = null;
	
	public Ready(MDA_EFSM me) {
		this.me = me;
	}
	@Override
		public void Deposit() {
			// TODO Auto-generated method stub
			super.Deposit();
			me.o.makeDeposit();
		}
	
	@Override
		public void balance() {
			// TODO Auto-generated method stub
			super.balance();
			me.o.displayBalance();
		}
	
	@Override
		public void withdraw() {
			// TODO Auto-generated method stub
			super.withdraw();
			me.o.makeWithdraw();
			if(me.acc == 1){
				me.setState(me.getS1());
			}else{
				me.setState(me.getReady());
			}
		}
	
	@Override
		public void lock() {
			// TODO Auto-generated method stub
			super.lock();
			me.setState(me.getLock());
		}
	
	@Override
		public void Nofunds() {
			// TODO Auto-generated method stub
			super.Nofunds();
			me.o.noFundMsg();
		}
	
	@Override
		public void Logout() {
			// TODO Auto-generated method stub
			super.Logout();
			me.setState(me.getIdle());
		}
	
	@Override
		public void IncorrectLock() {
			// TODO Auto-generated method stub
			super.IncorrectLock();
			me.o.incorrectLockMsg();
		}
	
	@Override
		public void Suspend() {
			// TODO Auto-generated method stub
			super.Suspend();
			me.setState(me.getSuspend());
		}
}
