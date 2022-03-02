package defpackage;

/* renamed from: anfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anfu extends anaf {
    public static final anaf b = new anfu((Object) null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    final transient Object[] c;
    private final transient Object d;
    private final transient int e;

    private anfu(Object obj, Object[] objArr, int i) {
        this.d = obj;
        this.c = objArr;
        this.e = i;
    }

    static anfu a(int i, Object[] objArr) {
        if (i == 0) {
            return (anfu) b;
        }
        if (i != 1) {
            amrl.b(i, objArr.length >> 1);
            return new anfu(a(objArr, i, anax.b(i), 0), objArr, i);
        }
        amxg.a(objArr[0], objArr[1]);
        return new anfu((Object) null, objArr, 1);
    }

    public final boolean bo() {
        return false;
    }

    public final amzn d() {
        return new anft(this.c, 1, this.e);
    }

    public final anax f() {
        return new anfs(this, new anft(this.c, 0, this.e));
    }

    public final anax g() {
        return new anfr(this, this.c, 0, this.e);
    }

    public final Object get(Object obj) {
        return a(this.d, this.c, this.e, 0, obj);
    }

    public final int size() {
        return this.e;
    }

    private static IllegalArgumentException a(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    static Object a(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 != null) {
            if (i == 1) {
                if (objArr[i2].equals(obj2)) {
                    return objArr[i2 ^ 1];
                }
                return null;
            } else if (obj != null) {
                if (!(obj instanceof byte[])) {
                    if (!(obj instanceof short[])) {
                        int[] iArr = (int[]) obj;
                        int length = iArr.length - 1;
                        int a = amzi.a(obj2.hashCode());
                        while (true) {
                            int i3 = a & length;
                            int i4 = iArr[i3];
                            if (i4 == -1) {
                                break;
                            } else if (objArr[i4].equals(obj2)) {
                                return objArr[i4 ^ 1];
                            } else {
                                a = i3 + 1;
                            }
                        }
                    } else {
                        short[] sArr = (short[]) obj;
                        int length2 = sArr.length - 1;
                        int a2 = amzi.a(obj2.hashCode());
                        while (true) {
                            int i5 = a2 & length2;
                            char c2 = (char) sArr[i5];
                            if (c2 == 65535) {
                                return null;
                            }
                            if (objArr[c2].equals(obj2)) {
                                return objArr[c2 ^ 1];
                            }
                            a2 = i5 + 1;
                        }
                    }
                } else {
                    byte[] bArr = (byte[]) obj;
                    int length3 = bArr.length - 1;
                    int a3 = amzi.a(obj2.hashCode());
                    while (true) {
                        int i6 = a3 & length3;
                        byte b2 = bArr[i6] & 255;
                        if (b2 == 255) {
                            return null;
                        }
                        if (objArr[b2].equals(obj2)) {
                            return objArr[b2 ^ 1];
                        }
                        a3 = i6 + 1;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        r11[r5] = (byte) r1;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
        r11[r6] = r1;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
        r11[r5] = (short) r1;
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Object a(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            r0 = 1
            if (r10 == r0) goto L_0x00bb
            int r0 = r11 + -1
            r1 = 128(0x80, float:1.794E-43)
            r2 = 0
            r3 = -1
            if (r11 > r1) goto L_0x0045
            byte[] r11 = new byte[r11]
            java.util.Arrays.fill(r11, r3)
        L_0x0010:
            if (r2 >= r10) goto L_0x0044
            int r1 = r2 + r2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            defpackage.amxg.a((java.lang.Object) r3, (java.lang.Object) r4)
            int r5 = r3.hashCode()
            int r5 = defpackage.amzi.a((int) r5)
        L_0x0026:
            r5 = r5 & r0
            byte r6 = r11[r5]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 == r7) goto L_0x003e
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0039
            int r5 = r5 + 1
            goto L_0x0026
        L_0x0039:
            java.lang.IllegalArgumentException r9 = a((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object[]) r9, (int) r6)
            throw r9
        L_0x003e:
            byte r1 = (byte) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L_0x0010
        L_0x0044:
            return r11
        L_0x0045:
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r11 <= r1) goto L_0x0080
            int[] r11 = new int[r11]
            java.util.Arrays.fill(r11, r3)
        L_0x004f:
            if (r2 >= r10) goto L_0x007f
            int r1 = r2 + r2
            int r1 = r1 + r12
            r4 = r9[r1]
            r5 = r1 ^ 1
            r5 = r9[r5]
            defpackage.amxg.a((java.lang.Object) r4, (java.lang.Object) r5)
            int r6 = r4.hashCode()
            int r6 = defpackage.amzi.a((int) r6)
        L_0x0065:
            r6 = r6 & r0
            r7 = r11[r6]
            if (r7 == r3) goto L_0x007a
            r8 = r9[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x0075
            int r6 = r6 + 1
            goto L_0x0065
        L_0x0075:
            java.lang.IllegalArgumentException r9 = a((java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object[]) r9, (int) r7)
            throw r9
        L_0x007a:
            r11[r6] = r1
            int r2 = r2 + 1
            goto L_0x004f
        L_0x007f:
            return r11
        L_0x0080:
            short[] r11 = new short[r11]
            java.util.Arrays.fill(r11, r3)
        L_0x0085:
            if (r2 >= r10) goto L_0x00ba
            int r1 = r2 + r2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            defpackage.amxg.a((java.lang.Object) r3, (java.lang.Object) r4)
            int r5 = r3.hashCode()
            int r5 = defpackage.amzi.a((int) r5)
        L_0x009b:
            r5 = r5 & r0
            short r6 = r11[r5]
            char r6 = (char) r6
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r6 == r7) goto L_0x00b4
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x00af
            int r5 = r5 + 1
            goto L_0x009b
        L_0x00af:
            java.lang.IllegalArgumentException r9 = a((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object[]) r9, (int) r6)
            throw r9
        L_0x00b4:
            short r1 = (short) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L_0x0085
        L_0x00ba:
            return r11
        L_0x00bb:
            r10 = r9[r12]
            r11 = r12 ^ 1
            r9 = r9[r11]
            defpackage.amxg.a((java.lang.Object) r10, (java.lang.Object) r9)
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anfu.a(java.lang.Object[], int, int, int):java.lang.Object");
    }
}
