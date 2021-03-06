
public class main {

	public static void main(String[] args) {
        
        Unicon ricardo = Unicon.getSingletonInstance("Ricardo Moya");
        Unicon ramon = Unicon.getSingletonInstance("Ramón Invarato");
        
        try{
            Unicon richard = ricardo.clone();
            System.out.println(richard.getNombre());
        }catch (NullPointerException ex){
            ex.printStackTrace();
        }
        
        // ricardo y ramon son referencias a un único objeto de la clase SoyUnico
        System.out.println(ramon.getNombre());
        System.out.println(ricardo.getNombre());   
    }
}
