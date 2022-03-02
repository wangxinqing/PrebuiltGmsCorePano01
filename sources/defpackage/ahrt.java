package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener2;
import com.google.android.location.collectionlib.RealCollectorConfig;

/* renamed from: ahrt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahrt implements SensorEventListener2 {
    final /* synthetic */ ahrx a;

    protected ahrt(ahrx ahrx) {
        this.a = ahrx;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFlushCompleted(android.hardware.Sensor r13) {
        /*
            r12 = this;
            ahrx r13 = r12.a
            java.lang.Object r13 = r13.c
            monitor-enter(r13)
            ahrx r0 = r12.a     // Catch:{ all -> 0x009f }
            int r1 = r0.g     // Catch:{ all -> 0x009f }
            int r1 = r1 + -1
            r0.g = r1     // Catch:{ all -> 0x009f }
            if (r1 > 0) goto L_0x009d
            r0 = 0
            r1 = -9223372036854775808
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = r1
            r5 = r3
        L_0x0019:
            ahrx r9 = r12.a     // Catch:{ all -> 0x009f }
            android.util.SparseArray r9 = r9.f     // Catch:{ all -> 0x009f }
            int r9 = r9.size()     // Catch:{ all -> 0x009f }
            if (r0 >= r9) goto L_0x0048
            ahrx r9 = r12.a     // Catch:{ all -> 0x009f }
            android.util.SparseArray r9 = r9.f     // Catch:{ all -> 0x009f }
            java.lang.Object r9 = r9.valueAt(r0)     // Catch:{ all -> 0x009f }
            ahrv r9 = (defpackage.ahrv) r9     // Catch:{ all -> 0x009f }
            ahyb r9 = r9.a     // Catch:{ all -> 0x009f }
            int r10 = r9.c     // Catch:{ all -> 0x009f }
            if (r10 <= 0) goto L_0x0044
            int r10 = r10 + -1
            long r9 = r9.a((int) r10)     // Catch:{ all -> 0x009f }
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x003e
            r5 = r9
        L_0x003e:
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x0044
            r7 = r9
            goto L_0x0045
        L_0x0044:
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0019
        L_0x0048:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x004d
            goto L_0x005b
        L_0x004d:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x005b
            long r7 = r7 - r5
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x005b
            monitor-exit(r13)     // Catch:{ all -> 0x009f }
            return
        L_0x005b:
            ahrx r0 = r12.a     // Catch:{ all -> 0x009f }
            java.util.List r0 = r0.e     // Catch:{ all -> 0x009f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x009f }
        L_0x0063:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x009f }
            if (r1 == 0) goto L_0x0096
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x009f }
            ahsy r1 = (defpackage.ahsy) r1     // Catch:{ all -> 0x009f }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x009f }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x009f }
            int r3 = r3.length()     // Catch:{ all -> 0x009f }
            int r3 = r3 + 40
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r4.<init>(r3)     // Catch:{ all -> 0x009f }
            java.lang.String r3 = "DataReader "
            r4.append(r3)     // Catch:{ all -> 0x009f }
            r4.append(r2)     // Catch:{ all -> 0x009f }
            java.lang.String r2 = " started by onFlushCompleted."
            r4.append(r2)     // Catch:{ all -> 0x009f }
            r4.toString()     // Catch:{ all -> 0x009f }
            r1.run()     // Catch:{ all -> 0x009f }
            goto L_0x0063
        L_0x0096:
            ahrx r0 = r12.a     // Catch:{ all -> 0x009f }
            java.util.List r0 = r0.e     // Catch:{ all -> 0x009f }
            r0.clear()     // Catch:{ all -> 0x009f }
        L_0x009d:
            monitor-exit(r13)     // Catch:{ all -> 0x009f }
            return
        L_0x009f:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x009f }
            goto L_0x00a3
        L_0x00a2:
            throw r0
        L_0x00a3:
            goto L_0x00a2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahrt.onFlushCompleted(android.hardware.Sensor):void");
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        ahyb ahyb;
        ahrv ahrv;
        synchronized (this.a.c) {
            ahup ahup = (ahup) RealCollectorConfig.b.get(Integer.valueOf(sensorEvent.sensor.getType()));
            ahyb = null;
            if (!(ahup == null || (ahrv = (ahrv) this.a.f.get(ahup.x)) == null)) {
                ahyb = ahrv.a;
            }
        }
        if (ahyb != null) {
            ahyb.a(sensorEvent.timestamp, sensorEvent.values);
        }
    }
}
