package defpackage;

import java.util.Arrays;

/* renamed from: amiw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amiw {
    public static final amiw a = new amiw();
    public amiv b = amiv.KIND_NOT_SET;
    public String c = "";
    private Object d = null;

    private amiw() {
    }

    public static amiu i() {
        return new amiu();
    }

    public final amih a() {
        return this.b == amiv.CREATE ? (amih) this.d : amih.a;
    }

    public final amir b() {
        return this.b == amiv.INSERT ? (amir) this.d : amir.a;
    }

    public final amik c() {
        return this.b == amiv.DELETE ? (amik) this.d : amik.a;
    }

    public final amjl d() {
        return this.b == amiv.SET ? (amjl) this.d : amjl.a;
    }

    public final amjn e() {
        return this.b == amiv.UPDATE ? (amjn) this.d : amjn.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amiw) {
            amiw amiw = (amiw) obj;
            return alyr.a(this.c, amiw.c) && alyr.a(this.d, amiw.d) && this.b == amiw.b;
        }
    }

    public final amit f() {
        return this.b == amiv.MOVE ? (amit) this.d : amit.a;
    }

    public final amip g() {
        return this.b == amiv.INDEX ? (amip) this.d : amip.a;
    }

    public final amie h() {
        return this.b == amiv.COMPOUND ? (amie) this.d : amie.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d, this.b});
    }

    public amiw(amiu amiu) {
        this.c = amiu.b;
        this.d = amiu.c;
        this.b = amiu.a;
    }
}
