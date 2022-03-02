package defpackage;

/* renamed from: alcv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alcv implements Runnable {
    final /* synthetic */ alcw a;

    public alcv(alcw alcw) {
        this.a = alcw;
    }

    public final void run() {
        alcw alcw = this.a;
        alda alda = alcw.c;
        alda.l = null;
        alda.a(alcw.b, alcw.a - 1);
    }
}
