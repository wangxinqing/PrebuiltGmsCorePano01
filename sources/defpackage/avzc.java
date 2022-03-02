package defpackage;

import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: avzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avzc {
    String a;
    String b = "";
    String c = "";
    String d;
    int e = -1;
    final List f;
    List g;
    String h;

    public avzc() {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.add("");
    }

    private static String a(String str, int i, int i2) {
        int i3 = 0;
        String a2 = avzd.a(str, i, i2, false);
        int i4 = -1;
        if (!a2.startsWith("[") || !a2.endsWith("]")) {
            try {
                String lowerCase = IDN.toASCII(a2).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                while (i3 < lowerCase.length()) {
                    char charAt = lowerCase.charAt(i3);
                    if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                        return null;
                    }
                    i3++;
                }
                return lowerCase;
            } catch (IllegalArgumentException e2) {
                return null;
            }
        } else {
            InetAddress a3 = a(a2, a2.length() - 1);
            if (a3 == null) {
                return null;
            }
            byte[] address = a3.getAddress();
            if (address.length == 16) {
                int i5 = 0;
                int i6 = 0;
                while (i5 < address.length) {
                    int i7 = i5;
                    while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                        i7 += 2;
                    }
                    int i8 = i7 - i5;
                    int i9 = i8 > i6 ? i8 : i6;
                    if (i8 > i6) {
                        i4 = i5;
                    }
                    i5 = i7 + 2;
                    i6 = i9;
                }
                batd batd = new batd();
                while (i3 < address.length) {
                    if (i3 == i4) {
                        batd.h(58);
                        i3 += i6;
                        if (i3 == 16) {
                            batd.h(58);
                        }
                    } else {
                        if (i3 > 0) {
                            batd.h(58);
                        }
                        batd.j((long) (((address[i3] & 255) << 8) | (address[i3 + 1] & 255)));
                        i3 += 2;
                    }
                }
                return batd.k();
            }
            throw new AssertionError();
        }
    }

    public final avzd b() {
        if (this.a == null) {
            throw new IllegalStateException("scheme == null");
        } else if (this.d != null) {
            return new avzd(this);
        } else {
            throw new IllegalStateException("host == null");
        }
    }

    public final void c(String str) {
        String str2 = "http";
        if (!str.equalsIgnoreCase(str2)) {
            str2 = "https";
            if (!str.equalsIgnoreCase(str2)) {
                throw new IllegalArgumentException(str.length() == 0 ? new String("unexpected scheme: ") : "unexpected scheme: ".concat(str));
            }
        }
        this.a = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("://");
        if (!this.b.isEmpty() || !this.c.isEmpty()) {
            sb.append(this.b);
            if (!this.c.isEmpty()) {
                sb.append(':');
                sb.append(this.c);
            }
            sb.append('@');
        }
        if (this.d.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.d);
            sb.append(']');
        } else {
            sb.append(this.d);
        }
        int a2 = a();
        if (a2 != avzd.a(this.a)) {
            sb.append(':');
            sb.append(a2);
        }
        List list = this.f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append((String) list.get(i));
        }
        if (this.g != null) {
            sb.append('?');
            List list2 = this.g;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2 += 2) {
                String str = (String) list2.get(i2);
                String str2 = (String) list2.get(i2 + 1);
                if (i2 > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
            }
        }
        if (this.h != null) {
            sb.append('#');
            sb.append(this.h);
        }
        return sb.toString();
    }

    public final void b(String str) {
        if (str != null) {
            String a2 = a(str, 0, str.length());
            if (a2 == null) {
                throw new IllegalArgumentException(str.length() == 0 ? new String("unexpected host: ") : "unexpected host: ".concat(str));
            }
            this.d = a2;
            return;
        }
        throw new IllegalArgumentException("host == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d8, code lost:
        if ((r12 - r10) == 0) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.net.InetAddress a(java.lang.String r16, int r17) {
        /*
            r0 = r16
            r1 = r17
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = -1
            r5 = 0
            r6 = 1
            r7 = 1
            r8 = 0
            r9 = -1
            r10 = -1
        L_0x000f:
            r11 = 0
            if (r7 < r1) goto L_0x0014
            goto L_0x0080
        L_0x0014:
            if (r8 == r2) goto L_0x00e6
            int r12 = r7 + 2
            r13 = 255(0xff, float:3.57E-43)
            r14 = 4
            if (r12 > r1) goto L_0x0032
            java.lang.String r15 = "::"
            r2 = 2
            boolean r2 = r0.regionMatches(r7, r15, r5, r2)
            if (r2 == 0) goto L_0x0032
            if (r9 != r4) goto L_0x0031
            int r8 = r8 + 2
            if (r12 == r1) goto L_0x002f
            r9 = r8
            r10 = r12
            goto L_0x0041
        L_0x002f:
            r9 = r8
            goto L_0x0080
        L_0x0031:
            return r11
        L_0x0032:
            if (r8 != 0) goto L_0x0036
            r10 = r7
            goto L_0x0041
        L_0x0036:
            java.lang.String r2 = ":"
            boolean r2 = r0.regionMatches(r7, r2, r5, r6)
            if (r2 == 0) goto L_0x006e
            int r7 = r7 + 1
            r10 = r7
        L_0x0041:
            r7 = r10
            r2 = 0
        L_0x0043:
            if (r7 >= r1) goto L_0x0055
            char r12 = r0.charAt(r7)
            int r12 = defpackage.avzd.a((char) r12)
            if (r12 == r4) goto L_0x0055
            int r2 = r2 << 4
            int r2 = r2 + r12
            int r7 = r7 + 1
            goto L_0x0043
        L_0x0055:
            int r12 = r7 - r10
            if (r12 == 0) goto L_0x006d
            if (r12 > r14) goto L_0x006d
            int r11 = r8 + 1
            int r12 = r2 >>> 8
            r12 = r12 & r13
            byte r12 = (byte) r12
            r3[r8] = r12
            int r8 = r11 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r11] = r2
            r2 = 16
            goto L_0x000f
        L_0x006d:
            return r11
        L_0x006e:
            java.lang.String r2 = "."
            boolean r2 = r0.regionMatches(r7, r2, r5, r6)
            if (r2 == 0) goto L_0x00e5
            int r2 = r8 + -2
            r6 = r2
        L_0x0079:
            if (r10 < r1) goto L_0x00a1
            int r2 = r2 + r14
            if (r6 != r2) goto L_0x00e4
            int r8 = r8 + 2
        L_0x0080:
            r0 = 16
            if (r8 != r0) goto L_0x0085
            goto L_0x0094
        L_0x0085:
            if (r9 == r4) goto L_0x00a0
            int r1 = r8 - r9
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r9, r3, r2, r1)
            int r2 = 16 - r8
            int r2 = r2 + r9
            java.util.Arrays.fill(r3, r9, r2, r5)
        L_0x0094:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)     // Catch:{ UnknownHostException -> 0x0099 }
            return r0
        L_0x0099:
            r0 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x00a0:
            return r11
        L_0x00a1:
            r7 = 16
            if (r6 == r7) goto L_0x00e4
            if (r6 == r2) goto L_0x00b2
            char r12 = r0.charAt(r10)
            r15 = 46
            if (r12 != r15) goto L_0x00e4
            int r10 = r10 + 1
            goto L_0x00b3
        L_0x00b2:
        L_0x00b3:
            r12 = r10
            r15 = 0
        L_0x00b5:
            if (r12 >= r1) goto L_0x00d6
            char r4 = r0.charAt(r12)
            r5 = 48
            if (r4 < r5) goto L_0x00d6
            r5 = 57
            if (r4 <= r5) goto L_0x00c4
            goto L_0x00d6
        L_0x00c4:
            if (r15 == 0) goto L_0x00c7
        L_0x00c6:
            goto L_0x00ca
        L_0x00c7:
            if (r10 == r12) goto L_0x00c6
            goto L_0x00e4
        L_0x00ca:
            int r15 = r15 * 10
            int r15 = r15 + r4
            int r15 = r15 + -48
            if (r15 > r13) goto L_0x00e4
            int r12 = r12 + 1
            r4 = -1
            r5 = 0
            goto L_0x00b5
        L_0x00d6:
            int r4 = r12 - r10
            if (r4 == 0) goto L_0x00e4
            int r4 = r6 + 1
            byte r5 = (byte) r15
            r3[r6] = r5
            r6 = r4
            r10 = r12
            r4 = -1
            r5 = 0
            goto L_0x0079
        L_0x00e4:
            return r11
        L_0x00e5:
            return r11
        L_0x00e6:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avzc.a(java.lang.String, int):java.net.InetAddress");
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        int i = this.e;
        return i == -1 ? avzd.a(this.a) : i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x038d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0226 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:230:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.avzd r22, java.lang.String r23) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r9 = r23
            int r2 = r23.length()
            r3 = 0
        L_0x000b:
            r4 = 32
            r5 = 13
            r6 = 12
            r7 = 10
            r10 = 9
            if (r3 >= r2) goto L_0x002a
            char r11 = r9.charAt(r3)
            if (r11 == r10) goto L_0x0027
            if (r11 == r7) goto L_0x0027
            if (r11 == r6) goto L_0x0027
            if (r11 == r5) goto L_0x0027
            if (r11 == r4) goto L_0x0027
            r11 = r3
            goto L_0x002b
        L_0x0027:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x002a:
            r11 = r2
        L_0x002b:
            int r2 = r23.length()
            r12 = -1
            int r2 = r2 + r12
        L_0x0031:
            r13 = 1
            if (r2 < r11) goto L_0x0048
            char r3 = r9.charAt(r2)
            if (r3 == r10) goto L_0x0045
            if (r3 == r7) goto L_0x0045
            if (r3 == r6) goto L_0x0045
            if (r3 == r5) goto L_0x0045
            if (r3 == r4) goto L_0x0045
            int r2 = r2 + r13
            r10 = r2
            goto L_0x0049
        L_0x0045:
            int r2 = r2 + -1
            goto L_0x0031
        L_0x0048:
            r10 = r11
        L_0x0049:
            int r2 = r10 - r11
            r14 = 58
            r15 = 3
            r7 = 2
            if (r2 < r7) goto L_0x00cf
            char r2 = r9.charAt(r11)
            r3 = 90
            r4 = 122(0x7a, float:1.71E-43)
            r5 = 65
            r6 = 97
            if (r2 < r6) goto L_0x0062
            if (r2 > r4) goto L_0x0062
            goto L_0x0069
        L_0x0062:
            if (r2 < r5) goto L_0x00cd
            if (r2 <= r3) goto L_0x0069
            r8 = 2
            goto L_0x00d0
        L_0x0069:
            int r2 = r11 + 1
        L_0x006b:
            if (r2 >= r10) goto L_0x00cb
            char r7 = r9.charAt(r2)
            if (r7 < r6) goto L_0x0077
            if (r7 > r4) goto L_0x0077
        L_0x0075:
            r8 = 2
            goto L_0x00c5
        L_0x0077:
            if (r7 >= r5) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            if (r7 <= r3) goto L_0x00c4
        L_0x007c:
            r3 = 48
            if (r7 < r3) goto L_0x0084
            r3 = 57
            if (r7 <= r3) goto L_0x0075
        L_0x0084:
            r3 = 43
            if (r7 == r3) goto L_0x00c2
            r3 = 45
            if (r7 == r3) goto L_0x00c2
            r3 = 46
            if (r7 == r3) goto L_0x00c2
            if (r7 != r14) goto L_0x00c0
            if (r2 == r12) goto L_0x00c0
            r3 = 1
            r6 = 0
            r7 = 6
            java.lang.String r5 = "https:"
            r2 = r23
            r4 = r11
            r8 = 2
            boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x00aa
            java.lang.String r2 = "https"
            r1.a = r2
            int r11 = r11 + 6
            goto L_0x00d6
        L_0x00aa:
            r3 = 1
            r6 = 0
            r7 = 5
            java.lang.String r5 = "http:"
            r2 = r23
            r4 = r11
            boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x00bf
            java.lang.String r2 = "http"
            r1.a = r2
            int r11 = r11 + 5
            goto L_0x00d6
        L_0x00bf:
            return r15
        L_0x00c0:
            r8 = 2
            goto L_0x00d0
        L_0x00c2:
            r8 = 2
            goto L_0x00c5
        L_0x00c4:
            r8 = 2
        L_0x00c5:
            int r2 = r2 + 1
            r3 = 90
            r7 = 2
            goto L_0x006b
        L_0x00cb:
            r8 = 2
            goto L_0x00d0
        L_0x00cd:
            r8 = 2
            goto L_0x00d0
        L_0x00cf:
            r8 = 2
        L_0x00d0:
            if (r0 == 0) goto L_0x038f
            java.lang.String r2 = r0.a
            r1.a = r2
        L_0x00d6:
            r2 = r11
            r3 = 0
        L_0x00d8:
            r7 = 47
            r6 = 92
            if (r2 >= r10) goto L_0x00ed
            char r4 = r9.charAt(r2)
            if (r4 != r6) goto L_0x00e5
        L_0x00e4:
            goto L_0x00e8
        L_0x00e5:
            if (r4 == r7) goto L_0x00e4
            goto L_0x00ed
        L_0x00e8:
            int r3 = r3 + 1
            int r2 = r2 + 1
            goto L_0x00d8
        L_0x00ed:
            r5 = 63
            r4 = 35
            if (r3 < r8) goto L_0x00f4
            goto L_0x0136
        L_0x00f4:
            if (r0 == 0) goto L_0x0136
            java.lang.String r2 = r0.a
            java.lang.String r8 = r1.a
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0136
            java.lang.String r2 = r22.c()
            r1.b = r2
            java.lang.String r2 = r22.d()
            r1.c = r2
            java.lang.String r2 = r0.b
            r1.d = r2
            int r2 = r0.c
            r1.e = r2
            java.util.List r2 = r1.f
            r2.clear()
            java.util.List r2 = r1.f
            java.util.List r3 = r22.e()
            r2.addAll(r3)
            if (r11 == r10) goto L_0x012d
            char r2 = r9.charAt(r11)
            if (r2 != r4) goto L_0x012b
            goto L_0x012d
        L_0x012b:
            goto L_0x0268
        L_0x012d:
            java.lang.String r0 = r22.f()
            r1.a((java.lang.String) r0)
            goto L_0x0268
        L_0x0136:
            int r11 = r11 + r3
            r3 = r11
            r0 = 0
            r18 = 0
        L_0x013b:
            java.lang.String r2 = "@/\\?#"
            int r11 = defpackage.avzd.a((java.lang.String) r9, (int) r3, (int) r10, (java.lang.String) r2)
            if (r11 == r10) goto L_0x0149
            char r2 = r9.charAt(r11)
            goto L_0x014a
        L_0x0149:
            r2 = -1
        L_0x014a:
            if (r2 == r12) goto L_0x0209
            if (r2 == r4) goto L_0x0209
            if (r2 == r7) goto L_0x0209
            if (r2 == r6) goto L_0x0209
            if (r2 == r5) goto L_0x0209
            r8 = 64
            if (r2 == r8) goto L_0x015a
            goto L_0x01fd
        L_0x015a:
            java.lang.String r8 = "%40"
            if (r18 == 0) goto L_0x01a3
            java.lang.String r2 = r1.c
            r16 = 1
            r17 = 0
            r19 = 1
            java.lang.String r20 = " \"':;<=>@[]^`{}|/\\?#"
            r22 = r2
            r2 = r23
            r4 = r11
            r5 = r20
            r6 = r16
            r7 = r17
            r12 = r8
            r8 = r19
            java.lang.String r2 = defpackage.avzd.a(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r3 = java.lang.String.valueOf(r22)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + r15
            int r3 = r3 + r4
            r5.<init>(r3)
            r3 = r22
            r5.append(r3)
            r5.append(r12)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r1.c = r2
            goto L_0x01fb
        L_0x01a3:
            r12 = r8
            java.lang.String r2 = ":"
            int r8 = defpackage.avzd.a((java.lang.String) r9, (int) r3, (int) r11, (java.lang.String) r2)
            r6 = 1
            r7 = 0
            r17 = 1
            java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
            r2 = r23
            r4 = r8
            r13 = r8
            r8 = r17
            java.lang.String r2 = defpackage.avzd.a(r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x01e2
            java.lang.String r0 = r1.b
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + r15
            int r3 = r3 + r4
            r5.<init>(r3)
            r5.append(r0)
            r5.append(r12)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
        L_0x01e2:
            r1.b = r2
            if (r13 == r11) goto L_0x01f9
            int r3 = r13 + 1
            r6 = 1
            r7 = 0
            r8 = 1
            java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
            r2 = r23
            r4 = r11
            java.lang.String r0 = defpackage.avzd.a(r2, r3, r4, r5, r6, r7, r8)
            r1.c = r0
            r18 = 1
            goto L_0x01fa
        L_0x01f9:
        L_0x01fa:
            r0 = 1
        L_0x01fb:
            int r3 = r11 + 1
        L_0x01fd:
            r4 = 35
            r5 = 63
            r6 = 92
            r7 = 47
            r12 = -1
            r13 = 1
            goto L_0x013b
        L_0x0209:
            r0 = r3
        L_0x020a:
            if (r0 >= r11) goto L_0x0226
            char r2 = r9.charAt(r0)
            if (r2 == r14) goto L_0x0227
            r4 = 91
            if (r2 == r4) goto L_0x0217
        L_0x0216:
            goto L_0x0223
        L_0x0217:
            r2 = 1
            int r0 = r0 + r2
            if (r0 >= r11) goto L_0x0216
            char r2 = r9.charAt(r0)
            r4 = 93
            if (r2 != r4) goto L_0x0217
        L_0x0223:
            r2 = 1
            int r0 = r0 + r2
            goto L_0x020a
        L_0x0226:
            r0 = r11
        L_0x0227:
            int r4 = r0 + 1
            if (r4 < r11) goto L_0x023a
            java.lang.String r0 = a(r9, r3, r0)
            r1.d = r0
            java.lang.String r0 = r1.a
            int r0 = defpackage.avzd.a((java.lang.String) r0)
            r1.e = r0
            goto L_0x0264
        L_0x023a:
            java.lang.String r0 = a(r9, r3, r0)
            r1.d = r0
            java.lang.String r5 = ""
            r6 = 0
            r7 = 0
            r8 = 1
            r2 = r23
            r3 = r4
            r4 = r11
            java.lang.String r0 = defpackage.avzd.a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ NumberFormatException -> 0x025b }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x025b }
            if (r0 <= 0) goto L_0x0259
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r0 > r2) goto L_0x0259
            goto L_0x025d
        L_0x0259:
            r0 = -1
            goto L_0x025d
        L_0x025b:
            r0 = move-exception
            r0 = -1
        L_0x025d:
            r1.e = r0
            r2 = -1
            if (r0 != r2) goto L_0x0264
            r0 = 4
            return r0
        L_0x0264:
            java.lang.String r0 = r1.d
            if (r0 == 0) goto L_0x038d
        L_0x0268:
            java.lang.String r0 = "?#"
            int r0 = defpackage.avzd.a((java.lang.String) r9, (int) r11, (int) r10, (java.lang.String) r0)
            if (r11 == r0) goto L_0x0349
            char r2 = r9.charAt(r11)
            java.lang.String r12 = ""
            r3 = 47
            if (r2 != r3) goto L_0x027c
            goto L_0x028d
        L_0x027c:
            r3 = 92
            if (r2 == r3) goto L_0x028d
            java.util.List r2 = r1.f
            int r3 = r2.size()
            r4 = -1
            int r3 = r3 + r4
            r2.set(r3, r12)
            r3 = r11
            goto L_0x029a
        L_0x028d:
            java.util.List r2 = r1.f
            r2.clear()
            java.util.List r2 = r1.f
            r2.add(r12)
            int r11 = r11 + 1
            r3 = r11
        L_0x029a:
            if (r3 >= r0) goto L_0x0349
            java.lang.String r2 = "/\\"
            int r11 = defpackage.avzd.a((java.lang.String) r9, (int) r3, (int) r0, (java.lang.String) r2)
            r6 = 1
            r7 = 0
            r8 = 1
            java.lang.String r5 = " \"<>^`{}|/\\?#"
            r2 = r23
            r4 = r11
            java.lang.String r2 = defpackage.avzd.a(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r3 = "."
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x033f
            java.lang.String r3 = "%2e"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 != 0) goto L_0x033f
            java.lang.String r3 = ".."
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x030e
            java.lang.String r3 = "%2e."
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 != 0) goto L_0x030e
            java.lang.String r3 = ".%2e"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 != 0) goto L_0x030e
            java.lang.String r3 = "%2e%2e"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x02df
            goto L_0x030e
        L_0x02df:
            java.util.List r3 = r1.f
            int r4 = r3.size()
            r5 = -1
            int r4 = r4 + r5
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x02fe
            java.util.List r3 = r1.f
            int r4 = r3.size()
            int r4 = r4 + r5
            r3.set(r4, r2)
            goto L_0x0303
        L_0x02fe:
            java.util.List r3 = r1.f
            r3.add(r2)
        L_0x0303:
            if (r11 >= r0) goto L_0x030c
            java.util.List r2 = r1.f
            r2.add(r12)
            r4 = -1
            goto L_0x0340
        L_0x030c:
            r4 = -1
            goto L_0x0340
        L_0x030e:
            java.util.List r2 = r1.f
            int r3 = r2.size()
            r4 = -1
            int r3 = r3 + r4
            java.lang.Object r2 = r2.remove(r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0338
            java.util.List r2 = r1.f
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x032c
            r4 = -1
            goto L_0x0339
        L_0x032c:
            java.util.List r2 = r1.f
            int r3 = r2.size()
            r4 = -1
            int r3 = r3 + r4
            r2.set(r3, r12)
            goto L_0x0340
        L_0x0338:
            r4 = -1
        L_0x0339:
            java.util.List r2 = r1.f
            r2.add(r12)
            goto L_0x0340
        L_0x033f:
            r4 = -1
        L_0x0340:
            if (r11 >= r0) goto L_0x0346
            int r3 = r11 + 1
            goto L_0x029a
        L_0x0346:
            r3 = r11
            goto L_0x029a
        L_0x0349:
            if (r0 >= r10) goto L_0x036f
            char r2 = r9.charAt(r0)
            r3 = 63
            if (r2 != r3) goto L_0x036f
            java.lang.String r2 = "#"
            int r11 = defpackage.avzd.a((java.lang.String) r9, (int) r0, (int) r10, (java.lang.String) r2)
            int r3 = r0 + 1
            r6 = 1
            r7 = 1
            r8 = 1
            java.lang.String r5 = " \"'<>#"
            r2 = r23
            r4 = r11
            java.lang.String r0 = defpackage.avzd.a(r2, r3, r4, r5, r6, r7, r8)
            java.util.List r0 = defpackage.avzd.b(r0)
            r1.g = r0
            r0 = r11
            goto L_0x0370
        L_0x036f:
        L_0x0370:
            if (r0 >= r10) goto L_0x038b
            char r2 = r9.charAt(r0)
            r3 = 35
            if (r2 != r3) goto L_0x038b
            r2 = 1
            int r3 = r0 + 1
            r6 = 1
            r7 = 0
            r8 = 0
            java.lang.String r5 = ""
            r2 = r23
            r4 = r10
            java.lang.String r0 = defpackage.avzd.a(r2, r3, r4, r5, r6, r7, r8)
            r1.h = r0
        L_0x038b:
            r2 = 1
            return r2
        L_0x038d:
            r0 = 5
            return r0
        L_0x038f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avzc.a(avzd, java.lang.String):int");
    }

    public final void a(int i) {
        if (i <= 0 || i > 65535) {
            StringBuilder sb = new StringBuilder(28);
            sb.append("unexpected port: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.e = i;
    }

    public final void a(String str) {
        this.g = str != null ? avzd.b(avzd.a(str, " \"'<>#", true, true)) : null;
    }
}
