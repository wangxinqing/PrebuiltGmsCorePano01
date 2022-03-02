package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: amxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amxf extends anfk implements Serializable {
    private static final long serialVersionUID = 0;
    final amqy a;
    final anfk b;

    public amxf(amqy amqy, anfk anfk) {
        amrl.a((Object) amqy);
        this.a = amqy;
        amrl.a((Object) anfk);
        this.b = anfk;
    }

    public final int compare(Object obj, Object obj2) {
        return this.b.compare(this.a.a(obj), this.a.a(obj2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amxf) {
            amxf amxf = (amxf) obj;
            return this.a.equals(amxf.a) && this.b.equals(amxf.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
