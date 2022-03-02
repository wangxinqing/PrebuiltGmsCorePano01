package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: cgq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cgq {
    private static final long c = TimeUnit.MINUTES.toNanos(2);
    public final cgz a;
    public final cgt b;

    public cgq(cgz cgz, cgt cgt) {
        this.a = cgz;
        this.b = cgt;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r2 = r7.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean c() {
        /*
            r7 = this;
            cgz r0 = r7.a
            r1 = 0
            if (r0 == 0) goto L_0x0016
            cgt r2 = r7.b
            if (r2 == 0) goto L_0x0016
            long r3 = r0.a
            long r5 = r2.a
            long r3 = r3 - r5
            long r5 = c
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0016
            r0 = 1
            return r0
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgq.c():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r2 = r6.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean d() {
        /*
            r6 = this;
            cgz r0 = r6.a
            r1 = 0
            if (r0 == 0) goto L_0x0016
            cgt r2 = r6.b
            if (r2 == 0) goto L_0x0016
            long r2 = r2.a
            long r4 = r0.a
            long r2 = r2 - r4
            long r4 = c
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0016
            r0 = 1
            return r0
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgq.d():boolean");
    }

    public final cgr a() {
        cgz cgz = this.a;
        if (cgz == null && this.b == null) {
            return null;
        }
        if (cgz == null || d()) {
            return cgr.NO_WIFI;
        }
        if (this.b == null || c()) {
            return cgr.NO_GPS;
        }
        return cgr.FULL;
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        sb.append(a());
        sb.append("; ");
        if (this.a != null) {
            sb.append(String.format(Locale.US, "rssi=%.1f,%.1f", new Object[]{this.a.b.get(0), this.a.d.get(0)}));
            if (d()) {
                long j = this.b.a;
                long j2 = this.a.a;
                sb.append(" (");
                sb.append(TimeUnit.NANOSECONDS.toSeconds(j - j2));
                sb.append(" secs old)");
            }
        } else {
            sb.append("<no WiFi>");
        }
        sb.append("; ");
        if (this.b != null) {
            sb.append(String.format(Locale.US, "snr=%.1f", new Object[]{this.b.b.get(0)}));
            if (c()) {
                long j3 = this.a.a;
                long j4 = this.b.a;
                sb.append(" (");
                sb.append(TimeUnit.NANOSECONDS.toSeconds(j3 - j4));
                sb.append(" secs old)");
            }
        } else {
            sb.append("<no GPS>");
        }
        return sb.toString();
    }

    public final String toString() {
        return b();
    }
}
