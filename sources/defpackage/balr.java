package defpackage;

import java.util.ArrayList;
import java.util.logging.Logger;

/* renamed from: balr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class balr {
    private static final Logger a = Logger.getLogger(balr.class.getName());
    private static final byte[] b = "-bin".getBytes(amqn.a);

    private balr() {
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        r5 = new java.lang.String(r3, defpackage.amqn.a);
        r3 = a;
        r6 = java.util.logging.Level.WARNING;
        r4 = java.util.Arrays.toString(r4);
        r9 = new java.lang.StringBuilder((r5.length() + 55) + java.lang.String.valueOf(r4).length());
        r9.append("Metadata key=");
        r9.append(r5);
        r9.append(", value=");
        r9.append(r4);
        r9.append(" contains invalid ASCII characters");
        r3.logp(r6, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", r9.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[][] a(defpackage.baaf r10) {
        /*
            byte[][] r10 = defpackage.azyz.a((defpackage.baaf) r10)
            r0 = 0
            r1 = 0
            r2 = 0
        L_0x0007:
            int r3 = r10.length
            if (r1 >= r3) goto L_0x008f
            r3 = r10[r1]
            int r4 = r1 + 1
            r4 = r10[r4]
            byte[] r5 = b
            boolean r5 = a(r3, r5)
            if (r5 == 0) goto L_0x002d
            r10[r2] = r3
            int r3 = r2 + 1
            anml r5 = defpackage.azyz.b
            java.lang.String r4 = r5.a((byte[]) r4)
            java.nio.charset.Charset r5 = defpackage.amqn.a
            byte[] r4 = r4.getBytes(r5)
            r10[r3] = r4
            int r2 = r2 + 2
            goto L_0x008b
        L_0x002d:
            int r5 = r4.length
            r6 = 0
        L_0x002f:
            if (r6 < r5) goto L_0x003a
            r10[r2] = r3
            int r3 = r2 + 1
            r10[r3] = r4
            int r2 = r2 + 2
            goto L_0x008b
        L_0x003a:
            byte r7 = r4[r6]
            r8 = 32
            if (r7 >= r8) goto L_0x0041
            goto L_0x0048
        L_0x0041:
            r8 = 126(0x7e, float:1.77E-43)
            if (r7 > r8) goto L_0x0048
            int r6 = r6 + 1
            goto L_0x002f
        L_0x0048:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = defpackage.amqn.a
            r5.<init>(r3, r6)
            java.util.logging.Logger r3 = a
            java.util.logging.Level r6 = java.util.logging.Level.WARNING
            java.lang.String r4 = java.util.Arrays.toString(r4)
            int r7 = r5.length()
            java.lang.String r8 = java.lang.String.valueOf(r4)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r7 = r7 + 55
            int r7 = r7 + r8
            r9.<init>(r7)
            java.lang.String r7 = "Metadata key="
            r9.append(r7)
            r9.append(r5)
            java.lang.String r5 = ", value="
            r9.append(r5)
            r9.append(r4)
            java.lang.String r4 = " contains invalid ASCII characters"
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            java.lang.String r5 = "io.grpc.internal.TransportFrameUtil"
            java.lang.String r7 = "toHttp2Headers"
            r3.logp(r6, r5, r7, r4)
        L_0x008b:
            int r1 = r1 + 2
            goto L_0x0007
        L_0x008f:
            if (r2 == r3) goto L_0x0097
            java.lang.Object[] r10 = java.util.Arrays.copyOfRange(r10, r0, r2)
            byte[][] r10 = (byte[][]) r10
        L_0x0097:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.balr.a(baaf):byte[][]");
    }

    public static byte[][] a(byte[][] bArr) {
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            int i2 = i + 1;
            byte[] bArr3 = bArr[i2];
            if (a(bArr2, b)) {
                for (byte b2 : bArr3) {
                    if (b2 == 44) {
                        ArrayList arrayList = new ArrayList(bArr.length + 10);
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList.add(bArr[i3]);
                        }
                        while (i < bArr.length) {
                            byte[] bArr4 = bArr[i];
                            byte[] bArr5 = bArr[i + 1];
                            if (a(bArr4, b)) {
                                int i4 = 0;
                                int i5 = 0;
                                while (true) {
                                    int length = bArr5.length;
                                    if (i4 > length) {
                                        break;
                                    }
                                    if (i4 == length || bArr5[i4] == 44) {
                                        byte[] b3 = anml.e.b((CharSequence) new String(bArr5, i5, i4 - i5, amqn.a));
                                        arrayList.add(bArr4);
                                        arrayList.add(b3);
                                        i5 = i4 + 1;
                                    }
                                    i4++;
                                }
                            } else {
                                arrayList.add(bArr4);
                                arrayList.add(bArr5);
                            }
                            i += 2;
                        }
                        return (byte[][]) arrayList.toArray(new byte[0][]);
                    }
                }
                bArr[i2] = anml.e.b((CharSequence) new String(bArr3, amqn.a));
            }
            i += 2;
        }
        return bArr;
    }
}
