package defpackage;

/* renamed from: anko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class anko extends ankm {
    private static final String a;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0.matches("\\n|\\r(?:\\n)?") == false) goto L_0x0010;
     */
    static {
        /*
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x000f }
            java.lang.String r1 = "\\n|\\r(?:\\n)?"
            boolean r1 = r0.matches(r1)     // Catch:{ SecurityException -> 0x000f }
            if (r1 != 0) goto L_0x0012
            goto L_0x0010
        L_0x000f:
            r0 = move-exception
        L_0x0010:
            java.lang.String r0 = "\n"
        L_0x0012:
            a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anko.<clinit>():void");
    }

    static int a(String str, int i) {
        while (i < str.length()) {
            int i2 = i + 1;
            if (str.charAt(i) != '%') {
                i = i2;
            } else if (i2 < str.length()) {
                char charAt = str.charAt(i2);
                if (charAt != '%' && charAt != 'n') {
                    return i2 - 1;
                }
                i = i2 + 1;
            } else {
                throw ankn.b("trailing unquoted '%' character", str, i2 - 1);
            }
        }
        return -1;
    }

    public abstract int a(ankl ankl, int i, String str, int i2, int i3, int i4);

    public final void a(ankl ankl) {
        int i;
        int i2;
        int i3;
        String b = ankl.b();
        int a2 = a(b, 0);
        int i4 = -1;
        int i5 = 0;
        while (a2 >= 0) {
            int i6 = a2 + 1;
            int i7 = i6;
            int i8 = 0;
            while (i7 < b.length()) {
                int i9 = i7 + 1;
                char charAt = b.charAt(i7);
                char c = (char) (charAt - '0');
                if (c < 10) {
                    i8 = (i8 * 10) + c;
                    if (i8 < 1000000) {
                        i7 = i9;
                    } else {
                        throw ankn.a("index too large", b, a2, i9);
                    }
                } else {
                    if (charAt == '$') {
                        if ((i9 - 1) - i6 == 0) {
                            throw ankn.a("missing index", b, a2, i9);
                        } else if (b.charAt(i6) != '0') {
                            int i10 = i8 - 1;
                            if (i9 != b.length()) {
                                b.charAt(i9);
                                i2 = i10;
                                i = i5;
                                i3 = i9;
                                i9++;
                            } else {
                                throw ankn.b("unterminated parameter", b, a2);
                            }
                        } else {
                            throw ankn.a("index has leading zero", b, a2, i9);
                        }
                    } else if (charAt != '<') {
                        i = i5 + 1;
                        i2 = i5;
                        i3 = i6;
                    } else if (i4 == -1) {
                        throw ankn.a("invalid relative parameter", b, a2, i9);
                    } else if (i9 != b.length()) {
                        b.charAt(i9);
                        i2 = i4;
                        i = i5;
                        i3 = i9;
                        i9++;
                    } else {
                        throw ankn.b("unterminated parameter", b, a2);
                    }
                    int i11 = i9 - 1;
                    while (i11 < b.length()) {
                        if (((char) ((b.charAt(i11) & 65503) - 'A')) < 26) {
                            a2 = a(b, a(ankl, i2, b, a2, i3, i11));
                            i4 = i2;
                            i5 = i;
                        } else {
                            i11++;
                        }
                    }
                    throw ankn.b("unterminated parameter", b, a2);
                }
            }
            throw ankn.b("unterminated parameter", b, a2);
        }
    }

    public final void a(StringBuilder sb, String str, int i, int i2) {
        int i3 = i;
        while (i < i2) {
            int i4 = i + 1;
            if (str.charAt(i) == '%') {
                if (i4 == i2) {
                    break;
                }
                char charAt = str.charAt(i4);
                if (charAt == '%') {
                    sb.append(str, i3, i4);
                } else if (charAt == 'n') {
                    sb.append(str, i3, i4 - 1);
                    sb.append(a);
                }
                i3 = i4 + 1;
                i = i3;
            }
            i = i4;
        }
        if (i3 < i2) {
            sb.append(str, i3, i2);
        }
    }
}
