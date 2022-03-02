package defpackage;

/* renamed from: akmk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class akmk implements Runnable {
    private final akmn a;
    private final akml b;

    public akmk(akmn akmn, akml akml) {
        this.a = akmn;
        this.b = akml;
    }

    public final void run() {
        this.a.b(this.b);
    }
}
