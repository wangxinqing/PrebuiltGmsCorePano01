package defpackage;

import java.util.concurrent.Executor;

/* renamed from: akvg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akvg implements Executor {
    final /* synthetic */ akvl a;

    public akvg(akvl akvl) {
        this.a = akvl;
    }

    public final void execute(Runnable runnable) {
        this.a.c.post(runnable);
    }
}
