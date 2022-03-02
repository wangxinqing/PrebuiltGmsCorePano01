package defpackage;

/* renamed from: aqjc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqjc implements Cloneable {
    public double a;
    public double[] b = new double[3];

    /* renamed from: a */
    public final aqjc clone() {
        try {
            aqjc aqjc = (aqjc) super.clone();
            aqjc.b = new double[this.b.length];
            aqjc.a(this);
            return aqjc;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void a(aqjc aqjc) {
        double[] dArr;
        int length;
        this.a = aqjc.a;
        double[] dArr2 = aqjc.b;
        if (dArr2 != null && (dArr = this.b) != null && (length = dArr2.length) == dArr.length) {
            System.arraycopy(dArr2, 0, dArr, 0, length);
        }
    }
}
