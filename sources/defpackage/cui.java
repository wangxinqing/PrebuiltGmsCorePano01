package defpackage;

import java.util.Arrays;

/* renamed from: cui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cui {
    public final String a;
    public final String b;
    public final aqsr c;
    public final boolean d;
    public final String e;
    public final csl f;

    public cui(String str, String str2, aqsr aqsr, boolean z, String str3, csl csl) {
        this.a = str;
        this.b = str2;
        this.c = aqsr;
        this.d = z;
        this.f = csl;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cui) {
            cui cui = (cui) obj;
            return this.d == cui.d && amqx.a(this.e, cui.e) && amqx.a(this.a, cui.a) && amqx.a(this.b, cui.b) && amqx.a(this.c, cui.c) && amqx.a(this.f, cui.f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d), this.e, this.f});
    }
}
