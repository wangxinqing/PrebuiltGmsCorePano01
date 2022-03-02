package defpackage;

import com.google.android.gms.location.WifiScan;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rff {
    public static final AtomicReference a = new AtomicReference();
    public long b;
    public long[] c;
    public int[] d;
    public int[] e;
    public int[] f;
    public int[] g;
    public int[] h;
    public int[] i;
    public int j;
    public boolean k;

    public rff(int i2, long j2, boolean z) {
        a(i2, j2, z);
    }

    public final void a(int i2, long j2, boolean z) {
        this.b = j2;
        this.k = z;
        this.c = new long[i2];
        this.d = new int[i2];
        if (z) {
            this.e = new int[i2];
            this.f = new int[i2];
            this.g = new int[i2];
            this.h = new int[i2];
            this.i = new int[i2];
        } else {
            this.e = WifiScan.b;
            this.f = WifiScan.b;
            this.g = WifiScan.b;
            this.h = WifiScan.b;
            this.i = WifiScan.b;
        }
        this.j = 0;
    }

    public final void a(long j2, byte b2, int i2) {
        int i3 = this.j;
        long[] jArr = this.c;
        if (i3 < jArr.length) {
            jArr[i3] = j2 | (((long) b2) << 48);
            this.d[i3] = i2;
            this.j = i3 + 1;
            return;
        }
        throw new IllegalStateException("Builder is full, have already added devices to capacity");
    }
}
