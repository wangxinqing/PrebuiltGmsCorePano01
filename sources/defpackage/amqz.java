package defpackage;

import java.io.Serializable;

/* renamed from: amqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amqz implements Serializable, amqy {
    private static final long serialVersionUID = 0;
    private final Object a;

    public amqz(Object obj) {
        this.a = obj;
    }

    public final Object a(Object obj) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amqz) {
            return amqx.a(this.a, ((amqz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Functions.constant(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
