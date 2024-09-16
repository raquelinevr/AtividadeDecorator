package com.decorator;

public class Main {
    public static void main(String[] args) {
        DataSource source = new CompressionDecorator(
            new EncryptionDecorator(new FileDataSource("OutputDemo.txt"))
        );

        String text = "Olá, atividade";
        
        source.writeData(text);
        String readData = source.readData();
        
        System.out.println("Data read from file: " + readData);
    }
}
