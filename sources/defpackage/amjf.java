package defpackage;

import java.util.Arrays;

/* renamed from: amjf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amjf {
    public static final amjf a = new amjf();
    public amje b = amje.KIND_NOT_SET;
    private Object c = null;

    private amjf() {
    }

    public static amjd c() {
        return new amjd();
    }

    public final amic a() {
        return this.b == amje.JSON ? (amic) this.c : amic.a;
    }

    public final String b() {
        return this.b == amje.REFERENCED_ID ? (String) this.c : "";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amjf) {
            amjf amjf = (amjf) obj;
            return alyr.a(this.c, amjf.c) && this.b == amjf.b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.b});
    }

    public amjf(amjd amjd) {
        this.c = amjd.b;
        this.b = amjd.a;
    }
}
