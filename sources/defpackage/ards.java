package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: ards  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ards {
    private static final double[] e = new double[0];
    public final ardr a;
    public final double b = Double.MIN_VALUE;
    public final double[] c;
    public final double[] d;

    public ards(ardr ardr) {
        this.a = ardr;
        double[] dArr = e;
        this.c = dArr;
        this.d = dArr;
    }

    public final List a() {
        return this.a.a;
    }

    public final boolean b() {
        return false;
    }

    public final long c() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ards) {
            ards ards = (ards) obj;
            if (this.a.equals(ards.a)) {
                double d2 = ards.b;
                if (Double.compare(Double.MIN_VALUE, Double.MIN_VALUE) != 0 || !Arrays.equals(this.c, ards.c) || !Arrays.equals(this.d, ards.d)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(Double.MIN_VALUE);
        return (((((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.a.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ardq ardq = (ardq) list.get(i);
            sb.append(ardj.a(ardq.a));
            sb.append(" = ");
            sb.append(ardq.b);
            sb.append("\n");
        }
        if (b()) {
            sb.append("GpsSpeed = ");
            sb.append(Double.MIN_VALUE);
            sb.append("\n");
        }
        sb.append("Timemillis = ");
        sb.append(c());
        return sb.toString();
    }
}
