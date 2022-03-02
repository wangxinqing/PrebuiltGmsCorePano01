package defpackage;

/* renamed from: aycc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aycc implements aycb {
    public static final agvx enableAddGeofencesThrottling;
    public static final agvx enableGeofencerMessageThrottling;
    public static final agvx geofencerAddGeofencesBurstEvents;
    public static final agvx geofencerAddGeofencesIntervalSeconds;
    public static final agvx geofencerFastestLocationIntervalMillis;
    public static final agvx geofencerReduceUnnecessaryLocationUpdates;
    public static final agvx geofencerRemoveUnusedCodePathV25;
    public static final agvx geofencerSpecialEventBurstEvents;
    public static final agvx geofencerSpecialEventIntervalSeconds;
    public static final agvx geofencerUpdateDetectorBurstEvents;
    public static final agvx geofencerUpdateDetectorIntervalSeconds;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        enableAddGeofencesThrottling = agvx.a(a, "GeofencerMessageThrottling__enable_add_geofences_throttling", false);
        enableGeofencerMessageThrottling = agvx.a(a, "GeofencerMessageThrottling__enable_geofencer_message_throttling", false);
        geofencerAddGeofencesBurstEvents = agvx.a(a, "GeofencerMessageThrottling__geofencer_add_geofences_burst_events", 5);
        geofencerAddGeofencesIntervalSeconds = agvx.a(a, "GeofencerMessageThrottling__geofencer_add_geofences_interval_seconds", 60);
        geofencerFastestLocationIntervalMillis = agvx.a(a, "GeofencerMessageThrottling__geofencer_fastest_location_interval_millis", 5000);
        geofencerReduceUnnecessaryLocationUpdates = agvx.a(a, "GeofencerMessageThrottling__geofencer_reduce_unnecessary_location_updates", false);
        geofencerRemoveUnusedCodePathV25 = agvx.a(a, "GeofencerMessageThrottling__geofencer_remove_unused_code_path_v25", true);
        geofencerSpecialEventBurstEvents = agvx.a(a, "GeofencerMessageThrottling__geofencer_special_event_burst_events", 3);
        geofencerSpecialEventIntervalSeconds = agvx.a(a, "GeofencerMessageThrottling__geofencer_special_event_interval_seconds", 300);
        geofencerUpdateDetectorBurstEvents = agvx.a(a, "GeofencerMessageThrottling__geofencer_update_detector_burst_events", 5);
        geofencerUpdateDetectorIntervalSeconds = agvx.a(a, "GeofencerMessageThrottling__geofencer_update_detector_interval_seconds", 60);
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableAddGeofencesThrottling() {
        return ((Boolean) enableAddGeofencesThrottling.c()).booleanValue();
    }

    public boolean enableGeofencerMessageThrottling() {
        return ((Boolean) enableGeofencerMessageThrottling.c()).booleanValue();
    }

    public long geofencerAddGeofencesBurstEvents() {
        return ((Long) geofencerAddGeofencesBurstEvents.c()).longValue();
    }

    public long geofencerAddGeofencesIntervalSeconds() {
        return ((Long) geofencerAddGeofencesIntervalSeconds.c()).longValue();
    }

    public long geofencerFastestLocationIntervalMillis() {
        return ((Long) geofencerFastestLocationIntervalMillis.c()).longValue();
    }

    public boolean geofencerReduceUnnecessaryLocationUpdates() {
        return ((Boolean) geofencerReduceUnnecessaryLocationUpdates.c()).booleanValue();
    }

    public boolean geofencerRemoveUnusedCodePathV25() {
        return ((Boolean) geofencerRemoveUnusedCodePathV25.c()).booleanValue();
    }

    public long geofencerSpecialEventBurstEvents() {
        return ((Long) geofencerSpecialEventBurstEvents.c()).longValue();
    }

    public long geofencerSpecialEventIntervalSeconds() {
        return ((Long) geofencerSpecialEventIntervalSeconds.c()).longValue();
    }

    public long geofencerUpdateDetectorBurstEvents() {
        return ((Long) geofencerUpdateDetectorBurstEvents.c()).longValue();
    }

    public long geofencerUpdateDetectorIntervalSeconds() {
        return ((Long) geofencerUpdateDetectorIntervalSeconds.c()).longValue();
    }
}
