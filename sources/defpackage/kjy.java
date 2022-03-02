package defpackage;

/* renamed from: kjy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kjy extends Thread {
    final /* synthetic */ lsb a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kjy(String str, lsb lsb) {
        super(str);
        this.a = lsb;
    }

    public final void run() {
        ((kjw) this.a).b();
    }
}
