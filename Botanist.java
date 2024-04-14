package zooassignmentoop;

public class Botanist extends MaintenanceWorker {
    public Botanist(int staffId, String name, double salary, String maintenanceWorkType) {
        super(staffId, name, salary, maintenanceWorkType);
    }

    @Override
    public void describeMyJob() {
        FilePrinter.writeToFile(" I water plants.\n");
    }
}
