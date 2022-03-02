package defpackage;

import java.util.Arrays;

/* renamed from: amjc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amjc {
    public static final amjc a = new amjc();
    private final String b = "";
    private final String c = "";

    private amjc() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amjc) {
            amjc amjc = (amjc) obj;
            return alyr.a(this.b, amjc.b) && alyr.a(this.c, amjc.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }
}
