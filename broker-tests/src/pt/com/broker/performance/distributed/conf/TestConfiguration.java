//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.17 at 11:24:58 AM WET 
//


package pt.com.broker.performance.distributed.conf;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agents" type="{}Agents"/>
 *         &lt;element name="machines" type="{}Machines"/>
 *         &lt;element name="tests" type="{}Tests"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "agents",
    "machines",
    "tests"
})
@XmlRootElement(name = "test-configuration")
public class TestConfiguration {

    @XmlElement(required = true)
    protected Agents agents;
    @XmlElement(required = true)
    protected Machines machines;
    @XmlElement(required = true)
    protected Tests tests;

    /**
     * Gets the value of the agents property.
     * 
     * @return
     *     possible object is
     *     {@link Agents }
     *     
     */
    public Agents getAgents() {
        return agents;
    }

    /**
     * Sets the value of the agents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agents }
     *     
     */
    public void setAgents(Agents value) {
        this.agents = value;
    }

    /**
     * Gets the value of the machines property.
     * 
     * @return
     *     possible object is
     *     {@link Machines }
     *     
     */
    public Machines getMachines() {
        return machines;
    }

    /**
     * Sets the value of the machines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Machines }
     *     
     */
    public void setMachines(Machines value) {
        this.machines = value;
    }

    /**
     * Gets the value of the tests property.
     * 
     * @return
     *     possible object is
     *     {@link Tests }
     *     
     */
    public Tests getTests() {
        return tests;
    }

    /**
     * Sets the value of the tests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tests }
     *     
     */
    public void setTests(Tests value) {
        this.tests = value;
    }

}
