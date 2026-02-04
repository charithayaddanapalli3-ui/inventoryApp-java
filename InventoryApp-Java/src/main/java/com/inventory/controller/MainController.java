package com.inventory.controller;

import com.inventory.model.Product;
import com.inventory.util.HibernateUtil;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainController {

    @FXML private TextField nameField, descField, qtyField, priceField;

    @FXML
    public void saveProduct() {
        Product p = new Product();
        p.setName(nameField.getText());
        p.setDescription(descField.getText());
        p.setQuantity(Integer.parseInt(qtyField.getText()));
        p.setUnitprice(Double.parseDouble(priceField.getText()));

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(p);
        tx.commit();
        session.close();

        new Alert(Alert.AlertType.INFORMATION, "Product saved successfully!").show();
    }
}