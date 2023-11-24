/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.UsuariosDto;
import database.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aguer
 */
public class UsuariosDao {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean login(String usuario, String clave) throws Exception {
        Boolean estado = false;
        UsuariosDto dto = null;
        Connection cn = Conexion.getConnection();

        String query = "SELECT * FROM usuario WHERE usuario = ?";
        PreparedStatement pstm = cn.prepareStatement(query);
        pstm.setString(1, usuario);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            dto = new UsuariosDto();
            dto.setClave(rs.getString("clave"));
            if (dto.getClave().equals(clave)) {
                estado = true;
            }
        }
        return estado;
    }

    public UsuariosDto consultarUsuario(String usuario) throws Exception {
        UsuariosDto dto = null;
        Connection cn = Conexion.getConnection();

        String query = "SELECT * FROM usuario WHERE usuario = ?";
        PreparedStatement pstm = cn.prepareStatement(query);
        pstm.setString(1, usuario);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            dto = new UsuariosDto();
            dto.setUsuario(rs.getString("usuario"));
            dto.setNombres(rs.getString("nombres"));
            dto.setApellidos(rs.getString("apellidos"));
            dto.setRol(rs.getString("rol"));

        }
        return dto;
    }

    public List Listar() throws Exception {
        List<UsuariosDto> lista = new ArrayList();
        Connection con = Conexion.getConnection();
        try {
            PreparedStatement ps;
            ResultSet rs;
            String sql = "SELECT * FROM usuario where rol=2 ORDER BY id DESC";
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();
            while (rs.next()) {
                UsuariosDto usu = new UsuariosDto();
                usu.setId(rs.getInt("id"));
                usu.setNombres(rs.getString("nombres"));
                usu.setApellidos(rs.getString("apellidos"));
                usu.setUsuario(rs.getString("usuario"));
                lista.add(usu);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista;
    }

    public boolean registrar(UsuariosDto usu) throws Exception {
        String sql = "INSERT INTO usuario(nombres, apellidos, usuario, clave, rol) VALUES (?, ?, ?, ?, ?)";
        Connection con = Conexion.getConnection();
        try {
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement(sql);
            ps.setString(1, usu.getNombres());
            ps.setString(2, usu.getApellidos());
            ps.setString(3, usu.getUsuario());
            ps.setString(4, usu.getClave()); 
            ps.setString(5, usu.getRol());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }

}
