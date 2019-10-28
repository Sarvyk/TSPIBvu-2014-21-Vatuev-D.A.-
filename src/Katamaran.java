/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saix1
 */
public class Katamaran 
{
    /// Левая координата отрисовки катамарана
    private int _startPosX;
    /// Правая кооридната отрисовки катамарана
    private int _startPosY;
    /// Ширина окна отрисовки
    private int _pictureWidth;
    //Высота окна отрисовки
    private int _pictureHeight;
    /// Ширина отрисовки лайнера
    private final int shipWidth = 100;
    /// Высота отрисовки лайнера
    private final int shipHeight = 60;
    //Свойство максимальной скорости
    private int MaxSpeed;
    //Вес
    private int weight;
    //Основной цвет катамарана
    
    //Дополнительные цвет катамарана
    
    //Повыешнная защита кабины(Improved Protection Of The Cockpit = IPOfTC)
    private boolean IPOfTС;
    //Система покидания лодки в случае аварии
    private boolean ejectionSystem;
    //Количество мест
    private int CountOfSeats;
    //Гетер и сетер для MaxSpeed
    public void SetMaxSpeed(int KatMaxSpeed)
    {
        MaxSpeed = KatMaxSpeed;
    }
    public int GetMaxSpeed()
    {
        return MaxSpeed;
    }
    //Гетер и сетер для Weight
     public void SetWeight(int Weight)
    {
        MaxSpeed = Weight;
    }
    public int GetWeight()
    {
        return weight;
    }
    public Katamaran(int maxSpeed, float weight, Color mainColor, Color dopColor)
    {
        
    }
}
