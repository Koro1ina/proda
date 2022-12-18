package com.example.hystory;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {

    private ObservableList<HystoryVxod> history = FXCollections.observableArrayList();


    @FXML
    private TableView<HystoryVxod> table;
    @FXML
    private TableColumn<HystoryVxod, String> tableFIO;
    @FXML
    private TableColumn<HystoryVxod, String> tableVxod;


    @FXML
    private void initialize() {
        historyDate();

        // устанавливаем тип и значение которое должно хранится в колонке
        tableFIO.setCellValueFactory(new PropertyValueFactory<HystoryVxod, String>("FIO"));
        tableVxod.setCellValueFactory(new PropertyValueFactory<HystoryVxod, String>("hystory"));


        // заполняем таблицу данными
        table.setItems(history);
    }

    private void historyDate() {
        history.add(new HystoryVxod("Alex", "2020-20-20"));
        history.add(new HystoryVxod("Bob", "20-20-2002"));
    }



}