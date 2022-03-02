package defpackage;

/* renamed from: aidt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aidt implements Runnable {
    private final aiei a;
    private final rec b;

    public aidt(aiei aiei, rec rec) {
        this.a = aiei;
        this.b = rec;
    }

    public final void run() {
        this.a.a((Object) this.b.asBinder());
    }
}
