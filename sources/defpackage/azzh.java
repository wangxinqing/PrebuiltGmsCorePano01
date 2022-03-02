package defpackage;

import java.util.Arrays;

/* renamed from: azzh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azzh {
    public static final azzh a = new azzh((azzl) null, babj.b, false);
    public final azzl b;
    public final babj c;
    public final boolean d;
    private final azxr e = null;

    private azzh(azzl azzl, babj babj, boolean z) {
        this.b = azzl;
        amrl.a((Object) babj, (Object) "status");
        this.c = babj;
        this.d = z;
    }

    public static azzh a(azzl azzl) {
        amrl.a((Object) azzl, (Object) "subchannel");
        return new azzh(azzl, babj.b, false);
    }

    public static azzh a(babj babj) {
        amrl.a(!babj.a(), (Object) "error status shouldn't be OK");
        return new azzh((azzl) null, babj, false);
    }

    public static azzh b(babj babj) {
        amrl.a(!babj.a(), (Object) "drop status shouldn't be OK");
        return new azzh((azzl) null, babj, true);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof azzh) {
            azzh azzh = (azzh) obj;
            if (amqx.a(this.b, azzh.b) && amqx.a(this.c, azzh.c)) {
                azxr azxr = azzh.e;
                if (!amqx.a((Object) null, (Object) null) || this.d != azzh.d) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, null, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("subchannel", (Object) this.b);
        a2.a("streamTracerFactory", (Object) null);
        a2.a("status", (Object) this.c);
        a2.a("drop", this.d);
        return a2.toString();
    }
}
