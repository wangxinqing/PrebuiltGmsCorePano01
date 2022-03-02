package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.hardware.Sensor;
import android.os.Build;
import android.os.Handler;
import com.google.android.location.collectionlib.RealCollectorConfig;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ahvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahvk {
    public static final AtomicLong i = new AtomicLong(0);
    public final Object a = new Object();
    public final ajrh b;
    public final boolean c;
    public final boolean d;
    public final Map e = new HashMap();
    public ahrh f;
    public AlarmManager g;
    public PendingIntent h;
    public String j = "";
    public final Map k = new HashMap();
    public final aizx l;
    public final ajbg m;
    public final BroadcastReceiver n = new ahve(this);
    private final ahrx o;
    private final long p;
    private final List q;

    public ahvk(ajbg ajbg, ahrx ahrx, long j2, ajrh ajrh, boolean z, aizx aizx, boolean z2) {
        this.m = ajbg;
        this.p = j2;
        this.o = ahrx;
        this.b = ahvx.a(ajrh);
        this.c = z;
        this.q = new ArrayList(1);
        this.l = aizx;
        this.d = z2;
    }

    public static final void a(AlarmManager alarmManager, int i2, long j2, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT < 23) {
            alarmManager.set(i2, j2, pendingIntent);
        } else {
            alarmManager.setAndAllowWhileIdle(i2, j2, pendingIntent);
        }
    }

    private final Set c() {
        EnumSet<E> noneOf = EnumSet.noneOf(ahup.class);
        for (Integer num : this.e.keySet()) {
            ahup ahup = (ahup) RealCollectorConfig.b.get(num);
            if (ahup != null) {
                noneOf.add(ahup);
            }
        }
        return noneOf;
    }

    public final void b() {
        synchronized (this.a) {
            AlarmManager alarmManager = this.g;
            if (alarmManager != null) {
                alarmManager.cancel(this.h);
            }
            if (!this.d) {
                for (ahty a2 : this.q) {
                    ahtx a3 = a2.a();
                    if (a3 != null) {
                        int type = a3.b.getType();
                        StringBuilder sb = new StringBuilder(40);
                        sb.append("OnChange sensors SensorType: ");
                        sb.append(type);
                        sb.toString();
                        a(a3.b, new long[]{a3.c}, new long[]{a3.d}, new float[][]{a3.a});
                    }
                }
            }
            ahrh ahrh = this.f;
            if (ahrh != null) {
                ahrh.c.post(new ahvf(this));
            }
        }
    }

    public final void a() {
        ahsy ahsy;
        synchronized (this.a) {
            Map map = this.k;
            if (map != null) {
                if (map.containsKey(1)) {
                    Long l2 = (Long) this.k.get(1);
                    amrl.a((Object) l2);
                    ahrx ahrx = this.o;
                    Set c2 = c();
                    long longValue = l2.longValue();
                    synchronized (ahrx.c) {
                        ahsy = new ahsy(ahrx.i, ahrx.b, this, c2, -1, longValue, ahrx.j, ahrx);
                    }
                    ahrx.a(ahsy, this);
                }
            }
            this.o.a(c(), 30000, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r0 = ((java.lang.Integer) r6.next()).intValue();
        r1 = defpackage.ahut.a(r0);
        r2 = r5.o;
        r3 = r2.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2 = r2.f.get(r1.x);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r2 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r1.B != 2) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r5.d == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r5.q.add(new defpackage.ahty(r7, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (r5.o.b.a() == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        r6 = r5.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r5.o.a(c(), r5.p, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0073, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r6 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r6.hasNext() == false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ahrh r6, android.content.Context r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.a
            monitor-enter(r0)
            r5.f = r6     // Catch:{ all -> 0x0079 }
            java.util.Set r6 = r5.c()     // Catch:{ all -> 0x0079 }
            int r6 = r6.size()     // Catch:{ all -> 0x0079 }
            if (r6 == 0) goto L_0x0074
            java.util.Map r6 = r5.e     // Catch:{ all -> 0x0079 }
            java.util.Set r6 = r6.keySet()     // Catch:{ all -> 0x0079 }
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            java.util.Iterator r6 = r6.iterator()
        L_0x001a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r6.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            ahup r1 = defpackage.ahut.a(r0)
            ahrx r2 = r5.o
            java.lang.Object r3 = r2.c
            monitor-enter(r3)
            android.util.SparseArray r2 = r2.f     // Catch:{ all -> 0x0053 }
            int r4 = r1.x     // Catch:{ all -> 0x0053 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x0053 }
            monitor-exit(r3)     // Catch:{ all -> 0x0053 }
            if (r2 != 0) goto L_0x0044
            int r1 = r1.B
            r2 = 2
            if (r1 != r2) goto L_0x0044
            goto L_0x0048
        L_0x0044:
            boolean r1 = r5.d
            if (r1 == 0) goto L_0x001a
        L_0x0048:
            java.util.List r1 = r5.q
            ahty r2 = new ahty
            r2.<init>(r7, r0)
            r1.add(r2)
            goto L_0x001a
        L_0x0053:
            r6 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0053 }
            throw r6
        L_0x0056:
            ahrx r6 = r5.o
            ahux r6 = r6.b
            boolean r6 = r6.a()
            if (r6 == 0) goto L_0x0073
            java.lang.Object r6 = r5.a
            monitor-enter(r6)
            ahrx r7 = r5.o     // Catch:{ all -> 0x0070 }
            java.util.Set r0 = r5.c()     // Catch:{ all -> 0x0070 }
            long r1 = r5.p     // Catch:{ all -> 0x0070 }
            r7.a((java.util.Set) r0, (long) r1, (defpackage.ahvk) r5)     // Catch:{ all -> 0x0070 }
            monitor-exit(r6)     // Catch:{ all -> 0x0070 }
            return
        L_0x0070:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0070 }
            throw r7
        L_0x0073:
            return
        L_0x0074:
            r5.b()     // Catch:{ all -> 0x0079 }
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            return
        L_0x0079:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            goto L_0x007d
        L_0x007c:
            throw r6
        L_0x007d:
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahvk.a(ahrh, android.content.Context):void");
    }

    public final void a(Sensor sensor, long[] jArr, long[] jArr2, float[][] fArr) {
        synchronized (this.a) {
            aiba aiba = (aiba) this.e.get(Integer.valueOf(sensor.getType()));
            int length = jArr.length;
            if (length > 0) {
                this.k.put(Integer.valueOf(sensor.getType()), Long.valueOf(jArr[length - 1]));
            }
            if (aiba != null) {
                ahus ahus = (ahus) aiba.a;
                Handler handler = (Handler) aiba.b;
                amrl.a((Object) ahus);
                amrl.a((Object) handler);
                handler.post(new ahvg(ahus, sensor, jArr, jArr2, fArr));
            }
        }
    }
}
