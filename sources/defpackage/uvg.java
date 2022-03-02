package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: uvg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uvg extends OutputStream {
    final /* synthetic */ uvi a;
    private volatile boolean b = false;

    public uvg(uvi uvi) {
        this.a = uvi;
    }

    public final void close() {
        this.b = true;
    }

    public final void write(int i) {
        write(new byte[]{(byte) i});
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (!this.b) {
            uvi uvi = this.a;
            uvi.f.a(uvi.a, Arrays.copyOfRange(bArr, i, i2 + i));
            return;
        }
        throw new IOException("Stream is closed");
    }
}
