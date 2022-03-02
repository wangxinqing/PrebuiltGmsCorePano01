package defpackage;

import android.content.Context;

/* renamed from: gwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gwz implements gxl {
    final /* synthetic */ int a;
    private double b = 0.0d;
    private int c = 0;

    public gwz(int i) {
        this.a = i;
    }

    public final void a(Object obj) {
        double d = this.b;
        double a2 = (double) gxn.a(gxn.a(obj, this.a));
        Double.isNaN(a2);
        this.b = d + a2;
        this.c++;
    }

    public final void a(StringBuilder sb, Context context) {
        double d;
        int i = this.c;
        if (i > 0) {
            double d2 = this.b;
            double d3 = (double) i;
            Double.isNaN(d3);
            d = d2 / d3;
        } else {
            d = 0.0d;
        }
        sb.append(d);
    }
}
