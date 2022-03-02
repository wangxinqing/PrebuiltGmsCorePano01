package defpackage;

import android.location.Location;
import android.os.Build;
import android.util.Log;

/* renamed from: aiet  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiet {
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.location.Location a(defpackage.aqey r5, java.lang.String r6, long r7, long r9) {
        /*
            if (r5 == 0) goto L_0x00a6
            android.location.Location r0 = new android.location.Location
            r0.<init>(r6)
            int r6 = r5.d
            float r6 = (float) r6
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r6 = r6 / r1
            r0.setAccuracy(r6)
            boolean r6 = r5.h()
            if (r6 == 0) goto L_0x001b
            float r6 = r5.l
            r0.setBearing(r6)
        L_0x001b:
            int r6 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r6 < r1) goto L_0x0037
            boolean r6 = r5.i()
            if (r6 == 0) goto L_0x002c
            float r6 = r5.m
            r0.setBearingAccuracyDegrees(r6)
        L_0x002c:
            boolean r6 = r5.e()
            if (r6 == 0) goto L_0x0037
            float r6 = r5.f
            r0.setSpeedAccuracyMetersPerSecond(r6)
        L_0x0037:
            boolean r6 = r5.d()
            if (r6 == 0) goto L_0x0042
            float r6 = r5.e
            r0.setSpeed(r6)
        L_0x0042:
            boolean r6 = r5.f()
            if (r6 == 0) goto L_0x004d
            double r1 = r5.g
            r0.setAltitude(r1)
        L_0x004d:
            int r6 = r5.b
            double r1 = (double) r6
            r3 = 4711630319722168320(0x416312d000000000, double:1.0E7)
            java.lang.Double.isNaN(r1)
            double r1 = r1 / r3
            r0.setLatitude(r1)
            int r6 = r5.c
            double r1 = (double) r6
            java.lang.Double.isNaN(r1)
            double r1 = r1 / r3
            r0.setLongitude(r1)
            r0.setTime(r7)
            int r6 = android.os.Build.VERSION.SDK_INT
            r0.setElapsedRealtimeNanos(r9)
            aqex r6 = defpackage.aqex.GPS
            aqex r6 = r5.a
            int r6 = r6.ordinal()
            r7 = 3
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x0086
            if (r6 == r9) goto L_0x0085
            if (r6 == r8) goto L_0x0083
            if (r6 == r7) goto L_0x0086
            r7 = 0
            goto L_0x0087
        L_0x0083:
            r7 = 2
            goto L_0x0087
        L_0x0085:
            goto L_0x0087
        L_0x0086:
            r7 = 1
        L_0x0087:
            defpackage.rev.a((android.location.Location) r0, (int) r7)
            boolean r6 = r5.g()
            if (r6 == 0) goto L_0x0096
            double r6 = r5.h
            float r6 = (float) r6
            defpackage.rev.a((android.location.Location) r0, (float) r6)
        L_0x0096:
            java.lang.String r6 = r5.k
            if (r6 != 0) goto L_0x009b
            goto L_0x009e
        L_0x009b:
            defpackage.rev.c(r0, r6)
        L_0x009e:
            java.lang.String r5 = r5.i
            if (r5 == 0) goto L_0x00a5
            defpackage.rev.b(r0, r5)
        L_0x00a5:
            return r0
        L_0x00a6:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiet.a(aqey, java.lang.String, long, long):android.location.Location");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.location.Location a(defpackage.aqey r5, java.lang.String r6, defpackage.aies r7, long r8, long r10) {
        /*
            if (r5 == 0) goto L_0x00bc
            android.location.Location r0 = new android.location.Location
            r0.<init>(r6)
            int r6 = r5.d
            float r6 = (float) r6
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r6 = r6 / r1
            r0.setAccuracy(r6)
            boolean r6 = r5.h()
            if (r6 == 0) goto L_0x001b
            float r6 = r5.l
            r0.setBearing(r6)
        L_0x001b:
            int r6 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r6 < r1) goto L_0x0037
            boolean r6 = r5.i()
            if (r6 == 0) goto L_0x002c
            float r6 = r5.m
            r0.setBearingAccuracyDegrees(r6)
        L_0x002c:
            boolean r6 = r5.e()
            if (r6 == 0) goto L_0x0037
            float r6 = r5.f
            r0.setSpeedAccuracyMetersPerSecond(r6)
        L_0x0037:
            boolean r6 = r5.d()
            if (r6 == 0) goto L_0x0042
            float r6 = r5.e
            r0.setSpeed(r6)
        L_0x0042:
            boolean r6 = r5.f()
            if (r6 == 0) goto L_0x004d
            double r1 = r5.g
            r0.setAltitude(r1)
        L_0x004d:
            int r6 = r5.b
            double r1 = (double) r6
            r3 = 4711630319722168320(0x416312d000000000, double:1.0E7)
            java.lang.Double.isNaN(r1)
            double r1 = r1 / r3
            r0.setLatitude(r1)
            int r6 = r5.c
            double r1 = (double) r6
            java.lang.Double.isNaN(r1)
            double r1 = r1 / r3
            r0.setLongitude(r1)
            r0.setTime(r8)
            int r6 = android.os.Build.VERSION.SDK_INT
            r0.setElapsedRealtimeNanos(r10)
            if (r7 != 0) goto L_0x0071
            goto L_0x0093
        L_0x0071:
            java.lang.String r6 = r7.a
            if (r6 != 0) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            defpackage.rev.b(r0, r6)
        L_0x0079:
            boolean r6 = r7.d
            if (r6 == 0) goto L_0x0086
            int r6 = r7.c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            defpackage.rev.a((android.location.Location) r0, (java.lang.Integer) r6)
        L_0x0086:
            boolean r6 = defpackage.aybc.b()
            if (r6 == 0) goto L_0x0093
            java.lang.String r6 = r7.b
            if (r6 == 0) goto L_0x0093
            defpackage.rev.c(r0, r6)
        L_0x0093:
            aqex r6 = defpackage.aqex.GPS
            aqex r6 = r5.a
            int r6 = r6.ordinal()
            r7 = 3
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x00ab
            if (r6 == r9) goto L_0x00aa
            if (r6 == r8) goto L_0x00a8
            if (r6 == r7) goto L_0x00ab
            r7 = 0
            goto L_0x00ac
        L_0x00a8:
            r7 = 2
            goto L_0x00ac
        L_0x00aa:
            goto L_0x00ac
        L_0x00ab:
            r7 = 1
        L_0x00ac:
            defpackage.rev.a((android.location.Location) r0, (int) r7)
            boolean r6 = r5.g()
            if (r6 == 0) goto L_0x00bb
            double r5 = r5.h
            float r5 = (float) r5
            defpackage.rev.a((android.location.Location) r0, (float) r5)
        L_0x00bb:
            return r0
        L_0x00bc:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiet.a(aqey, java.lang.String, aies, long, long):android.location.Location");
    }

    public static aqey a(Location location, boolean z) {
        if (location == null) {
            return null;
        }
        aqex aqex = aqex.UNKNOWN;
        String provider = location.getProvider();
        if ("gps".equals(provider)) {
            aqex = aqex.GPS;
        } else if ("network".equals(provider)) {
            String a = atiq.a(location);
            if ("cell".equals(a)) {
                aqex = aqex.CELL;
            } else if (!"wifi".equals(a)) {
                String valueOf = String.valueOf(a);
                Log.w("GCoreFlp", valueOf.length() == 0 ? new String("Network provider location has an unexpected type ") : "Network provider location has an unexpected type ".concat(valueOf));
            } else {
                aqex = aqex.WIFI;
            }
        } else if ("gps_injected".equals(provider)) {
            aqex = aqex.GPS_INJECTED;
        }
        aqew k = aqey.k();
        k.a(location.getLatitude(), location.getLongitude(), Math.round(location.getAccuracy() * 1000.0f));
        k.a(aqex);
        if (location.hasBearing()) {
            k.b((float) ((int) location.getBearing()));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (location.hasBearingAccuracy()) {
                k.a(location.getBearingAccuracyDegrees());
            }
            if (location.hasSpeedAccuracy()) {
                k.c(location.getSpeedAccuracyMetersPerSecond());
            }
        }
        if (location.hasAltitude()) {
            k.a(location.getAltitude());
        }
        if (location.hasSpeed()) {
            k.d(location.getSpeed());
        }
        if (rev.g(location)) {
            k.b((double) rev.h(location));
        } else if (location.hasAltitude() && aqex == aqex.GPS) {
            float accuracy = location.getAccuracy();
            k.b((double) (accuracy + accuracy));
        }
        if (rev.f(location)) {
            k.a(rev.e(location));
        }
        if (z && rev.b(location)) {
            k.k = rev.a(location);
        }
        return k.a();
    }
}
