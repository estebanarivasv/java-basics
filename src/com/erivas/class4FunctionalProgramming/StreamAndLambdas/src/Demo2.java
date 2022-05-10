public class Demo2 {

	public static void main(String[] args) {
		InterfaceFuncionalEjemplo ifunc = new InterfaceFuncionalEjemplo() {
			
			@Override
			public double process(int a, int b, int c) {
				
				return a * b * c;
			}
		};
		
		InterfaceFuncionalEjemplo ifunc2 = (x, y, z) -> x * y * z;
		
		
		System.out.println(ifunc.process(5, 6, 7));
		System.out.println(ifunc2.process(5, 6, 7));
	}

}
