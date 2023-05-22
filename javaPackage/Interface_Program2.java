package javaPackage;

	interface Drawable {
		
		void draw();
	}

		  class Rectangle implements Drawable
		{
			 public void draw()
			{
				System.out.println("Drawning Rectangle");
			}
		}
		  class Circle  implements Drawable
		 {
			 public void draw()
			 {
				 System.out.println("Drawning Cricle");
			
			}
		}
		 class Interface_Program2
		 {
		 public static void main(String[] args) {
			
			 Drawable i = new Circle();
				i.draw();
				 Drawable i1 = new Rectangle();
				 i1.draw();
}
		 }
