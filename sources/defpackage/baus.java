package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: baus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baus implements ThreadFactory {
    final /* synthetic */ int a;

    public baus(int i) {
        this.a = i;
    }

    public final Thread newThread(Runnable runnable) {
        return Executors.defaultThreadFactory().newThread(new baur(this, runnable));
    }
}
