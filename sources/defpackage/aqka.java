package defpackage;

import com.google.android.chimera.Service;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import org.chromium.net.UrlRequest;

/* renamed from: aqka  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqka implements Closeable {
    public final char[] a = new char[1024];
    public int b = 0;
    public int c = 0;
    public long d;
    public int e;
    public String f;
    public int g;
    public String[] h;
    public int[] i;
    private final Reader j;
    private int k = 0;
    private int l = 0;
    private int m = 0;
    private int[] n;

    static {
        ")]}'\n".toCharArray();
    }

    public aqka(Reader reader) {
        int[] iArr = new int[32];
        this.n = iArr;
        this.g = 1;
        iArr[0] = 6;
        this.h = new String[32];
        this.i = new int[32];
        this.j = reader;
    }

    private final int a(boolean z) {
        char[] cArr = this.a;
        int i2 = this.b;
        int i3 = this.k;
        while (true) {
            if (i2 == i3) {
                this.b = i2;
                if (b(1)) {
                    i2 = this.b;
                    i3 = this.k;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + d());
                }
            }
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 == 10) {
                this.l++;
                this.m = i4;
            } else if (!(c2 == ' ' || c2 == 13 || c2 == 9)) {
                if (c2 == '/') {
                    this.b = i4;
                    if (i4 == i3) {
                        this.b = i4 - 1;
                        boolean b2 = b(2);
                        this.b++;
                        if (!b2) {
                            return 47;
                        }
                    }
                    g();
                    int i5 = this.b;
                    char c3 = cArr[i5];
                    if (c3 == '*') {
                        this.b = i5 + 1;
                        while (true) {
                            if (this.b + 2 > this.k && !b(2)) {
                                throw a("Unterminated comment");
                            }
                            char[] cArr2 = this.a;
                            int i6 = this.b;
                            if (cArr2[i6] != 10) {
                                int i7 = 0;
                                while (i7 < 2) {
                                    if (this.a[this.b + i7] == "*/".charAt(i7)) {
                                        i7++;
                                    }
                                }
                                i2 = 2 + this.b;
                                i3 = this.k;
                                break;
                            }
                            this.l++;
                            this.m = i6 + 1;
                            this.b++;
                        }
                    } else if (c3 != '/') {
                        return 47;
                    } else {
                        this.b = i5 + 1;
                        h();
                        i2 = this.b;
                        i3 = this.k;
                    }
                } else if (c2 == '#') {
                    this.b = i4;
                    g();
                    h();
                    i2 = this.b;
                    i3 = this.k;
                } else {
                    this.b = i4;
                    return c2;
                }
            }
            i2 = i4;
        }
    }

    private final boolean b(char c2) {
        if (c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (!(c2 == '/' || c2 == '=')) {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        g();
        return false;
    }

    private final void g() {
        throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private final void h() {
        char c2;
        do {
            if (this.b < this.k || b(1)) {
                char[] cArr = this.a;
                int i2 = this.b;
                int i3 = i2 + 1;
                this.b = i3;
                c2 = cArr[i2];
                if (c2 == 10) {
                    this.l++;
                    this.m = i3;
                    return;
                }
            } else {
                return;
            }
        } while (c2 != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String c() {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L_0x0003:
            int r3 = r5.b
            int r3 = r3 + r2
            int r4 = r5.k
            if (r3 >= r4) goto L_0x004c
            char[] r4 = r5.a
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x0059
            r4 = 10
            if (r3 == r4) goto L_0x0059
            r4 = 12
            if (r3 == r4) goto L_0x0059
            r4 = 13
            if (r3 == r4) goto L_0x0059
            r4 = 32
            if (r3 == r4) goto L_0x0059
            r4 = 35
            if (r3 == r4) goto L_0x0048
            r4 = 44
            if (r3 == r4) goto L_0x0059
            r4 = 47
            if (r3 == r4) goto L_0x0048
            r4 = 61
            if (r3 == r4) goto L_0x0048
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x0059
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x0059
            r4 = 58
            if (r3 == r4) goto L_0x0059
            r4 = 59
            if (r3 == r4) goto L_0x0048
            switch(r3) {
                case 91: goto L_0x0059;
                case 92: goto L_0x0048;
                case 93: goto L_0x0059;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x0048:
            r5.g()
            goto L_0x0059
        L_0x004c:
            char[] r3 = r5.a
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005b
            int r3 = r2 + 1
            boolean r3 = r5.b((int) r3)
            if (r3 != 0) goto L_0x0003
        L_0x0059:
            r0 = r2
            goto L_0x007e
        L_0x005b:
            if (r1 == 0) goto L_0x005e
            goto L_0x0069
        L_0x005e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x0069:
            char[] r3 = r5.a
            int r4 = r5.b
            r1.append(r3, r4, r2)
            int r3 = r5.b
            int r3 = r3 + r2
            r5.b = r3
            r2 = 1
            boolean r2 = r5.b((int) r2)
            if (r2 == 0) goto L_0x007e
            r2 = 0
            goto L_0x0003
        L_0x007e:
            if (r1 == 0) goto L_0x008c
            char[] r2 = r5.a
            int r3 = r5.b
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
            goto L_0x0095
        L_0x008c:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r5.a
            int r3 = r5.b
            r1.<init>(r2, r3, r0)
        L_0x0095:
            int r2 = r5.b
            int r2 = r2 + r0
            r5.b = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqka.c():java.lang.String");
    }

    public final void close() {
        this.c = 0;
        this.n[0] = 8;
        this.g = 1;
        this.j.close();
    }

    public final String d() {
        int i2 = this.l;
        int i3 = this.b;
        int i4 = this.m;
        return " at line " + (i2 + 1) + " column " + ((i3 - i4) + 1) + " path " + e();
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = this.g;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.n[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(this.i[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String str = this.h[i3];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public final int f() {
        int i2 = this.c;
        if (i2 == 0) {
            i2 = b();
        }
        switch (i2) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return 5;
            case Service.START_CONTINUATION_MASK:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final String toString() {
        return getClass().getSimpleName() + d();
    }

    private final boolean b(int i2) {
        int i3;
        char[] cArr = this.a;
        int i4 = this.m;
        int i5 = this.b;
        this.m = i4 - i5;
        int i6 = this.k;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.k = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.k = 0;
        }
        this.b = 0;
        do {
            Reader reader = this.j;
            int i8 = this.k;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i3 = this.k + read;
            this.k = i3;
            if (this.l == 0 && this.m == 0 && i3 > 0 && cArr[0] == 65279) {
                this.b++;
                this.m = 1;
                i2++;
                continue;
            }
        } while (i3 < i2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01d3, code lost:
        if (b(r6) != false) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x01fb, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x01fd, code lost:
        if (r4 != 2) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01ff, code lost:
        if (r16 == false) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0205, code lost:
        if (r13 == Long.MIN_VALUE) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0208, code lost:
        if (r17 != false) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x020f, code lost:
        if (r13 != 0) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0211, code lost:
        if (r17 != false) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0213, code lost:
        if (r17 != false) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0215, code lost:
        r13 = -r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0216, code lost:
        r0.d = r13;
        r0.b += r7;
        r0.c = 15;
        r6 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0224, code lost:
        if (r4 != 2) goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0228, code lost:
        if (r4 == 4) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x022b, code lost:
        if (r4 == 7) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x022e, code lost:
        r0.e = r7;
        r0.c = 16;
        r6 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0238, code lost:
        if (r6 != 0) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0244, code lost:
        if (b(r0.a[r0.b]) == false) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0246, code lost:
        g();
        r0.c = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x024d, code lost:
        return 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0254, code lost:
        throw a("Expected value");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0255, code lost:
        return r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0256 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b() {
        /*
            r20 = this;
            r0 = r20
            int[] r1 = r0.n
            int r2 = r0.g
            r3 = -1
            int r2 = r2 + r3
            r4 = r1[r2]
            r7 = 93
            r9 = 59
            r10 = 44
            r11 = 6
            r12 = 3
            r13 = 7
            r14 = 4
            r15 = 5
            r5 = 2
            r6 = 0
            r8 = 1
            if (r4 != r8) goto L_0x001e
            r1[r2] = r5
            goto L_0x0094
        L_0x001e:
            if (r4 != r5) goto L_0x0039
            int r1 = r0.a((boolean) r8)
            if (r1 == r10) goto L_0x0094
            if (r1 == r9) goto L_0x0035
            if (r1 != r7) goto L_0x002d
            r0.c = r14
            return r14
        L_0x002d:
            java.lang.String r1 = "Unterminated array"
            java.io.IOException r1 = r0.a((java.lang.String) r1)
            throw r1
        L_0x0035:
            r20.g()
            goto L_0x0094
        L_0x0039:
            if (r4 != r12) goto L_0x003d
            goto L_0x029b
        L_0x003d:
            if (r4 == r15) goto L_0x029b
            if (r4 != r14) goto L_0x0075
            r1[r2] = r15
            int r1 = r0.a((boolean) r8)
            r2 = 58
            if (r1 == r2) goto L_0x0094
            r2 = 61
            if (r1 != r2) goto L_0x006d
            r20.g()
            int r1 = r0.b
            int r2 = r0.k
            if (r1 >= r2) goto L_0x0059
            goto L_0x005f
        L_0x0059:
            boolean r1 = r0.b((int) r8)
            if (r1 == 0) goto L_0x0094
        L_0x005f:
            char[] r1 = r0.a
            int r2 = r0.b
            char r1 = r1[r2]
            r14 = 62
            if (r1 != r14) goto L_0x0094
            int r2 = r2 + r8
            r0.b = r2
            goto L_0x0094
        L_0x006d:
            java.lang.String r1 = "Expected ':'"
            java.io.IOException r1 = r0.a((java.lang.String) r1)
            throw r1
        L_0x0075:
            if (r4 != r11) goto L_0x007a
            r1[r2] = r13
            goto L_0x0094
        L_0x007a:
            if (r4 != r13) goto L_0x0090
            int r1 = r0.a((boolean) r6)
            if (r1 == r3) goto L_0x008b
            r20.g()
            int r1 = r0.b
            int r1 = r1 + r3
            r0.b = r1
            goto L_0x0094
        L_0x008b:
            r1 = 17
            r0.c = r1
            return r1
        L_0x0090:
            r1 = 8
            if (r4 == r1) goto L_0x0293
        L_0x0094:
            int r1 = r0.a((boolean) r8)
            r2 = 34
            if (r1 == r2) goto L_0x0290
            r2 = 39
            if (r1 == r2) goto L_0x0288
            if (r1 == r10) goto L_0x026f
            if (r1 == r9) goto L_0x026f
            r2 = 91
            if (r1 == r2) goto L_0x026c
            if (r1 == r7) goto L_0x0264
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x0260
            int r1 = r0.b
            int r1 = r1 + r3
            r0.b = r1
            char[] r2 = r0.a
            char r1 = r2[r1]
            r2 = 116(0x74, float:1.63E-43)
            if (r1 != r2) goto L_0x00bd
            goto L_0x00e0
        L_0x00bd:
            r2 = 84
            if (r1 == r2) goto L_0x00e0
            r2 = 102(0x66, float:1.43E-43)
            if (r1 != r2) goto L_0x00c6
        L_0x00c5:
            goto L_0x00da
        L_0x00c6:
            r2 = 70
            if (r1 == r2) goto L_0x00c5
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 != r2) goto L_0x00cf
        L_0x00ce:
            goto L_0x00d4
        L_0x00cf:
            r2 = 78
            if (r1 == r2) goto L_0x00ce
            goto L_0x0124
        L_0x00d4:
            java.lang.String r1 = "null"
            java.lang.String r2 = "NULL"
            r3 = 7
            goto L_0x00e5
        L_0x00da:
            java.lang.String r1 = "false"
            java.lang.String r2 = "FALSE"
            r3 = 6
            goto L_0x00e5
        L_0x00e0:
            java.lang.String r1 = "true"
            java.lang.String r2 = "TRUE"
            r3 = 5
        L_0x00e5:
            int r4 = r1.length()
            r7 = 1
        L_0x00ea:
            if (r7 < r4) goto L_0x0114
            int r1 = r0.b
            int r1 = r1 + r4
            int r2 = r0.k
            if (r1 >= r2) goto L_0x00f4
            goto L_0x00fc
        L_0x00f4:
            int r1 = r4 + 1
            boolean r1 = r0.b((int) r1)
            if (r1 == 0) goto L_0x010c
        L_0x00fc:
            char[] r1 = r0.a
            int r2 = r0.b
            int r2 = r2 + r4
            char r1 = r1[r2]
            boolean r1 = r0.b((char) r1)
            if (r1 != 0) goto L_0x010a
            goto L_0x010c
        L_0x010a:
            r3 = 0
            goto L_0x013d
        L_0x010c:
            int r1 = r0.b
            int r1 = r1 + r4
            r0.b = r1
            r0.c = r3
            goto L_0x013d
        L_0x0114:
            int r9 = r0.b
            int r9 = r9 + r7
            int r10 = r0.k
            if (r9 >= r10) goto L_0x011c
            goto L_0x0126
        L_0x011c:
            int r9 = r7 + 1
            boolean r9 = r0.b((int) r9)
            if (r9 != 0) goto L_0x0126
        L_0x0124:
            r3 = 0
            goto L_0x013d
        L_0x0126:
            char[] r9 = r0.a
            int r10 = r0.b
            int r10 = r10 + r7
            char r9 = r9[r10]
            char r10 = r1.charAt(r7)
            if (r9 != r10) goto L_0x0136
            r8 = 6
            goto L_0x0258
        L_0x0136:
            char r10 = r2.charAt(r7)
            if (r9 == r10) goto L_0x0257
            r3 = 0
        L_0x013d:
            if (r3 != 0) goto L_0x0256
            char[] r1 = r0.a
            int r2 = r0.b
            int r3 = r0.k
            r9 = 0
            r13 = r9
            r4 = 0
            r7 = 0
            r16 = 1
            r17 = 0
        L_0x014e:
            int r6 = r2 + r7
            if (r6 == r3) goto L_0x0153
            goto L_0x0162
        L_0x0153:
            int r2 = r1.length
            if (r7 == r2) goto L_0x0237
            int r2 = r7 + 1
            boolean r2 = r0.b((int) r2)
            if (r2 == 0) goto L_0x01fd
            int r2 = r0.b
            int r3 = r0.k
        L_0x0162:
            int r6 = r2 + r7
            char r6 = r1[r6]
            r11 = 43
            if (r6 == r11) goto L_0x01ee
            r11 = 69
            if (r6 == r11) goto L_0x01e5
            r11 = 101(0x65, float:1.42E-43)
            if (r6 == r11) goto L_0x01e5
            r11 = 45
            if (r6 == r11) goto L_0x01db
            r11 = 46
            if (r6 == r11) goto L_0x01d6
            r11 = 48
            if (r6 < r11) goto L_0x01cf
            r11 = 57
            if (r6 > r11) goto L_0x01cf
            if (r4 != r8) goto L_0x0186
            r8 = 6
            goto L_0x01c9
        L_0x0186:
            if (r4 == 0) goto L_0x01c8
            if (r4 != r5) goto L_0x01b9
            int r11 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x01b6
            r18 = 10
            long r18 = r18 * r13
            int r6 = r6 + -48
            long r8 = (long) r6
            long r18 = r18 - r8
            r8 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r6 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x01af
            r8 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r6 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x01ad
            int r6 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r6 < 0) goto L_0x01af
        L_0x01ad:
            r6 = 0
            goto L_0x01b0
        L_0x01af:
            r6 = 1
        L_0x01b0:
            r16 = r16 & r6
            r13 = r18
            r8 = 6
            goto L_0x01f2
        L_0x01b6:
            r6 = 0
            goto L_0x0238
        L_0x01b9:
            if (r4 != r12) goto L_0x01be
            r4 = 4
        L_0x01bc:
            r8 = 6
            goto L_0x01f2
        L_0x01be:
            if (r4 != r15) goto L_0x01c2
            r4 = 7
            goto L_0x01bc
        L_0x01c2:
            r8 = 6
            if (r4 == r8) goto L_0x01c6
            goto L_0x01f2
        L_0x01c6:
            r4 = 7
            goto L_0x01f2
        L_0x01c8:
            r8 = 6
        L_0x01c9:
            int r6 = r6 + -48
            int r4 = -r6
            long r13 = (long) r4
            r4 = 2
            goto L_0x01f2
        L_0x01cf:
            boolean r1 = r0.b((char) r6)
            if (r1 == 0) goto L_0x01fd
            goto L_0x01fb
        L_0x01d6:
            r8 = 6
            if (r4 != r5) goto L_0x01fb
            r4 = 3
            goto L_0x01f2
        L_0x01db:
            r8 = 6
            if (r4 != 0) goto L_0x01e2
            r4 = 1
            r17 = 1
            goto L_0x01f2
        L_0x01e2:
            if (r4 != r15) goto L_0x01fb
            goto L_0x01f1
        L_0x01e5:
            r8 = 6
            if (r4 != r5) goto L_0x01ea
        L_0x01e8:
            r4 = 5
            goto L_0x01f2
        L_0x01ea:
            r6 = 4
            if (r4 != r6) goto L_0x01fb
            goto L_0x01e8
        L_0x01ee:
            r8 = 6
            if (r4 != r15) goto L_0x01fb
        L_0x01f1:
            r4 = 6
        L_0x01f2:
            int r7 = r7 + 1
            r6 = 0
            r8 = 1
            r9 = 0
            r11 = 6
            goto L_0x014e
        L_0x01fb:
            r6 = 0
            goto L_0x0238
        L_0x01fd:
            if (r4 != r5) goto L_0x0224
            if (r16 == 0) goto L_0x0224
            r1 = -9223372036854775808
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0208
        L_0x0207:
            goto L_0x020b
        L_0x0208:
            if (r17 != 0) goto L_0x0207
            goto L_0x0224
        L_0x020b:
            r1 = 0
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0213
            if (r17 != 0) goto L_0x0224
        L_0x0213:
            if (r17 != 0) goto L_0x0216
            long r13 = -r13
        L_0x0216:
            r0.d = r13
            int r1 = r0.b
            int r1 = r1 + r7
            r0.b = r1
            r1 = 15
            r0.c = r1
            r6 = 15
            goto L_0x0238
        L_0x0224:
            if (r4 != r5) goto L_0x0227
        L_0x0226:
            goto L_0x022e
        L_0x0227:
            r1 = 4
            if (r4 == r1) goto L_0x0226
            r1 = 7
            if (r4 == r1) goto L_0x0226
            goto L_0x01fb
        L_0x022e:
            r0.e = r7
            r1 = 16
            r0.c = r1
            r6 = 16
            goto L_0x0238
        L_0x0237:
            r6 = 0
        L_0x0238:
            if (r6 != 0) goto L_0x0255
            char[] r1 = r0.a
            int r2 = r0.b
            char r1 = r1[r2]
            boolean r1 = r0.b((char) r1)
            if (r1 == 0) goto L_0x024e
            r20.g()
            r1 = 10
            r0.c = r1
            return r1
        L_0x024e:
            java.lang.String r1 = "Expected value"
            java.io.IOException r1 = r0.a((java.lang.String) r1)
            throw r1
        L_0x0255:
            return r6
        L_0x0256:
            return r3
        L_0x0257:
            r8 = 6
        L_0x0258:
            int r7 = r7 + 1
            r6 = 0
            r8 = 1
            r11 = 6
            r13 = 7
            goto L_0x00ea
        L_0x0260:
            r1 = 1
            r0.c = r1
            return r1
        L_0x0264:
            r1 = 1
            if (r4 == r1) goto L_0x0268
            goto L_0x026f
        L_0x0268:
            r1 = 4
            r0.c = r1
            return r1
        L_0x026c:
            r0.c = r12
            return r12
        L_0x026f:
            r1 = 1
            if (r4 != r1) goto L_0x0273
            goto L_0x0275
        L_0x0273:
            if (r4 != r5) goto L_0x0281
        L_0x0275:
            r20.g()
            int r1 = r0.b
            int r1 = r1 + r3
            r0.b = r1
            r1 = 7
            r0.c = r1
            return r1
        L_0x0281:
            java.lang.String r1 = "Unexpected value"
            java.io.IOException r1 = r0.a((java.lang.String) r1)
            throw r1
        L_0x0288:
            r20.g()
            r1 = 8
        L_0x028d:
            r0.c = r1
            return r1
        L_0x0290:
            r1 = 9
            goto L_0x028d
        L_0x0293:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x029b:
            r6 = 4
            r1[r2] = r6
            r1 = 125(0x7d, float:1.75E-43)
            if (r4 != r15) goto L_0x02bc
            r2 = 1
            int r6 = r0.a((boolean) r2)
            if (r6 == r10) goto L_0x02bc
            if (r6 == r9) goto L_0x02b9
            if (r6 != r1) goto L_0x02b1
            r0.c = r5
            return r5
        L_0x02b1:
            java.lang.String r1 = "Unterminated object"
            java.io.IOException r1 = r0.a((java.lang.String) r1)
            throw r1
        L_0x02b9:
            r20.g()
        L_0x02bc:
            r2 = 1
            int r2 = r0.a((boolean) r2)
            r6 = 34
            if (r2 == r6) goto L_0x02fa
            r6 = 39
            if (r2 == r6) goto L_0x02f2
            java.lang.String r6 = "Expected name"
            if (r2 == r1) goto L_0x02e8
            r20.g()
            int r1 = r0.b
            int r1 = r1 + r3
            r0.b = r1
            char r1 = (char) r2
            boolean r1 = r0.b((char) r1)
            if (r1 == 0) goto L_0x02e2
            r1 = 14
            r0.c = r1
            return r1
        L_0x02e2:
            java.io.IOException r1 = r0.a((java.lang.String) r6)
            throw r1
        L_0x02e8:
            if (r4 == r15) goto L_0x02ed
            r0.c = r5
            return r5
        L_0x02ed:
            java.io.IOException r1 = r0.a((java.lang.String) r6)
            throw r1
        L_0x02f2:
            r20.g()
            r1 = 12
        L_0x02f7:
            r0.c = r1
            return r1
        L_0x02fa:
            r1 = 13
            goto L_0x02f7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqka.b():int");
    }

    private final IOException a(String str) {
        throw new aqkc(str + d());
    }

    public final String a(char c2) {
        int i2;
        char[] cArr = this.a;
        StringBuilder sb = null;
        do {
            int i3 = this.b;
            int i4 = this.k;
            int i5 = i3;
            while (i3 < i4) {
                int i6 = i3 + 1;
                char c3 = cArr[i3];
                if (c3 == c2) {
                    this.b = i6;
                    int i7 = (i6 - i5) - 1;
                    if (sb == null) {
                        return new String(cArr, i5, i7);
                    }
                    sb.append(cArr, i5, i7);
                    return sb.toString();
                }
                char c4 = 10;
                if (c3 == '\\') {
                    this.b = i6;
                    int i8 = (i6 - i5) - 1;
                    if (sb == null) {
                        int i9 = i8 + 1;
                        sb = new StringBuilder(Math.max(i9 + i9, 16));
                    }
                    sb.append(cArr, i5, i8);
                    if (this.b != this.k || b(1)) {
                        char[] cArr2 = this.a;
                        int i10 = this.b;
                        int i11 = i10 + 1;
                        this.b = i11;
                        char c5 = cArr2[i10];
                        if (c5 == 10) {
                            this.l++;
                            this.m = i11;
                        } else if (!(c5 == '\"' || c5 == '\'' || c5 == '/' || c5 == '\\')) {
                            if (c5 == 'b') {
                                c4 = 8;
                            } else if (c5 == 'f') {
                                c4 = 12;
                            } else if (c5 != 'n') {
                                if (c5 == 'r') {
                                    c4 = 13;
                                } else if (c5 == 't') {
                                    c4 = 9;
                                } else if (c5 != 'u') {
                                    throw a("Invalid escape sequence");
                                } else if (i11 + 4 > this.k && !b(4)) {
                                    throw a("Unterminated escape sequence");
                                } else {
                                    int i12 = this.b;
                                    int i13 = i12 + 4;
                                    c4 = 0;
                                    while (i12 < i13) {
                                        char c6 = this.a[i12];
                                        char c7 = (char) (c4 << 4);
                                        if (c6 >= '0' && c6 <= '9') {
                                            i2 = c6 - '0';
                                        } else if (c6 >= 'a' && c6 <= 'f') {
                                            i2 = c6 - 'W';
                                        } else if (c6 < 'A' || c6 > 'F') {
                                            throw new NumberFormatException("\\u" + new String(this.a, this.b, 4));
                                        } else {
                                            i2 = c6 - '7';
                                        }
                                        c4 = (char) (c7 + i2);
                                        i12++;
                                    }
                                    this.b += 4;
                                }
                            }
                            sb.append(c4);
                            i3 = this.b;
                            i4 = this.k;
                            i5 = i3;
                        }
                        c4 = c5;
                        sb.append(c4);
                        i3 = this.b;
                        i4 = this.k;
                        i5 = i3;
                    } else {
                        throw a("Unterminated escape sequence");
                    }
                } else {
                    if (c3 == 10) {
                        this.l++;
                        this.m = i6;
                    }
                    i3 = i6;
                }
            }
            if (sb == null) {
                int i14 = i3 - i5;
                sb = new StringBuilder(Math.max(i14 + i14, 16));
            }
            sb.append(cArr, i5, i3 - i5);
            this.b = i3;
        } while (b(1));
        throw a("Unterminated string");
    }

    public final void a(int i2) {
        int i3 = this.g;
        int[] iArr = this.n;
        if (i3 == iArr.length) {
            int i4 = i3 + i3;
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            String[] strArr = new String[i4];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            System.arraycopy(this.i, 0, iArr3, 0, this.g);
            System.arraycopy(this.h, 0, strArr, 0, this.g);
            this.n = iArr2;
            this.i = iArr3;
            this.h = strArr;
        }
        int[] iArr4 = this.n;
        int i5 = this.g;
        this.g = i5 + 1;
        iArr4[i5] = i2;
    }

    public final boolean a() {
        int i2 = this.c;
        if (i2 == 0) {
            i2 = b();
        }
        return (i2 == 2 || i2 == 4) ? false : true;
    }
}
