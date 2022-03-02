package defpackage;

import javax.security.auth.x500.X500Principal;

/* renamed from: bank  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bank {
    public final String a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public char[] g;

    public bank(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.a = name;
        this.b = name.length();
    }

    public final int a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < this.b) {
            char[] cArr = this.g;
            char c2 = cArr[i];
            if (c2 >= '0' && c2 <= '9') {
                i2 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i2 = c2 - 'W';
            } else if (c2 >= 'A' && c2 <= 'F') {
                i2 = c2 - '7';
            } else {
                String valueOf = String.valueOf(this.a);
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Malformed DN: ") : "Malformed DN: ".concat(valueOf));
            }
            char c3 = cArr[i4];
            if (c3 >= '0' && c3 <= '9') {
                i3 = c3 - '0';
            } else if (c3 >= 'a' && c3 <= 'f') {
                i3 = c3 - 'W';
            } else if (c3 >= 'A' && c3 <= 'F') {
                i3 = c3 - '7';
            } else {
                String valueOf2 = String.valueOf(this.a);
                throw new IllegalStateException(valueOf2.length() == 0 ? new String("Malformed DN: ") : "Malformed DN: ".concat(valueOf2));
            }
            return (i2 << 4) + i3;
        }
        String valueOf3 = String.valueOf(this.a);
        throw new IllegalStateException(valueOf3.length() == 0 ? new String("Malformed DN: ") : "Malformed DN: ".concat(valueOf3));
    }

    public final char b() {
        int i;
        int i2;
        int i3 = this.c + 1;
        this.c = i3;
        if (i3 == this.b) {
            String valueOf = String.valueOf(this.a);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Unexpected end of DN: ") : "Unexpected end of DN: ".concat(valueOf));
        }
        char c2 = this.g[i3];
        if (!(c2 == ' ' || c2 == '%' || c2 == '\\' || c2 == '_' || c2 == '\"' || c2 == '#')) {
            switch (c2) {
                case '*':
                case '+':
                case ',':
                    break;
                default:
                    switch (c2) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int a2 = a(i3);
                            this.c++;
                            if (a2 >= 128) {
                                if (a2 >= 192 && a2 <= 247) {
                                    if (a2 <= 223) {
                                        i2 = a2 & 31;
                                        i = 1;
                                    } else if (a2 > 239) {
                                        i2 = a2 & 7;
                                        i = 3;
                                    } else {
                                        i2 = a2 & 15;
                                        i = 2;
                                    }
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < i) {
                                            int i5 = this.c + 1;
                                            this.c = i5;
                                            if (i5 != this.b && this.g[i5] == '\\') {
                                                int i6 = i5 + 1;
                                                this.c = i6;
                                                int a3 = a(i6);
                                                this.c++;
                                                if ((a3 & 192) == 128) {
                                                    i2 = (i2 << 6) + (a3 & 63);
                                                    i4++;
                                                }
                                            }
                                        } else {
                                            a2 = (char) i2;
                                        }
                                    }
                                }
                                a2 = 63;
                            }
                            return (char) a2;
                    }
            }
        }
        return c2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ed A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r6.c
            int r1 = r6.b
            r2 = 32
            if (r0 >= r1) goto L_0x0013
            char[] r3 = r6.g
            char r3 = r3[r0]
            if (r3 != r2) goto L_0x0013
            int r0 = r0 + 1
            r6.c = r0
            goto L_0x0000
        L_0x0013:
            if (r0 == r1) goto L_0x00ed
            r6.d = r0
            int r0 = r0 + 1
            r6.c = r0
        L_0x001b:
            int r0 = r6.c
            int r1 = r6.b
            r3 = 61
            if (r0 >= r1) goto L_0x0030
            char[] r4 = r6.g
            char r4 = r4[r0]
            if (r4 == r3) goto L_0x0030
            if (r4 == r2) goto L_0x0030
            int r0 = r0 + 1
            r6.c = r0
            goto L_0x001b
        L_0x0030:
            java.lang.String r4 = "Unexpected end of DN: "
            if (r0 < r1) goto L_0x0050
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r6.a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0048
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
            goto L_0x004c
        L_0x0048:
            java.lang.String r1 = r4.concat(r1)
        L_0x004c:
            r0.<init>(r1)
            throw r0
        L_0x0050:
            r6.e = r0
            char[] r1 = r6.g
            char r1 = r1[r0]
            if (r1 != r2) goto L_0x0092
        L_0x0058:
            int r0 = r6.c
            int r1 = r6.b
            if (r0 >= r1) goto L_0x006c
            char[] r5 = r6.g
            char r5 = r5[r0]
            if (r5 != r3) goto L_0x0065
            goto L_0x006c
        L_0x0065:
            if (r5 != r2) goto L_0x006c
            int r0 = r0 + 1
            r6.c = r0
            goto L_0x0058
        L_0x006c:
            char[] r5 = r6.g
            char r5 = r5[r0]
            if (r5 == r3) goto L_0x0073
            goto L_0x0076
        L_0x0073:
            if (r0 == r1) goto L_0x0076
            goto L_0x0092
        L_0x0076:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r6.a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
            goto L_0x008e
        L_0x008a:
            java.lang.String r1 = r4.concat(r1)
        L_0x008e:
            r0.<init>(r1)
            throw r0
        L_0x0092:
            int r0 = r0 + 1
            r6.c = r0
        L_0x0096:
            int r0 = r6.c
            int r1 = r6.b
            if (r0 < r1) goto L_0x009d
            goto L_0x00a8
        L_0x009d:
            char[] r1 = r6.g
            char r1 = r1[r0]
            if (r1 != r2) goto L_0x00a8
            int r0 = r0 + 1
            r6.c = r0
            goto L_0x0096
        L_0x00a8:
            int r0 = r6.e
            int r1 = r6.d
            int r2 = r0 - r1
            r3 = 4
            if (r2 <= r3) goto L_0x00e4
            char[] r2 = r6.g
            int r3 = r1 + 3
            char r3 = r2[r3]
            r4 = 46
            if (r3 != r4) goto L_0x00e4
            char r3 = r2[r1]
            r4 = 79
            if (r3 != r4) goto L_0x00c2
            goto L_0x00c6
        L_0x00c2:
            r4 = 111(0x6f, float:1.56E-43)
            if (r3 != r4) goto L_0x00e4
        L_0x00c6:
            int r3 = r1 + 1
            char r3 = r2[r3]
            r4 = 73
            if (r3 != r4) goto L_0x00cf
            goto L_0x00d3
        L_0x00cf:
            r4 = 105(0x69, float:1.47E-43)
            if (r3 != r4) goto L_0x00e4
        L_0x00d3:
            int r3 = r1 + 2
            char r2 = r2[r3]
            r3 = 68
            if (r2 != r3) goto L_0x00dc
            goto L_0x00e0
        L_0x00dc:
            r3 = 100
            if (r2 != r3) goto L_0x00e4
        L_0x00e0:
            int r1 = r1 + 4
            r6.d = r1
        L_0x00e4:
            java.lang.String r2 = new java.lang.String
            char[] r3 = r6.g
            int r0 = r0 - r1
            r2.<init>(r3, r1, r0)
            return r2
        L_0x00ed:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bank.a():java.lang.String");
    }
}
