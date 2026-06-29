package SOLID;

public class MainExporter {
    private final Notifier notifier;
    private final Auditer auditer;
    private final Exporter exporter;

    MainExporter(Notifier notifier,  Auditer auditer, Exporter exporter) {
        this.notifier = notifier;
        this.auditer = auditer;
        this.exporter = exporter;
    }

    void export(String data){
        this.exporter.export(data);
        this.auditer.auditLog();
        this.notifier.notifyUser();
    }
}

class Notifier {
    void notifyUser(){
        System.out.println("Notifier");
    }
}

class Auditer {
    void auditLog(){
        System.out.println("Audit Called");
    }
}

interface Exporter {
    void export(String data);
}

class ExcelExporter implements Exporter {
    @Override
    public void export(String data) {
        System.out.println("Excel Export Called" + data);
    }
}

class MyExporter implements Exporter {
    @Override
    public void export(String data) {
        System.out.println("Export Called"+ data );
    }
}

class PDFExporter implements Exporter {
    @Override
    public void export(String data) {
        System.out.println("PDF Export Called" +  data);
    }
}

class CSVExporter implements Exporter {
    @Override
    public void export(String data) {
        System.out.println("CSV Export Called"+ data);
    }
}