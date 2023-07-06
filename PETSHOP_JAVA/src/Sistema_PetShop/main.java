package Sistema_PetShop;
public class main {
	
	static Login login = Login.getInstance();
	static Usuarios usuarios = Usuarios.getInstance();
	
	public static void main(String[] args) {
		usuarios.adicionaUsuario("Henrique", "4516", "4516", "Gerente");
		login.exibeLogin();
	}
	
}