
public class Ejercicio12 {

	public static void main(String[] args) {
		int vpodemos =85;
		int vpsoe =78;
		int vpp = 35;
		int vciudadanos = 1;
		int vvox = 6;
		int vmp = (vpodemos/4);	
				int tizquierda = 0;
				int tderecha =0;
				double pizquierda= 0.0;
				double pderecha =0.0;
		            tizquierda = vpodemos+vpsoe+vmp;
				    tderecha = vpp+ vciudadanos +vvox;
				    pizquierda= (tizquierda*100)/(tizquierda+tderecha);
				    pderecha= (tderecha*100)/(tizquierda+tderecha);
		System.out.println("Votos izquierda="+tizquierda+"Votos derecha="+tderecha+"%izquierdas="+pizquierda+"%derechas="+pderecha);

	}

}
