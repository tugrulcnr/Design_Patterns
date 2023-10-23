class WeatherObserver implements Observer{
    private String name;


    public WeatherObserver(String name) {
        this.name = name;
    }


    @Override
    public void update(int temperature) {
        System.out.println(name + " - Sıcaklık güncellendi: " + temperature + "°C");
    }
    
}
