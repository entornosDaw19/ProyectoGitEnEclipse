
public class Bienvenido {

	public static void main(String[] args) {
		
		if (args.length==0)
		{
			System.out.println("No hay parametros ");
		}
			else
			{
				System.out.println("Bienvenido "+args[0]);
				for (int i=1;i<args.length;i++)
				{
					System.out.println(" "+args[i]);
	
				}
				System.out.println("PROGRAMA TERMINADO ");
				
			}
		}
	}