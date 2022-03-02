package defpackage;

import java.util.Arrays;

/* renamed from: amjn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amjn {
    public static final amjn a = new amjn();
    public String b = "";
    public amjf c = amjf.a;

    private amjn() {
    }

    public static amjm a() {
        return new amjm();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amjn) {
            amjn amjn = (amjn) obj;
            return alyr.a(this.b, amjn.b) && alyr.a(this.c, amjn.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    public amjn(amjm amjm) {
        this.b = amjm.a;
        this.c = amjm.b;
    }
}
