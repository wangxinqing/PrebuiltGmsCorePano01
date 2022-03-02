package defpackage;

import java.util.Arrays;

/* renamed from: amip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amip {
    public static final amip a = new amip();
    public String b = "";
    public int c = 0;
    public amii d = amii.SHIFT_AFTER_DELETE;

    private amip() {
    }

    public static amio b() {
        return new amio();
    }

    public final amio a() {
        return new amio(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amip) {
            amip amip = (amip) obj;
            return alyr.a(this.b, amip.b) && alyr.a(Integer.valueOf(this.c), Integer.valueOf(amip.c)) && alyr.a(this.d, amip.d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.b, Integer.valueOf(this.c)});
    }

    public amip(amio amio) {
        this.b = amio.a;
        this.c = amio.b;
        this.d = amio.c;
    }
}
