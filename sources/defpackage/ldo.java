package defpackage;

import java.util.Arrays;

/* renamed from: ldo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ldo {
    public final long[] a;
    private int b = 0;

    public ldo() {
        long[] jArr = new long[2];
        this.a = jArr;
        Arrays.fill(jArr, 0);
    }

    public final long a(int i) {
        boolean z = false;
        if (i >= 0 && i < this.a.length) {
            z = true;
        }
        iva.b(z, "Offset is out ot bounds");
        int i2 = this.b - i;
        if (i2 < 0) {
            i2 += this.a.length;
        }
        return this.a[i2];
    }

    public final void a(long j) {
        int i = this.b + 1;
        this.b = i;
        long[] jArr = this.a;
        if (i >= jArr.length) {
            this.b = 0;
            i = 0;
        }
        long j2 = jArr[i];
        jArr[i] = j;
    }
}
