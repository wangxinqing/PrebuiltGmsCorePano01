package defpackage;

import java.io.Serializable;

/* renamed from: amrj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amrj implements Serializable {
    private static final long serialVersionUID = 747826592375603043L;
    public final Object a;
    public final Object b;

    protected amrj(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static amrj a(Object obj, Object obj2) {
        return new amrj(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amrj) {
            amrj amrj = (amrj) obj;
            return amqx.a(this.a, amrj.a) && amqx.a(this.b, amrj.b);
        }
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(valueOf2).length());
        sb.append("(");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
