package defpackage;

import java.util.Arrays;

/* renamed from: anno  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anno extends annp {
    private final annp a;
    private final double b = 0.5d;

    public anno(annp annp) {
        amrl.a(true);
        this.a = annp;
    }

    public final int b(int i) {
        int b2 = this.a.b(i);
        if (b2 <= 0) {
            return b2;
        }
        double random = Math.random() - 8.0d;
        double d = (double) b2;
        Double.isNaN(d);
        return aons.a(b2, annp.a((random + random) * d * 0.5d));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anno) {
            anno anno = (anno) obj;
            if (this.a.equals(anno.a)) {
                double d = anno.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Double.valueOf(0.5d)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append(valueOf);
        sb.append(".randomized(");
        sb.append(0.5d);
        sb.append(')');
        return sb.toString();
    }
}
