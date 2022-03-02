package defpackage;

import java.util.Arrays;

/* renamed from: aklj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aklj {
    public final int a;
    public final byte[] b;

    public aklj(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aklj)) {
            return false;
        }
        aklj aklj = (aklj) obj;
        return aklj.a == this.a && Arrays.equals(aklj.b, this.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.b))});
    }

    public final String toString() {
        int i = this.a;
        byte[] bArr = this.b;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < bArr.length; i2++) {
            sb.append(String.format("%02x", new Object[]{Integer.valueOf(bArr[i2] & 255)}));
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 34);
        sb3.append("BeaconId{type=");
        sb3.append(i);
        sb3.append(", bytes=");
        sb3.append(sb2);
        sb3.append("}");
        return sb3.toString();
    }
}
