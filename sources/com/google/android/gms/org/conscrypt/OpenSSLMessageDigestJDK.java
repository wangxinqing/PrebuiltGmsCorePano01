package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.EvpMdRef;
import com.google.android.gms.org.conscrypt.NativeRef;
import java.security.MessageDigestSpi;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OpenSSLMessageDigestJDK extends MessageDigestSpi implements Cloneable {
    private final NativeRef.EVP_MD_CTX ctx;
    private boolean digestInitializedInContext;
    private final long evp_md;
    private final byte[] singleByte;
    private final int size;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class MD5 extends OpenSSLMessageDigestJDK {
        public MD5() {
            super(EvpMdRef.MD5.EVP_MD, EvpMdRef.MD5.SIZE_BYTES);
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class SHA1 extends OpenSSLMessageDigestJDK {
        public SHA1() {
            super(EvpMdRef.SHA1.EVP_MD, EvpMdRef.SHA1.SIZE_BYTES);
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class SHA224 extends OpenSSLMessageDigestJDK {
        public SHA224() {
            super(EvpMdRef.SHA224.EVP_MD, EvpMdRef.SHA224.SIZE_BYTES);
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class SHA256 extends OpenSSLMessageDigestJDK {
        public SHA256() {
            super(EvpMdRef.SHA256.EVP_MD, EvpMdRef.SHA256.SIZE_BYTES);
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class SHA384 extends OpenSSLMessageDigestJDK {
        public SHA384() {
            super(EvpMdRef.SHA384.EVP_MD, EvpMdRef.SHA384.SIZE_BYTES);
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class SHA512 extends OpenSSLMessageDigestJDK {
        public SHA512() {
            super(EvpMdRef.SHA512.EVP_MD, EvpMdRef.SHA512.SIZE_BYTES);
        }
    }

    private OpenSSLMessageDigestJDK(long j, int i) {
        this.singleByte = new byte[1];
        this.evp_md = j;
        this.size = i;
        this.ctx = new NativeRef.EVP_MD_CTX(NativeCrypto.EVP_MD_CTX_create());
    }

    private synchronized void ensureDigestInitializedInContext() {
        if (!this.digestInitializedInContext) {
            NativeCrypto.EVP_DigestInit_ex(this.ctx, this.evp_md);
            this.digestInitializedInContext = true;
        }
    }

    public Object clone() {
        NativeRef.EVP_MD_CTX evp_md_ctx = new NativeRef.EVP_MD_CTX(NativeCrypto.EVP_MD_CTX_create());
        if (this.digestInitializedInContext) {
            NativeCrypto.EVP_MD_CTX_copy_ex(evp_md_ctx, this.ctx);
        }
        return new OpenSSLMessageDigestJDK(this.evp_md, this.size, evp_md_ctx, this.digestInitializedInContext);
    }

    /* access modifiers changed from: protected */
    public synchronized byte[] engineDigest() {
        byte[] bArr;
        ensureDigestInitializedInContext();
        bArr = new byte[this.size];
        NativeCrypto.EVP_DigestFinal_ex(this.ctx, bArr, 0);
        this.digestInitializedInContext = false;
        return bArr;
    }

    /* access modifiers changed from: protected */
    public int engineGetDigestLength() {
        return this.size;
    }

    /* access modifiers changed from: protected */
    public synchronized void engineReset() {
        NativeCrypto.EVP_MD_CTX_cleanup(this.ctx);
        this.digestInitializedInContext = false;
    }

    /* access modifiers changed from: protected */
    public synchronized void engineUpdate(byte b) {
        byte[] bArr = this.singleByte;
        bArr[0] = b;
        engineUpdate(bArr, 0, 1);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void engineUpdate(java.nio.ByteBuffer r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.hasRemaining()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x003b
            boolean r0 = r6.isDirect()     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0012
            super.engineUpdate(r6)     // Catch:{ all -> 0x004d }
            monitor-exit(r5)
            return
        L_0x0012:
            long r0 = com.google.android.gms.org.conscrypt.NativeCrypto.getDirectBufferAddress(r6)     // Catch:{ all -> 0x004d }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0021
            super.engineUpdate(r6)     // Catch:{ all -> 0x004d }
            monitor-exit(r5)
            return
        L_0x0021:
            int r2 = r6.position()     // Catch:{ all -> 0x004d }
            if (r2 < 0) goto L_0x0045
            long r3 = (long) r2     // Catch:{ all -> 0x004d }
            long r0 = r0 + r3
            int r3 = r6.remaining()     // Catch:{ all -> 0x004d }
            if (r3 < 0) goto L_0x003d
            r5.ensureDigestInitializedInContext()     // Catch:{ all -> 0x004d }
            com.google.android.gms.org.conscrypt.NativeRef$EVP_MD_CTX r4 = r5.ctx     // Catch:{ all -> 0x004d }
            com.google.android.gms.org.conscrypt.NativeCrypto.EVP_DigestUpdateDirect(r4, r0, r3)     // Catch:{ all -> 0x004d }
            int r2 = r2 + r3
            r6.position(r2)     // Catch:{ all -> 0x004d }
        L_0x003b:
            monitor-exit(r5)
            return
        L_0x003d:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "Negative remaining amount"
            r6.<init>(r0)     // Catch:{ all -> 0x004d }
            throw r6     // Catch:{ all -> 0x004d }
        L_0x0045:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "Negative position"
            r6.<init>(r0)     // Catch:{ all -> 0x004d }
            throw r6     // Catch:{ all -> 0x004d }
        L_0x004d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.OpenSSLMessageDigestJDK.engineUpdate(java.nio.ByteBuffer):void");
    }

    private OpenSSLMessageDigestJDK(long j, int i, NativeRef.EVP_MD_CTX evp_md_ctx, boolean z) {
        this.singleByte = new byte[1];
        this.evp_md = j;
        this.size = i;
        this.ctx = evp_md_ctx;
        this.digestInitializedInContext = z;
    }

    /* access modifiers changed from: protected */
    public synchronized void engineUpdate(byte[] bArr, int i, int i2) {
        ensureDigestInitializedInContext();
        NativeCrypto.EVP_DigestUpdate(this.ctx, bArr, i, i2);
    }
}
