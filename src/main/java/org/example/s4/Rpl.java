
package org.example.s4;

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
 *         &lt;element name="rplTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="employeeProfile"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="employeeNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="idNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="passportNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="employmentDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="employmentStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "rplTime",
    "employeeProfile"
})
@XmlRootElement(name = "rpl")
public class Rpl {

    @XmlElement(required = true)
    protected String refId;
    @XmlElement(required = true)
    protected String reqTime;
    @XmlElement(required = true)
    protected String rplTime;
    @XmlElement(required = true)
    protected Rpl.EmployeeProfile employeeProfile;

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
     * Gets the value of the rplTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRplTime() {
        return rplTime;
    }

    /**
     * Sets the value of the rplTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRplTime(String value) {
        this.rplTime = value;
    }

    /**
     * Gets the value of the employeeProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Rpl.EmployeeProfile }
     *     
     */
    public Rpl.EmployeeProfile getEmployeeProfile() {
        return employeeProfile;
    }

    /**
     * Sets the value of the employeeProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rpl.EmployeeProfile }
     *     
     */
    public void setEmployeeProfile(Rpl.EmployeeProfile value) {
        this.employeeProfile = value;
    }


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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="employeeNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="idNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="passportNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="employmentDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="employmentStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "name",
        "employeeNo",
        "idNo",
        "passportNo",
        "dob",
        "role",
        "employmentDate",
        "employmentStatus"
    })
    public static class EmployeeProfile {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String employeeNo;
        @XmlElement(required = true)
        protected String idNo;
        @XmlElement(required = true)
        protected String passportNo;
        @XmlElement(required = true)
        protected String dob;
        @XmlElement(required = true)
        protected String role;
        @XmlElement(required = true)
        protected String employmentDate;
        @XmlElement(required = true)
        protected String employmentStatus;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the employeeNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmployeeNo() {
            return employeeNo;
        }

        /**
         * Sets the value of the employeeNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmployeeNo(String value) {
            this.employeeNo = value;
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

        /**
         * Gets the value of the passportNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassportNo() {
            return passportNo;
        }

        /**
         * Sets the value of the passportNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassportNo(String value) {
            this.passportNo = value;
        }

        /**
         * Gets the value of the dob property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDob() {
            return dob;
        }

        /**
         * Sets the value of the dob property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDob(String value) {
            this.dob = value;
        }

        /**
         * Gets the value of the role property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRole() {
            return role;
        }

        /**
         * Sets the value of the role property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRole(String value) {
            this.role = value;
        }

        /**
         * Gets the value of the employmentDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmploymentDate() {
            return employmentDate;
        }

        /**
         * Sets the value of the employmentDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmploymentDate(String value) {
            this.employmentDate = value;
        }

        /**
         * Gets the value of the employmentStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmploymentStatus() {
            return employmentStatus;
        }

        /**
         * Sets the value of the employmentStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmploymentStatus(String value) {
            this.employmentStatus = value;
        }

    }

}
