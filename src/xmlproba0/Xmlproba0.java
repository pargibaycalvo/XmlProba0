/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlproba0;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

/**
 *
 * @author oracle
 */
public class Xmlproba0 {

    /**
     * @param args the command line arguments
     */
    
    static XMLStreamWriter xmls;
    static XMLOutputFactory outputFactory = XMLOutputFactory.newFactory();
    static File archivo = new File("/home/oracle/NetBeansProjects/xmlproba0/xmls.xml");
    
    public static void main(String[] args) throws IOException {
        
     escribir(archivo);  
    
    }
    
    static void archivo(File archivo) throws IOException{

        if(archivo.exists())
            System.out.println("Archivo de texto existente "+archivo.getPath());
        else
            archivo.createNewFile();
    }
   
    static void escribir(File archivo) throws IOException{
        try {
            xmls = outputFactory.createXMLStreamWriter(new FileWriter(archivo));
            xmls.writeStartDocument("utf-8","1.0");
            
            xmls.writeStartElement("autores");
            
                xmls.writeStartElement("Autor");
                xmls.writeAttribute("Codigo","a1");
                
                    xmls.writeStartElement("Nome");
                    xmls.writeCharacters("Alexandre Dumas");
                    xmls.writeEndElement();
                
                    xmls.writeStartElement("Titulo");
                    xmls.writeCharacters("El Conde de Montecristo");
                    xmls.writeEndElement();
                
                    xmls.writeStartElement("Titulo");
                    xmls.writeCharacters("Los Miserables");
                    xmls.writeEndElement();
                    
                xmls.writeEndElement();
     
                xmls.writeStartElement("Autor");
                xmls.writeAttribute("Codigo","a2");
                
                    xmls.writeStartElement("Nome");
                    xmls.writeCharacters("Fiodor Dostoyevski");
                    xmls.writeEndElement();
                    
                    xmls.writeStartElement("Titulo");
                    xmls.writeCharacters("El Idiota");
                    xmls.writeEndElement();
                    
                    xmls.writeStartElement("Titulo");
                    xmls.writeCharacters("Noches Blancas");
                    xmls.writeEndElement();
                    
                xmls.writeEndElement();
                
            xmls.writeEndElement();    
            xmls.close();           
            
        } catch (XMLStreamException ex) {
            Logger.getLogger(Xmlproba0.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
                
}
          
            
            