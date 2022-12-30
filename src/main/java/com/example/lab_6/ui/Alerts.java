package com.example.lab_6.ui;

import javafx.scene.control.Alert;

public class Alerts {
    private static final Alert illegalArgument = new Alert(Alert.AlertType.WARNING,
            "Неккоректые аргументы точки!");
    private static final Alert unselectedPoint = new Alert(Alert.AlertType.WARNING,
            "Выберите точку для данной операции!");

    private static final Alert unsavedChanges = new Alert(Alert.AlertType.WARNING,
            "Внесённые вами изменения не были сохранены!");

    private static final Alert comingSoon = new Alert(Alert.AlertType.INFORMATION,
            "Данный функционал находится в разработке");
    private static final Alert indexOutOfBounds = new Alert(Alert.AlertType.ERROR,
            "Выход за границу дозволенного диапазона точек!");
    private static final Alert illegalState = new Alert(Alert.AlertType.WARNING,
            "Слишком мало точек!");
    private static final Alert inappropriatePoint = new Alert(Alert.AlertType.WARNING,
            "Точка не входит в диапазон, определяемый её соседями!");

    static {
        illegalArgument.setTitle("Некорректный аргумент");
        unselectedPoint.setTitle("Неизвестная цель");
        unsavedChanges.setTitle("Несохранённые изменения");
        comingSoon.setTitle("Уже скоро (возможно :D)");
        indexOutOfBounds.setTitle("Выход за границы");
        illegalState.setTitle("Невалидное состояние");
        inappropriatePoint.setTitle("Неуместная точка");
    }

    public static void showIllegalArgument() {
        illegalArgument.showAndWait();
    }

    public static void showUnselectedPoint() {
        unselectedPoint.showAndWait();
    }

    public static void showUnsavedChanges() {
        unsavedChanges.showAndWait();
    }

    public static void showComingSoon() {
        comingSoon.showAndWait();
    }

    public static void showIndexOutOfBounds() {
        indexOutOfBounds.showAndWait();
    }

    public static void showIllegalState() {
        illegalState.showAndWait();
    }

    public static void showInappropriatePoint() {
        inappropriatePoint.showAndWait();
    }

}
