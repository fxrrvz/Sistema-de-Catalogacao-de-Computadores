/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Computador;

/**
 *
 * @author Lucas
 */
public class ComputadorDAO {
    
    public void create(Computador c){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO Computador VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, c.getIdComputador());
            stmt.setString(2, c.getTipo());
            stmt.setString(3, c.getSala());
            stmt.setString(4, c.getEmpresa());
            //componentes
            stmt.setBoolean(5, c.getPlacaMae());
            stmt.setBoolean(6, c.getHD());
            stmt.setBoolean(7, c.getPlacaRede());
            stmt.setBoolean(8, c.getRAM());
            stmt.setBoolean(9, c.getFonte());
            stmt.setBoolean(10, c.getPlacaVideo());
            stmt.setBoolean(11, c.getProcessador());
            stmt.setBoolean(12, c.getDrive());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    /**
     *
     * @return
     */
    
//cadastrar
    public List<Computador> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Computador> pc = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM computador");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                Computador computador = new Computador();
                
                computador.setIdComputador(rs.getString("idComputador"));
                computador.setTipo(rs.getString("Tipo"));
                computador.setEmpresa(rs.getString("Empresa"));
                computador.setSala(rs.getString("Sala"));
                computador.setPlacaMae(rs.getBoolean("PlacaMae"));
                computador.setHD(rs.getBoolean("HD"));
                computador.setPlacaRede(rs.getBoolean("PlacaRede"));
                computador.setRAM(rs.getBoolean("RAM"));
                computador.setFonte(rs.getBoolean("Fonte"));
                computador.setPlacaVideo(rs.getBoolean("PlacaVideo"));
                computador.setProcessador(rs.getBoolean("Processador"));
                computador.setDrive(rs.getBoolean("Drive"));
                pc.add(computador);                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ComputadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return pc;
        
    }

//deletar    
    public void delete(Computador c) {
    Connection con = ConnectionFactory.getConnection();

    PreparedStatement stmt = null;

    try{
        stmt = con.prepareStatement("DELETE FROM computador WHERE idComputador = ?");
        stmt.setString(1, c.getIdComputador());

        stmt.executeUpdate();

        JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
    }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Erro ao excluir: " + ex);
    }
}
    
//alterar
    public void update (Computador c) {

    Connection con = ConnectionFactory.getConnection();

    PreparedStatement stmt = null;

    try{
        stmt = con.prepareStatement("UPDATE computador set Tipo = ?, Empresa = ?, Sala = ? , PlacaMae = ?, HD=?, PlacaRede=?, RAM = ?, Fonte=?, PlacaVideo = ?, Processador=?, Drive=? where idComputador = ?");
        stmt.setString(1, c.getTipo());
            stmt.setString(3, c.getSala());
            stmt.setString(2, c.getEmpresa());
            //componentes
            stmt.setBoolean(4, c.getPlacaMae());
            stmt.setBoolean(5, c.getHD());
            stmt.setBoolean(6, c.getPlacaRede());
            stmt.setBoolean(7, c.getRAM());
            stmt.setBoolean(8, c.getFonte());
            stmt.setBoolean(9, c.getPlacaVideo());
            stmt.setBoolean(10, c.getProcessador());
            stmt.setBoolean(11, c.getDrive());
        stmt.setString(12, c.getIdComputador());

        stmt.executeUpdate();

        JOptionPane.showMessageDialog(null, "Atualizado com sucesso!"); 
    }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao atualizar:" + ex);
    }
}
   
//buscar
    public List<Computador> readForCod(String cod){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Computador> pc = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM computador WHERE idComputador LIKE ?");
            stmt.setString(1, "%"+cod+"%");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                Computador computador = new Computador();
                
                computador.setIdComputador(rs.getString("idComputador"));
                computador.setTipo(rs.getString("Tipo"));
                computador.setEmpresa(rs.getString("Empresa"));
                computador.setSala(rs.getString("Sala"));
                computador.setPlacaMae(rs.getBoolean("PlacaMae"));
                computador.setHD(rs.getBoolean("HD"));
                computador.setPlacaRede(rs.getBoolean("PlacaRede"));
                computador.setRAM(rs.getBoolean("RAM"));
                computador.setFonte(rs.getBoolean("Fonte"));
                computador.setPlacaVideo(rs.getBoolean("PlacaVideo"));
                computador.setProcessador(rs.getBoolean("Processador"));
                computador.setDrive(rs.getBoolean("Drive"));
                pc.add(computador);                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ComputadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return pc;
        
    }
    
}
