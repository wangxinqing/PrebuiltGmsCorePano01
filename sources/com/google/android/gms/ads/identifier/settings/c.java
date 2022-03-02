package com.google.android.gms.ads.identifier.settings;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class c implements d {
    private final e a;
    private final String b;

    public c(e eVar, String str) {
        this.a = eVar;
        this.b = str;
    }

    public final void a(aucd aucd) {
        e eVar = this.a;
        String str = this.b;
        aucd o = aotu.c.o();
        aucd a2 = eVar.a(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aotu aotu = (aotu) o.b;
        aotp aotp = (aotp) a2.i();
        aotp.getClass();
        aotu.b = aotp;
        aotu.a |= 1;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aott aott = (aott) aucd.b;
        aotu aotu2 = (aotu) o.i();
        aott aott2 = aott.i;
        aotu2.getClass();
        aott.c = aotu2;
        aott.b = 9;
    }
}
