package com.google.android.gms.org.conscrypt;

import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ByteArray {
    private final byte[] bytes;
    private final int hashCode;

    public ByteArray(byte[] bArr) {
        this.bytes = bArr;
        this.hashCode = Arrays.hashCode(bArr);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ByteArray) {
            return Arrays.equals(this.bytes, ((ByteArray) obj).bytes);
        }
        return false;
    }

    public int hashCode() {
        return this.hashCode;
    }
}
