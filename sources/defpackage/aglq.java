package defpackage;

import android.app.Application;

/* renamed from: aglq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aglq implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;
    private final bapu d;

    public aglq(bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
        this.d = bapu4;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        agkt b2 = ((agku) this.a).a();
        Application application = (Application) ((awdu) this.b).a;
        bapu bapu = this.c;
        amri b3 = ((ageh) this.d).a();
        agcz a2 = agcz.a(application);
        bapu bapu2 = (bapu) ((aghc) b3.b()).e().c();
        return new aglo(b2, application, bapu, a2, ((aghc) b3.b()).d());
    }
}
