package MDA_EFSM.States;

import MDA_EFSM.MDA_EFSM;

public class S1 extends State{
MDA_EFSM me = null;
	
	public S1(MDA_EFSM me) {
		this.me = me;
	}
	
	@Override
		public void WithdrawBelowMinBalance() {
			// TODO Auto-generated method stub
			super.WithdrawBelowMinBalance();
			me.o.penalty();
			me.setState(me.getOverdrawn());
		}
	
	@Override
		public void AboveMinBalance() {
			// TODO Auto-generated method stub
			super.AboveMinBalance();
			me.setState(me.getReady());
		}
	
	@Override
		public void BelowMinBalance() {
			// TODO Auto-generated method stub
			super.BelowMinBalance();
			me.setState(me.getOverdrawn());
		}
	
	
}
