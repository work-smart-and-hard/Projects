public abstract class Point2d {
    /* Координата X */
    private double Xcoord;
    /* Координата Y */
    private double Ycoord;
    /* Конструктор инициализации */
    public Point2d(double x, double y) {
        Xcoord = x;
        Ycoord = y;
    }
    /* Конструктор по умолчанию */
    public Point2d() {
        this(0,0);
    }
    /* Возвращение координаты X */
    public double getX() {
        return Xcoord;
    }
    /* Возвращение координаты Y */
    public double getY() {
        return Ycoord;
    }
    /* Установка значения координаты X */
    public void setX(double val) {
        Xcoord = val;
    }
    /* Установка значения координаты Y */
    public void setY(double val) {
        Ycoord = val;
    }
}