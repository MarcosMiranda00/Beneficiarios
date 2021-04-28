package com.marcos.unab.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.marcos.unab.ConexionBD.ConexionBD;
import com.marcos.unab.Entidades.Usuario;


public class ClsBeneficiario {
	
	ConexionBD conexion = new ConexionBD();
	Connection con = conexion.RetornarConexion();
	
	public boolean Confirmar (Usuario usu) {
		boolean confi = false;
		
		
		try {
			CallableStatement consulta = con.prepareCall("call SP_S_USUARIOS(?)");
			consulta.setString("pDUI", usu.getDUI());
			ResultSet resultado = consulta.executeQuery();
			while (resultado.next()) {
				confi = true;
				
			}
			
		} catch (Exception e) {
			System.out.println("");
			
		}
		
		return confi;
		
	}

}
