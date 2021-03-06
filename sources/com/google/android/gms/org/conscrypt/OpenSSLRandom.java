package com.google.android.gms.org.conscrypt;

import java.io.Serializable;
import java.security.SecureRandomSpi;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class OpenSSLRandom extends SecureRandomSpi implements Serializable {
    private static final long serialVersionUID = 8506210602917522861L;

    /* access modifiers changed from: protected */
    public byte[] engineGenerateSeed(int i) {
        byte[] bArr = new byte[i];
        NativeCrypto.RAND_bytes(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    public void engineNextBytes(byte[] bArr) {
        NativeCrypto.RAND_bytes(bArr);
    }

    /* access modifiers changed from: protected */
    public void engineSetSeed(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("seed == null");
        }
    }
}
