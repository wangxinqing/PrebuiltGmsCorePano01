package defpackage;

/* renamed from: eeb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class eeb implements Runnable {
    private final eee a;
    private final int b;

    public eeb(eee eee, int i) {
        this.a = eee;
        this.b = i;
    }

    public final void run() {
        eee eee = this.a;
        int i = this.b;
        jjg jjg = edx.a;
        if (i == 0) {
            eee.j = false;
            eee.c();
        } else if (i == 1 || i == 2) {
            eee.j = true;
            eee.c();
        }
    }
}
