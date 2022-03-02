package defpackage;

import android.location.Location;

/* renamed from: atfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atfi {
    public static ajcj a(Location location) {
        aucd o = ajcj.m.o();
        double latitude = location.getLatitude();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((ajcj) o.b).a = latitude;
        double longitude = location.getLongitude();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((ajcj) o.b).b = longitude;
        long time = location.getTime();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((ajcj) o.b).j = time;
        if (location.hasAccuracy()) {
            double altitude = location.getAltitude();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((ajcj) o.b).c = altitude;
        }
        if (location.hasSpeed()) {
            float speed = location.getSpeed();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((ajcj) o.b).d = speed;
        }
        if (location.hasBearing()) {
            float bearing = location.getBearing();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((ajcj) o.b).e = bearing;
        }
        if (location.hasAccuracy()) {
            float accuracy = location.getAccuracy();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((ajcj) o.b).f = accuracy;
        }
        if (jkr.e()) {
            if (location.hasVerticalAccuracy()) {
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ((ajcj) o.b).g = verticalAccuracyMeters;
            }
            if (location.hasSpeedAccuracy()) {
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ((ajcj) o.b).h = speedAccuracyMetersPerSecond;
            }
            if (location.hasBearingAccuracy()) {
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ((ajcj) o.b).i = bearingAccuracyDegrees;
            }
        }
        if (jkr.h() && location.hasElapsedRealtimeUncertaintyNanos()) {
            long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((ajcj) o.b).k = elapsedRealtimeNanos;
            double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((ajcj) o.b).l = elapsedRealtimeUncertaintyNanos;
        }
        return (ajcj) o.i();
    }
}
