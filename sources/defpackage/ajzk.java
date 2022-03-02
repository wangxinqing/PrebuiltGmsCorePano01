package defpackage;

/* renamed from: ajzk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajzk {
    public ajyz a = ajzg.a();
    public ajyz b = ajzg.a();
    public ajyz c = ajzg.a();
    public ajyz d = ajzg.a();
    public ajyy e = new ajyw(0.0f);
    public ajyy f = new ajyw(0.0f);
    public ajyy g = new ajyw(0.0f);
    public ajyy h = new ajyw(0.0f);
    public ajzb i = ajzg.b();
    public ajzb j = ajzg.b();
    public ajzb k = ajzg.b();
    public ajzb l = ajzg.b();

    public ajzk() {
    }

    public static void a(ajyz ajyz) {
        if (ajyz instanceof ajzj) {
            float f2 = ((ajzj) ajyz).a;
        } else if (ajyz instanceof ajza) {
            float f3 = ((ajza) ajyz).a;
        }
    }

    public final void b(float f2) {
        this.g = new ajyw(f2);
    }

    public final void c(float f2) {
        this.e = new ajyw(f2);
    }

    public final void d(float f2) {
        this.f = new ajyw(f2);
    }

    public final void e(float f2) {
        c(f2);
        d(f2);
        b(f2);
        a(f2);
    }

    public final ajzl a() {
        return new ajzl(this);
    }

    public final void a(float f2) {
        this.h = new ajyw(f2);
    }

    public ajzk(ajzl ajzl) {
        this.a = ajzl.b;
        this.b = ajzl.c;
        this.c = ajzl.d;
        this.d = ajzl.e;
        this.e = ajzl.f;
        this.f = ajzl.g;
        this.g = ajzl.h;
        this.h = ajzl.i;
        this.i = ajzl.j;
        this.j = ajzl.k;
        this.k = ajzl.l;
        this.l = ajzl.m;
    }
}
