package defpackage;

/* renamed from: uoq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class uoq implements Runnable {
    private final String a;
    private final String b;
    private final tow c;
    private final uow d;

    public uoq(uow uow, String str, String str2, tow tow) {
        this.d = uow;
        this.a = str;
        this.b = str2;
        this.c = tow;
    }

    public final void run() {
        uow uow = this.d;
        uow.b.a(this.a, this.b, this.c);
    }
}
