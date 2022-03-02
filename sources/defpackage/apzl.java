package defpackage;

import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: apzl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class apzl implements Callable {
    private final apzm a;
    private final azxh b;
    private final apyq c;
    private final Set d;

    public apzl(apzm apzm, azxh azxh, apyq apyq, Set set) {
        this.a = apzm;
        this.b = azxh;
        this.c = apyq;
        this.d = set;
    }

    public final Object call() {
        apzm apzm = this.a;
        azxh azxh = this.b;
        apyq apyq = this.c;
        Set set = this.d;
        return ((Boolean) azxh.a(apzm.a)).booleanValue() ? apzm.b.b(apyq, set) : apzm.b.a(apyq, set);
    }
}
