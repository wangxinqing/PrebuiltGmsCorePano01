package defpackage;

/* renamed from: aycb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface aycb {
    boolean enableAddGeofencesThrottling();

    boolean enableGeofencerMessageThrottling();

    long geofencerAddGeofencesBurstEvents();

    long geofencerAddGeofencesIntervalSeconds();

    long geofencerFastestLocationIntervalMillis();

    boolean geofencerReduceUnnecessaryLocationUpdates();

    long geofencerSpecialEventBurstEvents();

    long geofencerSpecialEventIntervalSeconds();

    long geofencerUpdateDetectorBurstEvents();

    long geofencerUpdateDetectorIntervalSeconds();
}
