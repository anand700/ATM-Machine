package MDA_EFSM.States;

import MDA_EFSM.MDA_EFSM;

public class Suspend extends State{
MDA_EFSM me = null;
	
	public Suspend(MDA_EFSM me) {
		this.me = me;
	}
	
	@Override
		public void close() {
			// TODO Auto-generated method stub
			super.close();
			me.setState(me.getStart());
		}
	
	@Override
		public void balance() {
			// TODO Auto-generated method stub
			super.balance();
			me.o.displayBalance();
		}
	@Override
		public void Activate() {
			// TODO Auto-generated method stub
			super.Activate();
			me.setState(me.getReady());
		}
}
