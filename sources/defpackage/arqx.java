package defpackage;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/* renamed from: arqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arqx {
    static final Set a = new HashSet();
    public static final Comparator e = new arqw();
    public long b = 0;
    public Set c = a;
    public final arsx d = new arsx();

    public final void a() {
        this.b = 0;
        this.c = a;
        this.d.a();
    }

    public final boolean b() {
        Set set = this.c;
        if (!(set == null || this.b == 0 || set == a)) {
            arsx arsx = this.d;
            return (arsx.a == Double.NEGATIVE_INFINITY || arsx.b == Integer.MIN_VALUE) ? false : true;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof arqx) {
            arqx arqx = (arqx) obj;
            if (this.b == arqx.b) {
                Set set = this.c;
                if (set == null ? arqx.c == null : set.equals(arqx.c)) {
                    return this.d.equals(arqx.d);
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        int i = (int) (j ^ (j >>> 32));
        Set set = this.c;
        if (set != null) {
            i = (i * 31) + set.hashCode();
        }
        return (i * 31) + this.d.hashCode();
    }

    public final String toString() {
        long j = this.b;
        String valueOf = String.valueOf(this.c);
        double d2 = this.d.a;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91);
        sb.append("s2cellid: ");
        sb.append(j);
        sb.append(" - apEntries: ");
        sb.append(valueOf);
        sb.append(" - logLikelihoodDelta: ");
        sb.append(d2);
        return sb.toString();
    }

    public final void a(arqx arqx) {
        this.b = arqx.b;
        this.c = arqx.c;
        arsx arsx = this.d;
        arsx arsx2 = arqx.d;
        arsx.a = arsx2.a;
        arsx.b = arsx2.b;
    }
}
