package defpackage;

import java.util.Arrays;

/* renamed from: amih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amih {
    public static final amih a = new amih();
    public amig b = amig.KIND_NOT_SET;
    private Object c = null;

    private amih() {
    }

    public static amif b() {
        return new amif();
    }

    public final amiy a() {
        return this.b == amig.CUSTOM ? (amiy) this.c : amiy.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amih) {
            amih amih = (amih) obj;
            return alyr.a(this.c, amih.c) && this.b == amih.b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.b});
    }

    public amih(amif amif) {
        this.c = amif.b;
        this.b = amif.a;
    }
}
