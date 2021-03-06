package com.google.android.gms.org.conscrypt;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OpenSSLSignatureRawECDSA extends SignatureSpi {
    private ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    private OpenSSLKey key;

    private static OpenSSLKey verifyKey(OpenSSLKey openSSLKey) {
        if (NativeCrypto.EVP_PKEY_type(openSSLKey.getNativeRef()) == 408) {
            return openSSLKey;
        }
        throw new InvalidKeyException("Non-EC key used to initialize EC signature.");
    }

    /* access modifiers changed from: protected */
    public Object engineGetParameter(String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void engineInitSign(PrivateKey privateKey) {
        OpenSSLKey fromPrivateKey = OpenSSLKey.fromPrivateKey(privateKey);
        verifyKey(fromPrivateKey);
        this.key = fromPrivateKey;
    }

    /* access modifiers changed from: protected */
    public void engineInitVerify(PublicKey publicKey) {
        OpenSSLKey fromPublicKey = OpenSSLKey.fromPublicKey(publicKey);
        verifyKey(fromPublicKey);
        this.key = fromPublicKey;
    }

    /* access modifiers changed from: protected */
    public void engineSetParameter(String str, Object obj) {
    }

    /* access modifiers changed from: protected */
    public byte[] engineSign() {
        OpenSSLKey openSSLKey = this.key;
        if (openSSLKey != null) {
            int ECDSA_size = NativeCrypto.ECDSA_size(openSSLKey.getNativeRef());
            byte[] bArr = new byte[ECDSA_size];
            try {
                int ECDSA_sign = NativeCrypto.ECDSA_sign(this.buffer.toByteArray(), bArr, this.key.getNativeRef());
                if (ECDSA_sign >= 0) {
                    if (ECDSA_sign != ECDSA_size) {
                        byte[] bArr2 = new byte[ECDSA_sign];
                        System.arraycopy(bArr, 0, bArr2, 0, ECDSA_sign);
                        bArr = bArr2;
                    }
                    this.buffer.reset();
                    return bArr;
                }
                throw new SignatureException("Could not compute signature.");
            } catch (Exception e) {
                throw new SignatureException(e);
            } catch (Throwable th) {
                this.buffer.reset();
                throw th;
            }
        } else {
            throw new SignatureException("No key provided");
        }
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(byte b) {
        this.buffer.write(b);
    }

    /* access modifiers changed from: protected */
    public boolean engineVerify(byte[] bArr) {
        if (this.key != null) {
            try {
                int ECDSA_verify = NativeCrypto.ECDSA_verify(this.buffer.toByteArray(), bArr, this.key.getNativeRef());
                if (ECDSA_verify != -1) {
                    boolean z = true;
                    if (ECDSA_verify != 1) {
                        z = false;
                    }
                    this.buffer.reset();
                    return z;
                }
                throw new SignatureException("Could not verify signature.");
            } catch (Exception e) {
                throw new SignatureException(e);
            } catch (Throwable th) {
                this.buffer.reset();
                throw th;
            }
        } else {
            throw new SignatureException("No key provided");
        }
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.buffer.write(bArr, i, i2);
    }
}
