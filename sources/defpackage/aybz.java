package defpackage;

/* renamed from: aybz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aybz implements ayby {
    public static final agvx generateProtoFormatRecords;
    public static final agvx geofencingLogRecordSize;
    public static final agvx geofencingLogRecordTtlMillis;
    public static final agvx logGeofencerInternalEvents;
    public static final agvx logLocationAndArEvents;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        generateProtoFormatRecords = agvx.a(a, "GeofencerDumpsys__generate_proto_format_records", false);
        geofencingLogRecordSize = agvx.a(a, "geofencing_log_record_size", 0);
        geofencingLogRecordTtlMillis = agvx.a(a, "geofencing_log_record_ttl", 0);
        logGeofencerInternalEvents = agvx.a(a, "GeofencerDumpsys__log_geofencer_internal_events", false);
        logLocationAndArEvents = agvx.a(a, "GeofencerDumpsys__log_location_and_ar_events", false);
    }

    public boolean compiled() {
        return true;
    }

    public boolean generateProtoFormatRecords() {
        return ((Boolean) generateProtoFormatRecords.c()).booleanValue();
    }

    public long geofencingLogRecordSize() {
        return ((Long) geofencingLogRecordSize.c()).longValue();
    }

    public long geofencingLogRecordTtlMillis() {
        return ((Long) geofencingLogRecordTtlMillis.c()).longValue();
    }

    public boolean logGeofencerInternalEvents() {
        return ((Boolean) logGeofencerInternalEvents.c()).booleanValue();
    }

    public boolean logLocationAndArEvents() {
        return ((Boolean) logLocationAndArEvents.c()).booleanValue();
    }
}
