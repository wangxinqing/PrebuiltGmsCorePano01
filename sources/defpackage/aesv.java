package defpackage;

import java.util.Arrays;

/* renamed from: aesv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aesv extends aetg {
    private final byte[] a;
    private final int b;

    public aesv(byte[] bArr, int i) {
        if (bArr != null) {
            this.a = bArr;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null secondaryId");
    }

    public final byte[] a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aetg)) {
            return false;
        }
        aetg aetg = (aetg) obj;
        return Arrays.equals(this.a, aetg instanceof aesv ? ((aesv) aetg).a : aetg.a()) && this.b == aetg.b();
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 62);
        sb.append("CoreSecondaryIdMatcher{secondaryId=");
        sb.append(arrays);
        sb.append(", matchingType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
