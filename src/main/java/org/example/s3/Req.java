
package org.example.s3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="refId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reqTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "refId",
    "reqTime",
    "idNo"
})
@XmlRootElement(name = "req")
public class Req {

    @XmlElement(required = true)
    protected String refId;
    @XmlElement(required = true)
    protected String reqTime;
    @XmlElement(required = true)
    protected String idNo;

    /**
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }

    /**
     * Gets the value of the reqTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqTime() {
        return reqTime;
    }

    /**
     * Sets the value of the reqTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqTime(String value) {
        this.reqTime = value;
    }

    /**
     * Gets the value of the idNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * Sets the value of the idNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNo(String value) {
        this.idNo = value;
    }

}
