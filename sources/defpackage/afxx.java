package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afxx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afxx implements amqy {
    private final AtomicReference a;

    public afxx(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    public final Object a(Object obj) {
        AtomicReference atomicReference = this.a;
        afys afys = (afys) obj;
        aucd aucd = (aucd) afys.c(5);
        aucd.a((aucj) afys);
        for (int i = 0; i < ((afys) aucd.b).e.size(); i++) {
            afyr C = aucd.C(i);
            aucd aucd2 = (aucd) C.c(5);
            aucd2.a((aucj) C);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            afyr afyr = (afyr) aucd2.b;
            afyr afyr2 = afyr.e;
            afyr.a &= -5;
            afyr.d = 0;
            aucd.a(i, (afyr) aucd2.i());
        }
        afys afys2 = (afys) aucd.i();
        atomicReference.set(afys2);
        return afys2;
    }
}
