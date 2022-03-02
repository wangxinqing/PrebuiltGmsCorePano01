package defpackage;

/* renamed from: aivd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aivd implements Runnable {
    private final aivu a;
    private final ajbe b;
    private final aiac c;

    public aivd(aivu aivu, ajbe ajbe, aiac aiac) {
        this.a = aivu;
        this.b = ajbe;
        this.c = aiac;
    }

    public final void run() {
        aivu aivu = this.a;
        aivu.l.a(this.b, this.c);
    }
}
