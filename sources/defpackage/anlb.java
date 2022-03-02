package defpackage;

import java.util.zip.Checksum;

/* renamed from: anlb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anlb extends anku {
    private final Checksum a;

    public anlb(Checksum checksum) {
        amrl.a((Object) checksum);
        this.a = checksum;
    }

    public final anlh a() {
        return anlh.a((int) this.a.getValue());
    }

    /* access modifiers changed from: protected */
    public final void a(byte b) {
        this.a.update(b);
    }

    /* access modifiers changed from: protected */
    public final void a(byte[] bArr, int i, int i2) {
        this.a.update(bArr, i, i2);
    }
}
