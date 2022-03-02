package defpackage;

import android.os.SystemClock;

/* renamed from: ahla  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahla {
    public boolean a = false;
    public final aizy b;
    public long c;
    public int d;
    private final ajbf e;
    private final ahup f;
    private final boolean g;
    private final aicn h;
    private int i;

    public ahla(ahup ahup, aizy aizy, ajbf ajbf, aicn aicn) {
        this.b = aizy;
        this.e = ajbf;
        this.f = ahup;
        this.g = ajbf.b(ahup);
        this.h = aicn;
        String valueOf = String.valueOf(ahup);
        boolean z = this.g;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("sensor=");
        sb.append(valueOf);
        sb.append(", supportSensorBatching=");
        sb.append(z);
        sb.toString();
    }

    public final void a() {
        if (this.a) {
            ajbf ajbf = this.e;
            ahup ahup = this.f;
            aixe aixe = (aixe) ajbf;
            ahrx a2 = ahrx.a(aixe.e, aixe.b, new ajrh("RealSensorService"));
            amrl.a((Object) a2);
            a2.a("ActivityDetectionScheduler", ahup);
            this.a = false;
            String valueOf = String.valueOf(this.f);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Sensor batching is off for ");
            sb.append(valueOf);
            sb.toString();
            this.h.a(aico.SENSOR_BATCHING_CHANGED, 0, Integer.numberOfTrailingZeros(this.f.x));
        }
    }

    public final void a(int i2, int i3) {
        int i4;
        boolean z = this.a;
        if ((!z || this.i != i3) && this.g) {
            if (z && (i4 = this.i) != i3) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Resizing buffer size from ");
                sb.append(i4);
                sb.append(" to ");
                sb.append(i3);
                sb.toString();
            }
            this.i = i3;
            ajbf ajbf = this.e;
            ahup ahup = this.f;
            aixe aixe = (aixe) ajbf;
            ahrx a2 = ahrx.a(aixe.e, aixe.b, new ajrh("ActivityScheduler"));
            amrl.a((Object) a2);
            a2.h = axwx.a.a().sensorBatchingFlushTimeoutMillis();
            boolean a3 = a2.a("ActivityDetectionScheduler", ahup, i2, i3);
            this.a = a3;
            if (a3) {
                this.c = SystemClock.elapsedRealtime();
                this.d = i2;
                String valueOf = String.valueOf(this.f);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb2.append("Sensor batching is on for ");
                sb2.append(valueOf);
                sb2.toString();
                this.h.a(aico.SENSOR_BATCHING_CHANGED, 1, Integer.numberOfTrailingZeros(this.f.x), i2);
            }
        }
    }
}
