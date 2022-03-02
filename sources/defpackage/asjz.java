package defpackage;

/* renamed from: asjz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asjz implements asiz {
    final /* synthetic */ askc a;

    public asjz(askc askc) {
        this.a = askc;
    }

    public final void a() {
        jjg jjg = asil.a;
        this.a.f.countDown();
    }

    public final void b() {
        ((anih) ((anih) asil.a.c()).a("asjz", "b", 271, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Fail to revert Bluetooth.");
        this.a.f.countDown();
    }
}
