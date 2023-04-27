package fyRPG.services;

public class D20RollService {

    public int rolarD20() {
        return (int)Math.floor(Math.random() * 20);
    }
}
