package defpackage;

import java.util.Arrays;

/* renamed from: amhz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amhz {
    public static final amhz a = new amhz();
    public long b = 0;
    public int c = 0;

    private amhz() {
    }

    public static amhy a() {
        return new amhy();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amhz) {
            amhz amhz = (amhz) obj;
            return alyr.a(Long.valueOf(this.b), Long.valueOf(amhz.b)) && alyr.a(Integer.valueOf(this.c), Integer.valueOf(amhz.c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public amhz(amhy amhy) {
        this.b = amhy.a;
        this.c = amhy.b;
    }
}
