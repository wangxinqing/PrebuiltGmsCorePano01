package defpackage;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* renamed from: aonw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aonw {
    private static final amsk a = amsk.a('.').a(4);
    private static final amsk b = amsk.a(':').a(10);

    static {
        Inet4Address inet4Address = (Inet4Address) a("127.0.0.1");
        Inet4Address inet4Address2 = (Inet4Address) a("0.0.0.0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009a, code lost:
        if (r3 != null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ee, code lost:
        if (r4 == 0) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0102, code lost:
        if (r2 != 0) goto L_0x0160;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.net.InetAddress a(java.lang.String r14) {
        /*
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0004:
            int r4 = r14.length()
            r5 = 16
            r6 = 58
            r7 = -1
            r8 = 1
            r9 = 0
            if (r1 >= r4) goto L_0x002e
            char r4 = r14.charAt(r1)
            r10 = 46
            if (r4 != r10) goto L_0x001b
            r3 = 1
            goto L_0x002b
        L_0x001b:
            if (r4 == r6) goto L_0x0028
            r10 = 37
            if (r4 == r10) goto L_0x002f
            int r4 = java.lang.Character.digit(r4, r5)
            if (r4 == r7) goto L_0x0160
            goto L_0x002b
        L_0x0028:
            if (r3 != 0) goto L_0x015f
            r2 = 1
        L_0x002b:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x002e:
            r1 = -1
        L_0x002f:
            if (r2 == 0) goto L_0x0158
            r2 = 3
            if (r3 == 0) goto L_0x009f
            int r3 = r14.lastIndexOf(r6)
            int r3 = r3 + r8
            java.lang.String r4 = r14.substring(r0, r3)
            java.lang.String r3 = r14.substring(r3)
            byte[] r3 = b(r3)
            if (r3 == 0) goto L_0x0099
            byte r6 = r3[r0]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            byte r10 = r3[r8]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r6 = r6 | r10
            java.lang.String r6 = java.lang.Integer.toHexString(r6)
            r10 = 2
            byte r10 = r3[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 8
            byte r3 = r3[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r10
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r10 = java.lang.String.valueOf(r4)
            int r10 = r10.length()
            java.lang.String r11 = java.lang.String.valueOf(r6)
            int r11 = r11.length()
            java.lang.String r12 = java.lang.String.valueOf(r3)
            int r12 = r12.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r10 = r10 + r8
            int r10 = r10 + r11
            int r10 = r10 + r12
            r13.<init>(r10)
            r13.append(r4)
            r13.append(r6)
            java.lang.String r4 = ":"
            r13.append(r4)
            r13.append(r3)
            java.lang.String r3 = r13.toString()
            goto L_0x009a
        L_0x0099:
            r3 = r9
        L_0x009a:
            if (r3 == 0) goto L_0x009d
            goto L_0x00a0
        L_0x009d:
            goto L_0x0160
        L_0x009f:
            r3 = r14
        L_0x00a0:
            if (r1 != r7) goto L_0x00a3
            goto L_0x00a8
        L_0x00a3:
            java.lang.String r3 = r3.substring(r0, r1)
        L_0x00a8:
            amsk r1 = b
            java.util.List r1 = r1.c(r3)
            int r3 = r1.size()
            if (r3 < r2) goto L_0x0157
            int r2 = r1.size()
            r3 = 9
            if (r2 > r3) goto L_0x0157
            r2 = 1
            r3 = -1
        L_0x00be:
            int r4 = r1.size()
            int r4 = r4 + r7
            if (r2 >= r4) goto L_0x00d8
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            if (r4 == 0) goto L_0x00d2
            goto L_0x00d5
        L_0x00d2:
            if (r3 >= 0) goto L_0x0160
            r3 = r2
        L_0x00d5:
            int r2 = r2 + 1
            goto L_0x00be
        L_0x00d8:
            if (r3 < 0) goto L_0x0106
            int r2 = r1.size()
            int r2 = r2 - r3
            int r2 = r2 + r7
            java.lang.Object r4 = r1.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            if (r4 != 0) goto L_0x00f3
            int r4 = r3 + -1
            if (r4 != 0) goto L_0x00f1
            goto L_0x00f4
        L_0x00f1:
            goto L_0x0160
        L_0x00f3:
            r4 = r3
        L_0x00f4:
            java.lang.Object r6 = defpackage.anbs.d(r1)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0105
            int r2 = r2 + -1
            if (r2 != 0) goto L_0x00f1
            goto L_0x010b
        L_0x0105:
            goto L_0x010b
        L_0x0106:
            int r4 = r1.size()
            r2 = 0
        L_0x010b:
            int r6 = r4 + r2
            int r6 = 8 - r6
            if (r3 >= 0) goto L_0x0114
            if (r6 != 0) goto L_0x00f1
            goto L_0x0117
        L_0x0114:
            if (r6 > 0) goto L_0x0117
            goto L_0x00f1
        L_0x0117:
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r5)
            r5 = 0
        L_0x011d:
            if (r5 >= r4) goto L_0x0131
            java.lang.Object r7 = r1.get(r5)     // Catch:{ NumberFormatException -> 0x012f }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x012f }
            short r7 = c(r7)     // Catch:{ NumberFormatException -> 0x012f }
            r3.putShort(r7)     // Catch:{ NumberFormatException -> 0x012f }
            int r5 = r5 + 1
            goto L_0x011d
        L_0x012f:
            r1 = move-exception
            goto L_0x015f
        L_0x0131:
            r4 = 0
        L_0x0132:
            if (r4 >= r6) goto L_0x013a
            r3.putShort(r0)     // Catch:{ NumberFormatException -> 0x012f }
            int r4 = r4 + 1
            goto L_0x0132
        L_0x013a:
        L_0x013b:
            if (r2 <= 0) goto L_0x0152
            int r4 = r1.size()     // Catch:{ NumberFormatException -> 0x012f }
            int r4 = r4 - r2
            java.lang.Object r4 = r1.get(r4)     // Catch:{ NumberFormatException -> 0x012f }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ NumberFormatException -> 0x012f }
            short r4 = c(r4)     // Catch:{ NumberFormatException -> 0x012f }
            r3.putShort(r4)     // Catch:{ NumberFormatException -> 0x012f }
            int r2 = r2 + -1
            goto L_0x013b
        L_0x0152:
            byte[] r9 = r3.array()
            goto L_0x0160
        L_0x0157:
            goto L_0x0160
        L_0x0158:
            if (r3 == 0) goto L_0x015f
            byte[] r9 = b(r14)
            goto L_0x0160
        L_0x015f:
        L_0x0160:
            if (r9 == 0) goto L_0x0167
            java.net.InetAddress r14 = a((byte[]) r9)
            return r14
        L_0x0167:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r0] = r14
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = "'%s' is not an IP string literal."
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            r14.<init>(r0)
            goto L_0x017a
        L_0x0179:
            throw r14
        L_0x017a:
            goto L_0x0179
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aonw.a(java.lang.String):java.net.InetAddress");
    }

    private static byte[] b(String str) {
        byte[] bArr = new byte[4];
        try {
            int i = 0;
            for (String str2 : a.a((CharSequence) str)) {
                int i2 = i + 1;
                int parseInt = Integer.parseInt(str2);
                if (parseInt > 255 || (str2.startsWith("0") && str2.length() > 1)) {
                    throw new NumberFormatException();
                }
                bArr[i] = (byte) parseInt;
                i = i2;
            }
            if (i == 4) {
                return bArr;
            }
            return null;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private static short c(String str) {
        int parseInt = Integer.parseInt(str, 16);
        if (parseInt <= 65535) {
            return (short) parseInt;
        }
        throw new NumberFormatException();
    }

    private static InetAddress a(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            throw new AssertionError(e);
        }
    }
}
