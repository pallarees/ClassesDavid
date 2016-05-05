package Meses;

public class Meses
{
   
    private int mes;
   
    Meses(int numero)
    {
        if(numero>=1 && numero<=12)
            mes=numero;
        else
            mes=1;
    }
    
    Meses()
    {
       mes=1;
    }

    /**
     * calcula el nombre del mes
     * @return el nombre del mes
     */
    public String getMonthName()
    {
        String temp="";
        if(mes==1)
            temp="Enero";
        else if (mes==2)
            temp="Febrero";
        else if (mes==3)
            temp="Marzo";
        else if (mes==4)
            temp="Abril";
        else if (mes==5)
            temp="Mayo";
        else if (mes==6)
            temp="Junio";
        else if (mes==7)
            temp="Julio";
        else if (mes==8)
            temp="Agosto";
        else if (mes==9)
            temp="Septiembre";
        else if (mes==10)
            temp="Octubre";
        else if (mes==11)
            temp="Noviembre";
        else if (mes==12)
            temp="Diciembre";
            
       
            
        return temp;
    }

    /**
     * numero de dias
     * @return el numero de dias del mes. Febrero tiene 28
     */
    public int getNumberOfDays()
    {
        int num;
        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8|| mes==10 || mes==12)
            num=31;
        else if(mes==2)
            num=28;
        else
            num=30;

        return num;
    }
}
