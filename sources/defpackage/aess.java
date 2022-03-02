package defpackage;

import java.util.Arrays;

/* renamed from: aess  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aess extends aetb {
    private final byte[] a;
    private final byte[] b;
    private final long c;

    public aess(byte[] bArr, byte[] bArr2, long j) {
        if (bArr != null) {
            this.a = bArr;
            this.b = bArr2;
            this.c = j;
            return;
        }
        throw new NullPointerException("Null data");
    }

    public final byte[] a() {
        return this.a;
    }

    public final byte[] b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aetb)) {
            return false;
        }
        aetb aetb = (aetb) obj;
        boolean z = aetb instanceof aess;
        if (Arrays.equals(this.a, z ? ((aess) aetb).a : aetb.a())) {
            return Arrays.equals(this.b, z ? ((aess) aetb).b : aetb.b()) && this.c == aetb.c();
        }
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.a);
        int hashCode2 = Arrays.hashCode(this.b);
        long j = this.c;
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        String arrays2 = Arrays.toString(this.b);
        long j = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 82 + String.valueOf(arrays2).length());
        sb.append("CoreMdhFootprint{data=");
        sb.append(arrays);
        sb.append(", secondaryId=");
        sb.append(arrays2);
        sb.append(", serverEventIdTimestamp=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
