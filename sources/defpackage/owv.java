package defpackage;

/* renamed from: owv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class owv {
    final /* synthetic */ oww a;
    public int b = 1;

    public owv(oww oww) {
        this.a = oww;
    }

    public final void a() {
        boolean z = true;
        if (this.b != 1) {
            z = false;
        }
        iva.a(z);
        this.b = 2;
        oww oww = this.a;
        oww.d.a(oww);
    }

    public final boolean b() {
        iva.a(this.b == 1);
        owy owy = this.a.b;
        if (owy == null || owy.a >= 10) {
            return false;
        }
        this.b = 3;
        return true;
    }
}
