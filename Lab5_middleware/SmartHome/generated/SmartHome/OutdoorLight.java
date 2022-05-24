//
// Copyright (c) ZeroC, Inc. All rights reserved.
//
//
// Ice version 3.7.7
//
// <auto-generated>
//
// Generated from file `devices.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package SmartHome;

public interface OutdoorLight extends Lightbulb
{
    void setNightMode(NightMode nightMode, com.zeroc.Ice.Current current);

    NightMode getNightMode(com.zeroc.Ice.Current current);

    /** @hidden */
    static final String[] _iceIds =
    {
        "::Ice::Object",
        "::SmartHome::Lightbulb",
        "::SmartHome::OutdoorLight"
    };

    @Override
    default String[] ice_ids(com.zeroc.Ice.Current current)
    {
        return _iceIds;
    }

    @Override
    default String ice_id(com.zeroc.Ice.Current current)
    {
        return ice_staticId();
    }

    static String ice_staticId()
    {
        return "::SmartHome::OutdoorLight";
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_setNightMode(OutdoorLight obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        NightMode iceP_nightMode;
        iceP_nightMode = NightMode.ice_read(istr);
        inS.endReadParams();
        obj.setNightMode(iceP_nightMode, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_getNightMode(OutdoorLight obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(com.zeroc.Ice.OperationMode.Idempotent, current.mode);
        inS.readEmptyParams();
        NightMode ret = obj.getNightMode(current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        NightMode.ice_write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    /** @hidden */
    final static String[] _iceOps =
    {
        "getColor",
        "getDeviceInfo",
        "getLightbulbState",
        "getNightMode",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "setColor",
        "setNightMode",
        "turnOff",
        "turnOn"
    };

    /** @hidden */
    @Override
    default java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceDispatch(com.zeroc.IceInternal.Incoming in, com.zeroc.Ice.Current current)
        throws com.zeroc.Ice.UserException
    {
        int pos = java.util.Arrays.binarySearch(_iceOps, current.operation);
        if(pos < 0)
        {
            throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return Lightbulb._iceD_getColor(this, in, current);
            }
            case 1:
            {
                return Lightbulb._iceD_getDeviceInfo(this, in, current);
            }
            case 2:
            {
                return Lightbulb._iceD_getLightbulbState(this, in, current);
            }
            case 3:
            {
                return _iceD_getNightMode(this, in, current);
            }
            case 4:
            {
                return com.zeroc.Ice.Object._iceD_ice_id(this, in, current);
            }
            case 5:
            {
                return com.zeroc.Ice.Object._iceD_ice_ids(this, in, current);
            }
            case 6:
            {
                return com.zeroc.Ice.Object._iceD_ice_isA(this, in, current);
            }
            case 7:
            {
                return com.zeroc.Ice.Object._iceD_ice_ping(this, in, current);
            }
            case 8:
            {
                return Lightbulb._iceD_setColor(this, in, current);
            }
            case 9:
            {
                return _iceD_setNightMode(this, in, current);
            }
            case 10:
            {
                return Lightbulb._iceD_turnOff(this, in, current);
            }
            case 11:
            {
                return Lightbulb._iceD_turnOn(this, in, current);
            }
        }

        assert(false);
        throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
    }
}
