/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frames1.repository;

import com.frames1.model.CarroModel;
import com.frames1.util.ConectorHibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Felipe
 */
public class CarroRepository {
    
    // método de excluir, editar, buscar por nome, buscar por id, buscar todos.
    
    public void salvar(CarroModel carroModel){
    // ação de me conectar ao banco e salvar os dados de carro na tablea carro.
        Session ses = ConectorHibernateUtil.getSessionFactory().openSession();
        Transaction tr = ses.beginTransaction();
        
        ses.save(carroModel);
        
        tr.commit();
        ses.close();
    }
    
}
