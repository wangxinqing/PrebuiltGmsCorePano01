package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: ail  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ail {
    public final int a;
    public final int b;
    public final byte[] c;

    public ail(int i, int i2, byte[] bArr) {
        this(i, i2, bArr, (byte[]) null);
    }

    public static ail a(int i, ByteOrder byteOrder) {
        int[] iArr = {i};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[aio.e[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) iArr[0]);
        return new ail(3, 1, wrap.array());
    }

    public final int b(ByteOrder byteOrder) {
        Object a2 = a(byteOrder);
        if (a2 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        } else if (a2 instanceof String) {
            return Integer.parseInt((String) a2);
        } else {
            if (a2 instanceof long[]) {
                long[] jArr = (long[]) a2;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (a2 instanceof int[]) {
                int[] iArr = (int[]) a2;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
    }

    public final String c(ByteOrder byteOrder) {
        Object a2 = a(byteOrder);
        if (a2 != null) {
            if (a2 instanceof String) {
                return (String) a2;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (a2 instanceof long[]) {
                long[] jArr = (long[]) a2;
                while (true) {
                    int length = jArr.length;
                    if (i >= length) {
                        return sb.toString();
                    }
                    sb.append(jArr[i]);
                    i++;
                    if (i != length) {
                        sb.append(",");
                    }
                }
            } else if (a2 instanceof int[]) {
                int[] iArr = (int[]) a2;
                while (true) {
                    int length2 = iArr.length;
                    if (i >= length2) {
                        return sb.toString();
                    }
                    sb.append(iArr[i]);
                    i++;
                    if (i != length2) {
                        sb.append(",");
                    }
                }
            } else if (a2 instanceof double[]) {
                double[] dArr = (double[]) a2;
                while (true) {
                    int length3 = dArr.length;
                    if (i >= length3) {
                        return sb.toString();
                    }
                    sb.append(dArr[i]);
                    i++;
                    if (i != length3) {
                        sb.append(",");
                    }
                }
            } else if (a2 instanceof ain[]) {
                ain[] ainArr = (ain[]) a2;
                while (true) {
                    int length4 = ainArr.length;
                    if (i >= length4) {
                        return sb.toString();
                    }
                    sb.append(ainArr[i].a);
                    sb.append('/');
                    sb.append(ainArr[i].b);
                    i++;
                    if (i != length4) {
                        sb.append(",");
                    }
                }
            }
        }
        return null;
    }

    public final String toString() {
        return "(" + aio.d[this.a] + ", data length:" + this.c.length + ")";
    }

    public ail(int i, int i2, byte[] bArr, byte[] bArr2) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    public static ail a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[aio.e[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new ail(4, 1, wrap.array());
    }

    public static ail a(ain ain, ByteOrder byteOrder) {
        ain[] ainArr = {ain};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[aio.e[5]]);
        wrap.order(byteOrder);
        ain ain2 = ainArr[0];
        wrap.putInt((int) ain2.a);
        wrap.putInt((int) ain2.b);
        return new ail(5, 1, wrap.array());
    }

    public static ail a(String str) {
        byte[] bytes = (str + 0).getBytes(aio.h);
        return new ail(2, bytes.length, bytes);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0191 A[SYNTHETIC, Splitter:B:158:0x0191] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x019e A[SYNTHETIC, Splitter:B:166:0x019e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.nio.ByteOrder r11) {
        /*
            r10 = this;
            java.lang.String r0 = "IOException occurred while closing InputStream"
            java.lang.String r1 = "ExifInterface"
            r2 = 0
            aik r3 = new aik     // Catch:{ IOException -> 0x0188, all -> 0x0186 }
            byte[] r4 = r10.c     // Catch:{ IOException -> 0x0188, all -> 0x0186 }
            r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x0188, all -> 0x0186 }
            r3.a = r11     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            int r11 = r10.a     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            r4 = 0
            switch(r11) {
                case 1: goto L_0x014a;
                case 2: goto L_0x00fe;
                case 3: goto L_0x00e4;
                case 4: goto L_0x00ca;
                case 5: goto L_0x00a7;
                case 6: goto L_0x014a;
                case 7: goto L_0x00fe;
                case 8: goto L_0x008d;
                case 9: goto L_0x0073;
                case 10: goto L_0x004e;
                case 11: goto L_0x0033;
                case 12: goto L_0x0019;
                default: goto L_0x0014;
            }
        L_0x0014:
            r3.close()     // Catch:{ IOException -> 0x017c }
            goto L_0x0180
        L_0x0019:
            int r11 = r10.b     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
        L_0x001d:
            int r5 = r10.b     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            if (r4 >= r5) goto L_0x002a
            double r5 = r3.readDouble()     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            r11[r4] = r5     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            int r4 = r4 + 1
            goto L_0x001d
        L_0x002a:
            r3.close()     // Catch:{ IOException -> 0x002e }
            goto L_0x0032
        L_0x002e:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x0032:
            return r11
        L_0x0033:
            int r11 = r10.b     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
        L_0x0037:
            int r5 = r10.b     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            if (r4 >= r5) goto L_0x0045
            float r5 = r3.readFloat()     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            double r5 = (double) r5     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            r11[r4] = r5     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            int r4 = r4 + 1
            goto L_0x0037
        L_0x0045:
            r3.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x004d:
            return r11
        L_0x004e:
            int r11 = r10.b     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            ain[] r11 = new defpackage.ain[r11]     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
        L_0x0052:
            int r5 = r10.b     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            if (r4 >= r5) goto L_0x006a
            int r5 = r3.readInt()     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            long r5 = (long) r5     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            int r7 = r3.readInt()     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            long r7 = (long) r7     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            ain r9 = new ain     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            r9.<init>(r5, r7)     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            r11[r4] = r9     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            int r4 = r4 + 1
            goto L_0x0052
        L_0x006a:
            r3.close()     // Catch:{ IOException -> 0x006e }
            goto L_0x0072
        L_0x006e:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x0072:
            return r11
        L_0x0073:
            int r11 = r10.b     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
        L_0x0077:
            int r5 = r10.b     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            if (r4 >= r5) goto L_0x0084
            int r5 = r3.readInt()     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            r11[r4] = r5     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            int r4 = r4 + 1
            goto L_0x0077
        L_0x0084:
            r3.close()     // Catch:{ IOException -> 0x0088 }
            goto L_0x008c
        L_0x0088:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x008c:
            return r11
        L_0x008d:
            int r11 = r10.b     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
        L_0x0091:
            int r5 = r10.b     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            if (r4 >= r5) goto L_0x009e
            short r5 = r3.readShort()     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            r11[r4] = r5     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            int r4 = r4 + 1
            goto L_0x0091
        L_0x009e:
            r3.close()     // Catch:{ IOException -> 0x00a2 }
            goto L_0x00a6
        L_0x00a2:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x00a6:
            return r11
        L_0x00a7:
            int r11 = r10.b     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            ain[] r11 = new defpackage.ain[r11]     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
        L_0x00ab:
            int r5 = r10.b     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            if (r4 >= r5) goto L_0x00c1
            long r5 = r3.a()     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            long r7 = r3.a()     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            ain r9 = new ain     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            r9.<init>(r5, r7)     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            r11[r4] = r9     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            int r4 = r4 + 1
            goto L_0x00ab
        L_0x00c1:
            r3.close()     // Catch:{ IOException -> 0x00c5 }
            goto L_0x00c9
        L_0x00c5:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x00c9:
            return r11
        L_0x00ca:
            int r11 = r10.b     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
        L_0x00ce:
            int r5 = r10.b     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            if (r4 >= r5) goto L_0x00db
            long r5 = r3.a()     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            r11[r4] = r5     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            int r4 = r4 + 1
            goto L_0x00ce
        L_0x00db:
            r3.close()     // Catch:{ IOException -> 0x00df }
            goto L_0x00e3
        L_0x00df:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x00e3:
            return r11
        L_0x00e4:
            int r11 = r10.b     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
        L_0x00e8:
            int r5 = r10.b     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            if (r4 >= r5) goto L_0x00f5
            int r5 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            r11[r4] = r5     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            int r4 = r4 + 1
            goto L_0x00e8
        L_0x00f5:
            r3.close()     // Catch:{ IOException -> 0x00f9 }
            goto L_0x00fd
        L_0x00f9:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x00fd:
            return r11
        L_0x00fe:
            int r11 = r10.b     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            byte[] r5 = defpackage.aio.f     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            int r5 = r5.length     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            if (r11 >= r5) goto L_0x0106
            goto L_0x011c
        L_0x0106:
            r11 = 0
        L_0x0107:
            byte[] r5 = defpackage.aio.f     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            int r5 = r5.length     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            if (r11 >= r5) goto L_0x0119
            byte[] r5 = r10.c     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            byte r5 = r5[r11]     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            byte[] r6 = defpackage.aio.f     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            byte r6 = r6[r11]     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            if (r5 != r6) goto L_0x011c
            int r11 = r11 + 1
            goto L_0x0107
        L_0x0119:
            byte[] r11 = defpackage.aio.f     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            int r4 = r11.length     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
        L_0x011c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            r11.<init>()     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
        L_0x0121:
            int r5 = r10.b     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            if (r4 >= r5) goto L_0x013d
            byte[] r5 = r10.c     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            byte r5 = r5[r4]     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            if (r5 != 0) goto L_0x012c
            goto L_0x013d
        L_0x012c:
            r6 = 32
            if (r5 < r6) goto L_0x0135
            char r5 = (char) r5     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            r11.append(r5)     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            goto L_0x013a
        L_0x0135:
            r5 = 63
            r11.append(r5)     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
        L_0x013a:
            int r4 = r4 + 1
            goto L_0x0121
        L_0x013d:
            java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            r3.close()     // Catch:{ IOException -> 0x0145 }
            goto L_0x0149
        L_0x0145:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x0149:
            return r11
        L_0x014a:
            byte[] r11 = r10.c     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            int r5 = r11.length     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            r6 = 1
            if (r5 != r6) goto L_0x016c
            byte r5 = r11[r4]     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            if (r5 >= 0) goto L_0x0155
            goto L_0x016c
        L_0x0155:
            if (r5 > r6) goto L_0x016c
            java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            char[] r6 = new char[r6]     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            int r5 = r5 + 48
            char r5 = (char) r5     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            r6[r4] = r5     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            r11.<init>(r6)     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            r3.close()     // Catch:{ IOException -> 0x0167 }
            goto L_0x016b
        L_0x0167:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x016b:
            return r11
        L_0x016c:
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            java.nio.charset.Charset r5 = defpackage.aio.h     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            r4.<init>(r11, r5)     // Catch:{ IOException -> 0x0184, all -> 0x0181 }
            r3.close()     // Catch:{ IOException -> 0x0177 }
            goto L_0x017b
        L_0x0177:
            r11 = move-exception
            android.util.Log.e(r1, r0, r11)
        L_0x017b:
            return r4
        L_0x017c:
            r11 = move-exception
            android.util.Log.e(r1, r0, r11)
        L_0x0180:
            return r2
        L_0x0181:
            r11 = move-exception
            r2 = r3
            goto L_0x019c
        L_0x0184:
            r11 = move-exception
            goto L_0x018a
        L_0x0186:
            r11 = move-exception
            goto L_0x019c
        L_0x0188:
            r11 = move-exception
            r3 = r2
        L_0x018a:
            java.lang.String r4 = "IOException occurred during reading a value"
            android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x019a }
            if (r3 == 0) goto L_0x0199
            r3.close()     // Catch:{ IOException -> 0x0195 }
            goto L_0x0199
        L_0x0195:
            r11 = move-exception
            android.util.Log.e(r1, r0, r11)
        L_0x0199:
            return r2
        L_0x019a:
            r11 = move-exception
            r2 = r3
        L_0x019c:
            if (r2 == 0) goto L_0x01a6
            r2.close()     // Catch:{ IOException -> 0x01a2 }
            goto L_0x01a6
        L_0x01a2:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x01a6:
            goto L_0x01a8
        L_0x01a7:
            throw r11
        L_0x01a8:
            goto L_0x01a7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ail.a(java.nio.ByteOrder):java.lang.Object");
    }
}
