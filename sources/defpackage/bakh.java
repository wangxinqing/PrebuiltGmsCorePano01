package defpackage;

import java.util.Arrays;

/* renamed from: bakh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bakh extends azzi {
    public final azxh a;
    public final baaf b;
    public final baaj c;

    public bakh(baaj baaj, baaf baaf, azxh azxh) {
        amrl.a((Object) baaj, (Object) "method");
        this.c = baaj;
        amrl.a((Object) baaf, (Object) "headers");
        this.b = baaf;
        amrl.a((Object) azxh, (Object) "callOptions");
        this.a = azxh;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bakh bakh = (bakh) obj;
            return amqx.a(this.a, bakh.a) && amqx.a(this.b, bakh.b) && amqx.a(this.c, bakh.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.a);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 31 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("[method=");
        sb.append(valueOf);
        sb.append(" headers=");
        sb.append(valueOf2);
        sb.append(" callOptions=");
        sb.append(valueOf3);
        sb.append("]");
        return sb.toString();
    }
}
