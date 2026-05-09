package DesignPatterns.适配器模式;

public class PrinterAdapter implements Printer{
    private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter){
        this.oldPrinter = oldPrinter;
    }
    @Override
    public void print() {
        this.oldPrinter.printText();
    }
}
