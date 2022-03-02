package defpackage;

/* renamed from: ljz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ljz extends jfz {
    private final Integer j;

    public ljz(int i, Integer num) {
        super(i, 9);
        this.j = num;
    }

    /* access modifiers changed from: protected */
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        izj.a();
    }

    /* access modifiers changed from: protected */
    public final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        Integer num = this.j;
        if (num != null) {
            izj.a(13312, num.intValue());
        } else {
            izj.b(13312);
        }
    }
}
