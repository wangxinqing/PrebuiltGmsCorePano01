package defpackage;

/* renamed from: awed  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awed extends awee {
    private final Object a;

    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awed) {
            return amqx.a(this.a, ((awed) obj).a);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append("Produced[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public awed(Object obj) {
        this.a = obj;
    }
}
