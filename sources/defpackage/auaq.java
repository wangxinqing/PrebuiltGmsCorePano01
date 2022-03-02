package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* renamed from: auaq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auaq extends auav {
    private static final long serialVersionUID = 1;
    private final int d;
    private final int e;

    public auaq(byte[] bArr, int i, int i2) {
        super(bArr);
        c(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    public final byte a(int i) {
        b(i, this.e);
        return this.a[this.d + i];
    }

    public final int a() {
        return this.e;
    }

    public final byte b(int i) {
        return this.a[this.d + i];
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return auay.b(k());
    }

    /* access modifiers changed from: protected */
    public final void a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, this.d + i, bArr, i2, i3);
    }
}
