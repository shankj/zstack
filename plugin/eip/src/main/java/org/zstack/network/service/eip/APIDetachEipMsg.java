package org.zstack.network.service.eip;

import org.zstack.header.message.APIMessage;
import org.zstack.header.message.APIParam;

/**
 * @api
 *
 * detach eip from vm nic
 *
 * @category eip
 *
 * @since 0.1.0
 *
 * @cli
 *
 * @httpMsg
 *{
"org.zstack.network.service.eip.APIDetachEipMsg": {
"uuid": "69198105fd7a40778fba1759b923545c",
"session": {
"uuid": "b8a93f786c474493b34e560b49a8da1f"
}
}
}
 * @msg
 * {
"org.zstack.network.service.eip.APIDetachEipMsg": {
"uuid": "69198105fd7a40778fba1759b923545c",
"session": {
"uuid": "b8a93f786c474493b34e560b49a8da1f"
},
"timeout": 1800000,
"id": "2bbc35d895b445da8b1a869f9b351458",
"serviceId": "api.portal"
}
}
 *
 * @result
 * see :ref:`APIDetachEipEvent`
 */
public class APIDetachEipMsg extends APIMessage implements EipMessage {
    /**
     * @desc eip uuid
     */
    @APIParam(resourceType = EipVO.class)
    private String uuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String getEipUuid() {
        return uuid;
    }
}
