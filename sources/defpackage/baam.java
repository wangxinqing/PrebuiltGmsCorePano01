package defpackage;

import java.util.Arrays;

/* renamed from: baam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baam {
    public final babj a;
    public final Object b;

    private baam(babj babj) {
        this.b = null;
        amrl.a((Object) babj, (Object) "status");
        this.a = babj;
        amrl.a(!babj.a(), "cannot use OK status: %s", (Object) babj);
    }

    public static baam a(babj babj) {
        return new baam(babj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            baam baam = (baam) obj;
            return amqx.a(this.a, baam.a) && amqx.a(this.b, baam.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        if (this.b != null) {
            amrg a2 = amrh.a((Object) this);
            a2.a("config", this.b);
            return a2.toString();
        }
        amrg a3 = amrh.a((Object) this);
        a3.a("error", (Object) this.a);
        return a3.toString();
    }

    public static baam a(Object obj) {
        return new baam(obj);
    }

    private baam(Object obj) {
        amrl.a(obj, (Object) "config");
        this.b = obj;
        this.a = null;
    }
}
