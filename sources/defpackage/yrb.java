package defpackage;

/* renamed from: yrb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yrb implements icm {
    final /* synthetic */ yrd a;

    public yrb(yrd yrd) {
        this.a = yrd;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        wlg wlg = (wlg) icl;
        yrd yrd = this.a;
        yrd.e = false;
        yrd.f = wlg.aO();
        yrd yrd2 = this.a;
        yrd2.g = yrd.a(yrd2.b, wlg.b());
        yrd yrd3 = this.a;
        yrd3.h = yrd.a(yrd3.c, wlg.c());
        if (wlg.aO().c() && this.a.c.size() == 1 && wlg.c().size() == 0 && this.a.b.size() == 0 && wlg.b().size() == 0) {
            yrd yrd4 = this.a;
            yrd4.h.addAll(yrd4.c);
        }
        this.a.b();
    }
}
