package defpackage;

/* renamed from: abuy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abuy implements Runnable {
    final /* synthetic */ abuz a;

    public abuy(abuz abuz) {
        this.a = abuz;
    }

    public final void run() {
        abuz abuz = this.a;
        abvc abvc = abuz.c;
        abvm abvm = new abvm(abuz.d);
        abuz abuz2 = this.a;
        abvc.a(abvm, abuz2.a, abuz2.b, abuz2.e);
    }
}
