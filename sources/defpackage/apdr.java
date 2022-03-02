package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: apdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apdr {
    public final annh a;
    public final Charset b;
    ByteBuffer c;
    private byte[] d;

    public apdr(annh annh, Charset charset) {
        this.a = annh;
        this.b = charset;
    }

    public final void a() {
        boolean z;
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            annh annh = this.a;
            amrl.a((Object) annh);
            int readInt = annh.readInt();
            if (readInt > 0) {
                z = true;
            } else {
                z = false;
            }
            amrl.b(z);
            byte[] bArr = this.d;
            if (bArr == null || bArr.length < readInt) {
                this.d = new byte[(readInt + 1024)];
            }
            anmr.a(this.a, this.d, 0, readInt);
            this.c = ByteBuffer.wrap(this.d, 0, readInt).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            a();
            short s = this.c.getShort();
            ByteBuffer byteBuffer = this.c;
            byteBuffer.position(byteBuffer.position() + s);
        }
    }
}
