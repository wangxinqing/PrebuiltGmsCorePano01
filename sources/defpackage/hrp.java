package defpackage;

import com.google.android.chimera.FragmentTransaction;

/* renamed from: hrp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hrp implements hrv {
    private final aucd a;

    public hrp(aucd aucd) {
        this.a = aucd;
    }

    public final void a(int i) {
        aucd aucd = this.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        avqy avqy = (avqy) aucd.b;
        avqy avqy2 = avqy.ab;
        avqy.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
        avqy.o = i;
    }
}
