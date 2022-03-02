package defpackage;

/* renamed from: bacy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bacy implements Runnable {
    final /* synthetic */ babj a;
    final /* synthetic */ baeg b;
    final /* synthetic */ baaf c;
    final /* synthetic */ bade d;

    public bacy(bade bade, babj babj, baeg baeg, baaf baaf) {
        this.d = bade;
        this.a = babj;
        this.b = baeg;
        this.c = baaf;
    }

    public final void run() {
        this.d.a(this.a, this.b, this.c);
    }
}
