package defpackage;

import java.util.Arrays;

/* renamed from: ahgw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahgw implements ahgp {
    double[] a = new double[5];
    int b = 0;

    public final aqdf a() {
        aucd o = aqdd.b.o();
        for (int i = 0; i < this.b; i++) {
            aucd o2 = aqdc.d.o();
            double d = this.a[i];
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aqdc aqdc = (aqdc) o2.b;
            int i2 = aqdc.a | 1;
            aqdc.a = i2;
            aqdc.b = d;
            aqdc.a = i2 | 2;
            aqdc.c = 1;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqdd aqdd = (aqdd) o.b;
            aqdc aqdc2 = (aqdc) o2.i();
            aqdc2.getClass();
            if (!aqdd.a.a()) {
                aqdd.a = aucj.a(aqdd.a);
            }
            aqdd.a.add(aqdc2);
        }
        aucd o3 = aqdf.c.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aqdf aqdf = (aqdf) o3.b;
        aqdd aqdd2 = (aqdd) o.i();
        aqdd2.getClass();
        aqdf.b = aqdd2;
        aqdf.a = 3;
        return (aqdf) o3.i();
    }

    public final String toString() {
        return ", count = " + this.b + ", value =" + Arrays.toString(this.a);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Double d = (Double) obj;
        int i = this.b + 1;
        double[] dArr = this.a;
        int length = dArr.length;
        if (i - length > 0) {
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if (-2147483639 + i2 > 0) {
                if (i >= 0) {
                    i2 = i <= 2147483639 ? 2147483639 : Integer.MAX_VALUE;
                } else {
                    throw new OutOfMemoryError();
                }
            }
            this.a = Arrays.copyOf(dArr, i2);
        }
        this.a[this.b] = d.doubleValue();
        this.b++;
    }
}
