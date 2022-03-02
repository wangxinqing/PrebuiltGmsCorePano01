package defpackage;

/* renamed from: hu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hu implements Runnable {
    final /* synthetic */ gj a;
    final /* synthetic */ mo b;
    final /* synthetic */ hb c;

    public hu(hb hbVar, gj gjVar, mo moVar) {
        this.c = hbVar;
        this.a = gjVar;
        this.b = moVar;
    }

    public final void run() {
        this.c.b(this.a, this.b);
    }
}
