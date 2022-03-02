package defpackage;

import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;

/* renamed from: ahpl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahpl {
    final ahpj a = new ahpj();
    int b = -1;
    private long c = 0;
    private boolean d = false;
    private final ahpu e = new ahpu();

    public ahpl(int i) {
        this.b = i;
    }

    private static final ahpk a() {
        return new ahpk(1, -1);
    }

    static final boolean a(int i) {
        return i == 16 || i == 0;
    }

    static final boolean b(int i) {
        return axwr.b() ? DetectedActivity.b(i) : i == 0;
    }

    private final ahpk c(int i) {
        d(i);
        return new ahpk(2, i);
    }

    private final void d(int i) {
        this.b = i;
        ahpj ahpj = this.a;
        ahpj.a = 0;
        ahpj.b = 0;
        ahpj.c = -1;
        if (i == 0 || i == 16 || i == 17) {
            this.c = SystemClock.elapsedRealtime();
        }
        if (!a(this.b)) {
            this.d = false;
        }
    }

    private static final boolean a(ActivityRecognitionResult activityRecognitionResult) {
        return ((long) rcm.a(activityRecognitionResult.c())) >= axxa.a.a().minPersonalInVehicleConfidence();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ce, code lost:
        if (r8 == 8) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01d6, code lost:
        if (r7.a.c(3) < r6) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01d8, code lost:
        r7.a.b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01e2, code lost:
        return a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00de, code lost:
        if (r2 != 6) goto L_0x00e0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.ahpk a(com.google.android.gms.location.ActivityRecognitionResult r8, boolean r9, boolean r10, boolean r11) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.b     // Catch:{ all -> 0x0341 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0341 }
            r2 = 142(0x8e, float:1.99E-43)
            r1.<init>(r2)     // Catch:{ all -> 0x0341 }
            java.lang.String r2 = "Current activity = "
            r1.append(r2)     // Catch:{ all -> 0x0341 }
            r1.append(r0)     // Catch:{ all -> 0x0341 }
            java.lang.String r0 = ", speed = "
            r1.append(r0)     // Catch:{ all -> 0x0341 }
            r0 = 0
            r1.append(r0)     // Catch:{ all -> 0x0341 }
            java.lang.String r2 = ", isWifiConnected = "
            r1.append(r2)     // Catch:{ all -> 0x0341 }
            r1.append(r9)     // Catch:{ all -> 0x0341 }
            java.lang.String r2 = ", isVehicleBluetoothConnected = "
            r1.append(r2)     // Catch:{ all -> 0x0341 }
            r1.append(r10)     // Catch:{ all -> 0x0341 }
            java.lang.String r2 = ", isDeepStillMode = "
            r1.append(r2)     // Catch:{ all -> 0x0341 }
            r1.append(r11)     // Catch:{ all -> 0x0341 }
            r1.toString()     // Catch:{ all -> 0x0341 }
            com.google.android.gms.location.DetectedActivity r1 = r8.b()     // Catch:{ all -> 0x0341 }
            boolean r2 = defpackage.axwr.b()     // Catch:{ all -> 0x0341 }
            r3 = 0
            if (r2 != 0) goto L_0x0053
            int r2 = r1.a()     // Catch:{ all -> 0x0341 }
            boolean r2 = com.google.android.gms.location.DetectedActivity.b(r2)     // Catch:{ all -> 0x0341 }
            if (r2 == 0) goto L_0x0053
            com.google.android.gms.location.DetectedActivity r2 = new com.google.android.gms.location.DetectedActivity     // Catch:{ all -> 0x0341 }
            int r1 = r1.e     // Catch:{ all -> 0x0341 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0341 }
            r1 = r2
        L_0x0053:
            int r2 = r1.a()     // Catch:{ all -> 0x0341 }
            int r1 = r1.e     // Catch:{ all -> 0x0341 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0341 }
            r5 = 66
            r4.<init>(r5)     // Catch:{ all -> 0x0341 }
            java.lang.String r5 = "Most probable new activity = "
            r4.append(r5)     // Catch:{ all -> 0x0341 }
            r4.append(r2)     // Catch:{ all -> 0x0341 }
            java.lang.String r5 = ", confidence = "
            r4.append(r5)     // Catch:{ all -> 0x0341 }
            r4.append(r1)     // Catch:{ all -> 0x0341 }
            r4.toString()     // Catch:{ all -> 0x0341 }
            r4 = 3
            if (r11 == 0) goto L_0x0087
            int r8 = r7.b     // Catch:{ all -> 0x0341 }
            if (r8 != r4) goto L_0x0080
            ahpk r8 = a()     // Catch:{ all -> 0x0341 }
            monitor-exit(r7)
            return r8
        L_0x0080:
            ahpk r8 = r7.c(r4)     // Catch:{ all -> 0x0341 }
            monitor-exit(r7)
            return r8
        L_0x0087:
            int r11 = r7.b     // Catch:{ all -> 0x0341 }
            if (r11 == 0) goto L_0x00c0
            boolean r11 = defpackage.axwr.b()     // Catch:{ all -> 0x0341 }
            if (r11 != 0) goto L_0x00c0
            axxa r11 = defpackage.axxa.a     // Catch:{ all -> 0x0341 }
            axxb r11 = r11.a()     // Catch:{ all -> 0x0341 }
            double r5 = r11.minInVehicleSpeed()     // Catch:{ all -> 0x0341 }
            float r11 = (float) r5     // Catch:{ all -> 0x0341 }
            int r11 = java.lang.Float.compare(r0, r11)     // Catch:{ all -> 0x0341 }
            if (r11 >= 0) goto L_0x00a3
            goto L_0x00c0
        L_0x00a3:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0341 }
            r9 = 87
            r8.<init>(r9)     // Catch:{ all -> 0x0341 }
            java.lang.String r9 = "Received vehicular speed measurements: "
            r8.append(r9)     // Catch:{ all -> 0x0341 }
            r8.append(r0)     // Catch:{ all -> 0x0341 }
            java.lang.String r9 = "m/s. Transitioning to IN_VEHICLE."
            r8.append(r9)     // Catch:{ all -> 0x0341 }
            r8.toString()     // Catch:{ all -> 0x0341 }
            ahpk r8 = r7.c(r3)     // Catch:{ all -> 0x0341 }
            monitor-exit(r7)
            return r8
        L_0x00c0:
            boolean r11 = a((int) r2)     // Catch:{ all -> 0x0341 }
            r5 = 16
            if (r11 != 0) goto L_0x0110
            boolean r11 = a((com.google.android.gms.location.ActivityRecognitionResult) r8)     // Catch:{ all -> 0x0341 }
            if (r10 != 0) goto L_0x00e0
            axxa r6 = defpackage.axxa.a     // Catch:{ all -> 0x0341 }
            axxb r6 = r6.a()     // Catch:{ all -> 0x0341 }
            boolean r6 = r6.arTransitionApplyPersonalConfidenceFilter()     // Catch:{ all -> 0x0341 }
            if (r6 != 0) goto L_0x00db
            goto L_0x0110
        L_0x00db:
            if (r11 == 0) goto L_0x0110
            r11 = 6
            if (r2 == r11) goto L_0x0110
        L_0x00e0:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0341 }
            r9 = 174(0xae, float:2.44E-43)
            r8.<init>(r9)     // Catch:{ all -> 0x0341 }
            java.lang.String r9 = "Received vehicular speed measurements or bluetooth. Speed = "
            r8.append(r9)     // Catch:{ all -> 0x0341 }
            r8.append(r0)     // Catch:{ all -> 0x0341 }
            java.lang.String r9 = ", isVehicleBluetoothConnected = "
            r8.append(r9)     // Catch:{ all -> 0x0341 }
            r8.append(r10)     // Catch:{ all -> 0x0341 }
            java.lang.String r9 = " . Transitioning to road vehicle (IN_VEHICLE/IN_ROAD_VEHICLE)."
            r8.append(r9)     // Catch:{ all -> 0x0341 }
            r8.toString()     // Catch:{ all -> 0x0341 }
            r7.d = r10     // Catch:{ all -> 0x0341 }
            boolean r8 = defpackage.axwr.b()     // Catch:{ all -> 0x0341 }
            if (r8 != 0) goto L_0x0108
            goto L_0x010a
        L_0x0108:
            r3 = 16
        L_0x010a:
            ahpk r8 = r7.c(r3)     // Catch:{ all -> 0x0341 }
            monitor-exit(r7)
            return r8
        L_0x0110:
            int r11 = r7.b     // Catch:{ all -> 0x0341 }
            if (r2 != r11) goto L_0x011d
            r7.d(r11)     // Catch:{ all -> 0x0341 }
            ahpk r8 = a()     // Catch:{ all -> 0x0341 }
            monitor-exit(r7)
            return r8
        L_0x011d:
            if (r2 == r5) goto L_0x02dd
            r0 = 17
            if (r2 == r0) goto L_0x028a
            r0 = 7
            switch(r2) {
                case 0: goto L_0x02dd;
                case 1: goto L_0x0236;
                case 2: goto L_0x01e9;
                case 3: goto L_0x0173;
                case 4: goto L_0x0160;
                case 5: goto L_0x015a;
                case 6: goto L_0x014b;
                case 7: goto L_0x01e9;
                case 8: goto L_0x01e9;
                default: goto L_0x0127;
            }
        L_0x0127:
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0341 }
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0341 }
            int r9 = r9.length()     // Catch:{ all -> 0x0341 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0341 }
            int r9 = r9 + 35
            r10.<init>(r9)     // Catch:{ all -> 0x0341 }
            java.lang.String r9 = "Unidentifiable activity received = "
            r10.append(r9)     // Catch:{ all -> 0x0341 }
            r10.append(r8)     // Catch:{ all -> 0x0341 }
            r10.toString()     // Catch:{ all -> 0x0341 }
            ahpk r8 = a()     // Catch:{ all -> 0x0341 }
            monitor-exit(r7)
            return r8
        L_0x014b:
            if (r11 == 0) goto L_0x0153
            ahpk r8 = a()     // Catch:{ all -> 0x0341 }
            monitor-exit(r7)
            return r8
        L_0x0153:
            ahpk r8 = r7.c(r0)     // Catch:{ all -> 0x0341 }
            monitor-exit(r7)
            return r8
        L_0x015a:
            ahpk r8 = a()     // Catch:{ all -> 0x0341 }
            monitor-exit(r7)
            return r8
        L_0x0160:
            ahpj r8 = r7.a     // Catch:{ all -> 0x0341 }
            int r8 = r8.c(r4)     // Catch:{ all -> 0x0341 }
            if (r8 <= 0) goto L_0x016d
            ahpj r8 = r7.a     // Catch:{ all -> 0x0341 }
            r8.b(r3)     // Catch:{ all -> 0x0341 }
        L_0x016d:
            ahpk r8 = a()     // Catch:{ all -> 0x0341 }
            monitor-exit(r7)
            return r8
        L_0x0173:
            long r8 = defpackage.axxa.h()     // Catch:{ all -> 0x0341 }
            int r9 = (int) r8     // Catch:{ all -> 0x0341 }
            axxa r8 = defpackage.axxa.a     // Catch:{ all -> 0x0341 }
            axxb r8 = r8.a()     // Catch:{ all -> 0x0341 }
            long r5 = r8.minStillHighConfidenceContinuousDetectionCount()     // Catch:{ all -> 0x0341 }
            int r8 = (int) r5     // Catch:{ all -> 0x0341 }
            axxa r11 = defpackage.axxa.a     // Catch:{ all -> 0x0341 }
            axxb r11 = r11.a()     // Catch:{ all -> 0x0341 }
            long r5 = r11.minStillContinuousDetectionCount()     // Catch:{ all -> 0x0341 }
            int r11 = (int) r5     // Catch:{ all -> 0x0341 }
            axxa r5 = defpackage.axxa.a     // Catch:{ all -> 0x0341 }
            axxb r5 = r5.a()     // Catch:{ all -> 0x0341 }
            long r5 = r5.minStillForTransitionFromFoot()     // Catch:{ all -> 0x0341 }
            int r6 = (int) r5     // Catch:{ all -> 0x0341 }
            boolean r10 = r7.a((boolean) r10)     // Catch:{ all -> 0x0341 }
            if (r10 != 0) goto L_0x01e3
            int r10 = r7.b     // Catch:{ all -> 0x0341 }
            boolean r10 = b(r10)     // Catch:{ all -> 0x0341 }
            if (r10 == 0) goto L_0x01a8
            goto L_0x01b7
        L_0x01a8:
            if (r1 < r9) goto L_0x01b7
            ahpj r9 = r7.a     // Catch:{ all -> 0x0341 }
            int r10 = r9.c     // Catch:{ all -> 0x0341 }
            if (r10 != r4) goto L_0x01b3
            int r3 = r9.b     // Catch:{ all -> 0x0341 }
            goto L_0x01b4
        L_0x01b3:
        L_0x01b4:
            if (r3 < r8) goto L_0x01b7
            goto L_0x01e3
        L_0x01b7:
            int r8 = r7.b     // Catch:{ all -> 0x0341 }
            boolean r8 = b(r8)     // Catch:{ all -> 0x0341 }
            if (r8 != 0) goto L_0x01c7
            ahpj r8 = r7.a     // Catch:{ all -> 0x0341 }
            int r8 = r8.c(r4)     // Catch:{ all -> 0x0341 }
            if (r8 >= r11) goto L_0x01e3
        L_0x01c7:
            int r8 = r7.b     // Catch:{ all -> 0x0341 }
            if (r8 != r0) goto L_0x01cc
            goto L_0x01d0
        L_0x01cc:
            r9 = 8
            if (r8 != r9) goto L_0x01d8
        L_0x01d0:
            ahpj r8 = r7.a     // Catch:{ all -> 0x0341 }
            int r8 = r8.c(r4)     // Catch:{ all -> 0x0341 }
            if (r8 >= r6) goto L_0x01e3
        L_0x01d8:
            ahpj r8 = r7.a     // Catch:{ all -> 0x0341 }
            r8.b(r1)     // Catch:{ all -> 0x0341 }
            ahpk r8 = a()     // Catch:{ all -> 0x0341 }
            monitor-exit(r7)
            return r8
        L_0x01e3:
            ahpk r8 = r7.c(r2)     // Catch:{ all -> 0x0341 }
            monitor-exit(r7)
            return r8
        L_0x01e9:
            axxa r8 = defpackage.axxa.a     // Catch:{ all -> 0x0341 }
            axxb r8 = r8.a()     // Catch:{ all -> 0x0341 }
            long r8 = r8.footHighConfidenceThreshold()     // Catch:{ all -> 0x0341 }
            axxa r11 = defpackage.axxa.a     // Catch:{ all -> 0x0341 }
            axxb r11 = r11.a()     // Catch:{ all -> 0x0341 }
            long r3 = r11.minFootContinuousDetectionCount()     // Catch:{ all -> 0x0341 }
            int r11 = (int) r3     // Catch:{ all -> 0x0341 }
            int r9 = (int) r8     // Catch:{ all -> 0x0341 }
            if (r1 >= r9) goto L_0x0230
            ahpj r8 = r7.a     // Catch:{ all -> 0x0341 }
            r9 = 2
            int r8 = r8.c(r9)     // Catch:{ all -> 0x0341 }
            if (r8 >= r11) goto L_0x0230
            boolean r8 = r7.a((boolean) r10)     // Catch:{ all -> 0x0341 }
            if (r8 != 0) goto L_0x0230
            axxa r8 = defpackage.axxa.a     // Catch:{ all -> 0x0341 }
            axxb r8 = r8.a()     // Catch:{ all -> 0x0341 }
            boolean r8 = r8.arTransitionFastVehicleexitOnfootEnabled()     // Catch:{ all -> 0x0341 }
            if (r8 == 0) goto L_0x0225
            int r8 = r7.b     // Catch:{ all -> 0x0341 }
            boolean r8 = a((int) r8)     // Catch:{ all -> 0x0341 }
            if (r8 == 0) goto L_0x0225
            goto L_0x0230
        L_0x0225:
            ahpj r8 = r7.a     // Catch:{ all -> 0x0341 }
            r8.a(r9)     // Catch:{ all -> 0x0341 }
            ahpk r8 = a()     // Catch:{ all -> 0x0341 }
            monitor-exit(r7)
            return r8
        L_0x0230:
            ahpk r8 = r7.c(r2)     // Catch:{ all -> 0x0341 }
            monitor-exit(r7)
            return r8
        L_0x0236:
            axxa r8 = defpackage.axxa.a     // Catch:{ all -> 0x0341 }
            axxb r8 = r8.a()     // Catch:{ all -> 0x0341 }
            boolean r8 = r8.arTransitionBikingWifiFilteringEnabled()     // Catch:{ all -> 0x0341 }
            r11 = 1
            if (r8 != 0) goto L_0x0244
            goto L_0x0247
        L_0x0244:
            if (r9 == 0) goto L_0x0247
            r3 = 1
        L_0x0247:
            axxa r8 = defpackage.axxa.a     // Catch:{ all -> 0x0341 }
            axxb r8 = r8.a()     // Catch:{ all -> 0x0341 }
            long r8 = r8.bikeHighConfidenceThreshold()     // Catch:{ all -> 0x0341 }
            int r9 = (int) r8     // Catch:{ all -> 0x0341 }
            axxa r8 = defpackage.axxa.a     // Catch:{ all -> 0x0341 }
            axxb r8 = r8.a()     // Catch:{ all -> 0x0341 }
            long r4 = r8.minBikeContinuousDetectionCount()     // Catch:{ all -> 0x0341 }
            int r8 = (int) r4     // Catch:{ all -> 0x0341 }
            if (r3 == 0) goto L_0x0260
            goto L_0x0279
        L_0x0260:
            if (r1 < r9) goto L_0x026a
            int r9 = r7.b     // Catch:{ all -> 0x0341 }
            boolean r9 = b(r9)     // Catch:{ all -> 0x0341 }
            if (r9 == 0) goto L_0x0284
        L_0x026a:
            ahpj r9 = r7.a     // Catch:{ all -> 0x0341 }
            int r9 = r9.c(r11)     // Catch:{ all -> 0x0341 }
            if (r9 >= r8) goto L_0x0284
            boolean r8 = r7.a((boolean) r10)     // Catch:{ all -> 0x0341 }
            if (r8 == 0) goto L_0x0279
            goto L_0x0284
        L_0x0279:
            ahpj r8 = r7.a     // Catch:{ all -> 0x0341 }
            r8.a(r11)     // Catch:{ all -> 0x0341 }
            ahpk r8 = a()     // Catch:{ all -> 0x0341 }
            monitor-exit(r7)
            return r8
        L_0x0284:
            ahpk r8 = r7.c(r2)     // Catch:{ all -> 0x0341 }
            monitor-exit(r7)
            return r8
        L_0x028a:
            boolean r8 = defpackage.axwr.b()     // Catch:{ all -> 0x0341 }
            if (r8 == 0) goto L_0x02c9
            axxa r8 = defpackage.axxa.a     // Catch:{ all -> 0x0341 }
            axxb r8 = r8.a()     // Catch:{ all -> 0x0341 }
            long r8 = r8.inRailVehicleConfidenceThreshold()     // Catch:{ all -> 0x0341 }
            axxa r11 = defpackage.axxa.a     // Catch:{ all -> 0x0341 }
            axxb r11 = r11.a()     // Catch:{ all -> 0x0341 }
            long r2 = r11.minInRailVehicleContinuousDetectionCount()     // Catch:{ all -> 0x0341 }
            int r11 = (int) r2     // Catch:{ all -> 0x0341 }
            int r9 = (int) r8     // Catch:{ all -> 0x0341 }
            if (r1 >= r9) goto L_0x02c2
            ahpj r8 = r7.a     // Catch:{ all -> 0x0341 }
            int r8 = r8.c(r0)     // Catch:{ all -> 0x0341 }
            if (r8 >= r11) goto L_0x02c2
            boolean r8 = r7.a((boolean) r10)     // Catch:{ all -> 0x0341 }
            if (r8 == 0) goto L_0x02b7
            goto L_0x02c2
        L_0x02b7:
            ahpj r8 = r7.a     // Catch:{ all -> 0x0341 }
            r8.a(r0)     // Catch:{ all -> 0x0341 }
            ahpk r8 = a()     // Catch:{ all -> 0x0341 }
            monitor-exit(r7)
            return r8
        L_0x02c2:
            ahpk r8 = r7.c(r0)     // Catch:{ all -> 0x0341 }
            monitor-exit(r7)
            return r8
        L_0x02c9:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0341 }
            java.lang.String r9 = com.google.android.gms.location.DetectedActivity.a(r0)     // Catch:{ all -> 0x0341 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0341 }
            java.lang.String r10 = " classification should never be used for non road and rail filter."
            java.lang.String r9 = r9.concat(r10)     // Catch:{ all -> 0x0341 }
            r8.<init>(r9)     // Catch:{ all -> 0x0341 }
            throw r8     // Catch:{ all -> 0x0341 }
        L_0x02dd:
            boolean r8 = a((com.google.android.gms.location.ActivityRecognitionResult) r8)     // Catch:{ all -> 0x0341 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0341 }
            r0 = 119(0x77, float:1.67E-43)
            r11.<init>(r0)     // Catch:{ all -> 0x0341 }
            java.lang.String r0 = "Checking is ready for vehicle transition. confidence = "
            r11.append(r0)     // Catch:{ all -> 0x0341 }
            r11.append(r1)     // Catch:{ all -> 0x0341 }
            java.lang.String r0 = ", is personal vehicle = "
            r11.append(r0)     // Catch:{ all -> 0x0341 }
            r11.append(r8)     // Catch:{ all -> 0x0341 }
            java.lang.String r0 = ", wifi connected = "
            r11.append(r0)     // Catch:{ all -> 0x0341 }
            r11.append(r9)     // Catch:{ all -> 0x0341 }
            r11.toString()     // Catch:{ all -> 0x0341 }
            axxa r11 = defpackage.axxa.a     // Catch:{ all -> 0x0341 }
            axxb r11 = r11.a()     // Catch:{ all -> 0x0341 }
            long r3 = r11.inVehicleConfidenceThreshold()     // Catch:{ all -> 0x0341 }
            int r11 = (int) r3     // Catch:{ all -> 0x0341 }
            axxa r0 = defpackage.axxa.a     // Catch:{ all -> 0x0341 }
            axxb r0 = r0.a()     // Catch:{ all -> 0x0341 }
            long r3 = r0.minInVehicleContinuousDetectionCount()     // Catch:{ all -> 0x0341 }
            int r0 = (int) r3     // Catch:{ all -> 0x0341 }
            if (r8 == 0) goto L_0x031c
            goto L_0x033b
        L_0x031c:
            if (r9 == 0) goto L_0x031f
            goto L_0x032a
        L_0x031f:
            if (r1 >= r11) goto L_0x033b
            ahpj r8 = r7.a     // Catch:{ all -> 0x0341 }
            int r8 = r8.c(r2)     // Catch:{ all -> 0x0341 }
            if (r8 < r0) goto L_0x032a
            goto L_0x033b
        L_0x032a:
            boolean r8 = r7.a((boolean) r10)     // Catch:{ all -> 0x0341 }
            if (r8 != 0) goto L_0x033b
            ahpj r8 = r7.a     // Catch:{ all -> 0x0341 }
            r8.a(r2)     // Catch:{ all -> 0x0341 }
            ahpk r8 = a()     // Catch:{ all -> 0x0341 }
            monitor-exit(r7)
            return r8
        L_0x033b:
            ahpk r8 = r7.c(r2)     // Catch:{ all -> 0x0341 }
            monitor-exit(r7)
            return r8
        L_0x0341:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahpl.a(com.google.android.gms.location.ActivityRecognitionResult, boolean, boolean, boolean):ahpk");
    }

    /* access modifiers changed from: package-private */
    public final boolean a(boolean z) {
        String a2 = DetectedActivity.a(this.b);
        long j = this.c;
        boolean z2 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 164);
        sb.append("isVehicleActivityExpired. currentActivity = ");
        sb.append(a2);
        sb.append(", lastVehicleDetectionMillis = ");
        sb.append(j);
        sb.append(", carBluetoothConnected = ");
        sb.append(z);
        sb.append(", isVehicleEnterDueToBluetooth = ");
        sb.append(z2);
        sb.toString();
        return this.e.a(this.b, this.c, SystemClock.elapsedRealtime(), z, this.d);
    }
}
