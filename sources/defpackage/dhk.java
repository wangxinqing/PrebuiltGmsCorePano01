package defpackage;

import java.util.Arrays;

/* renamed from: dhk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dhk {
    public final aqsr a;
    public final aqsr b;
    public final aqsr c;
    public final aqsr d;
    public final dhh e;

    public dhk(aqsr aqsr, aqsr aqsr2, aqsr aqsr3, aqsr aqsr4, dhh dhh) {
        this.a = aqsr;
        this.b = aqsr2;
        this.c = aqsr3;
        this.d = aqsr4;
        this.e = dhh;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dhk)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        dhk dhk = (dhk) obj;
        return amqx.a(this.a, dhk.a) && amqx.a(this.b, dhk.b) && amqx.a(this.c, dhk.c) && amqx.a(this.d, dhk.d) && amqx.a(this.e, dhk.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }
}
