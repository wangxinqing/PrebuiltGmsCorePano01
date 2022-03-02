package com.google.android.gms.org.conscrypt;

import java.math.BigInteger;
import java.security.PublicKey;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface CertBlacklist {
    boolean isPublicKeyBlackListed(PublicKey publicKey);

    boolean isSerialNumberBlackListed(BigInteger bigInteger);
}
