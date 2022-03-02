package defpackage;

/* renamed from: nto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nto {
    public static final nto a = new nto(0);
    public final int b;
    private final int c = 30;
    private final int d = 3600;

    static {
        new nto(1);
    }

    private nto(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nto) {
            nto nto = (nto) obj;
            if (nto.b == this.b) {
                int i = nto.c;
                int i2 = nto.d;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b + 1) ^ 1000003) * 1000003) ^ 30) * 1000003) ^ 3600;
    }

    public final String toString() {
        int i = this.b;
        StringBuilder sb = new StringBuilder(74);
        sb.append("policy=");
        sb.append(i);
        sb.append(" initial_backoff=30 maximum_backoff=3600");
        return sb.toString();
    }
}
