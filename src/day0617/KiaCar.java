package day0617;

public class KiaCar implements Car{
    private final String engine;
    private final double naviPrice;
    private final String tier;

    public KiaCar(String engine, double naviPrice, String tier) {
        this.engine = engine;
        this.naviPrice = naviPrice;
        this.tier = tier;
    }

    @Override
    public String showEngine() {
        return this.engine;
    }

    @Override
    public double amountNavi() {
        return this.naviPrice;
    }

    @Override
    public String getTier() {
        return this.tier;
    }
}
