package defpackage;

import java.io.InputStream;

/* renamed from: bakm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bakm extends InputStream implements azzc {
    final bakl a;

    public bakm(bakl bakl) {
        amrl.a((Object) bakl, (Object) "buffer");
        this.a = bakl;
    }

    public final int available() {
        return ((baeo) this.a).a;
    }

    public final void close() {
        this.a.close();
    }

    public final int read() {
        bakl bakl = this.a;
        if (((baeo) bakl).a == 0) {
            return -1;
        }
        return bakl.b();
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = ((baeo) this.a).a;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i3, i2);
        this.a.a(bArr, i, min);
        return min;
    }
}
