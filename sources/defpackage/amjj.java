package defpackage;

import java.util.Arrays;

/* renamed from: amjj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amjj {
    public static final amjj a = new amjj();
    public String b = "";
    public String c = "";
    public String d = "";
    public boolean e = false;
    public String f = "";
    public String g = "";
    public amhz h = amhz.a;
    public int i = 0;

    private amjj() {
    }

    public static amji a() {
        return new amji();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amjj) {
            amjj amjj = (amjj) obj;
            return alyr.a(this.b, amjj.b) && alyr.a(this.c, amjj.c) && alyr.a(this.d, amjj.d) && alyr.a(Boolean.valueOf(this.e), Boolean.valueOf(amjj.e)) && alyr.a(this.f, amjj.f) && alyr.a(this.g, amjj.g) && alyr.a(this.h, amjj.h) && alyr.a(Integer.valueOf(this.i), Integer.valueOf(amjj.i));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.g, Boolean.valueOf(this.e), this.d, this.b, this.c, this.h, Integer.valueOf(this.i)});
    }

    public amjj(amji amji) {
        this.b = amji.a;
        this.c = amji.b;
        this.d = amji.c;
        this.e = amji.d;
        this.f = amji.e;
        this.g = amji.f;
        this.h = amji.g;
        this.i = amji.h;
    }
}
