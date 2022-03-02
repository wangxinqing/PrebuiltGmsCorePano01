package defpackage;

import java.util.Arrays;

/* renamed from: amik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amik {
    public static final amik a = new amik();
    public int b = 0;
    public int c = 0;

    private amik() {
    }

    public static amij b() {
        return new amij();
    }

    public final amij a() {
        return new amij(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amik) {
            amik amik = (amik) obj;
            return alyr.a(Integer.valueOf(this.b), Integer.valueOf(amik.b)) && alyr.a(Integer.valueOf(this.c), Integer.valueOf(amik.c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public amik(amij amij) {
        this.b = amij.a;
        this.c = amij.b;
    }
}
