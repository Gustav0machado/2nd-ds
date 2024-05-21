
public class ClientePremium extends Cliente {
	@Override
	public double calcDesc() {
		 return super.getValPe() * 0.15;
		
		 
	}
	@Override
		public double valCDesc() {
		
		return super.getValPe() -(super.getValPe()*0.15)  ;
		 			 
	}

}
