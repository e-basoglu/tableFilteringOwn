package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TableViewFilterController {

    @FXML
    private TableView<MyData> tableView;

    @FXML
    private TableColumn<MyData, String> columnA;

    @FXML
    private TableColumn<MyData, String> columnB;

    @FXML
    private TableColumn<MyData, String> columnC;

    @FXML
    private TableColumn<MyData, String> columnD;

    @FXML
    private TableColumn<MyData, String> columnE;

    @FXML
    private TextField filterA;

    @FXML
    private TextField filterB;

    @FXML
    private TextField filterC;

    @FXML
    private TextField filterD;

    @FXML
    private TextField filterE;

    private ObservableList<MyData> data;

    @FXML
    public void initialize() {
        // Initialize the columns to use the properties from MyData
        columnA.setCellValueFactory(cellData -> cellData.getValue().columnAProperty());
        columnB.setCellValueFactory(cellData -> cellData.getValue().columnBProperty());
        columnC.setCellValueFactory(cellData -> cellData.getValue().columnCProperty());
        columnD.setCellValueFactory(cellData -> cellData.getValue().columnDProperty());
        columnE.setCellValueFactory(cellData -> cellData.getValue().columnEProperty());

        // Set up initial data
        data = FXCollections.observableArrayList(
                new MyData("A1", "B1", "C1", "D1", "E1"),
                new MyData("A2", "B2", "C2", "D2", "E2"),
                new MyData("A3", "B3", "C3", "D3", "E3"),
                new MyData("A4", "B4", "C4", "D4", "E4"),
                new MyData("A5", "B5", "C5", "D5", "E5"),
                new MyData("A6", "B6", "C6", "D6", "E6"),
                new MyData("A7", "B7", "C7", "D7", "E7"),
                new MyData("A8", "B8", "C8", "D8", "E8"),
                new MyData("A9", "B9", "C9", "D9", "E9"),
                new MyData("A10", "B10", "C10", "D10", "E10")
        );

        // Bind TextField widths to their respective TableColumn widths
        filterA.prefWidthProperty().bind(columnA.widthProperty());
        filterB.prefWidthProperty().bind(columnB.widthProperty());
        filterC.prefWidthProperty().bind(columnC.widthProperty());
        filterD.prefWidthProperty().bind(columnD.widthProperty());
        filterE.prefWidthProperty().bind(columnE.widthProperty());

        // Wrap data in a FilteredList
        FilteredList<MyData> filteredData = new FilteredList<>(data, p -> true);

        // Add listeners to filter fields to filter data dynamically
        filterA.textProperty().addListener((obs, oldVal, newVal) -> {
            filteredData.setPredicate(myData -> {
                if (newVal == null || newVal.isEmpty()) return true;
                return myData.getColumnA().toLowerCase().contains(newVal.toLowerCase());
            });
        });

        filterB.textProperty().addListener((obs, oldVal, newVal) -> {
            filteredData.setPredicate(myData -> {
                if (newVal == null || newVal.isEmpty()) return true;
                return myData.getColumnB().toLowerCase().contains(newVal.toLowerCase());
            });
        });

        filterC.textProperty().addListener((obs, oldVal, newVal) -> {
            filteredData.setPredicate(myData -> {
                if (newVal == null || newVal.isEmpty()) return true;
                return myData.getColumnC().toLowerCase().contains(newVal.toLowerCase());
            });
        });

        filterD.textProperty().addListener((obs, oldVal, newVal) -> {
            filteredData.setPredicate(myData -> {
                if (newVal == null || newVal.isEmpty()) return true;
                return myData.getColumnD().toLowerCase().contains(newVal.toLowerCase());
            });
        });

        filterE.textProperty().addListener((obs, oldVal, newVal) -> {
            filteredData.setPredicate(myData -> {
                if (newVal == null || newVal.isEmpty()) return true;
                return myData.getColumnE().toLowerCase().contains(newVal.toLowerCase());
            });
        });

        // Bind the filtered data to the TableView
        tableView.setItems(filteredData);
    }
}
