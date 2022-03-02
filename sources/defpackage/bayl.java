package defpackage;

/* renamed from: bayl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bayl {
    public Thread a = Thread.currentThread();

    public final void a() {
        if (this.a == null) {
            this.a = Thread.currentThread();
        }
        if (Thread.currentThread() != this.a) {
            throw new IllegalStateException("Wrong thread");
        }
    }
}
