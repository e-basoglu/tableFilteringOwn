//package com.example.demo;
//
//import javafx.application.Application;
//import javafx.beans.binding.Bindings;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.collections.transformation.FilteredList;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//public class TableViewFilterExample extends Application {
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        // Create the TableView
//        TableView<MyData> tableView = new TableView<>();
//
//        // Define columns
//        TableColumn<MyData, String> columnA = new TableColumn<>("Column A");
//        columnA.setCellValueFactory(cellData -> cellData.getValue().columnAProperty());
//        TableColumn<MyData, String> columnB = new TableColumn<>("Column B");
//        columnB.setCellValueFactory(cellData -> cellData.getValue().columnBProperty());
//        TableColumn<MyData, String> columnC = new TableColumn<>("Column C");
//        columnC.setCellValueFactory(cellData -> cellData.getValue().columnCProperty());
//        TableColumn<MyData, String> columnD = new TableColumn<>("Column D");
//        columnD.setCellValueFactory(cellData -> cellData.getValue().columnDProperty());
//        TableColumn<MyData, String> columnE = new TableColumn<>("Column E");
//        columnE.setCellValueFactory(cellData -> cellData.getValue().columnEProperty());
//
//        tableView.getColumns().addAll(columnA, columnB, columnC, columnD, columnE);
//
//        // Create filter fields for each column
//        TextField filterA = new TextField();
//        TextField filterB = new TextField();
//        TextField filterC = new TextField();
//        TextField filterD = new TextField();
//        TextField filterE = new TextField();
//
//        // Bind filter widths to columns
//        filterA.prefWidthProperty().bind(columnA.widthProperty());
//        filterB.prefWidthProperty().bind(columnB.widthProperty());
//        filterC.prefWidthProperty().bind(columnC.widthProperty());
//        filterD.prefWidthProperty().bind(columnD.widthProperty());
//        filterE.prefWidthProperty().bind(columnE.widthProperty());
//
//        // Set up the data
//        ObservableList<MyData> data = FXCollections.observableArrayList(
//                new MyData("A1", "B1", "C1", "D1", "E1"),
//                new MyData("A2", "B2", "C2", "D2", "E2"),
//                new MyData("A3", "B3", "C3", "D3", "E3"),
//                new MyData("A4", "B4", "C4", "D4", "E4"),
//                new MyData("A5", "B5", "C5", "D5", "E5"),
//                new MyData("A6", "B6", "C6", "D6", "E6"),
//                new MyData("A7", "B7", "C7", "D7", "E7"),
//                new MyData("A8", "B8", "C8", "D8", "E8"),
//                new MyData("A9", "B9", "C9", "D9", "E9"),
//                new MyData("A10", "B10", "C10", "D10", "E10")
//        );
//
//        // Wrap data in a FilteredList
//        FilteredList<MyData> filteredData = new FilteredList<>(data, p -> true);
//
//        // Add listeners to filter fields to filter data dynamically
//        filterA.textProperty().addListener((obs, oldVal, newVal) -> {
//            filteredData.setPredicate(myData -> {
//                if (newVal == null || newVal.isEmpty()) return true;
//                return myData.getColumnA().toLowerCase().contains(newVal.toLowerCase());
//            });
//        });
//
//        filterB.textProperty().addListener((obs, oldVal, newVal) -> {
//            filteredData.setPredicate(myData -> {
//                if (newVal == null || newVal.isEmpty()) return true;
//                return myData.getColumnB().toLowerCase().contains(newVal.toLowerCase());
//            });
//        });
//
//        filterC.textProperty().addListener((obs, oldVal, newVal) -> {
//            filteredData.setPredicate(myData -> {
//                if (newVal == null || newVal.isEmpty()) return true;
//                return myData.getColumnC().toLowerCase().contains(newVal.toLowerCase());
//            });
//        });
//
//        filterD.textProperty().addListener((obs, oldVal, newVal) -> {
//            filteredData.setPredicate(myData -> {
//                if (newVal == null || newVal.isEmpty()) return true;
//                return myData.getColumnD().toLowerCase().contains(newVal.toLowerCase());
//            });
//        });
//
//        filterE.textProperty().addListener((obs, oldVal, newVal) -> {
//            filteredData.setPredicate(myData -> {
//                if (newVal == null || newVal.isEmpty()) return true;
//                return myData.getColumnE().toLowerCase().contains(newVal.toLowerCase());
//            });
//        });
//
//        // Bind the filtered data to the TableView
//        tableView.setItems(filteredData);
//
//        // Layout: Place filter inputs above the table
//        HBox filterBox = new HBox(filterA, filterB, filterC, filterD, filterE);
//        filterBox.setSpacing(5);
//
//        // Add everything to a VBox
//        VBox vbox = new VBox(filterBox, tableView);
//        vbox.setSpacing(10);
//
//        // Set up the scene and show the stage
//        Scene scene = new Scene(vbox, 800, 600);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("TableView with Filters Example");
//        primaryStage.show();
//
//
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
