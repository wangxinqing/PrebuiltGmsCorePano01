package defpackage;

/* renamed from: uqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uqt implements amoh {
    private final ura a;
    private final byte[] b;

    public uqt(ura ura, byte[] bArr) {
        this.a = ura;
        this.b = bArr;
    }

    public final void a(amon amon) {
        ura ura = this.a;
        byte[] bArr = this.b;
        if (!amon.b()) {
            ((anih) ((anih) ulh.a.b()).a("ura", "a", 356, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 failed to send a disconnection packet to %s for service ID hash %s.", (Object) ura.b, (Object) ulu.a(bArr));
        }
    }
}
