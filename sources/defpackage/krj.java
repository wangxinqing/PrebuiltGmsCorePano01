package defpackage;

/* renamed from: krj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class krj {
    public final kke a;
    public final kqi b;
    public boolean c = false;

    protected krj(kke kke, kqi kqi) {
        this.a = kke;
        this.b = kqi;
    }

    public final kqi a() {
        iva.a(!this.c, (Object) "Cannot interact with a deleted domain class");
        return this.b;
    }

    public final boolean b() {
        return this.a.b();
    }

    public final void c() {
        iva.a(!this.c, (Object) "Cannot interact with a deleted domain class");
        this.a.a(this.b);
    }
}
