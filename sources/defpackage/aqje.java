package defpackage;

/* renamed from: aqje  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqje {
    public final double[] a;
    public aqjd[] b;
    public aqjd[] c;
    public final int[] d;
    public final aqjg e;

    public aqje(aqjg aqjg, int i) {
        ativ.a((Object) aqjg);
        this.e = aqjg;
        int i2 = 0;
        i = i < 0 ? 0 : i;
        double[] dArr = new double[i];
        this.a = dArr;
        this.b = new aqjd[i];
        this.c = new aqjd[i];
        this.d = new int[i];
        aqjf.c(dArr);
        while (true) {
            aqjd[] aqjdArr = this.b;
            if (i2 < aqjdArr.length) {
                aqjdArr[i2] = new aqjd();
                this.c[i2] = new aqjd();
                this.d[i2] = i2;
                i2++;
            } else {
                return;
            }
        }
    }

    public final double a(int i) {
        double[] dArr = this.a;
        if (i < dArr.length && i >= 0) {
            return dArr[i];
        }
        return 0.0d;
    }
}
