package defpackage;

import android.app.Activity;
import java.util.concurrent.TimeUnit;

/* renamed from: aglz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aglz implements agcw {
    final /* synthetic */ agma a;

    public aglz(agma agma) {
        this.a = agma;
    }

    public final void a(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.a.i.a(4, simpleName);
        this.a.b();
        agma agma = this.a;
        agma.c = ((aorv) agma.e.a()).a((Runnable) new agly(this, simpleName), 10, TimeUnit.SECONDS);
    }
}
