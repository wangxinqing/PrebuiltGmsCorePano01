package defpackage;

import java.io.Serializable;

/* renamed from: amrp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amrp implements Serializable, amrm {
    private static final long serialVersionUID = 0;
    final amrm a;

    public amrp(amrm amrm) {
        amrl.a((Object) amrm);
        this.a = amrm;
    }

    public final boolean a(Object obj) {
        return !this.a.a(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amrp) {
            return this.a.equals(((amrp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ -1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("Predicates.not(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
