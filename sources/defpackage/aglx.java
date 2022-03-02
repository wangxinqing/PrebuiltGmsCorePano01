package defpackage;

import android.app.Activity;
import java.util.concurrent.TimeUnit;

/* renamed from: aglx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aglx implements agcv {
    final /* synthetic */ agma a;

    public aglx(agma agma) {
        this.a = agma;
    }

    public final void b(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.a.i.a(3, simpleName);
        this.a.b();
        agma agma = this.a;
        agma.d = ((aorv) agma.e.a()).a((Runnable) new aglw(this, simpleName), 10, TimeUnit.SECONDS);
    }
}
