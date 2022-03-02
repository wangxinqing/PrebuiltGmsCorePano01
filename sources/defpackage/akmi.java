package defpackage;

/* renamed from: akmi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class akmi implements Runnable {
    private final akmn a;
    private final akml b;

    public akmi(akmn akmn, akml akml) {
        this.a = akmn;
        this.b = akml;
    }

    public final void run() {
        this.a.c(this.b);
    }
}
