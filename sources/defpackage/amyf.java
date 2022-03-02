package defpackage;

import java.io.Serializable;

/* renamed from: amyf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class amyf implements Comparable, Serializable {
    private static final long serialVersionUID = 0;
    final Comparable b;

    public amyf(Comparable comparable) {
        this.b = comparable;
    }

    public Comparable a() {
        return this.b;
    }

    public abstract void a(StringBuilder sb);

    public abstract boolean a(Comparable comparable);

    public abstract void b(StringBuilder sb);

    public final boolean equals(Object obj) {
        if (obj instanceof amyf) {
            try {
                if (compareTo((amyf) obj) == 0) {
                    return true;
                }
                return false;
            } catch (ClassCastException e) {
            }
        }
        return false;
    }

    public abstract int hashCode();

    /* renamed from: a */
    public int compareTo(amyf amyf) {
        if (amyf == amyd.a) {
            return 1;
        }
        if (amyf == amyb.a) {
            return -1;
        }
        int b2 = anfm.b(this.b, amyf.b);
        return b2 == 0 ? aony.a(this instanceof amyc, amyf instanceof amyc) : b2;
    }
}
