package defpackage;

import java.util.Arrays;

/* renamed from: azys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azys {
    public final String a;
    public final azyr b;
    public final long c;
    public final azzb d = null;
    public final azzb e;

    public azys(String str, azyr azyr, long j, azzb azzb) {
        this.a = str;
        amrl.a((Object) azyr, (Object) "severity");
        this.b = azyr;
        this.c = j;
        this.e = azzb;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof azys) {
            azys azys = (azys) obj;
            if (amqx.a(this.a, azys.a) && amqx.a(this.b, azys.b) && this.c == azys.c) {
                azzb azzb = azys.d;
                if (!amqx.a((Object) null, (Object) null) || !amqx.a(this.e, azys.e)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), null, this.e});
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("description", (Object) this.a);
        a2.a("severity", (Object) this.b);
        a2.a("timestampNanos", this.c);
        a2.a("channelRef", (Object) null);
        a2.a("subchannelRef", (Object) this.e);
        return a2.toString();
    }
}
