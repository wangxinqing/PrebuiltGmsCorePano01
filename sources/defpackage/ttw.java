package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: ttw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ttw extends tug {
    private final Context b;
    private final avuu c;
    private final ClientContext d;
    private final int e;

    public ttw(Context context, avuu avuu, ClientContext clientContext, int i) {
        this.b = context;
        this.c = avuu;
        this.d = clientContext;
        this.e = i;
    }

    public final Context a() {
        return this.b;
    }

    public final avuu b() {
        return this.c;
    }

    public final ClientContext c() {
        return this.d;
    }

    public final int d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tug) {
            tug tug = (tug) obj;
            return this.b.equals(tug.a()) && this.c.equals(tug.b()) && this.d.equals(tug.c()) && this.e == tug.d();
        }
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        avuu avuu = this.c;
        int i = avuu.S;
        if (i == 0) {
            i = aueh.a.a((Object) avuu).a(avuu);
            avuu.S = i;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int i = this.e;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 92 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("FailedStoreAccessoryRequest{context=");
        sb.append(valueOf);
        sb.append(", request=");
        sb.append(valueOf2);
        sb.append(", clientContext=");
        sb.append(valueOf3);
        sb.append(", allowedAttempts=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
