package defpackage;

import java.io.OutputStream;

/* renamed from: baju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baju extends OutputStream {
    final /* synthetic */ bajw a;

    public baju(bajw bajw) {
        this.a = bajw;
    }

    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2);
    }
}
