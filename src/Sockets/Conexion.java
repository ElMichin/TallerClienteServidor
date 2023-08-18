package Sockets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Conexion {


	private final int PUERTO = 8000; 
	private final String HOST = "127.0.0.1"; 
	
	protected String mensajeServidor; 
	protected ServerSocket ss; 
	protected Socket cs;
	protected DataOutputStream salidadSerivdor;
	protected DataOutputStream salidadCliente; 
	
	public Conexion(String tipo) {
		
		if (tipo.equals("servidor")) {
			//La conexion es un servidor
			try {
				ss = new ServerSocket(PUERTO);
			} catch (IOException e) {
				e.printStackTrace();
			}
			cs = new Socket();
		}else {
			//La conexion del cliente
				try {
					cs = new Socket(HOST, PUERTO);
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
