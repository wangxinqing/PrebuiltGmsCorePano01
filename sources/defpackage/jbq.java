package defpackage;

/* renamed from: jbq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jbq extends jbr {
    final /* synthetic */ Runnable a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jbq(String str, String str2, Runnable runnable) {
        super(str, str2);
        this.a = runnable;
    }

    public final void a() {
        this.a.run();
    }
}
