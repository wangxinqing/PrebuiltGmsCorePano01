package defpackage;

/* renamed from: ogl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ogl implements Runnable {
    final /* synthetic */ ogo a;

    public ogl(ogo ogo) {
        this.a = ogo;
    }

    public final void run() {
        ogo ogo = this.a;
        ogo.e = false;
        ogo.d = -1;
        ogo.a();
    }
}
