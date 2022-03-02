package com.google.android.location.fused;

import android.os.SystemClock;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.NetworkLocationStatus;
import com.google.android.location.util.DeviceActiveAlarmTimer;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationStatusHelper extends jgw implements aifv, jlc {
    private static final long s = TimeUnit.SECONDS.toMillis(1);
    private static final long t = TimeUnit.SECONDS.toMillis(5);
    private static final long u = TimeUnit.SECONDS.toMillis(1);
    private static final long v = TimeUnit.SECONDS.toMillis(5);
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public aifi g = new aifi();
    public aifi h = new aifi();
    public long i = 0;
    public long j = 0;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public aifk o;
    public final aifw p;
    public final jld q;
    public final DeviceActiveAlarmTimer r;
    private long w;

    public LocationStatusHelper(jld jld, aifw aifw, DeviceActiveAlarmTimer deviceActiveAlarmTimer) {
        super("location");
        this.q = jld;
        this.p = aifw;
        this.r = deviceActiveAlarmTimer;
    }

    private static final long a(long j2) {
        return j2 != Long.MAX_VALUE ? j2 + Math.max(v, (long) (((float) j2) * 0.5f)) : j2;
    }

    private static final boolean a(int i2, int i3) {
        return (i2 == 0 || i2 == 1 || i3 == 0 || i3 == 1) ? false : true;
    }

    private final long f() {
        return a(Math.max(this.g.g, s));
    }

    private final long g() {
        return a(Math.max(this.g.g, t));
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
    }

    public final void a(List list) {
    }

    public final void b() {
        this.k = false;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.w = elapsedRealtime;
        if (this.h.f < Long.MAX_VALUE) {
            this.i = elapsedRealtime;
        }
        this.j = elapsedRealtime;
        c();
        e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (a(r1, r0) == false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r14 = this;
            boolean r0 = r14.l
            if (r0 == 0) goto L_0x008a
            boolean r0 = r14.m
            r1 = 7
            if (r0 == 0) goto L_0x000e
            int r1 = r14.e
            int r0 = r14.f
            goto L_0x000f
        L_0x000e:
            r0 = 7
        L_0x000f:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r14.i
            long r6 = r14.w
            r8 = 0
            r9 = 1
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 > 0) goto L_0x0025
            long r4 = r14.j
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 > 0) goto L_0x0025
            r4 = 0
            goto L_0x0026
        L_0x0025:
            r4 = 1
        L_0x0026:
            boolean r5 = r14.n
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r5 == 0) goto L_0x003a
            long r10 = r14.f()
            long r10 = r2 - r10
            long r12 = r14.i
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            goto L_0x0057
        L_0x003a:
            boolean r5 = r14.m
            if (r5 == 0) goto L_0x0054
            long r10 = r14.g()
            long r2 = r2 - r10
            long r10 = r14.j
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x004d
            r4 = 1
            r8 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0057
        L_0x004d:
            boolean r2 = a((int) r1, (int) r0)
            if (r2 != 0) goto L_0x0054
            goto L_0x0039
        L_0x0054:
            r4 = 1
            r8 = 1000(0x3e8, float:1.401E-42)
        L_0x0057:
            if (r4 == 0) goto L_0x0089
            int r2 = r14.b
            if (r8 == r2) goto L_0x005e
            goto L_0x006a
        L_0x005e:
            int r2 = r14.c
            if (r1 != r2) goto L_0x006a
            int r2 = r14.d
            if (r0 != r2) goto L_0x006a
            boolean r2 = r14.k
            if (r2 != 0) goto L_0x0089
        L_0x006a:
            r14.b = r8
            r14.c = r1
            r14.d = r0
            r14.k = r9
            aifk r2 = r14.o
            if (r2 == 0) goto L_0x0089
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2.toNanos(r3)
            com.google.android.gms.location.LocationAvailability r0 = com.google.android.gms.location.LocationAvailability.a(r8, r1, r0, r2)
            aifk r1 = r14.o
            r1.a(r0)
        L_0x0089:
            return
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.location.fused.LocationStatusHelper.c():void");
    }

    public final void d() {
    }

    public final void e() {
        long j2;
        long j3;
        if ((this.b == 0 || !this.k) && this.g.f != Long.MAX_VALUE) {
            if (this.m) {
                j2 = this.j + g();
            } else {
                j2 = 0;
            }
            if (this.n) {
                j3 = this.i + f();
            } else {
                j3 = 0;
            }
            if (j2 != 0 || j3 != 0) {
                long max = Math.max(j2, j3) + u;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (max > elapsedRealtime) {
                    this.r.a(max - elapsedRealtime, this.g.k, "com.google.android.location.fused.LOCATION_STATUS_ALARM_ACTION", this);
                }
            }
        }
    }

    public final void a() {
        c();
        e();
    }

    public final void a(boolean z, boolean z2) {
        if (!z2) {
            this.j = 0;
        }
        if (!z) {
            this.i = 0;
        }
        this.m = z2;
        this.n = z;
        c();
    }

    public final void a(NetworkLocationStatus[] networkLocationStatusArr) {
        int i2;
        NetworkLocationStatus networkLocationStatus = networkLocationStatusArr[networkLocationStatusArr.length - 1];
        int i3 = networkLocationStatus.a;
        this.f = i3;
        int i4 = networkLocationStatus.b;
        this.e = i4;
        this.c = i4;
        this.d = i3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if ((!this.n || elapsedRealtime - f() > this.i) && (!this.m || elapsedRealtime - g() > this.j || a(this.c, this.d))) {
            this.b = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
            i2 = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
        } else {
            this.b = 0;
            i2 = 0;
        }
        if (this.o != null) {
            this.o.a(new LocationAvailability(i2, this.c, this.d, TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()), networkLocationStatusArr));
        }
    }
}
