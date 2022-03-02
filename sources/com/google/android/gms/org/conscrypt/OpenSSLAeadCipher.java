package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.OpenSSLCipher;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class OpenSSLAeadCipher extends OpenSSLCipher {
    static final int DEFAULT_TAG_SIZE_BITS = 128;
    private static int lastGlobalMessageSize = 32;
    private byte[] aad;
    byte[] buf;
    int bufCount;
    long evpAead;
    private boolean mustInitialize;
    private byte[] previousIv;
    private byte[] previousKey;
    int tagLengthInBytes;

    public OpenSSLAeadCipher(OpenSSLCipher.Mode mode) {
        super(mode, OpenSSLCipher.Padding.NOPADDING);
    }

    private boolean arraysAreEqual(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            byte b = 0;
            for (int i = 0; i < bArr.length; i++) {
                b |= bArr[i] ^ bArr2[i];
            }
            if (b == 0) {
                return true;
            }
        }
        return false;
    }

    private void checkInitialization() {
        if (this.mustInitialize) {
            throw new IllegalStateException("Cannot re-use same key and IV for multiple encryptions");
        }
    }

    private void expand(int i) {
        int i2 = this.bufCount;
        int i3 = i + i2;
        byte[] bArr = this.buf;
        if (i3 > bArr.length) {
            byte[] bArr2 = new byte[(i3 + i3)];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            this.buf = bArr2;
        }
    }

    private void reset() {
        this.aad = null;
        int i = lastGlobalMessageSize;
        byte[] bArr = this.buf;
        if (bArr != null) {
            int i2 = this.bufCount;
            if (i2 > 0 && i2 != i) {
                lastGlobalMessageSize = i2;
                if (bArr.length != i2) {
                    this.buf = new byte[i2];
                }
            }
        } else {
            this.buf = new byte[i];
        }
        this.bufCount = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        throw ((javax.crypto.BadPaddingException) new javax.crypto.BadPaddingException().initCause(r6.getTargetException()));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026 A[ExcHandler: InvocationTargetException (r6v3 'e' java.lang.reflect.InvocationTargetException A[CUSTOM_DECLARE]), Splitter:B:4:0x0013] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void throwAEADBadTagExceptionIfAvailable(java.lang.String r6, java.lang.Throwable r7) {
        /*
            r5 = this;
            java.lang.String r0 = "javax.crypto.AEADBadTagException"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x003e }
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x003e }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x003e }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)     // Catch:{ Exception -> 0x003e }
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException -> 0x0039, InstantiationException -> 0x0037, InvocationTargetException -> 0x0026 }
            r1[r4] = r6     // Catch:{ IllegalAccessException -> 0x0039, InstantiationException -> 0x0037, InvocationTargetException -> 0x0026 }
            java.lang.Object r6 = r0.newInstance(r1)     // Catch:{ IllegalAccessException -> 0x0039, InstantiationException -> 0x0037, InvocationTargetException -> 0x0026 }
            javax.crypto.BadPaddingException r6 = (javax.crypto.BadPaddingException) r6     // Catch:{ IllegalAccessException -> 0x0039, InstantiationException -> 0x0037, InvocationTargetException -> 0x0026 }
            r6.initCause(r7)     // Catch:{ IllegalAccessException -> 0x0023, InstantiationException -> 0x0021, InvocationTargetException -> 0x0026 }
            goto L_0x0024
        L_0x0021:
            r7 = move-exception
            goto L_0x0024
        L_0x0023:
            r7 = move-exception
        L_0x0024:
            r2 = r6
            goto L_0x003a
        L_0x0026:
            r6 = move-exception
            javax.crypto.BadPaddingException r7 = new javax.crypto.BadPaddingException
            r7.<init>()
            java.lang.Throwable r6 = r6.getTargetException()
            java.lang.Throwable r6 = r7.initCause(r6)
            javax.crypto.BadPaddingException r6 = (javax.crypto.BadPaddingException) r6
            throw r6
        L_0x0037:
            r6 = move-exception
            goto L_0x003a
        L_0x0039:
            r6 = move-exception
        L_0x003a:
            if (r2 != 0) goto L_0x003d
            return
        L_0x003d:
            throw r2
        L_0x003e:
            r6 = move-exception
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.OpenSSLAeadCipher.throwAEADBadTagExceptionIfAvailable(java.lang.String, java.lang.Throwable):void");
    }

    public boolean allowsNonceReuse() {
        return false;
    }

    public void checkSupportedPadding(OpenSSLCipher.Padding padding) {
        if (padding != OpenSSLCipher.Padding.NOPADDING) {
            throw new NoSuchPaddingException("Must be NoPadding for AEAD ciphers");
        }
    }

    public void checkSupportedTagLength(int i) {
        if (i % 8 != 0) {
            StringBuilder sb = new StringBuilder(51);
            sb.append("Tag length must be a multiple of 8; was ");
            sb.append(i);
            throw new InvalidAlgorithmParameterException(sb.toString());
        }
    }

    public int doFinalInternal(byte[] bArr, int i, int i2) {
        int i3;
        checkInitialization();
        try {
            if (!isEncrypting()) {
                i3 = NativeCrypto.EVP_AEAD_CTX_open(this.evpAead, this.encodedKey, this.tagLengthInBytes, bArr, i, this.iv, this.buf, 0, this.bufCount, this.aad);
            } else {
                i3 = NativeCrypto.EVP_AEAD_CTX_seal(this.evpAead, this.encodedKey, this.tagLengthInBytes, bArr, i, this.iv, this.buf, 0, this.bufCount, this.aad);
            }
            if (isEncrypting()) {
                this.mustInitialize = true;
            }
            reset();
            return i3;
        } catch (BadPaddingException e) {
            throwAEADBadTagExceptionIfAvailable(e.getMessage(), e.getCause());
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr2 == null || getOutputSizeForFinal(i2) <= bArr2.length - i3) {
            return super.engineDoFinal(bArr, i, i2, bArr2, i3);
        }
        throw new ShortBufferException("Insufficient output space");
    }

    public void engineInitInternal(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        int length;
        byte[] bArr2 = null;
        int i = 128;
        if (algorithmParameterSpec != null) {
            GCMParameters fromGCMParameterSpec = Platform.fromGCMParameterSpec(algorithmParameterSpec);
            if (fromGCMParameterSpec != null) {
                bArr2 = fromGCMParameterSpec.getIV();
                i = fromGCMParameterSpec.getTLen();
            } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                bArr2 = ((IvParameterSpec) algorithmParameterSpec).getIV();
            }
        }
        checkSupportedTagLength(i);
        this.tagLengthInBytes = i / 8;
        boolean isEncrypting = isEncrypting();
        long evp_aead = getEVP_AEAD(bArr.length);
        this.evpAead = evp_aead;
        int EVP_AEAD_nonce_length = NativeCrypto.EVP_AEAD_nonce_length(evp_aead);
        if (bArr2 != null || EVP_AEAD_nonce_length == 0) {
            if (EVP_AEAD_nonce_length == 0 && bArr2 != null) {
                String valueOf = String.valueOf(this.mode);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("IV not used in ");
                sb.append(valueOf);
                sb.append(" mode");
                throw new InvalidAlgorithmParameterException(sb.toString());
            } else if (!(bArr2 == null || (length = bArr2.length) == EVP_AEAD_nonce_length)) {
                StringBuilder sb2 = new StringBuilder(53);
                sb2.append("Expected IV length of ");
                sb2.append(EVP_AEAD_nonce_length);
                sb2.append(" but was ");
                sb2.append(length);
                throw new InvalidAlgorithmParameterException(sb2.toString());
            }
        } else if (isEncrypting) {
            bArr2 = new byte[EVP_AEAD_nonce_length];
            if (secureRandom != null) {
                secureRandom.nextBytes(bArr2);
            } else {
                NativeCrypto.RAND_bytes(bArr2);
            }
        } else {
            String valueOf2 = String.valueOf(this.mode);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
            sb3.append("IV must be specified in ");
            sb3.append(valueOf2);
            sb3.append(" mode");
            throw new InvalidAlgorithmParameterException(sb3.toString());
        }
        if (isEncrypting() && bArr2 != null && !allowsNonceReuse()) {
            byte[] bArr3 = this.previousKey;
            if (bArr3 != null && this.previousIv != null && arraysAreEqual(bArr3, bArr) && arraysAreEqual(this.previousIv, bArr2)) {
                this.mustInitialize = true;
                throw new InvalidAlgorithmParameterException("When using AEAD key and IV must not be re-used");
            } else {
                this.previousKey = bArr;
                this.previousIv = bArr2;
            }
        }
        this.mustInitialize = false;
        this.iv = bArr2;
        reset();
    }

    /* access modifiers changed from: protected */
    public void engineUpdateAAD(ByteBuffer byteBuffer) {
        checkInitialization();
        byte[] bArr = this.aad;
        if (bArr == null) {
            byte[] bArr2 = new byte[byteBuffer.remaining()];
            this.aad = bArr2;
            byteBuffer.get(bArr2);
            return;
        }
        byte[] bArr3 = new byte[(bArr.length + byteBuffer.remaining())];
        byte[] bArr4 = this.aad;
        System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
        byteBuffer.get(bArr3, this.aad.length, byteBuffer.remaining());
        this.aad = bArr3;
    }

    public abstract long getEVP_AEAD(int i);

    public int getOutputSizeForFinal(int i) {
        return this.bufCount + i + (isEncrypting() ? NativeCrypto.EVP_AEAD_max_overhead(this.evpAead) : 0);
    }

    public int getOutputSizeForUpdate(int i) {
        return 0;
    }

    public int updateInternal(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        checkInitialization();
        if (this.buf != null) {
            ArrayUtils.checkOffsetAndCount(bArr.length, i, i2);
            if (i2 <= 0) {
                return 0;
            }
            expand(i2);
            System.arraycopy(bArr, i, this.buf, this.bufCount, i2);
            this.bufCount += i2;
            return 0;
        }
        throw new IllegalStateException("Cipher not initialized");
    }

    /* access modifiers changed from: protected */
    public void engineUpdateAAD(byte[] bArr, int i, int i2) {
        checkInitialization();
        byte[] bArr2 = this.aad;
        if (bArr2 == null) {
            this.aad = Arrays.copyOfRange(bArr, i, i2 + i);
            return;
        }
        int length = bArr2.length;
        byte[] bArr3 = new byte[(length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        System.arraycopy(bArr, i, bArr3, this.aad.length, i2);
        this.aad = bArr3;
    }
}
