package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: abwj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abwj {
    public static final ScheduledExecutorService a = jfm.a(Integer.MAX_VALUE, 10);
    public final abwk b;
    public aora c;
    public Future d;
    public boolean e;

    public abwj(boolean z, abwl abwl, int i) {
        abwk abwk;
        if (z) {
            abwk = new abwk(abwl, 12, i);
        } else {
            abwk = new abwk(abwl, 11, i);
        }
        this.b = abwk;
    }
}
