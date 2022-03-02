package com.google.android.gms.org.conscrypt;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OpenSSLRSAPublicKey implements RSAPublicKey, OpenSSLKeyHolder {
    private static final long serialVersionUID = 123125005824688292L;
    private transient boolean fetchedParams;
    private transient OpenSSLKey key;
    private BigInteger modulus;
    private BigInteger publicExponent;

    public OpenSSLRSAPublicKey(OpenSSLKey openSSLKey) {
        this.key = openSSLKey;
    }

    private synchronized void ensureReadParams() {
        if (!this.fetchedParams) {
            byte[][] bArr = NativeCrypto.get_RSA_public_params(this.key.getNativeRef());
            this.modulus = new BigInteger(bArr[0]);
            this.publicExponent = new BigInteger(bArr[1]);
            this.fetchedParams = true;
        }
    }

    static OpenSSLKey getInstance(RSAPublicKey rSAPublicKey) {
        try {
            return new OpenSSLKey(NativeCrypto.EVP_PKEY_new_RSA(rSAPublicKey.getModulus().toByteArray(), rSAPublicKey.getPublicExponent().toByteArray(), (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null));
        } catch (Exception e) {
            throw new InvalidKeyException(e);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.key = new OpenSSLKey(NativeCrypto.EVP_PKEY_new_RSA(this.modulus.toByteArray(), this.publicExponent.toByteArray(), (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null));
        this.fetchedParams = true;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ensureReadParams();
        objectOutputStream.defaultWriteObject();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof OpenSSLRSAPublicKey) && this.key.equals(((OpenSSLRSAPublicKey) obj).getOpenSSLKey())) {
            return true;
        }
        if (obj instanceof RSAPublicKey) {
            ensureReadParams();
            RSAPublicKey rSAPublicKey = (RSAPublicKey) obj;
            if (!this.modulus.equals(rSAPublicKey.getModulus()) || !this.publicExponent.equals(rSAPublicKey.getPublicExponent())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String getAlgorithm() {
        return "RSA";
    }

    public byte[] getEncoded() {
        return NativeCrypto.EVP_marshal_public_key(this.key.getNativeRef());
    }

    public String getFormat() {
        return "X.509";
    }

    public BigInteger getModulus() {
        ensureReadParams();
        return this.modulus;
    }

    public OpenSSLKey getOpenSSLKey() {
        return this.key;
    }

    public BigInteger getPublicExponent() {
        ensureReadParams();
        return this.publicExponent;
    }

    public int hashCode() {
        ensureReadParams();
        return this.modulus.hashCode() ^ this.publicExponent.hashCode();
    }

    public String toString() {
        ensureReadParams();
        return "OpenSSLRSAPublicKey{" + "modulus=" + this.modulus.toString(16) + ",publicExponent=" + this.publicExponent.toString(16) + '}';
    }

    public OpenSSLRSAPublicKey(RSAPublicKeySpec rSAPublicKeySpec) {
        try {
            this.key = new OpenSSLKey(NativeCrypto.EVP_PKEY_new_RSA(rSAPublicKeySpec.getModulus().toByteArray(), rSAPublicKeySpec.getPublicExponent().toByteArray(), (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null));
        } catch (Exception e) {
            throw new InvalidKeySpecException(e);
        }
    }
}
