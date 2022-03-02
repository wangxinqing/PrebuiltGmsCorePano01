package defpackage;

/* renamed from: aivf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aivf implements Runnable {
    private final aivu a;
    private final Object b;

    public aivf(aivu aivu, Object obj) {
        this.a = aivu;
        this.b = obj;
    }

    public final void run() {
        aivu aivu = this.a;
        aivu.l.h(this.b);
    }
}
