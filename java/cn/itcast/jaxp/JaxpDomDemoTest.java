/*
 * jaxp 简单入门，read xml document node
 */

package cn.itcast.jaxp;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Element;

import cn.itcast.utils.JaxpDomUtil;


public class JaxpDomDemoTest{

    public static void main(String[] args){
	try{
	    run1();
	    run2();
	}catch(Exception e){
	    e.printStackTrace();
	}

    }

    public static void run1() throws Exception{
	//声明解析器对象

	//声明解析器工厂类实例,下一步由解析器工厂对象获取一个解析器对象
	//这样的代码使用了，工厂设计模式
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	DocumentBuilder builder = factory.newDocumentBuilder();

	//使用解析器，解析xml文件,得到document对象

	//Document 接口表示整个 HTML 或 XML 文档。从概念上讲，它是文档树的根，并提供对文档数据的基本访问。 
	Document document = builder.parse("xml/lianxi.xml");

	//获取某个node（节点）信息
	NodeList nodeList = document.getElementsByTagName("person");
	//System.out.println(nodeList.getLength());

	for(int i = 0 ; i < nodeList.getLength() ; i++){
	    Node node = nodeList.item(i);
	    //此属性返回此节点及其后代的文本内容。也就是此node所封装的数据
	    System.out.println(node.getTextContent());
	    //System.out.println(node.getNodeName());
	    //System.out.println(node.getNodeType());
	    //System.out.println(node.getNodeValue());
	}

    }

    public static void run2() throws Exception{
	String path = "xml/lianxi.xml";
	Document document = JaxpDomUtil.getDocument(path);
	Node person = document.getElementsByTagName("person").item(1);
	Element school= document.createElement("school");
	school.setTextContent("beijie");
	person.appendChild(school);

	//此时内存中的document已经发生了改变
	TransformerFactory transformerFactory = TransformerFactory.newInstance();
	Transformer transformer = transformerFactory.newTransformer();
	transformer.transform(new DOMSource(document),new StreamResult(path));
    }

}
