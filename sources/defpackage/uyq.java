package defpackage;

import android.os.SystemClock;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: uyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uyq {
    public final String a;
    public final uyp b;
    public final MessageFilter c;
    public final Strategy d;
    public final long e;
    public vdo f;

    public uyq(uyp uyp, MessageFilter messageFilter, Strategy strategy) {
        String valueOf = String.valueOf(UUID.randomUUID());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
        sb.append("s#");
        sb.append(valueOf);
        this.a = sb.toString();
        iva.a((Object) messageFilter);
        this.c = messageFilter;
        iva.a((Object) uyp);
        this.b = uyp;
        iva.a((Object) strategy);
        this.d = strategy;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long a2 = vds.a(this.d);
        this.e = !vds.a(a2) ? elapsedRealtime + a2 : Long.MAX_VALUE;
    }

    public final boolean a() {
        return this.b.b != null;
    }

    public final long b() {
        return vds.a(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uyq) {
            uyq uyq = (uyq) obj;
            return this.e == uyq.e && ius.a(this.b, uyq.b) && ius.a(this.c, uyq.c) && ius.a(this.d, uyq.d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d});
    }

    public final String toString() {
        long elapsedRealtime = this.e - SystemClock.elapsedRealtime();
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(!vds.a(b()) ? Long.valueOf(elapsedRealtime) : "infinite");
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 66 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Subscription{id=");
        sb.append(str);
        sb.append(", listener=");
        sb.append(valueOf);
        sb.append(", strategy=");
        sb.append(valueOf2);
        sb.append(", filter=");
        sb.append(valueOf3);
        sb.append(", expiresInMillis=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
