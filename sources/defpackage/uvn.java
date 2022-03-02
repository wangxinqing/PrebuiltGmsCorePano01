package defpackage;

/* renamed from: uvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uvn extends uvi {
    final /* synthetic */ uvy g;
    final /* synthetic */ uvp h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uvn(uvp uvp, uvy uvy, uvh uvh, uvy uvy2) {
        super(uvy, uvh);
        this.h = uvp;
        this.g = uvy2;
    }

    public final void close() {
        this.h.b(this.g);
        super.close();
        ulu.b();
    }
}
