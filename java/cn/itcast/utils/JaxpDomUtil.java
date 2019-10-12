package cn.itcast.utils;

import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class JaxpDomUtil{

    /*
     * 通过 xml文件的path获取xml文件的解析器最后返回解析器解析的结果
     */
    public static Document getDocument(String path) throws Exception{
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	DocumentBuilder builder = factory.newDocumentBuilder();
	return builder.parse(path);
    }


    /*
     * 回写方法
     */
    public static void writeXML(Document document,String path) throws Exception{
	TransformerFactory factory = TransformerFactory.newInstance();
	Transformer transformer = factory.newTransformer();
	transformer.transform(new DOMSource(document),new StreamResult(path));
    }
}
