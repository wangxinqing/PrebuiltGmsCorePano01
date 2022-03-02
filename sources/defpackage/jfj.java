package defpackage;

/* renamed from: jfj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jfj extends jfz {
    private final String j;
    private String k;

    public jfj(String str, int i) {
        super(1, i);
        this.j = str;
    }

    /* access modifiers changed from: protected */
    public final void afterExecute(Runnable runnable, Throwable th) {
        Thread.currentThread().setName(this.k);
    }

    /* access modifiers changed from: protected */
    public final void beforeExecute(Thread thread, Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        this.k = currentThread.getName();
        currentThread.setName(this.j);
    }
}
