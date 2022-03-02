package defpackage;

import com.google.android.chimera.Service;
import java.io.EOFException;
import org.chromium.net.UrlRequest;

/* renamed from: bau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bau extends bat {
    private static final batg f = batg.a("'\\");
    private static final batg g = batg.a("\"\\");
    private static final batg h = batg.a("{}[]:, \n\t\r\f/\\;#=");
    private static final batg i = batg.a("\n\r");
    private static final batg j = batg.a("*/");
    private final batf k;
    private final batd l;
    private int m = 0;
    private long n;
    private int o;
    private String p;

    public bau(batf batf) {
        this.k = batf;
        this.l = ((batv) batf).a;
        a(6);
    }

    private final int a(String str, bar bar) {
        int length = bar.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(bar.a[i2])) {
                this.m = 0;
                this.d[this.b - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    private final void b(batg batg) {
        while (true) {
            long a = this.k.a(batg);
            if (a == -1) {
                throw a("Unterminated string");
            } else if (this.l.c(a) == 92) {
                this.l.h(a + 1);
                t();
            } else {
                this.l.h(a + 1);
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01cd, code lost:
        if (b((int) r11) != false) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x01f3, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x01f5, code lost:
        if (r2 != 2) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01f7, code lost:
        if (r5 == false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x01fd, code lost:
        if (r6 == Long.MIN_VALUE) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0200, code lost:
        if (r9 != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0207, code lost:
        if (r6 != 0) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0209, code lost:
        if (r9 != false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x020b, code lost:
        if (r9 != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x020d, code lost:
        r6 = -r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0210, code lost:
        r0.n = r6;
        r0.l.h((long) r4);
        r0.m = 16;
        r3 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x021f, code lost:
        if (r2 != 2) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0223, code lost:
        if (r2 == 4) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0225, code lost:
        if (r2 == 7) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0227, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0229, code lost:
        r0.o = r4;
        r0.m = 17;
        r3 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0231, code lost:
        if (r3 != 0) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x023f, code lost:
        if (b((int) r0.l.c(0)) == false) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0241, code lost:
        r();
        r0.m = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0248, code lost:
        return 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x024f, code lost:
        throw a("Expected value");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0250, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0251 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int o() {
        /*
            r16 = this;
            r0 = r16
            int[] r1 = r0.c
            int r2 = r0.b
            r3 = -1
            int r2 = r2 + r3
            r4 = r1[r2]
            r7 = 93
            r9 = 59
            r10 = 44
            r11 = 6
            r12 = 3
            r13 = 0
            r15 = 7
            r5 = 4
            r6 = 5
            r8 = 2
            r3 = 1
            if (r4 != r3) goto L_0x0020
            r1[r2] = r8
            r1 = 0
            goto L_0x00a7
        L_0x0020:
            if (r4 != r8) goto L_0x0044
            int r1 = r0.a((boolean) r3)
            batd r2 = r0.l
            r2.e()
            if (r1 == r10) goto L_0x0042
            if (r1 == r9) goto L_0x003c
            if (r1 != r7) goto L_0x0034
            r0.m = r5
            return r5
        L_0x0034:
            java.lang.String r1 = "Unterminated array"
            baq r1 = r0.a((java.lang.String) r1)
            throw r1
        L_0x003c:
            r16.r()
            r1 = 0
            goto L_0x00a7
        L_0x0042:
            r1 = 0
            goto L_0x00a7
        L_0x0044:
            if (r4 != r12) goto L_0x0048
            goto L_0x02a3
        L_0x0048:
            if (r4 == r6) goto L_0x02a3
            if (r4 != r5) goto L_0x0089
            r1[r2] = r6
            int r1 = r0.a((boolean) r3)
            batd r2 = r0.l
            r2.e()
            r2 = 58
            if (r1 == r2) goto L_0x0087
            r2 = 61
            if (r1 != r2) goto L_0x007f
            r16.r()
            batf r1 = r0.k
            r5 = 1
            boolean r1 = r1.b(r5)
            if (r1 == 0) goto L_0x007d
            batd r1 = r0.l
            byte r1 = r1.c((long) r13)
            r2 = 62
            if (r1 != r2) goto L_0x007d
            batd r1 = r0.l
            r1.e()
            r1 = 0
            goto L_0x00a7
        L_0x007d:
            r1 = 0
            goto L_0x00a7
        L_0x007f:
            java.lang.String r1 = "Expected ':'"
            baq r1 = r0.a((java.lang.String) r1)
            throw r1
        L_0x0087:
            r1 = 0
            goto L_0x00a7
        L_0x0089:
            if (r4 != r11) goto L_0x008f
            r1[r2] = r15
            r1 = 0
            goto L_0x00a7
        L_0x008f:
            if (r4 != r15) goto L_0x00a2
            r1 = 0
            int r2 = r0.a((boolean) r1)
            r5 = -1
            if (r2 != r5) goto L_0x009e
            r1 = 18
            r0.m = r1
            return r1
        L_0x009e:
            r16.r()
            goto L_0x00a7
        L_0x00a2:
            r1 = 0
            r2 = 8
            if (r4 == r2) goto L_0x029b
        L_0x00a7:
            int r2 = r0.a((boolean) r3)
            r5 = 34
            if (r2 == r5) goto L_0x0291
            r5 = 39
            if (r2 == r5) goto L_0x0284
            if (r2 == r10) goto L_0x0271
            if (r2 == r9) goto L_0x0271
            r5 = 91
            if (r2 == r5) goto L_0x0268
            if (r2 == r7) goto L_0x025b
            r4 = 123(0x7b, float:1.72E-43)
            if (r2 == r4) goto L_0x0252
            batd r2 = r0.l
            byte r2 = r2.c((long) r13)
            r4 = 116(0x74, float:1.63E-43)
            if (r2 != r4) goto L_0x00cd
            goto L_0x00f0
        L_0x00cd:
            r4 = 84
            if (r2 == r4) goto L_0x00f0
            r4 = 102(0x66, float:1.43E-43)
            if (r2 != r4) goto L_0x00d6
        L_0x00d5:
            goto L_0x00ea
        L_0x00d6:
            r4 = 70
            if (r2 == r4) goto L_0x00d5
            r4 = 110(0x6e, float:1.54E-43)
            if (r2 != r4) goto L_0x00df
        L_0x00de:
            goto L_0x00e4
        L_0x00df:
            r4 = 78
            if (r2 == r4) goto L_0x00de
            goto L_0x013c
        L_0x00e4:
            java.lang.String r2 = "null"
            java.lang.String r4 = "NULL"
            r5 = 7
            goto L_0x00f5
        L_0x00ea:
            java.lang.String r2 = "false"
            java.lang.String r4 = "FALSE"
            r5 = 6
            goto L_0x00f5
        L_0x00f0:
            java.lang.String r2 = "true"
            java.lang.String r4 = "TRUE"
            r5 = 5
        L_0x00f5:
            int r6 = r2.length()
            r7 = 1
        L_0x00fa:
            if (r7 >= r6) goto L_0x0123
            int r9 = r7 + 1
            batf r10 = r0.k
            long r11 = (long) r9
            boolean r10 = r10.b(r11)
            if (r10 == 0) goto L_0x0121
            batd r10 = r0.l
            long r11 = (long) r7
            byte r10 = r10.c((long) r11)
            char r11 = r2.charAt(r7)
            if (r10 == r11) goto L_0x011c
            char r7 = r4.charAt(r7)
            if (r10 == r7) goto L_0x011c
            r5 = 0
            goto L_0x0146
        L_0x011c:
            r7 = r9
            r11 = 6
            r12 = 3
            goto L_0x00fa
        L_0x0121:
            r5 = 0
            goto L_0x0146
        L_0x0123:
            batf r2 = r0.k
            int r4 = r6 + 1
            long r9 = (long) r4
            boolean r2 = r2.b(r9)
            if (r2 == 0) goto L_0x013e
            batd r2 = r0.l
            long r9 = (long) r6
            byte r2 = r2.c((long) r9)
            boolean r2 = r0.b((int) r2)
            if (r2 != 0) goto L_0x013c
            goto L_0x013e
        L_0x013c:
            r5 = 0
            goto L_0x0146
        L_0x013e:
            batd r2 = r0.l
            long r6 = (long) r6
            r2.h((long) r6)
            r0.m = r5
        L_0x0146:
            if (r5 != 0) goto L_0x0251
            r6 = r13
            r2 = 0
            r4 = 0
            r5 = 1
            r9 = 0
        L_0x014d:
            int r10 = r4 + 1
            batf r11 = r0.k
            long r13 = (long) r10
            boolean r11 = r11.b(r13)
            if (r11 == 0) goto L_0x01f5
            batd r11 = r0.l
            long r12 = (long) r4
            byte r11 = r11.c((long) r12)
            r12 = 43
            if (r11 == r12) goto L_0x01e8
            r12 = 69
            if (r11 == r12) goto L_0x01df
            r12 = 101(0x65, float:1.42E-43)
            if (r11 == r12) goto L_0x01df
            r12 = 45
            if (r11 == r12) goto L_0x01d5
            r12 = 46
            if (r11 == r12) goto L_0x01d0
            r12 = 48
            if (r11 < r12) goto L_0x01c9
            r12 = 57
            if (r11 > r12) goto L_0x01c9
            if (r2 != r3) goto L_0x017f
            r3 = 6
            goto L_0x01c3
        L_0x017f:
            if (r2 == 0) goto L_0x01c2
            if (r2 != r8) goto L_0x01b1
            r12 = 0
            int r4 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x01ae
            r12 = 10
            long r12 = r12 * r6
            int r11 = r11 + -48
            long r3 = (long) r11
            long r12 = r12 - r3
            r3 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r11 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r11 > 0) goto L_0x01a9
            r3 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r11 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r11 != 0) goto L_0x01a7
            int r3 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x01a9
        L_0x01a7:
            r3 = 0
            goto L_0x01aa
        L_0x01a9:
            r3 = 1
        L_0x01aa:
            r5 = r5 & r3
            r6 = r12
            r3 = 6
            goto L_0x01ed
        L_0x01ae:
            r3 = 0
            goto L_0x0231
        L_0x01b1:
            r3 = 3
            if (r2 != r3) goto L_0x01b7
            r2 = 4
        L_0x01b5:
            r3 = 6
            goto L_0x01ed
        L_0x01b7:
            r3 = 5
            if (r2 != r3) goto L_0x01bc
            r2 = 7
            goto L_0x01b5
        L_0x01bc:
            r3 = 6
            if (r2 == r3) goto L_0x01c0
            goto L_0x01ed
        L_0x01c0:
            r2 = 7
            goto L_0x01ed
        L_0x01c2:
            r3 = 6
        L_0x01c3:
            int r11 = r11 + -48
            int r2 = -r11
            long r6 = (long) r2
            r2 = 2
            goto L_0x01ed
        L_0x01c9:
            boolean r3 = r0.b((int) r11)
            if (r3 == 0) goto L_0x01f5
            goto L_0x01f3
        L_0x01d0:
            r3 = 6
            if (r2 != r8) goto L_0x01f3
            r2 = 3
            goto L_0x01ed
        L_0x01d5:
            r3 = 6
            if (r2 != 0) goto L_0x01db
            r2 = 1
            r9 = 1
            goto L_0x01ed
        L_0x01db:
            r4 = 5
            if (r2 != r4) goto L_0x01f3
            goto L_0x01ec
        L_0x01df:
            r3 = 6
            if (r2 != r8) goto L_0x01e4
        L_0x01e2:
            r2 = 5
            goto L_0x01ed
        L_0x01e4:
            r4 = 4
            if (r2 != r4) goto L_0x01f3
            goto L_0x01e2
        L_0x01e8:
            r3 = 6
            r4 = 5
            if (r2 != r4) goto L_0x01f3
        L_0x01ec:
            r2 = 6
        L_0x01ed:
            r4 = r10
            r3 = 1
            r13 = 0
            goto L_0x014d
        L_0x01f3:
            r3 = 0
            goto L_0x0231
        L_0x01f5:
            if (r2 != r8) goto L_0x021f
            if (r5 == 0) goto L_0x021f
            r10 = -9223372036854775808
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x0200
            goto L_0x0203
        L_0x0200:
            if (r9 != 0) goto L_0x0203
            goto L_0x021f
        L_0x0203:
            r10 = 0
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x020b
            if (r9 != 0) goto L_0x021f
        L_0x020b:
            if (r9 != 0) goto L_0x020f
            long r6 = -r6
            goto L_0x0210
        L_0x020f:
        L_0x0210:
            r0.n = r6
            batd r1 = r0.l
            long r2 = (long) r4
            r1.h((long) r2)
            r1 = 16
            r0.m = r1
            r3 = 16
            goto L_0x0231
        L_0x021f:
            if (r2 != r8) goto L_0x0222
        L_0x0221:
            goto L_0x0229
        L_0x0222:
            r3 = 4
            if (r2 == r3) goto L_0x0221
            if (r2 == r15) goto L_0x0221
            r3 = 0
            goto L_0x0231
        L_0x0229:
            r0.o = r4
            r1 = 17
            r0.m = r1
            r3 = 17
        L_0x0231:
            if (r3 != 0) goto L_0x0250
            batd r1 = r0.l
            r2 = 0
            byte r1 = r1.c((long) r2)
            boolean r1 = r0.b((int) r1)
            if (r1 == 0) goto L_0x0249
            r16.r()
            r1 = 10
            r0.m = r1
            return r1
        L_0x0249:
            java.lang.String r1 = "Expected value"
            baq r1 = r0.a((java.lang.String) r1)
            throw r1
        L_0x0250:
            return r3
        L_0x0251:
            return r5
        L_0x0252:
            batd r1 = r0.l
            r1.e()
            r1 = 1
            r0.m = r1
            return r1
        L_0x025b:
            r1 = 1
            if (r4 == r1) goto L_0x025f
            goto L_0x0271
        L_0x025f:
            batd r1 = r0.l
            r1.e()
            r1 = 4
            r0.m = r1
            return r1
        L_0x0268:
            batd r1 = r0.l
            r1.e()
            r1 = 3
            r0.m = r1
            return r1
        L_0x0271:
            r1 = 1
            if (r4 != r1) goto L_0x0275
            goto L_0x0277
        L_0x0275:
            if (r4 != r8) goto L_0x027d
        L_0x0277:
            r16.r()
            r0.m = r15
            return r15
        L_0x027d:
            java.lang.String r1 = "Unexpected value"
            baq r1 = r0.a((java.lang.String) r1)
            throw r1
        L_0x0284:
            r16.r()
            batd r1 = r0.l
            r1.e()
            r1 = 8
            r0.m = r1
            return r1
        L_0x0291:
            batd r1 = r0.l
            r1.e()
            r1 = 9
            r0.m = r1
            return r1
        L_0x029b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x02a3:
            r3 = 4
            r1[r2] = r3
            r1 = 125(0x7d, float:1.75E-43)
            r2 = 5
            if (r4 != r2) goto L_0x02ca
            r2 = 1
            int r3 = r0.a((boolean) r2)
            batd r2 = r0.l
            r2.e()
            if (r3 == r10) goto L_0x02ca
            if (r3 == r9) goto L_0x02c7
            if (r3 != r1) goto L_0x02bf
            r0.m = r8
            return r8
        L_0x02bf:
            java.lang.String r1 = "Unterminated object"
            baq r1 = r0.a((java.lang.String) r1)
            throw r1
        L_0x02c7:
            r16.r()
        L_0x02ca:
            r2 = 1
            int r2 = r0.a((boolean) r2)
            r3 = 34
            if (r2 == r3) goto L_0x030f
            r3 = 39
            if (r2 == r3) goto L_0x0302
            java.lang.String r3 = "Expected name"
            if (r2 == r1) goto L_0x02f1
            r16.r()
            char r1 = (char) r2
            boolean r1 = r0.b((int) r1)
            if (r1 == 0) goto L_0x02eb
            r1 = 14
            r0.m = r1
            return r1
        L_0x02eb:
            baq r1 = r0.a((java.lang.String) r3)
            throw r1
        L_0x02f1:
            r1 = 5
            if (r4 == r1) goto L_0x02fc
            batd r1 = r0.l
            r1.e()
            r0.m = r8
            return r8
        L_0x02fc:
            baq r1 = r0.a((java.lang.String) r3)
            throw r1
        L_0x0302:
            batd r1 = r0.l
            r1.e()
            r16.r()
            r1 = 12
            r0.m = r1
            return r1
        L_0x030f:
            batd r1 = r0.l
            r1.e()
            r1 = 13
            r0.m = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bau.o():int");
    }

    private final String p() {
        long a = this.k.a(h);
        return a == -1 ? this.l.k() : this.l.e(a);
    }

    private final void q() {
        long a = this.k.a(h);
        batd batd = this.l;
        if (a == -1) {
            a = batd.b;
        }
        batd.h(a);
    }

    private final void r() {
        throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private final void s() {
        long a = this.k.a(i);
        batd batd = this.l;
        batd.h(a != -1 ? a + 1 : batd.b);
    }

    private final char t() {
        int i2;
        if (this.k.b(1)) {
            byte e = this.l.e();
            if (e == 10 || e == 34 || e == 39 || e == 47 || e == 92) {
                return (char) e;
            }
            if (e == 98) {
                return 8;
            }
            if (e == 102) {
                return 12;
            }
            if (e == 110) {
                return 10;
            }
            if (e == 114) {
                return 13;
            }
            if (e == 116) {
                return 9;
            }
            if (e != 117) {
                throw a("Invalid escape sequence: \\" + ((char) e));
            } else if (this.k.b(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte c2 = this.l.c((long) i3);
                    char c3 = (char) (c << 4);
                    if (c2 >= 48 && c2 <= 57) {
                        i2 = c2 - 48;
                    } else if (c2 >= 97 && c2 <= 102) {
                        i2 = c2 - 87;
                    } else if (c2 < 65 || c2 > 70) {
                        throw a("\\u" + this.l.e(4));
                    } else {
                        i2 = c2 - 55;
                    }
                    c = (char) (c3 + i2);
                }
                this.l.h(4);
                return c;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + m());
            }
        } else {
            throw a("Unterminated escape sequence");
        }
    }

    public final void c() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = o();
        }
        if (i2 == 1) {
            a(3);
            this.m = 0;
            return;
        }
        throw new bap("Expected BEGIN_OBJECT but was " + bas.a(n()) + " at path " + m());
    }

    public final void close() {
        this.m = 0;
        this.c[0] = 8;
        this.b = 1;
        this.l.n();
        this.k.close();
    }

    public final void d() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = o();
        }
        if (i2 == 2) {
            int i3 = this.b - 1;
            this.b = i3;
            this.d[i3] = null;
            int[] iArr = this.e;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.m = 0;
            return;
        }
        throw new bap("Expected END_OBJECT but was " + bas.a(n()) + " at path " + m());
    }

    public final boolean e() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = o();
        }
        return (i2 == 2 || i2 == 4 || i2 == 18) ? false : true;
    }

    public final String f() {
        String str;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = o();
        }
        if (i2 == 14) {
            str = p();
        } else if (i2 == 13) {
            str = a(g);
        } else if (i2 == 12) {
            str = a(f);
        } else if (i2 == 15) {
            str = this.p;
        } else {
            throw new bap("Expected a name but was " + bas.a(n()) + " at path " + m());
        }
        this.m = 0;
        this.d[this.b - 1] = str;
        return str;
    }

    public final void g() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = o();
        }
        if (i2 == 14) {
            q();
        } else if (i2 == 13) {
            b(g);
        } else if (i2 == 12) {
            b(f);
        } else if (i2 != 15) {
            throw new bap("Expected a name but was " + bas.a(n()) + " at path " + m());
        }
        this.m = 0;
        this.d[this.b - 1] = "null";
    }

    public final String h() {
        String str;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = o();
        }
        if (i2 == 10) {
            str = p();
        } else if (i2 == 9) {
            str = a(g);
        } else if (i2 == 8) {
            str = a(f);
        } else if (i2 == 11) {
            str = this.p;
            this.p = null;
        } else if (i2 == 16) {
            str = Long.toString(this.n);
        } else if (i2 == 17) {
            str = this.l.e((long) this.o);
        } else {
            throw new bap("Expected a string but was " + bas.a(n()) + " at path " + m());
        }
        this.m = 0;
        int[] iArr = this.e;
        int i3 = this.b - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    public final boolean i() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = o();
        }
        if (i2 == 5) {
            this.m = 0;
            int[] iArr = this.e;
            int i3 = this.b - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.m = 0;
            int[] iArr2 = this.e;
            int i4 = this.b - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            throw new bap("Expected a boolean but was " + bas.a(n()) + " at path " + m());
        }
    }

    public final double j() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = o();
        }
        if (i2 == 16) {
            this.m = 0;
            int[] iArr = this.e;
            int i3 = this.b - 1;
            iArr[i3] = iArr[i3] + 1;
            return (double) this.n;
        }
        if (i2 == 17) {
            this.p = this.l.e((long) this.o);
        } else if (i2 == 9) {
            this.p = a(g);
        } else if (i2 == 8) {
            this.p = a(f);
        } else if (i2 == 10) {
            this.p = p();
        } else if (i2 != 11) {
            throw new bap("Expected a double but was " + bas.a(n()) + " at path " + m());
        }
        this.m = 11;
        try {
            double parseDouble = Double.parseDouble(this.p);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new baq("JSON forbids NaN and infinities: " + parseDouble + " at path " + m());
            }
            this.p = null;
            this.m = 0;
            int[] iArr2 = this.e;
            int i4 = this.b - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return parseDouble;
        } catch (NumberFormatException e) {
            throw new bap("Expected a double but was " + this.p + " at path " + m());
        }
    }

    public final int k() {
        String str;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = o();
        }
        if (i2 == 16) {
            long j2 = this.n;
            int i3 = (int) j2;
            if (j2 == ((long) i3)) {
                this.m = 0;
                int[] iArr = this.e;
                int i4 = this.b - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            throw new bap("Expected an int but was " + this.n + " at path " + m());
        }
        if (i2 == 17) {
            this.p = this.l.e((long) this.o);
        } else {
            if (i2 == 9) {
                str = a(g);
            } else if (i2 == 8) {
                str = a(f);
            } else if (i2 != 11) {
                throw new bap("Expected an int but was " + bas.a(n()) + " at path " + m());
            }
            this.p = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.m = 0;
                int[] iArr2 = this.e;
                int i5 = this.b - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException e) {
            }
        }
        this.m = 11;
        try {
            double parseDouble = Double.parseDouble(this.p);
            int i6 = (int) parseDouble;
            if (((double) i6) == parseDouble) {
                this.p = null;
                this.m = 0;
                int[] iArr3 = this.e;
                int i7 = this.b - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return i6;
            }
            throw new bap("Expected an int but was " + this.p + " at path " + m());
        } catch (NumberFormatException e2) {
            throw new bap("Expected an int but was " + this.p + " at path " + m());
        }
    }

    public final void l() {
        int i2 = 0;
        do {
            int i3 = this.m;
            if (i3 == 0) {
                i3 = o();
            }
            if (i3 == 3) {
                a(1);
                i2++;
            } else if (i3 == 1) {
                a(3);
                i2++;
            } else if (i3 == 4) {
                i2--;
                if (i2 >= 0) {
                    this.b--;
                } else {
                    throw new bap("Expected a value but was " + bas.a(n()) + " at path " + m());
                }
            } else if (i3 == 2) {
                i2--;
                if (i2 >= 0) {
                    this.b--;
                } else {
                    throw new bap("Expected a value but was " + bas.a(n()) + " at path " + m());
                }
            } else if (i3 == 14 || i3 == 10) {
                q();
            } else if (i3 == 9 || i3 == 13) {
                b(g);
            } else if (i3 == 8 || i3 == 12) {
                b(f);
            } else if (i3 == 17) {
                this.l.h((long) this.o);
            } else if (i3 == 18) {
                throw new bap("Expected a value but was " + bas.a(n()) + " at path " + m());
            }
            this.m = 0;
        } while (i2 != 0);
        int[] iArr = this.e;
        int i4 = this.b - 1;
        iArr[i4] = iArr[i4] + 1;
        this.d[i4] = "null";
    }

    public final int n() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = o();
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
            case Service.START_CONTINUATION_MASK /*15*/:
                return 5;
            case 16:
            case 17:
                return 7;
            default:
                return 10;
        }
    }

    public final String toString() {
        return "JsonReader(" + this.k + ")";
    }

    private final int a(boolean z) {
        long j2;
        batv batv;
        long j3;
        long j4;
        long j5;
        int i2;
        bau bau = this;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if (bau.k.b((long) i5)) {
                byte c = bau.l.c((long) i4);
                if (c == 10 || c == 32 || c == 13 || c == 9) {
                    i4 = i5;
                    bau = bau;
                    i3 = 0;
                } else {
                    bau.l.h((long) (i5 - 1));
                    if (c != 47) {
                        bau bau2 = bau;
                        if (c != 35) {
                            return c;
                        }
                        r();
                        s();
                        bau = bau2;
                        i3 = 0;
                        i4 = 0;
                    } else if (bau.k.b(2)) {
                        r();
                        long j6 = 1;
                        byte c2 = bau.l.c(1);
                        if (c2 == 42) {
                            bau.l.e();
                            bau.l.e();
                            batf batf = bau.k;
                            batg batg = j;
                            batv batv2 = (batv) batf;
                            if (!batv2.c) {
                                long j7 = 0;
                                long j8 = 0;
                                while (true) {
                                    batd batd = batv2.a;
                                    if (batg.e() == 0) {
                                        bau bau3 = bau;
                                        throw new IllegalArgumentException("bytes is empty");
                                    } else if (j8 >= j7) {
                                        batw batw = batd.a;
                                        if (batw != null) {
                                            long j9 = batd.b;
                                            if (j9 - j8 >= j8) {
                                                j4 = j7;
                                                while (true) {
                                                    long j10 = ((long) (batw.c - batw.b)) + j4;
                                                    if (j10 >= j8) {
                                                        break;
                                                    }
                                                    batw = batw.f;
                                                    j4 = j10;
                                                }
                                            } else {
                                                while (j4 > j8) {
                                                    batw = batw.g;
                                                    j9 = j4 - ((long) (batw.c - batw.b));
                                                }
                                            }
                                            byte a = batg.a(i3);
                                            int e = batg.e();
                                            batv = batv2;
                                            long j11 = (batd.b - ((long) e)) + j6;
                                            long j12 = j8;
                                            while (true) {
                                                if (j4 >= j11) {
                                                    j2 = j8;
                                                    j3 = -1;
                                                    break;
                                                }
                                                byte[] bArr = batw.a;
                                                j2 = j8;
                                                int min = (int) Math.min((long) batw.c, (((long) batw.b) + j11) - j4);
                                                int i6 = (int) ((((long) batw.b) + j12) - j4);
                                                while (i6 < min) {
                                                    if (bArr[i6] == a) {
                                                        int i7 = i6 + 1;
                                                        int i8 = batw.c;
                                                        byte[] bArr2 = batw.a;
                                                        int i9 = 1;
                                                        batw batw2 = batw;
                                                        while (i9 < e) {
                                                            if (i7 == i8) {
                                                                batw2 = batw2.f;
                                                                bArr2 = batw2.a;
                                                                i7 = batw2.b;
                                                                i8 = batw2.c;
                                                            }
                                                            i2 = min;
                                                            j5 = j11;
                                                            if (bArr2[i7] == batg.a(i9)) {
                                                                i7++;
                                                                i9++;
                                                                min = i2;
                                                                j11 = j5;
                                                            }
                                                        }
                                                        j3 = ((long) (i6 - batw.b)) + j4;
                                                        break;
                                                    }
                                                    i2 = min;
                                                    j5 = j11;
                                                    i6++;
                                                    min = i2;
                                                    j11 = j5;
                                                }
                                                j12 = j4 + ((long) (batw.c - batw.b));
                                                batw = batw.f;
                                                j4 = j12;
                                                j8 = j2;
                                            }
                                        } else {
                                            batv = batv2;
                                            j2 = j8;
                                            j3 = -1;
                                        }
                                        if (j3 != -1) {
                                            break;
                                        }
                                        batv2 = batv;
                                        batd batd2 = batv2.a;
                                        long j13 = batd2.b;
                                        if (batv2.b.c(batd2, 8192) == -1) {
                                            j3 = -1;
                                            break;
                                        }
                                        j8 = Math.max(j2, (j13 - ((long) batg.e())) + 1);
                                        j7 = 0;
                                        j6 = 1;
                                        i3 = 0;
                                        bau = this;
                                    } else {
                                        bau bau4 = bau;
                                        throw new IllegalArgumentException("fromIndex < 0");
                                    }
                                }
                                batd batd3 = this.l;
                                batd3.h(j3 != -1 ? ((long) j.e()) + j3 : batd3.b);
                                if (j3 != -1) {
                                    bau = this;
                                    i3 = 0;
                                    i4 = 0;
                                } else {
                                    throw a("Unterminated comment");
                                }
                            } else {
                                bau bau5 = bau;
                                throw new IllegalStateException("closed");
                            }
                        } else if (c2 != 47) {
                            return 47;
                        } else {
                            bau.l.e();
                            bau.l.e();
                            s();
                            i4 = 0;
                        }
                    } else {
                        bau bau6 = bau;
                        return 47;
                    }
                }
            } else {
                bau bau7 = bau;
                if (!z) {
                    return -1;
                }
                throw new EOFException("End of input");
            }
        }
    }

    private final boolean b(int i2) {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (!(i2 == 47 || i2 == 61)) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        r();
        return false;
    }

    public final void b() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = o();
        }
        if (i2 == 4) {
            int i3 = this.b - 1;
            this.b = i3;
            int[] iArr = this.e;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.m = 0;
            return;
        }
        throw new bap("Expected END_ARRAY but was " + bas.a(n()) + " at path " + m());
    }

    private final String a(batg batg) {
        StringBuilder sb = null;
        while (true) {
            long a = this.k.a(batg);
            if (a == -1) {
                throw a("Unterminated string");
            } else if (this.l.c(a) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.l.e(a));
                this.l.e();
                sb.append(t());
            } else if (sb != null) {
                sb.append(this.l.e(a));
                this.l.e();
                return sb.toString();
            } else {
                String e = this.l.e(a);
                this.l.e();
                return e;
            }
        }
    }

    public final int a(bar bar) {
        int i2;
        int i3;
        bar bar2 = bar;
        int i4 = this.m;
        if (i4 == 0) {
            i4 = o();
        }
        int i5 = -1;
        if (i4 < 12 || i4 > 15) {
            return -1;
        }
        if (i4 == 15) {
            return a(this.p, bar2);
        }
        batf batf = this.k;
        batr batr = bar2.b;
        batv batv = (batv) batf;
        if (!batv.c) {
            while (true) {
                batw batw = batv.a.a;
                if (batw != null) {
                    byte[] bArr = batw.a;
                    int i6 = batw.b;
                    int i7 = batw.c;
                    int[] iArr = batr.b;
                    batw batw2 = batw;
                    int i8 = 0;
                    i2 = -1;
                    while (true) {
                        int i9 = i8 + 1;
                        int i10 = iArr[i8];
                        int i11 = i9 + 1;
                        int i12 = iArr[i9];
                        if (i12 != i5) {
                            i2 = i12;
                        }
                        if (batw2 != null) {
                            if (i10 < 0) {
                                int i13 = i11 + (-i10);
                                while (true) {
                                    int i14 = i6 + 1;
                                    int i15 = i11 + 1;
                                    if ((bArr[i6] & 255) != iArr[i11]) {
                                        break;
                                    }
                                    if (i14 == i7) {
                                        batw batw3 = batw2.f;
                                        int i16 = batw3.b;
                                        bArr = batw3.a;
                                        int i17 = batw3.c;
                                        if (batw3 == batw) {
                                            if (i15 != i13) {
                                                break;
                                            }
                                            i7 = i17;
                                            batw2 = null;
                                            i6 = i16;
                                        } else {
                                            batw2 = batw3;
                                            i7 = i17;
                                            i6 = i16;
                                        }
                                    } else {
                                        i6 = i14;
                                    }
                                    if (i15 == i13) {
                                        i3 = iArr[i15];
                                        break;
                                    }
                                    i11 = i15;
                                }
                            } else {
                                int i18 = i6 + 1;
                                byte b = bArr[i6] & 255;
                                int i19 = i11 + i10;
                                int i20 = i11;
                                while (true) {
                                    if (i20 == i19) {
                                        break;
                                    } else if (b == iArr[i20]) {
                                        i3 = iArr[i20 + i10];
                                        if (i18 == i7) {
                                            batw2 = batw2.f;
                                            int i21 = batw2.b;
                                            byte[] bArr2 = batw2.a;
                                            int i22 = batw2.c;
                                            if (batw2 != batw) {
                                                i6 = i21;
                                                bArr = bArr2;
                                                i7 = i22;
                                            } else {
                                                i6 = i21;
                                                bArr = bArr2;
                                                i7 = i22;
                                                batw2 = null;
                                            }
                                        } else {
                                            i6 = i18;
                                        }
                                    } else {
                                        i20++;
                                    }
                                }
                            }
                            if (i3 >= 0) {
                                i2 = i3;
                                break;
                            }
                            i8 = -i3;
                            i5 = -1;
                        } else {
                            break;
                        }
                    }
                }
                i2 = -2;
                if (i2 == -1) {
                    i2 = -1;
                    break;
                } else if (i2 != -2) {
                    batv.a.h((long) batr.a[i2].e());
                    break;
                } else if (batv.b.c(batv.a, 8192) == -1) {
                    i2 = -1;
                    break;
                } else {
                    i5 = -1;
                }
            }
            if (i2 == -1) {
                String str = this.d[this.b - 1];
                String f2 = f();
                int a = a(f2, bar2);
                if (a != -1) {
                    return a;
                }
                this.m = 15;
                this.p = f2;
                this.d[this.b - 1] = str;
                return -1;
            }
            this.m = 0;
            this.d[this.b - 1] = bar2.a[i2];
            return i2;
        }
        throw new IllegalStateException("closed");
    }

    public final void a() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = o();
        }
        if (i2 == 3) {
            a(1);
            this.e[this.b - 1] = 0;
            this.m = 0;
            return;
        }
        throw new bap("Expected BEGIN_ARRAY but was " + bas.a(n()) + " at path " + m());
    }
}
