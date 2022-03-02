package defpackage;

import java.util.concurrent.Executor;

/* renamed from: baio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baio implements Executor {
    final /* synthetic */ baji a;

    public baio(baji baji) {
        this.a = baji;
    }

    public final void execute(Runnable runnable) {
        this.a.j.a().execute(runnable);
    }
}
