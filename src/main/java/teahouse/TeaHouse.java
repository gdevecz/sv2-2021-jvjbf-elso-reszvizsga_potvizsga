package teahouse;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TeaHouse {

    private String name;

    private List<Tea> teas = new ArrayList<>();

    private LocalTime openTime;

    private LocalTime closeTime;

    public TeaHouse(String name, LocalTime open, LocalTime close) {
        this.name = name;
        this.openTime = open;
        this.closeTime = close;
        addTea(new Tea("Kamillavirágzat", 1256, Sort.HERBAL_TEA));
        addTea(new Tea("Cseresznyés álom", 1745, Sort.FRUIT_TEA));
    }


    public void setActionPrices(Sort sort, int percent) {
        for (Tea tea : teas) {
            tea.setPrice(getNewPrice(tea, percent));
        }
    }

    private int getNewPrice(Tea tea, double percentOfReduce) {
        return (int) (tea.getPrice() * ((100.0 - percentOfReduce) / 100.0));
    }

    public void addTea(Tea tea) {
        teas.add(tea);
    }

    public double getAveragePrice() {
        double sum = 0.0;

        for (Tea tea : teas) {
            sum += tea.getPrice();
        }
        return sum / teas.size();
    }

    public String getName() {
        return name;
    }

    public List<Tea> getTeas() {
        return teas;
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }
}
