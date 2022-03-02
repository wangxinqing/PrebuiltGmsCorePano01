package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.SecretKey;

/* renamed from: auta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auta {
    private final HashMap a = new HashMap();
    private final ausy b;
    private final KeyPair c;
    private PublicKey d;
    private SecretKey e;
    private byte[] f;
    private byte[] g;
    private byte[] h;
    private final int i;
    private int j;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private auta(int r3, defpackage.ausy r4) {
        /*
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.a = r0
            if (r4 != 0) goto L_0x0011
            java.lang.String r0 = "Invalid handshake cipher"
            r2.c((java.lang.String) r0)
        L_0x0011:
            r2.b = r4
            ausy r0 = defpackage.ausy.a
            int r0 = r3 + -1
            if (r0 == 0) goto L_0x0027
            r1 = 3
            if (r0 == r1) goto L_0x0025
            java.lang.String r0 = "Invalid handshake state"
            r2.b((java.lang.String) r0)
            r0 = 0
            r2.i = r0
            goto L_0x002a
        L_0x0025:
            r0 = 2
            goto L_0x0028
        L_0x0027:
            r0 = 1
        L_0x0028:
            r2.i = r0
        L_0x002a:
            r2.j = r3
            int r3 = r4.ordinal()
            if (r3 == 0) goto L_0x0056
            java.lang.String r3 = java.lang.String.valueOf(r4)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r4 = r4 + 16
            r0.<init>(r4)
            java.lang.String r4 = "unknown cipher: "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.a((java.lang.String) r3)
            r3 = 0
            goto L_0x005a
        L_0x0056:
            java.security.KeyPair r3 = defpackage.autq.a()
        L_0x005a:
            r2.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auta.<init>(int, ausy):void");
    }

    public static auta a(ausy ausy) {
        return new auta(1, ausy);
    }

    public static auta b(ausy ausy) {
        return new auta(4, ausy);
    }

    private final void c(String str) {
        this.j = 11;
        throw new IllegalArgumentException(str);
    }

    private static byte[] e() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public final int d() {
        ausy ausy = ausy.a;
        int i2 = this.j;
        int i3 = i2 - 1;
        if (i2 != 0) {
            switch (i3) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return 1;
                case 6:
                    return 2;
                case 7:
                    return 3;
                case 8:
                    return 4;
                case 9:
                    return 5;
                case 10:
                    return 6;
                default:
                    b("Unknown state");
                    return 0;
            }
        } else {
            throw null;
        }
    }

    private final void a(int i2, String str) {
        this.j = 11;
        ausy ausy = ausy.a;
        if (!(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4)) {
            switch (i2) {
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                    break;
                default:
                    String valueOf = String.valueOf(Integer.toString(i2));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                    sb.append("Unknown alert type: ");
                    sb.append(valueOf);
                    a(sb.toString());
                    break;
            }
        }
        aucd o = autd.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        autd autd = (autd) o.b;
        autd.b = i2;
        int i3 = autd.a | 1;
        autd.a = i3;
        if (str != null) {
            str.getClass();
            autd.a = i3 | 2;
            autd.c = str;
        }
        throw new ausx(str, (autd) o.i());
    }

    private final PublicKey b(byte[] bArr) {
        try {
            return autq.a((autx) aucj.a((aucj) autx.f, bArr));
        } catch (auda | InvalidKeySpecException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            a(104, valueOf.length() == 0 ? new String("Cannot parse public key: ") : "Cannot parse public key: ".concat(valueOf));
            return null;
        }
    }

    private final byte[] c(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-512").digest(bArr);
        } catch (NoSuchAlgorithmException e2) {
            a("No security provider initialized yet?", (Exception) e2);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aurx c() {
        /*
            r6 = this;
            ausy r0 = defpackage.ausy.a
            int r0 = r6.j
            int r1 = r0 + -1
            r2 = 0
            if (r0 == 0) goto L_0x009c
            switch(r1) {
                case 6: goto L_0x0020;
                case 7: goto L_0x000c;
                case 8: goto L_0x0027;
                case 9: goto L_0x0019;
                case 10: goto L_0x0012;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.String r0 = "Handshake is not complete; cannot create connection context"
            r6.b((java.lang.String) r0)
            goto L_0x0027
        L_0x0012:
            java.lang.String r0 = "Cannot make context; handshake had error"
            r6.b((java.lang.String) r0)
            return r2
        L_0x0019:
            java.lang.String r0 = "Cannot reuse handshake context; is has already been used"
            r6.b((java.lang.String) r0)
            return r2
        L_0x0020:
            java.lang.String r0 = "Handshake not verified, cannot create context"
            r6.b((java.lang.String) r0)
            return r2
        L_0x0027:
            javax.crypto.SecretKey r0 = r6.e
            if (r0 == 0) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            java.lang.String r0 = "Unexpected state error: derived key is null"
            r6.b((java.lang.String) r0)
        L_0x0032:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            byte[] r1 = r6.g     // Catch:{ IOException -> 0x0042 }
            r0.write(r1)     // Catch:{ IOException -> 0x0042 }
            byte[] r1 = r6.h     // Catch:{ IOException -> 0x0042 }
            r0.write(r1)     // Catch:{ IOException -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r1 = move-exception
            r6.a((java.lang.Exception) r1)
        L_0x0046:
            byte[] r0 = r0.toByteArray()
            java.lang.String r1 = "UKEY2 v1 next"
            java.lang.String r3 = "UTF-8"
            byte[] r1 = r1.getBytes(r3)     // Catch:{ UnsupportedEncodingException -> 0x0053 }
            goto L_0x0058
        L_0x0053:
            r1 = move-exception
            r6.a((java.lang.Exception) r1)
            r1 = r2
        L_0x0058:
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidKeyException -> 0x0068, NoSuchAlgorithmException -> 0x0066 }
            javax.crypto.SecretKey r4 = r6.e     // Catch:{ InvalidKeyException -> 0x0068, NoSuchAlgorithmException -> 0x0066 }
            byte[] r0 = defpackage.autp.a(r4, r1, r0)     // Catch:{ InvalidKeyException -> 0x0068, NoSuchAlgorithmException -> 0x0066 }
            java.lang.String r1 = "AES"
            r3.<init>(r0, r1)     // Catch:{ InvalidKeyException -> 0x0068, NoSuchAlgorithmException -> 0x0066 }
            goto L_0x006d
        L_0x0066:
            r0 = move-exception
            goto L_0x0069
        L_0x0068:
            r0 = move-exception
        L_0x0069:
            r6.a((java.lang.Exception) r0)
            r3 = r2
        L_0x006d:
            java.lang.String r0 = "client"
            javax.crypto.SecretKey r0 = defpackage.ausa.a((javax.crypto.SecretKey) r3, (java.lang.String) r0)     // Catch:{ InvalidKeyException -> 0x0080, NoSuchAlgorithmException -> 0x007e }
            java.lang.String r1 = "server"
            javax.crypto.SecretKey r2 = defpackage.ausa.a((javax.crypto.SecretKey) r3, (java.lang.String) r1)     // Catch:{ InvalidKeyException -> 0x007c, NoSuchAlgorithmException -> 0x007a }
            goto L_0x0086
        L_0x007a:
            r1 = move-exception
            goto L_0x0083
        L_0x007c:
            r1 = move-exception
            goto L_0x0083
        L_0x007e:
            r0 = move-exception
            goto L_0x0081
        L_0x0080:
            r0 = move-exception
        L_0x0081:
            r1 = r0
            r0 = r2
        L_0x0083:
            r6.a((java.lang.Exception) r1)
        L_0x0086:
            r1 = 10
            r6.j = r1
            aurz r1 = new aurz
            int r3 = r6.i
            r4 = 1
            if (r3 != r4) goto L_0x0093
            r5 = r0
            goto L_0x0094
        L_0x0093:
            r5 = r2
        L_0x0094:
            if (r3 != r4) goto L_0x0097
            r0 = r2
        L_0x0097:
            r2 = 0
            r1.<init>(r5, r0, r2, r2)
            return r1
        L_0x009c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auta.c():aurx");
    }

    private final void b(String str) {
        this.j = 11;
        throw new IllegalStateException(str);
    }

    public final void b() {
        int i2 = this.j;
        if (i2 != 8) {
            String a2 = ausz.a(i2);
            StringBuilder sb = new StringBuilder(a2.length() + 18);
            sb.append("Unexpected state: ");
            sb.append(a2);
            b(sb.toString());
        }
        this.j = 9;
    }

    private final void a(autl autl) {
        autd autd;
        if ((autl.a & 2) != 0) {
            try {
                autd = (autd) aucj.a((aucj) autd.d, autl.c);
            } catch (auda e2) {
                a("Cannot parse alert message", (Exception) e2);
                autd = null;
            }
            int i2 = autd.a;
            if ((i2 & 1) != 0) {
                int i3 = 1;
                if ((i2 & 2) == 0) {
                    int a2 = autc.a(autd.b);
                    if (a2 != 0) {
                        i3 = a2;
                    }
                    String valueOf = String.valueOf(Integer.toString(i3));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                    sb.append("Received Alert message. Type: ");
                    sb.append(valueOf);
                    a(sb.toString());
                } else {
                    int a3 = autc.a(autd.b);
                    if (a3 != 0) {
                        i3 = a3;
                    }
                    String valueOf2 = String.valueOf(Integer.toString(i3));
                    String str = autd.c;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 46 + String.valueOf(str).length());
                    sb2.append("Received Alert message. Type: ");
                    sb2.append(valueOf2);
                    sb2.append(" Error Message: ");
                    sb2.append(str);
                    a(sb2.toString());
                }
            }
        }
        a("Received empty Alert Message");
    }

    private final void a(Exception exc) {
        this.j = 11;
        throw new ausp(exc);
    }

    private final void a(String str) {
        this.j = 11;
        throw new ausp(str);
    }

    private final void a(String str, Exception exc) {
        this.j = 11;
        throw new ausp(str, exc);
    }

    private final byte[] a(int i2, byte[] bArr) {
        aucd o = autl.d.o();
        int i3 = i2 - 1;
        ausy ausy = ausy.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        autl autl = (autl) o.b;
        autl.b = i3;
        autl.a |= 1;
        if (bArr == null || bArr.length == 0) {
            c("Cannot send empty message data for non-alert messages");
        }
        auay a2 = auay.a(bArr);
        if (o.c) {
            o.c();
            o.c = false;
        }
        autl autl2 = (autl) o.b;
        a2.getClass();
        autl2.a |= 2;
        autl2.c = a2;
        return ((autl) o.i()).k();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: autg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: aute} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(byte[] r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            ausy r0 = defpackage.ausy.a
            int r0 = r1.j
            int r3 = r0 + -1
            r4 = 0
            if (r0 == 0) goto L_0x02c6
            r6 = 32
            java.lang.String r7 = "Expected, but did not find message type"
            java.lang.String r8 = "Expected message data, but didn't find it"
            r9 = 3
            r10 = 101(0x65, float:1.42E-43)
            r11 = 100
            r12 = 102(0x66, float:1.43E-43)
            r13 = 4
            r14 = 2
            r15 = 1
            if (r3 == r15) goto L_0x01d1
            r5 = 5
            if (r3 == r9) goto L_0x00d8
            if (r3 == r5) goto L_0x0043
            java.lang.String r0 = defpackage.ausz.a(r0)
            int r2 = r0.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 30
            r3.<init>(r2)
            java.lang.String r2 = "Cannot parse message in state "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.b((java.lang.String) r0)
            return
        L_0x0043:
            autl r0 = defpackage.autl.d     // Catch:{ auda -> 0x004c }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r0, (byte[]) r2)     // Catch:{ auda -> 0x004c }
            autl r0 = (defpackage.autl) r0     // Catch:{ auda -> 0x004c }
            goto L_0x0053
        L_0x004c:
            r0 = move-exception
            java.lang.String r3 = "Can't parse message 3"
            r1.a((java.lang.String) r3, (java.lang.Exception) r0)
            r0 = r4
        L_0x0053:
            int r3 = r0.a
            r3 = r3 & r15
            if (r3 == 0) goto L_0x00d2
            int r3 = r0.b
            int r3 = defpackage.autk.a(r3)
            if (r3 != 0) goto L_0x0061
            goto L_0x0066
        L_0x0061:
            if (r3 != r14) goto L_0x0066
            r1.a((defpackage.autl) r0)
        L_0x0066:
            int r3 = r0.b
            int r3 = defpackage.autk.a(r3)
            if (r3 != 0) goto L_0x006f
            goto L_0x0072
        L_0x006f:
            if (r3 != r5) goto L_0x0072
            goto L_0x0078
        L_0x0072:
            java.lang.String r3 = "Expected, but did not find CLIENT_FINISH message type"
            r1.a((java.lang.String) r3)
        L_0x0078:
            ausy r3 = r1.b
            int r3 = r3.ordinal()
            if (r3 == 0) goto L_0x0088
            java.lang.String r2 = "Unexpected handshakeCipher"
            r1.b((java.lang.String) r2)
            r2 = r4
            goto L_0x008c
        L_0x0088:
            byte[] r2 = r16.c((byte[]) r17)
        L_0x008c:
            byte[] r3 = r1.f
            boolean r2 = java.security.MessageDigest.isEqual(r2, r3)
            if (r2 == 0) goto L_0x0095
            goto L_0x009b
        L_0x0095:
            java.lang.String r2 = "Commitment does not match"
            r1.a((java.lang.String) r2)
        L_0x009b:
            int r2 = r0.a
            r2 = r2 & r14
            if (r2 != 0) goto L_0x00a3
            r1.a((java.lang.String) r8)
        L_0x00a3:
            auay r0 = r0.c     // Catch:{ auda -> 0x00af }
            aute r2 = defpackage.aute.c     // Catch:{ auda -> 0x00af }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r2, (defpackage.auay) r0)     // Catch:{ auda -> 0x00af }
            aute r0 = (defpackage.aute) r0     // Catch:{ auda -> 0x00af }
            r4 = r0
            goto L_0x00b3
        L_0x00af:
            r0 = move-exception
            r1.a((java.lang.Exception) r0)
        L_0x00b3:
            int r0 = r4.a
            r0 = r0 & r15
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = "No public key found in ClientFinished"
            r1.a((java.lang.String) r0)
        L_0x00bd:
            auay r0 = r4.b     // Catch:{ ausx -> 0x00ca }
            byte[] r0 = r0.k()     // Catch:{ ausx -> 0x00ca }
            java.security.PublicKey r0 = r1.b((byte[]) r0)     // Catch:{ ausx -> 0x00ca }
            r1.d = r0     // Catch:{ ausx -> 0x00ca }
            goto L_0x00ce
        L_0x00ca:
            r0 = move-exception
            r1.a((java.lang.Exception) r0)
        L_0x00ce:
            r0 = 7
            r1.j = r0
            return
        L_0x00d2:
            ausp r0 = new ausp
            r0.<init>((java.lang.String) r7)
            throw r0
        L_0x00d8:
            autl r0 = defpackage.autl.d     // Catch:{ auda -> 0x00e1 }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r0, (byte[]) r2)     // Catch:{ auda -> 0x00e1 }
            autl r0 = (defpackage.autl) r0     // Catch:{ auda -> 0x00e1 }
            goto L_0x0100
        L_0x00e1:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "Can't parse message 1 "
            int r7 = r0.length()
            if (r7 != 0) goto L_0x00f8
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            goto L_0x00fc
        L_0x00f8:
            java.lang.String r0 = r3.concat(r0)
        L_0x00fc:
            r1.a((int) r15, (java.lang.String) r0)
            r0 = r4
        L_0x0100:
            int r3 = r0.a
            r3 = r3 & r15
            if (r3 == 0) goto L_0x0111
            int r3 = r0.b
            int r3 = defpackage.autk.a(r3)
            if (r3 != 0) goto L_0x010e
            goto L_0x0111
        L_0x010e:
            if (r3 != r9) goto L_0x0111
            goto L_0x0117
        L_0x0111:
            java.lang.String r3 = "Expected, but did not find ClientInit message type"
            r1.a((int) r14, (java.lang.String) r3)
        L_0x0117:
            int r3 = r0.a
            r3 = r3 & r14
            if (r3 != 0) goto L_0x011f
            r1.a((int) r13, (java.lang.String) r8)
        L_0x011f:
            auay r0 = r0.c     // Catch:{ auda -> 0x012b }
            autg r3 = defpackage.autg.f     // Catch:{ auda -> 0x012b }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r3, (defpackage.auay) r0)     // Catch:{ auda -> 0x012b }
            autg r0 = (defpackage.autg) r0     // Catch:{ auda -> 0x012b }
            r4 = r0
            goto L_0x0131
        L_0x012b:
            r0 = move-exception
            java.lang.String r0 = "Can't parse message data into ClientInit"
            r1.a((int) r13, (java.lang.String) r0)
        L_0x0131:
            int r0 = r4.a
            r0 = r0 & r15
            if (r0 != 0) goto L_0x013b
            java.lang.String r0 = "ClientInit missing version"
            r1.a((int) r11, (java.lang.String) r0)
        L_0x013b:
            int r0 = r4.b
            if (r0 != r15) goto L_0x0140
            goto L_0x0146
        L_0x0140:
            java.lang.String r0 = "ClientInit version mismatch"
            r1.a((int) r11, (java.lang.String) r0)
        L_0x0146:
            int r0 = r4.a
            r0 = r0 & r14
            if (r0 == 0) goto L_0x014c
            goto L_0x0152
        L_0x014c:
            java.lang.String r0 = "ClientInit missing random"
            r1.a((int) r10, (java.lang.String) r0)
        L_0x0152:
            auay r0 = r4.c
            byte[] r0 = r0.k()
            int r0 = r0.length
            if (r0 != r6) goto L_0x015c
            goto L_0x0162
        L_0x015c:
            java.lang.String r0 = "ClientInit has incorrect nonce length"
            r1.a((int) r10, (java.lang.String) r0)
        L_0x0162:
            aucx r0 = r4.d
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x016b
            goto L_0x0171
        L_0x016b:
            java.lang.String r3 = "ClientInit is missing cipher commitments"
            r1.a((int) r12, (java.lang.String) r3)
        L_0x0171:
            int r3 = r0.size()
            r6 = 0
        L_0x0176:
            if (r6 >= r3) goto L_0x01ab
            java.lang.Object r7 = r0.get(r6)
            autf r7 = (defpackage.autf) r7
            int r8 = r7.a
            r9 = r8 & 1
            if (r9 != 0) goto L_0x0185
            goto L_0x018a
        L_0x0185:
            r8 = r8 & 2
            if (r8 == 0) goto L_0x018a
            goto L_0x0190
        L_0x018a:
            java.lang.String r8 = "ClientInit has improperly formatted cipher commitment"
            r1.a((int) r12, (java.lang.String) r8)
        L_0x0190:
            int r8 = r7.b
            int r8 = defpackage.auti.a(r8)
            if (r8 == 0) goto L_0x0199
            goto L_0x019a
        L_0x0199:
            r8 = 1
        L_0x019a:
            ausy r9 = r1.b
            int r9 = r9.b
            if (r8 != r9) goto L_0x01a8
            auay r7 = r7.c
            byte[] r7 = r7.k()
            r1.f = r7
        L_0x01a8:
            int r6 = r6 + 1
            goto L_0x0176
        L_0x01ab:
            byte[] r0 = r1.f
            if (r0 == 0) goto L_0x01b0
            goto L_0x01b6
        L_0x01b0:
            java.lang.String r0 = "No acceptable commitments found"
            r1.a((int) r12, (java.lang.String) r0)
        L_0x01b6:
            int r0 = r4.a
            r0 = r0 & r13
            if (r0 == 0) goto L_0x01c5
            java.lang.String r0 = r4.e
            java.lang.String r3 = "AES_256_CBC-HMAC_SHA256"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x01cc
        L_0x01c5:
            r0 = 103(0x67, float:1.44E-43)
            java.lang.String r3 = "Incorrect next protocol"
            r1.a((int) r0, (java.lang.String) r3)
        L_0x01cc:
            r1.g = r2
            r1.j = r5
            return
        L_0x01d1:
            autl r0 = defpackage.autl.d     // Catch:{ auda -> 0x01da }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r0, (byte[]) r2)     // Catch:{ auda -> 0x01da }
            autl r0 = (defpackage.autl) r0     // Catch:{ auda -> 0x01da }
            goto L_0x01f9
        L_0x01da:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "Can't parse message 2 "
            int r5 = r0.length()
            if (r5 != 0) goto L_0x01f1
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            goto L_0x01f5
        L_0x01f1:
            java.lang.String r0 = r3.concat(r0)
        L_0x01f5:
            r1.a((int) r15, (java.lang.String) r0)
            r0 = r4
        L_0x01f9:
            int r3 = r0.a
            r3 = r3 & r15
            if (r3 == 0) goto L_0x01ff
            goto L_0x0203
        L_0x01ff:
            r1.a((int) r14, (java.lang.String) r7)
        L_0x0203:
            int r3 = r0.b
            int r3 = defpackage.autk.a(r3)
            if (r3 != 0) goto L_0x020c
            goto L_0x0215
        L_0x020c:
            if (r3 != r14) goto L_0x0215
            r3 = 11
            r1.j = r3
            r1.a((defpackage.autl) r0)
        L_0x0215:
            int r3 = r0.b
            int r3 = defpackage.autk.a(r3)
            if (r3 != 0) goto L_0x021e
            goto L_0x0221
        L_0x021e:
            if (r3 != r13) goto L_0x0221
            goto L_0x0227
        L_0x0221:
            java.lang.String r3 = "Expected, but did not find SERVER_INIT message type"
            r1.a((int) r14, (java.lang.String) r3)
        L_0x0227:
            int r3 = r0.a
            r3 = r3 & r14
            if (r3 != 0) goto L_0x022f
            r1.a((int) r13, (java.lang.String) r8)
        L_0x022f:
            auay r0 = r0.c     // Catch:{ auda -> 0x023a }
            autm r3 = defpackage.autm.f     // Catch:{ auda -> 0x023a }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r3, (defpackage.auay) r0)     // Catch:{ auda -> 0x023a }
            autm r0 = (defpackage.autm) r0     // Catch:{ auda -> 0x023a }
            goto L_0x0241
        L_0x023a:
            r0 = move-exception
            java.lang.String r0 = "Can't parse message data into ServerInit"
            r1.a((int) r13, (java.lang.String) r0)
            r0 = r4
        L_0x0241:
            int r3 = r0.a
            r3 = r3 & r15
            if (r3 != 0) goto L_0x024b
            java.lang.String r3 = "ServerInit missing version"
            r1.a((int) r11, (java.lang.String) r3)
        L_0x024b:
            int r3 = r0.b
            if (r3 != r15) goto L_0x0250
            goto L_0x0256
        L_0x0250:
            java.lang.String r3 = "ServerInit version mismatch"
            r1.a((int) r11, (java.lang.String) r3)
        L_0x0256:
            int r3 = r0.a
            r3 = r3 & r14
            if (r3 == 0) goto L_0x025c
            goto L_0x0262
        L_0x025c:
            java.lang.String r3 = "ServerInit missing random"
            r1.a((int) r10, (java.lang.String) r3)
        L_0x0262:
            auay r3 = r0.c
            byte[] r3 = r3.k()
            int r3 = r3.length
            if (r3 != r6) goto L_0x026c
            goto L_0x0272
        L_0x026c:
            java.lang.String r3 = "ServerInit has incorrect nonce length"
            r1.a((int) r10, (java.lang.String) r3)
        L_0x0272:
            int r3 = r0.a
            r3 = r3 & r13
            if (r3 != 0) goto L_0x027c
            java.lang.String r3 = "No handshake cipher found"
            r1.a((int) r12, (java.lang.String) r3)
        L_0x027c:
            ausy[] r3 = defpackage.ausy.values()
            int r5 = r3.length
            r6 = 0
        L_0x0282:
            if (r6 >= r5) goto L_0x0299
            r7 = r3[r6]
            int r8 = r7.b
            int r10 = r0.d
            int r10 = defpackage.auti.a(r10)
            if (r10 == 0) goto L_0x0291
            goto L_0x0292
        L_0x0291:
            r10 = 1
        L_0x0292:
            if (r8 == r10) goto L_0x0297
            int r6 = r6 + 1
            goto L_0x0282
        L_0x0297:
            r4 = r7
            goto L_0x029a
        L_0x0299:
        L_0x029a:
            if (r4 != 0) goto L_0x029d
            goto L_0x02a1
        L_0x029d:
            ausy r3 = r1.b
            if (r4 == r3) goto L_0x02a7
        L_0x02a1:
            java.lang.String r3 = "No acceptable handshake cipher found"
            r1.a((int) r12, (java.lang.String) r3)
        L_0x02a7:
            int r3 = r0.a
            r3 = r3 & 8
            if (r3 == 0) goto L_0x02ae
            goto L_0x02b5
        L_0x02ae:
            r3 = 104(0x68, float:1.46E-43)
            java.lang.String r4 = "No public key found in ServerInit"
            r1.a((int) r3, (java.lang.String) r4)
        L_0x02b5:
            auay r0 = r0.e
            byte[] r0 = r0.k()
            java.security.PublicKey r0 = r1.b((byte[]) r0)
            r1.d = r0
            r1.h = r2
            r1.j = r9
            return
        L_0x02c6:
            goto L_0x02c9
        L_0x02c8:
            throw r4
        L_0x02c9:
            goto L_0x02c8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auta.a(byte[]):void");
    }

    public final byte[] a() {
        ausy ausy = ausy.a;
        int i2 = this.j;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            aucd o = autg.f.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            autg autg = (autg) o.b;
            autg.a |= 1;
            autg.b = 1;
            auay a2 = auay.a(e());
            if (o.c) {
                o.c();
                o.c = false;
            }
            autg autg2 = (autg) o.b;
            a2.getClass();
            int i4 = autg2.a | 2;
            autg2.a = i4;
            autg2.c = a2;
            "AES_256_CBC-HMAC_SHA256".getClass();
            autg2.a = 4 | i4;
            autg2.e = "AES_256_CBC-HMAC_SHA256";
            if (!this.a.containsKey(ausy.a)) {
                byte[] k = autq.a(this.c.getPublic()).k();
                aucd o2 = aute.c.o();
                auay a3 = auay.a(k);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aute aute = (aute) o2.b;
                a3.getClass();
                aute.a |= 1;
                aute.b = a3;
                this.a.put(ausy.a, a(5, ((aute) o2.i()).k()));
                aute aute2 = (aute) o2.i();
            }
            aucd o3 = autf.d.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            autf autf = (autf) o3.b;
            autf.b = 100;
            autf.a |= 1;
            auay a4 = auay.a(c((byte[]) this.a.get(ausy.a)));
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            autf autf2 = (autf) o3.b;
            a4.getClass();
            autf2.a |= 2;
            autf2.c = a4;
            autf autf3 = (autf) o3.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            autg autg3 = (autg) o.b;
            autf3.getClass();
            if (!autg3.d.a()) {
                autg3.d = aucj.a(autg3.d);
            }
            autg3.d.add(autf3);
            byte[] a5 = a(3, ((autg) o.i()).k());
            this.g = a5;
            this.j = 2;
            return a5;
        } else if (i3 == 2) {
            if (!this.a.containsKey(this.b)) {
                String valueOf = String.valueOf(this.b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 125);
                sb.append("Client state is CLIENT_AFTER_SERVER_INIT, and cipher is ");
                sb.append(valueOf);
                sb.append(", but no corresponding raw client finished message has been generated");
                b(sb.toString());
            }
            this.j = 7;
            return (byte[]) this.a.get(this.b);
        } else if (i3 != 4) {
            String a6 = ausz.a(i2);
            StringBuilder sb2 = new StringBuilder(a6.length() + 34);
            sb2.append("Cannot get next message in state: ");
            sb2.append(a6);
            b(sb2.toString());
            return null;
        } else {
            aucd o4 = autm.f.o();
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            autm autm = (autm) o4.b;
            autm.a |= 1;
            autm.b = 1;
            auay a7 = auay.a(e());
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            autm autm2 = (autm) o4.b;
            a7.getClass();
            int i5 = 2 | autm2.a;
            autm2.a = i5;
            autm2.c = a7;
            int i6 = this.b.b;
            int i7 = i6 - 1;
            if (i6 != 0) {
                autm2.d = i7;
                autm2.a = i5 | 4;
                auay au = autq.a(this.c.getPublic()).au();
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                autm autm3 = (autm) o4.b;
                au.getClass();
                autm3.a |= 8;
                autm3.e = au;
                byte[] a8 = a(4, ((autm) o4.i()).k());
                this.h = a8;
                this.j = 6;
                return a8;
            }
            throw null;
        }
    }

    public final byte[] a(int i2) {
        byte[] bArr;
        int i3 = this.j;
        if (i3 != 7) {
            String a2 = ausz.a(i3);
            StringBuilder sb = new StringBuilder(a2.length() + 18);
            sb.append("Unexpected state: ");
            sb.append(a2);
            b(sb.toString());
        }
        try {
            this.e = auso.a(this.c.getPrivate(), this.d);
        } catch (InvalidKeyException e2) {
            a((Exception) e2);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(this.g);
            byteArrayOutputStream.write(this.h);
        } catch (IOException e3) {
            a((Exception) e3);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr2 = null;
        try {
            bArr = "UKEY2 v1 auth".getBytes("UTF-8");
        } catch (UnsupportedEncodingException e4) {
            a((Exception) e4);
            bArr = null;
        }
        try {
            bArr2 = autp.a(this.e, bArr, byteArray);
        } catch (InvalidKeyException | NoSuchAlgorithmException e5) {
            a((Exception) e5);
        }
        this.j = 8;
        return Arrays.copyOf(bArr2, i2);
    }
}
