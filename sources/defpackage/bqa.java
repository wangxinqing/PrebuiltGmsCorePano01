package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: bqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bqa implements ThreadFactory {
    private final String a;

    public bqa(String str) {
        this.a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(this.a);
        return thread;
    }
}
