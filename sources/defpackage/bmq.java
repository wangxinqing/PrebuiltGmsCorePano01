package defpackage;

import java.util.Arrays;

/* renamed from: bmq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class bmq {
    /* access modifiers changed from: protected */
    public abstract String a();

    /* access modifiers changed from: protected */
    public abstract String b();

    public final boolean equals(Object obj) {
        if (obj instanceof bmq) {
            bmq bmq = (bmq) obj;
            if (!amqx.a(a(), bmq.a()) || !amqx.a(b(), bmq.b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b()});
    }

    public final String toString() {
        String a = a();
        String b = b();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 3 + String.valueOf(b).length());
        sb.append("[");
        sb.append(a);
        sb.append(":");
        sb.append(b);
        sb.append("]");
        return sb.toString();
    }
}
