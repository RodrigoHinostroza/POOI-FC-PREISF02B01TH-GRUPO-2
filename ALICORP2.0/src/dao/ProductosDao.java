/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import dto.ProductosDTO;
import database.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ARMANDO GUERRA
 */
public class ProductosDao {
    
     public List<ProductosDTO> ListarBOL(String valor) throws Exception {
        List<ProductosDTO> listaBOL = new ArrayList<>();
        Connection con = Conexion.getConnection();
        ResultSet rs ;
        PreparedStatement ps;
       if ("".equalsIgnoreCase(valor)) {
                String sql = "SELECT idProductos, nombreProducto, almacen, marca, stock, peso, precio, fechaCaducidad, img FROM productos WHERE marca='Bolivar' ORDER BY idProductos ASC";
                ps = con.prepareStatement(sql);
       }else {  
                String sql = "SELECT idProductos, nombreProducto, almacen, marca, stock, peso, precio, fechaCaducidad, img FROM productos WHERE marca='Bolivar' AND nombreProducto LIKE '%" + valor.trim() + "%'";
                ps = con.prepareStatement(sql);
       }
               rs = ps.executeQuery();
            while (rs.next()) {
                ProductosDTO producto = new ProductosDTO();
                producto.setIdProductos(rs.getInt("idProductos"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setAlmacen(rs.getString("almacen"));
                producto.setMarca(rs.getString("marca"));
                producto.setStock(rs.getString("stock"));
                producto.setPeso(rs.getString("peso"));
                producto.setPrecio(rs.getFloat("precio"));
                producto.setFechaCaducidad(rs.getString("fechaCaducidad"));
                producto.setImg(rs.getBytes("img"));
                listaBOL.add(producto);
            
        }
        return listaBOL;
}
       public List<ProductosDTO> ListarDV(String valor) throws Exception {
        List<ProductosDTO> listaDV = new ArrayList<>();
        Connection con = Conexion.getConnection();
        ResultSet rs ;
        PreparedStatement ps;
       if ("".equalsIgnoreCase(valor)) {
                String sql = "SELECT idProductos, nombreProducto, almacen, marca, stock, peso, precio, fechaCaducidad, img FROM productos WHERE marca='Don Vittorio' ORDER BY idProductos ASC";
                ps = con.prepareStatement(sql);
       }else {  
                String sql = "SELECT idProductos, nombreProducto, almacen, marca, stock, peso, precio, fechaCaducidad, img FROM productos WHERE marca='Don Vittorio' AND nombreProducto LIKE '%" + valor.trim() + "%'";
                ps = con.prepareStatement(sql);
       }
               rs = ps.executeQuery();
            while (rs.next()) {
                ProductosDTO producto = new ProductosDTO();
                producto.setIdProductos(rs.getInt("idProductos"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setAlmacen(rs.getString("almacen"));
                producto.setMarca(rs.getString("marca"));
                producto.setStock(rs.getString("stock"));
                producto.setPeso(rs.getString("peso"));
                producto.setPrecio(rs.getFloat("precio"));
                producto.setFechaCaducidad(rs.getString("fechaCaducidad"));
                producto.setImg(rs.getBytes("img"));
                listaDV.add(producto);
            
        }
        return listaDV;
}
       public List<ProductosDTO> ListarMR(String valor) throws Exception {
        List<ProductosDTO> listaMR = new ArrayList<>();
        Connection con = Conexion.getConnection();
        ResultSet rs ;
        PreparedStatement ps;
       if ("".equalsIgnoreCase(valor)) {
                String sql = "SELECT idProductos, nombreProducto, almacen, marca, stock, peso, precio, fechaCaducidad, img FROM productos WHERE marca='Marsella' ORDER BY idProductos ASC";
                ps = con.prepareStatement(sql);
       }else {  
                String sql = "SELECT idProductos, nombreProducto, almacen, marca, stock, peso, precio, fechaCaducidad, img FROM productos WHERE marca='Marsella' AND nombreProducto LIKE '%" + valor.trim() + "%'";
                ps = con.prepareStatement(sql);
       }
               rs = ps.executeQuery();
            while (rs.next()) {
                ProductosDTO producto = new ProductosDTO();
                producto.setIdProductos(rs.getInt("idProductos"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setAlmacen(rs.getString("almacen"));
                producto.setMarca(rs.getString("marca"));
                producto.setStock(rs.getString("stock"));
                producto.setPeso(rs.getString("peso"));
                producto.setPrecio(rs.getFloat("precio"));
                producto.setFechaCaducidad(rs.getString("fechaCaducidad"));
                producto.setImg(rs.getBytes("img"));
                listaMR.add(producto);
            
        }
        return listaMR;
}
       public List<ProductosDTO> ListarPR(String valor) throws Exception {
        List<ProductosDTO> listaPR = new ArrayList<>();
        Connection con = Conexion.getConnection();
        ResultSet rs ;
        PreparedStatement ps;
       if ("".equalsIgnoreCase(valor)) {
                String sql = "SELECT idProductos, nombreProducto, almacen, marca, stock, peso, precio, fechaCaducidad, img FROM productos WHERE marca='Primor' ORDER BY idProductos ASC";
                ps = con.prepareStatement(sql);
       }else {  
                String sql = "SELECT idProductos, nombreProducto, almacen, marca, stock, peso, precio, fechaCaducidad, img FROM productos WHERE marca='Primor' AND nombreProducto LIKE '%" + valor.trim() + "%'";
                ps = con.prepareStatement(sql);
       }
               rs = ps.executeQuery();
            while (rs.next()) {
                ProductosDTO producto = new ProductosDTO();
                producto.setIdProductos(rs.getInt("idProductos"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setAlmacen(rs.getString("almacen"));
                producto.setMarca(rs.getString("marca"));
                producto.setStock(rs.getString("stock"));
                producto.setPeso(rs.getString("peso"));
                producto.setPrecio(rs.getFloat("precio"));
                producto.setFechaCaducidad(rs.getString("fechaCaducidad"));
                producto.setImg(rs.getBytes("img"));
                listaPR.add(producto);
            
        }
        return listaPR;
}
        public List<ProductosDTO> Listartodo() throws Exception {
        List<ProductosDTO> listatodo = new ArrayList<>();
        Connection con = Conexion.getConnection();
        ResultSet rs ;
        PreparedStatement ps;
                String sql = "SELECT * FROM productos WHERE fechaCaducidad > CURDATE() AND fechaCaducidad <= DATE_ADD(CURDATE(), INTERVAL 60 DAY) ORDER BY fechaCaducidad ASC";
                ps = con.prepareStatement(sql);
               rs = ps.executeQuery();
            while (rs.next()) {
                ProductosDTO producto = new ProductosDTO();
                producto.setIdProductos(rs.getInt("idProductos"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setAlmacen(rs.getString("almacen"));
                producto.setMarca(rs.getString("marca"));
                producto.setStock(rs.getString("stock"));
                producto.setPeso(rs.getString("peso"));
                producto.setPrecio(rs.getFloat("precio"));
                producto.setFechaCaducidad(rs.getString("fechaCaducidad"));
                listatodo.add(producto);
            
        }
        return listatodo;
}
}
