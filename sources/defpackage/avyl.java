package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: avyl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avyl {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final boolean i;
    String j;
    private final int k;
    private final boolean l;

    static {
        int i2;
        avyk avyk = new avyk();
        avyk.a = true;
        avyk.a();
        avyk avyk2 = new avyk();
        avyk2.c = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        if (seconds <= 2147483647L) {
            i2 = (int) seconds;
        } else {
            i2 = Integer.MAX_VALUE;
        }
        avyk2.b = i2;
        avyk2.a();
    }

    public avyl(avyk avyk) {
        this.a = avyk.a;
        this.b = false;
        this.c = -1;
        this.k = -1;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = avyk.b;
        this.h = -1;
        this.i = avyk.c;
        this.l = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.avyl a(defpackage.avzb r23) {
        /*
            r0 = r23
            int r1 = r23.a()
            r6 = 0
            r7 = 1
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = -1
            r13 = -1
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = -1
            r18 = -1
            r19 = 0
            r20 = 0
        L_0x0019:
            if (r6 >= r1) goto L_0x0147
            java.lang.String r9 = r0.a((int) r6)
            java.lang.String r2 = r0.b(r6)
            java.lang.String r4 = "Cache-Control"
            boolean r4 = r9.equalsIgnoreCase(r4)
            if (r4 != 0) goto L_0x003a
            java.lang.String r4 = "Pragma"
            boolean r4 = r9.equalsIgnoreCase(r4)
            if (r4 != 0) goto L_0x0038
            r9 = -1
            r22 = 1
            goto L_0x0143
        L_0x0038:
            r7 = 0
            goto L_0x003f
        L_0x003a:
            if (r8 == 0) goto L_0x003e
            r7 = 0
            goto L_0x003f
        L_0x003e:
            r8 = r2
        L_0x003f:
            r4 = 0
        L_0x0040:
            int r9 = r2.length()
            if (r4 >= r9) goto L_0x0140
            java.lang.String r9 = "=,;"
            int r9 = defpackage.awcf.a(r2, r4, r9)
            java.lang.String r4 = r2.substring(r4, r9)
            java.lang.String r4 = r4.trim()
            int r3 = r2.length()
            if (r9 != r3) goto L_0x005d
            r22 = 1
            goto L_0x00a8
        L_0x005d:
            char r3 = r2.charAt(r9)
            r5 = 44
            if (r3 == r5) goto L_0x00a6
            char r3 = r2.charAt(r9)
            r5 = 59
            if (r3 == r5) goto L_0x00a6
            int r9 = r9 + 1
            int r3 = defpackage.awcf.a(r2, r9)
            int r5 = r2.length()
            if (r3 >= r5) goto L_0x0095
            char r5 = r2.charAt(r3)
            r9 = 34
            if (r5 == r9) goto L_0x0084
            r22 = 1
            goto L_0x0097
        L_0x0084:
            int r3 = r3 + 1
            java.lang.String r5 = "\""
            int r5 = defpackage.awcf.a(r2, r3, r5)
            java.lang.String r3 = r2.substring(r3, r5)
            r22 = 1
            int r5 = r5 + 1
            goto L_0x00ac
        L_0x0095:
            r22 = 1
        L_0x0097:
            java.lang.String r5 = ",;"
            int r5 = defpackage.awcf.a(r2, r3, r5)
            java.lang.String r3 = r2.substring(r3, r5)
            java.lang.String r3 = r3.trim()
            goto L_0x00ac
        L_0x00a6:
            r22 = 1
        L_0x00a8:
            int r9 = r9 + 1
            r5 = r9
            r3 = 0
        L_0x00ac:
            java.lang.String r9 = "no-cache"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00b9
            r9 = -1
            r10 = 1
            goto L_0x013d
        L_0x00b9:
            java.lang.String r9 = "no-store"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00c5
            r9 = -1
            r11 = 1
            goto L_0x013d
        L_0x00c5:
            java.lang.String r9 = "max-age"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00d4
            r9 = -1
            int r12 = defpackage.awcf.b(r3, r9)
            goto L_0x013d
        L_0x00d4:
            r9 = -1
            java.lang.String r9 = "s-maxage"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00e4
            r4 = -1
            int r13 = defpackage.awcf.b(r3, r4)
            r9 = -1
            goto L_0x013d
        L_0x00e4:
            java.lang.String r9 = "private"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00f0
            r9 = -1
            r14 = 1
            goto L_0x013d
        L_0x00f0:
            java.lang.String r9 = "public"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00fb
            r9 = -1
            r15 = 1
            goto L_0x013d
        L_0x00fb:
            java.lang.String r9 = "must-revalidate"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x0107
            r9 = -1
            r16 = 1
            goto L_0x013d
        L_0x0107:
            java.lang.String r9 = "max-stale"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x0118
            r4 = 2147483647(0x7fffffff, float:NaN)
            int r17 = defpackage.awcf.b(r3, r4)
            r9 = -1
            goto L_0x013d
        L_0x0118:
            java.lang.String r9 = "min-fresh"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x0127
            r9 = -1
            int r18 = defpackage.awcf.b(r3, r9)
            goto L_0x013d
        L_0x0127:
            r9 = -1
            java.lang.String r3 = "only-if-cached"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x0133
            r19 = 1
            goto L_0x013d
        L_0x0133:
            java.lang.String r3 = "no-transform"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x013d
            r20 = 1
        L_0x013d:
            r4 = r5
            goto L_0x0040
        L_0x0140:
            r9 = -1
            r22 = 1
        L_0x0143:
            int r6 = r6 + 1
            goto L_0x0019
        L_0x0147:
            if (r7 != 0) goto L_0x014c
            r21 = 0
            goto L_0x014e
        L_0x014c:
            r21 = r8
        L_0x014e:
            avyl r0 = new avyl
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avyl.a(avzb):avyl");
    }

    public final String toString() {
        String str = this.j;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a) {
                sb.append("no-cache, ");
            }
            if (this.b) {
                sb.append("no-store, ");
            }
            if (this.c != -1) {
                sb.append("max-age=");
                sb.append(this.c);
                sb.append(", ");
            }
            if (this.k != -1) {
                sb.append("s-maxage=");
                sb.append(this.k);
                sb.append(", ");
            }
            if (this.d) {
                sb.append("private, ");
            }
            if (this.e) {
                sb.append("public, ");
            }
            if (this.f) {
                sb.append("must-revalidate, ");
            }
            if (this.g != -1) {
                sb.append("max-stale=");
                sb.append(this.g);
                sb.append(", ");
            }
            if (this.h != -1) {
                sb.append("min-fresh=");
                sb.append(this.h);
                sb.append(", ");
            }
            if (this.i) {
                sb.append("only-if-cached, ");
            }
            if (this.l) {
                sb.append("no-transform, ");
            }
            if (sb.length() != 0) {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            } else {
                str = "";
            }
            this.j = str;
        }
        return str;
    }

    private avyl(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, String str) {
        this.a = z;
        this.b = z2;
        this.c = i2;
        this.k = i3;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = i4;
        this.h = i5;
        this.i = z6;
        this.l = z7;
        this.j = str;
    }
}
