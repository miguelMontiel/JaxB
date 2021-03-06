package com.danibuiza.jaxb.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.danibuiza.jaxb.museum.Museums;

public class UnMarshalJAXVBCompleteExample
{
    public static void main( String[] args )
    {

        try
        {

            File file = new File( "museums.xml" );
            JAXBContext jaxbContext = JAXBContext.newInstance( Museums.class );

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Museums museums = (Museums)jaxbUnmarshaller.unmarshal( file );
            System.out.println( museums );

        }
        catch( JAXBException e )
        {
            e.printStackTrace();
        }

    }

}
