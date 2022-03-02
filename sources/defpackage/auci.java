package defpackage;

/* renamed from: auci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auci extends aubq {
    final audx a;
    public final Object b;
    final audx c;
    public final auch d;

    public auci(audx audx, Object obj, audx audx2, auch auch) {
        if (audx == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        } else if (auch.b == aufw.MESSAGE && audx2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        } else {
            this.a = audx;
            this.b = obj;
            this.c = audx2;
            this.d = auch;
        }
    }

    public final int a() {
        return this.d.a;
    }

    public final aufw b() {
        return this.d.b;
    }

    public final void a(Object obj) {
        if (this.d.a() == aufx.ENUM) {
            ((Integer) obj).intValue();
            throw null;
        }
    }
}
