package defpackage;

/* renamed from: babn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class babn implements Runnable {
    final /* synthetic */ babo a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ babq c;

    public babn(babq babq, babo babo, Runnable runnable) {
        this.c = babq;
        this.a = babo;
        this.b = runnable;
    }

    public final void run() {
        this.c.execute(this.a);
    }

    public final String toString() {
        return String.valueOf(this.b.toString()).concat("(scheduled in SynchronizationContext)");
    }
}
