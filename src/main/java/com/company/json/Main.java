package com.company.json;
import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {

        ///передаем ссылку с json файлом
        ValuteParser valuteParser = new ValuteParser("https://www.cbr-xml-daily.ru/daily_json.js");
        var value = valuteParser.valutes.getValute();


        String [] currency =
                {
                        valuteParser.valutes.getValute().getAUD().toString(),
                        valuteParser.valutes.getValute().getAZN().toString(),
                        valuteParser.valutes.getValute().getGBP().toString(),
                        valuteParser.valutes.getValute().getAMD().toString(),
                        valuteParser.valutes.getValute().getBYN().toString(),
                        valuteParser.valutes.getValute().getBGN().toString(),
                        valuteParser.valutes.getValute().getBRL().toString(),
                        valuteParser.valutes.getValute().getHUF().toString(),
                        valuteParser.valutes.getValute().getHKD().toString(),
                        valuteParser.valutes.getValute().getDKK().toString(),
                        valuteParser.valutes.getValute().getUSD().toString(),
                        valuteParser.valutes.getValute().getEUR().toString(),
                        valuteParser.valutes.getValute().getINR().toString(),
                        valuteParser.valutes.getValute().getKZT().toString(),
                        valuteParser.valutes.getValute().getCAD().toString(),
                        valuteParser.valutes.getValute().getKGS().toString(),
                        valuteParser.valutes.getValute().getCNY().toString(),
                        valuteParser.valutes.getValute().getMDL().toString(),
                        valuteParser.valutes.getValute().getNOK().toString(),
                        valuteParser.valutes.getValute().getPLN().toString(),
                        valuteParser.valutes.getValute().getRON().toString(),
                        valuteParser.valutes.getValute().getXDR().toString(),
                        valuteParser.valutes.getValute().getSGD().toString(),
                        valuteParser.valutes.getValute().getTJS().toString(),
                        valuteParser.valutes.getValute().getTRY().toString(),
                        valuteParser.valutes.getValute().getTMT().toString(),
                        valuteParser.valutes.getValute().getUZS().toString(),
                        valuteParser.valutes.getValute().getUAH().toString(),
                        valuteParser.valutes.getValute().getCZK().toString(),
                        valuteParser.valutes.getValute().getSEK().toString(),
                        valuteParser.valutes.getValute().getCHF().toString(),
                        valuteParser.valutes.getValute().getZAR().toString(),
                        valuteParser.valutes.getValute().getKRW().toString(),
                        valuteParser.valutes.getValute().getJPY().toString(),
                };

        for (int i = 0; i < currency.length; i++)
        {
            System.out.println(currency[i]);
        }
    }
}
