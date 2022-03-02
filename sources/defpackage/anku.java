package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: anku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class anku extends ankw {
    private final ByteBuffer a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    private final void a(int i) {
        try {
            a(this.a.array(), 0, i);
        } finally {
            this.a.clear();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(byte b);

    /* access modifiers changed from: protected */
    public void a(byte[] bArr, int i, int i2) {
        throw null;
    }

    public final void b(byte b) {
        a(b);
    }

    public final void b(byte[] bArr, int i, int i2) {
        amrl.a(i, i + i2, bArr.length);
        a(bArr, i, i2);
    }

    public final void a(char c) {
        this.a.putChar(c);
        a(2);
    }

    public final void a(long j) {
        this.a.putLong(j);
        a(8);
    }

    public final void a(byte[] bArr) {
        amrl.a((Object) bArr);
        a(bArr, 0, bArr.length);
    }
}
