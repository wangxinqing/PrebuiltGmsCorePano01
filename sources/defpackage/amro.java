package defpackage;

import java.io.Serializable;

/* renamed from: amro  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amro implements Serializable, amrm {
    private static final long serialVersionUID = 0;
    private final Object a;

    public amro(Object obj) {
        this.a = obj;
    }

    public final boolean a(Object obj) {
        return this.a.equals(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amro) {
            return this.a.equals(((amro) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Predicates.equalTo(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
