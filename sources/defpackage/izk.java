package defpackage;

/* renamed from: izk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class izk extends jfz {
    private final int j;
    private final int k;

    public izk(int i, int i2) {
        super(Integer.MAX_VALUE, 10);
        this.j = i;
        this.k = i2;
    }

    /* access modifiers changed from: protected */
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (awzu.a.a().c()) {
            izj.a();
        }
    }

    /* access modifiers changed from: protected */
    public final void beforeExecute(Thread thread, Runnable runnable) {
        izj.a(this.k, this.j);
        super.beforeExecute(thread, runnable);
    }
}
