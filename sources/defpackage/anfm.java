package defpackage;

import java.io.Serializable;

/* renamed from: anfm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anfm extends anfn implements Serializable, amrm {
    private static final anfm c = new anfm(amyd.a, amyb.a);
    private static final long serialVersionUID = 0;
    final amyf a;
    final amyf b;

    private anfm(amyf amyf, amyf amyf2) {
        amrl.a((Object) amyf);
        this.a = amyf;
        amrl.a((Object) amyf2);
        this.b = amyf2;
        if (amyf.compareTo(amyf2) > 0 || amyf == amyb.a || amyf2 == amyd.a) {
            String valueOf = String.valueOf(a(amyf, amyf2));
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid range: ") : "Invalid range: ".concat(valueOf));
        }
    }

    public static anfm a(Comparable comparable, Comparable comparable2) {
        return new anfm(new amye(comparable), new amyc(comparable2));
    }

    static int b(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anfm) {
            anfm anfm = (anfm) obj;
            return this.a.equals(anfm.a) && this.b.equals(anfm.b);
        }
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return equals(c) ? c : this;
    }

    public final String toString() {
        return a(this.a, this.b);
    }

    public final Comparable b() {
        return this.b.a();
    }

    private static String a(amyf amyf, amyf amyf2) {
        StringBuilder sb = new StringBuilder(16);
        amyf.a(sb);
        sb.append("..");
        amyf2.b(sb);
        return sb.toString();
    }

    public final Comparable a() {
        return this.a.a();
    }

    public final boolean a(Comparable comparable) {
        amrl.a((Object) comparable);
        return this.a.a(comparable) && !this.b.a(comparable);
    }
}
