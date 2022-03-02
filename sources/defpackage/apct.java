package defpackage;

import java.security.Key;
import javax.crypto.Mac;

/* renamed from: apct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apct implements aoun {
    private final Mac a;
    private final int b;
    private final String c;
    private final Key d;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public apct(java.lang.String r5, java.security.Key r6, int r7) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 10
            if (r7 < r0) goto L_0x00a1
            byte[] r0 = r6.getEncoded()
            int r0 = r0.length
            r1 = 16
            if (r0 < r1) goto L_0x0099
            int r0 = r5.hashCode()
            r1 = -1823053428(0xffffffff9356698c, float:-2.7062636E-27)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x003a
            r1 = 392315118(0x176240ee, float:7.310649E-25)
            if (r0 == r1) goto L_0x0030
            r1 = 392317873(0x17624bb1, float:7.3120074E-25)
            if (r0 == r1) goto L_0x0026
            goto L_0x0044
        L_0x0026:
            java.lang.String r0 = "HMACSHA512"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0044
            r0 = 2
            goto L_0x0045
        L_0x0030:
            java.lang.String r0 = "HMACSHA256"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0044
            r0 = 1
            goto L_0x0045
        L_0x003a:
            java.lang.String r0 = "HMACSHA1"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0044
            r0 = 0
            goto L_0x0045
        L_0x0044:
            r0 = -1
        L_0x0045:
            java.lang.String r1 = "tag size too big"
            if (r0 == 0) goto L_0x007b
            if (r0 == r3) goto L_0x0070
            if (r0 == r2) goto L_0x0065
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException
            java.lang.String r7 = "unknown Hmac algorithm: "
            int r0 = r5.length()
            if (r0 != 0) goto L_0x005d
            java.lang.String r5 = new java.lang.String
            r5.<init>(r7)
            goto L_0x0061
        L_0x005d:
            java.lang.String r5 = r7.concat(r5)
        L_0x0061:
            r6.<init>(r5)
            throw r6
        L_0x0065:
            r0 = 64
            if (r7 > r0) goto L_0x006a
            goto L_0x007f
        L_0x006a:
            java.security.InvalidAlgorithmParameterException r5 = new java.security.InvalidAlgorithmParameterException
            r5.<init>(r1)
            throw r5
        L_0x0070:
            r0 = 32
            if (r7 > r0) goto L_0x0075
            goto L_0x007f
        L_0x0075:
            java.security.InvalidAlgorithmParameterException r5 = new java.security.InvalidAlgorithmParameterException
            r5.<init>(r1)
            throw r5
        L_0x007b:
            r0 = 20
            if (r7 > r0) goto L_0x0093
        L_0x007f:
            r4.c = r5
            r4.b = r7
            r4.d = r6
            apcf r7 = defpackage.apcf.b
            java.lang.Object r5 = r7.a(r5)
            javax.crypto.Mac r5 = (javax.crypto.Mac) r5
            r4.a = r5
            r5.init(r6)
            return
        L_0x0093:
            java.security.InvalidAlgorithmParameterException r5 = new java.security.InvalidAlgorithmParameterException
            r5.<init>(r1)
            throw r5
        L_0x0099:
            java.security.InvalidAlgorithmParameterException r5 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r6 = "key size too small, need at least 16 bytes"
            r5.<init>(r6)
            throw r5
        L_0x00a1:
            java.security.InvalidAlgorithmParameterException r5 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r6 = "tag size too small, need at least 10 bytes"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apct.<init>(java.lang.String, java.security.Key, int):void");
    }

    public final byte[] a(byte[] bArr) {
        Mac mac;
        try {
            mac = (Mac) this.a.clone();
        } catch (CloneNotSupportedException e) {
            mac = (Mac) apcf.b.a(this.c);
            mac.init(this.d);
        }
        mac.update(bArr);
        byte[] bArr2 = new byte[this.b];
        System.arraycopy(mac.doFinal(), 0, bArr2, 0, this.b);
        return bArr2;
    }
}
