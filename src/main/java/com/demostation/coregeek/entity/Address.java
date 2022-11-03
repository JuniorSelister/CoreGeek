package com.demostation.coregeek.entity;

import com.demostation.coregeek.base.Constraint;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.io.Serializable;
import java.net.URL;
import java.util.Iterator;

public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    private String addressPostalCode = "";
    private String addressType = "";
    private String addressName = "";
    private String addressNumber = "";
    private String addressNeighbor = "";
    private String addressCity = "";
    private String addressState = "";
    private String addressCountry = "";

    private int result = 0;

    public Address(String postalCode) {

        try {
            URL url = new URL("http://cep.republicavirtual.com.br/web_cep.php?cep=" + Constraint.POSTALCODE(postalCode) + "&formato=xml");
            Document document = getDocument(url);
            Element root = document.getRootElement();

            for (Iterator i = root.elementIterator(); i.hasNext(); ) {
                Element element = (Element) i.next();

                if (element.getQualifiedName().equals("estado")) {
                    setAddressState(element.getText());
                }
                if (element.getQualifiedName().equals("cidade")) {
                    setAddressState(element.getText());
                }
                if (element.getQualifiedName().equals("bairro")) {
                    setAddressNeighbor(element.getText());
                }
                if (element.getQualifiedName().equals("tipo_logradouro")) {
                    setAddressType(element.getText());
                }
                if (element.getQualifiedName().equals("logradouro")) {
                    setAddressName(element.getText());
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Document getDocument(URL url) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(url);
        return document;
    }

    public String getAddressPostalCode() {
        return addressPostalCode;
    }

    public void setAddressPostalCode(String addressPostalCode) {
        this.addressPostalCode = addressPostalCode;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getAddressNeighbor() {
        return addressNeighbor;
    }

    public void setAddressNeighbor(String addressNeighbor) {
        this.addressNeighbor = addressNeighbor;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressState() {
        return addressState;
    }

    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
