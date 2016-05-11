package MDA_EFSM.States;

import MDA_EFSM.MDA_EFSM;

public class Start extends State{
MDA_EFSM me = null;
	
	public Start(MDA_EFSM me) {
		this.me = me;
	}
	
	@Override
		public void open() {
			// TODO Auto-generated method stub
			super.open();
			me.setState(me.getIdle());
			me.o.storeData();
		}
}
