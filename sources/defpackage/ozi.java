package defpackage;

/* renamed from: ozi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ozi {
    final Runnable a;
    public final /* synthetic */ ozq b;

    public ozi(ozq ozq, Runnable runnable) {
        this.b = ozq;
        this.a = runnable;
    }

    public final ozq a() {
        this.a.run();
        return this.b;
    }
}
