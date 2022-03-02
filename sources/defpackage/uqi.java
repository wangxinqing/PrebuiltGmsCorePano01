package defpackage;

/* renamed from: uqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uqi implements amoh {
    private final byte[] a;

    public uqi(byte[] bArr) {
        this.a = bArr;
    }

    public final void a(amon amon) {
        byte[] bArr = this.a;
        if (!amon.b()) {
            ((anih) ((anih) ulh.a.b()).a("uqj", "a", 139, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleSocketOutputStreamV2 failed to send a control packet %s", (Object) ulu.a(bArr));
        }
    }
}
