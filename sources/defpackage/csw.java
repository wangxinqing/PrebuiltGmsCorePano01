package defpackage;

import java.util.Arrays;

/* renamed from: csw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class csw {
    public final String a;
    public final Long b;

    public csw(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof csw) {
            csw csw = (csw) obj;
            return amqx.a(this.a, csw.a) && amqx.a(this.b, csw.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
