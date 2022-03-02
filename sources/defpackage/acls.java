package defpackage;

/* renamed from: acls  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acls implements Runnable {
    final /* synthetic */ acly a;

    public acls(acly acly) {
        this.a = acly;
    }

    public final void run() {
        if (this.a.f.a() > 0) {
            this.a.b();
        }
    }
}
