package MDA_EFSM.States;

import MDA_EFSM.MDA_EFSM;

public class Overdrawn extends State{
MDA_EFSM me = null;
	
	public Overdrawn(MDA_EFSM me) {
		this.me = me;
	}
	
	@Override
		public void Deposit() {
			// TODO Auto-generated method stub
			super.Deposit();
			me.o.makeDeposit();
			me.setState(me.getS1());
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
			me.o.noFundMsg();
		}
	@Override
		public void lock() {
			// TODO Auto-generated method stub
			super.lock();
			me.setState(me.getLock());
		}
	@Override
		public void Logout() {
			// TODO Auto-generated method stub
			super.Logout();
			me.setState(me.getIdle());
		}
	
}
