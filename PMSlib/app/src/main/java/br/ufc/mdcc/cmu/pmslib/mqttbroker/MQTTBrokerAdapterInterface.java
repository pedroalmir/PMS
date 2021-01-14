package br.ufc.mdcc.cmu.pmslib.mqttbroker;

import br.ufc.mdcc.cmu.pmslib.exception.MQTTBrokerException;

/**
 * Created by makleyston on 14/01/2021
 */

<<<<<<< HEAD:PMSlib/app/src/main/java/br/ufc/mdcc/cmu/pmslib/mqttbroker/MQTTBrokerAdapterInterface.java
public interface MQTTBrokerAdapterInterface {
=======
public interface BrokerMQTTAdapterInterface {
>>>>>>> BrokerMQTT:PMSlib/app/src/main/java/br/ufc/mdcc/cmu/pmslib/brokermqtt/BrokerMQTTAdapterInterface.java

    /**
     * This method is called to start the MQTT broker
     */
    public void start() throws MQTTBrokerException;

    /**
     * This method is called to stop the MQTT broker
     */
    public void stop() throws MQTTBrokerException;

    /**
     * This method is called to verify if that the broker is active
     * @return boolean [true for active and false for inactive]
     */
    public boolean isActive();

}
