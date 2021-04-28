package com.marcos.unab.negocio;



import com.marcos.unab.DAO.ClsBeneficiario;
import com.marcos.unab.Entidades.Usuario;

public class ClsConsultaDUI {
	
	
	
	public int consulta(Usuario usua) {
		int validacion = 0;
		ClsBeneficiario clsDui = new ClsBeneficiario();
		var revisar = clsDui.Confirmar(usua);
		
		if(revisar == true) {
			validacion = 1;
		}
		return validacion;
		
		
	}
	
}
