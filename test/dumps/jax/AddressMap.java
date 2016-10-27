/*
 * This Java file has been generated by smidump 0.4.5. Do not edit!
 * It is intended to be used within a Java AgentX sub-agent environment.
 *
 * $Id: AddressMap.java 4432 2006-05-29 16:21:11Z strauss $
 */

/**
    This class represents a Java AgentX (JAX) implementation of
    the scalar group addressMap defined in RMON2-MIB.

    @version 1
    @author  smidump 0.4.5
    @see     AgentXGroup, AgentXScalars
 */

import java.util.Vector;
import java.util.Enumeration;
import jax.AgentXOID;
import jax.AgentXVarBind;
import jax.AgentXSetPhase;
import jax.AgentXResponsePDU;
import jax.AgentXScalars;

public class AddressMap extends AgentXScalars
{

    private final static long[] AddressMapOID = {1, 3, 6, 1, 2, 1, 16, 13};

    protected AgentXOID AddressMapInsertsOID;
    protected final static long[] AddressMapInsertsName = {1, 3, 6, 1, 2, 1, 16, 13, 1, 0};
    protected long addressMapInserts = 0;
    protected AgentXOID AddressMapDeletesOID;
    protected final static long[] AddressMapDeletesName = {1, 3, 6, 1, 2, 1, 16, 13, 2, 0};
    protected long addressMapDeletes = 0;
    protected AgentXOID AddressMapMaxDesiredEntriesOID;
    protected final static long[] AddressMapMaxDesiredEntriesName = {1, 3, 6, 1, 2, 1, 16, 13, 3, 0};
    protected int addressMapMaxDesiredEntries = 0;
    protected int undo_addressMapMaxDesiredEntries = 0;
    public AddressMap()
    {
        oid = new AgentXOID(AddressMapOID);
        data = new Vector();
        AddressMapInsertsOID = new AgentXOID(AddressMapInsertsName);
        data.addElement(AddressMapInsertsOID);
        AddressMapDeletesOID = new AgentXOID(AddressMapDeletesName);
        data.addElement(AddressMapDeletesOID);
        AddressMapMaxDesiredEntriesOID = new AgentXOID(AddressMapMaxDesiredEntriesName);
        data.addElement(AddressMapMaxDesiredEntriesOID);
    }

    public long get_addressMapInserts()
    {
        return addressMapInserts;
    }

    public long get_addressMapDeletes()
    {
        return addressMapDeletes;
    }

    public int get_addressMapMaxDesiredEntries()
    {
        return addressMapMaxDesiredEntries;
    }

    public int set_addressMapMaxDesiredEntries(AgentXSetPhase phase, int value)
    {
        switch (phase.getPhase()) {
        case AgentXSetPhase.TEST_SET:
            break;
        case AgentXSetPhase.COMMIT:
            undo_addressMapMaxDesiredEntries = addressMapMaxDesiredEntries;
            addressMapMaxDesiredEntries = value;
            break;
        case AgentXSetPhase.UNDO:
            addressMapMaxDesiredEntries = undo_addressMapMaxDesiredEntries;
            break;
        case AgentXSetPhase.CLEANUP:
            break;
        default:
            return AgentXResponsePDU.PROCESSING_ERROR;
        }
        return AgentXResponsePDU.NO_ERROR;
    }
    public AgentXVarBind getScalar(AgentXOID pos, AgentXOID oid)
    {
        if ((pos == null) || (pos.compareTo(oid) != 0))
            return new AgentXVarBind(oid, AgentXVarBind.NOSUCHOBJECT);
        else {
            if (pos == AddressMapInsertsOID)
                return new AgentXVarBind(oid, AgentXVarBind.COUNTER32, 
                                         get_addressMapInserts());
            if (pos == AddressMapDeletesOID)
                return new AgentXVarBind(oid, AgentXVarBind.COUNTER32, 
                                         get_addressMapDeletes());
            if (pos == AddressMapMaxDesiredEntriesOID)
                return new AgentXVarBind(oid, AgentXVarBind.INTEGER, 
                                         get_addressMapMaxDesiredEntries());
        }
        return new AgentXVarBind(oid, AgentXVarBind.NOSUCHOBJECT);
    }

    public int setScalar(AgentXSetPhase phase, AgentXOID pos,
                         AgentXVarBind inVb)
    {
        if ((pos == null) || (pos.compareTo(inVb.getOID()) != 0))
            return AgentXResponsePDU.INCONSISTENT_NAME;
        else {
            if (pos == AddressMapMaxDesiredEntriesOID)
                return set_addressMapMaxDesiredEntries(phase, inVb.intValue());
        }
        return AgentXResponsePDU.NOT_WRITABLE;
    }

    public AgentXVarBind getNextScalar(AgentXOID pos, AgentXOID oid)
    {
        if ((pos == null) || (pos.compareTo(oid) <= 0))
            return new AgentXVarBind(oid, AgentXVarBind.ENDOFMIBVIEW);
        else {
            if (pos == AddressMapInsertsOID)
                return new AgentXVarBind(pos, AgentXVarBind.COUNTER32, 
                                         get_addressMapInserts());
            if (pos == AddressMapDeletesOID)
                return new AgentXVarBind(pos, AgentXVarBind.COUNTER32, 
                                         get_addressMapDeletes());
            if (pos == AddressMapMaxDesiredEntriesOID)
                return new AgentXVarBind(pos, AgentXVarBind.INTEGER, 
                                         get_addressMapMaxDesiredEntries());
        }
        return new AgentXVarBind(pos, AgentXVarBind.ENDOFMIBVIEW);
    }

}

