package defpackage;

/* renamed from: uqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uqs implements url {
    private final ura a;
    private final byte[] b;

    public uqs(ura ura, byte[] bArr) {
        this.a = ura;
        this.b = bArr;
    }

    public final void a() {
        ura ura = this.a;
        byte[] bArr = this.b;
        byte[] bArr2 = ura.a;
        aucd o = asmh.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asmh asmh = (asmh) o.b;
        asmh.b = 2;
        asmh.a |= 1;
        aucd o2 = asmd.c.o();
        auay a2 = auay.a(bArr);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asmd asmd = (asmd) o2.b;
        a2.getClass();
        asmd.a |= 1;
        asmd.b = a2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asmh asmh2 = (asmh) o.b;
        asmd asmd2 = (asmd) o2.i();
        asmd2.getClass();
        asmh2.d = asmd2;
        asmh2.a |= 4;
        byte[] a3 = upu.a(bArr2, ((asmh) o.i()).k());
        if (a3 != null) {
            ura.e.b(a3).a(new uqt(ura, bArr));
        } else {
            ((anih) ((anih) ulh.a.b()).a("ura", "b", 341, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 failed to create a disconnection packet for service ID hash %s.", (Object) ulu.a(bArr));
        }
        ura.a(bArr);
    }
}
