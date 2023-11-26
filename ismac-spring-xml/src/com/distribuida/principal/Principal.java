package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ditribuida.entities.Cliente;
import com.ditribuida.entities.Factura;
import com.ditribuida.entities.FacturaDetalle;
import com.ditribuida.entities.Producto;

public class Principal {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Cliente cliente = context.getBean("beanCliente", Cliente.class);
		Cliente cliente2 = context.getBean("beanCliente2", Cliente.class);
		Cliente cliente3 = context.getBean("beanCliente3", Cliente.class);
		
		Producto producto = context.getBean("beanProducto", Producto.class);
		Producto producto2 = context.getBean("beanProducto2", Producto.class);
		Producto producto3 = context.getBean("beanProducto3", Producto.class);
		Producto producto4 = context.getBean("beanProducto4", Producto.class);
		Producto producto5 = context.getBean("beanProducto5", Producto.class);
		
		Factura factura = context.getBean("beanFactura", Factura.class);
		Factura factura2 = context.getBean("beanFactura2", Factura.class);
		
		FacturaDetalle facturadetalle = context.getBean("beanFacturaDetalle", FacturaDetalle.class);
		FacturaDetalle facturadetalle2 = context.getBean("beanFacturaDetalle", FacturaDetalle.class);	
		
		
		
		cliente.setIdCliente(1);
		cliente.setCedula("1722906787");
		cliente.setNombre("Mateo");
		cliente.setApellido("Maldonado");
		cliente.setEdad(18);
		cliente.setFechaNacimiento(new Date());
		cliente.setDireccion("Tumbaco");
		cliente.setTelefono("0988972345");
		cliente.setCorreo("MateoM@hotmail.com");
		
		cliente2.setIdCliente(2);
		cliente2.setCedula("17885678954");
		cliente2.setNombre("Micaela");
		cliente2.setApellido("Mesias");
		cliente2.setEdad(25);
		cliente2.setFechaNacimiento(new Date());
		cliente2.setDireccion("Guayaquil");
		cliente2.setTelefono("0987983843");
		cliente2.setCorreo("Micaela601@gmail.com");
		
		cliente3.setIdCliente(3);
		cliente3.setCedula("1744556789");
		cliente3.setNombre("Josue");
		cliente3.setApellido("Guevara");
		cliente3.setEdad(30);
		cliente3.setFechaNacimiento(new Date());
		cliente3.setDireccion("Ambato");
		cliente3.setTelefono("0967896786");
		cliente3.setCorreo("josue100@yahoo.com");
		
		factura.setIdFactura(1);
		factura.setNumFactura("FACT-1");
		factura.setFecha(new Date());
		factura.setTotalNeto(20.40);
		factura.setIva(0.12);
		factura.setTotal(20.52);
		
		factura2.setIdFactura(2);
		factura2.setNumFactura("FACT-2");
		factura2.setFecha(new Date());
		factura2.setTotalNeto(15.08);
		factura2.setIva(0.12);
		factura2.setTotal(15.2);
		
		producto.setIdProducto(1);
		producto.setNombre("Jugo de naranja");
		producto.setDescripcion("jugo de naranja en carton");
		producto.setPrecio(3.50);
		producto.setStock(25);
		
		producto2.setIdProducto(2);
		producto2.setNombre("Carne");
		producto2.setDescripcion("5 filetes de carne");
		producto2.setPrecio(7.60);
		producto2.setStock(10);
		
		producto3.setIdProducto(3);
		producto3.setNombre("Limon");
		producto3.setDescripcion("Funda de limon");
		producto3.setPrecio(1.00);
		producto3.setStock(70);
		
		producto4.setIdProducto(4);
		producto4.setNombre("Pan");
		producto4.setDescripcion(" 2 Baguette");
		producto4.setPrecio(3.00);
		producto4.setStock(45);
		
		producto5.setIdProducto(5);
		producto5.setNombre("Salasa de tomate");
		producto5.setDescripcion("un galon");
		producto5.setPrecio(4.50);
		producto5.setStock(6);
		
		
		facturadetalle.setIdFacturaDetalle(1);
		facturadetalle.setCantidad(7);
		facturadetalle.setFactura(factura);
		
		facturadetalle2.setIdFacturaDetalle(2);
		facturadetalle2.setCantidad(9);
		facturadetalle2.setFactura(factura2);
	
		System.out.println(factura.toString());
		System.out.println(facturadetalle.toString());
		System.out.println(factura2.toString());
		System.out.println(facturadetalle2.toString());
		
					
		context.close();

	}

}
