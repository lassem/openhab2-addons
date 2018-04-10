/**
 *
 */
package org.openhab.binding.freeathome.internal;

import org.eclipse.smarthome.core.types.State;
import org.openhab.binding.freeathome.handler.FreeAtHomeBaseHandler;

/**
 * @author rue
 *
 */
public class FreeAtHomeUpdateChannel {
    public FreeAtHomeBaseHandler m_Thing;
    public String m_OhThingChanneId;
    public State m_OhThingState;
    public String m_FhSerial;
    public String m_FhChannel;
    public String m_FhDataPoint;

    public FreeAtHomeUpdateChannel(FreeAtHomeBaseHandler thing, String channelId, State state, String serial,
            String channel, String dataPoint) {
        m_Thing = thing;
        m_OhThingChanneId = channelId;
        m_OhThingState = state;
        m_FhSerial = serial;
        m_FhChannel = channel;
        m_FhDataPoint = dataPoint;
    }

    @Override
    public String toString() {
        return m_Thing.toString() + "_" + m_OhThingChanneId + "_" + m_OhThingState.toString() + "_" + m_FhSerial + "_"
                + m_FhChannel + "_" + m_FhDataPoint;
    }
}