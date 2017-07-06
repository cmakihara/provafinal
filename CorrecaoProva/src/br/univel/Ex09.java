package br.univel;
enum Valid{
	A{
		@Override
		void calcular(int i) {
			System.out.println(i / 2);
			
		}
	},
	B{
		@Override
	void calcular(int i) {
		System.out.println(i / 3);
	}	
	};	
	abstract void calcular(int i);
}

public class Ex09 {
	public static void main(String[] args) {
		execute(169476);
	
	}
	private static void execute(Integer ii) {
		int idx = ii % 2;
		Valid v;
		if(idx == 0)
			v = Valid.A;
		else
			v = Valid.B;
		v.calcular(ii);
	}

}
