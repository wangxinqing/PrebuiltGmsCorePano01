package defpackage;

import java.util.Arrays;

/* renamed from: upv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class upv {
    public final byte[] a;
    public int b = 0;

    public upv(byte[] bArr, int i) {
        this.a = Arrays.copyOf(bArr, bArr.length);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof upv) && Arrays.equals(((upv) obj).a, this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return String.format("BlePeripheral { id=%s }", new Object[]{ulu.a(this.a)});
    }
}
