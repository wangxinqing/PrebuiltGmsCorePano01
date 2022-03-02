package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ins  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ins implements Callable {
    private final inv a;

    public ins(inv inv) {
        this.a = inv;
    }

    public final Object call() {
        inv inv = this.a;
        iwu a2 = iwv.a(inv.a, true);
        if (!a2.b()) {
            return amzy.h();
        }
        return a2.a(inv.a);
    }
}
