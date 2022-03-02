package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: alge  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class alge implements ThreadFactory {
    private final String a;

    public alge(String str) {
        this.a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.a);
    }
}
