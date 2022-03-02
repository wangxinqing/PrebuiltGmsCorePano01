package defpackage;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;

/* renamed from: banl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class banl implements HostnameVerifier {
    public static final banl a = new banl();
    private static final Pattern b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private banl() {
    }

    private static List a(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List next : subjectAlternativeNames) {
                if (!(next == null || next.size() < 2 || (num = (Integer) next.get(0)) == null || num.intValue() != i || (str = (String) next.get(1)) == null)) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException e) {
            return Collections.emptyList();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r1 = java.lang.String.valueOf(r3.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x025f, code lost:
        if (r1.length() != 0) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0261, code lost:
        r1 = new java.lang.String("Malformed DN: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0267, code lost:
        r1 = "Malformed DN: ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x026e, code lost:
        throw new java.lang.IllegalStateException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ec, code lost:
        r1 = r3.d;
        r7 = new java.lang.String(r8, r1, r3.e - r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012c, code lost:
        r1 = r3.g;
        r8 = r3.d;
        r7 = new java.lang.String(r1, r8, r3.f - r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x019d, code lost:
        r3.e = r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean verify(java.lang.String r17, javax.net.ssl.SSLSession r18) {
        /*
            r16 = this;
            r0 = r17
            r1 = 0
            java.security.cert.Certificate[] r2 = r18.getPeerCertificates()     // Catch:{ SSLException -> 0x02c3 }
            r2 = r2[r1]     // Catch:{ SSLException -> 0x02c3 }
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2     // Catch:{ SSLException -> 0x02c3 }
            java.util.regex.Pattern r3 = b     // Catch:{ SSLException -> 0x02c3 }
            java.util.regex.Matcher r3 = r3.matcher(r0)     // Catch:{ SSLException -> 0x02c3 }
            boolean r3 = r3.matches()     // Catch:{ SSLException -> 0x02c3 }
            r4 = 1
            if (r3 == 0) goto L_0x0038
            r3 = 7
            java.util.List r2 = a((java.security.cert.X509Certificate) r2, (int) r3)     // Catch:{ SSLException -> 0x02c3 }
            int r3 = r2.size()     // Catch:{ SSLException -> 0x02c3 }
            r5 = 0
        L_0x0022:
            if (r5 >= r3) goto L_0x0036
            java.lang.Object r6 = r2.get(r5)     // Catch:{ SSLException -> 0x02c3 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ SSLException -> 0x02c3 }
            boolean r6 = r0.equalsIgnoreCase(r6)     // Catch:{ SSLException -> 0x02c3 }
            if (r6 != 0) goto L_0x0033
            int r5 = r5 + 1
            goto L_0x0022
        L_0x0033:
            r1 = 1
            goto L_0x02c2
        L_0x0036:
            goto L_0x02c2
        L_0x0038:
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ SSLException -> 0x02c3 }
            java.lang.String r0 = r0.toLowerCase(r3)     // Catch:{ SSLException -> 0x02c3 }
            r3 = 2
            java.util.List r3 = a((java.security.cert.X509Certificate) r2, (int) r3)     // Catch:{ SSLException -> 0x02c3 }
            int r5 = r3.size()     // Catch:{ SSLException -> 0x02c3 }
            r6 = 0
            r7 = 0
        L_0x0049:
            if (r6 >= r5) goto L_0x005e
            java.lang.Object r7 = r3.get(r6)     // Catch:{ SSLException -> 0x02c3 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ SSLException -> 0x02c3 }
            boolean r7 = a((java.lang.String) r0, (java.lang.String) r7)     // Catch:{ SSLException -> 0x02c3 }
            if (r7 != 0) goto L_0x005b
            int r6 = r6 + 1
            r7 = 1
            goto L_0x0049
        L_0x005b:
            r1 = 1
            goto L_0x02c2
        L_0x005e:
            if (r7 != 0) goto L_0x02c1
            javax.security.auth.x500.X500Principal r2 = r2.getSubjectX500Principal()     // Catch:{ SSLException -> 0x02c3 }
            bank r3 = new bank     // Catch:{ SSLException -> 0x02c3 }
            r3.<init>(r2)     // Catch:{ SSLException -> 0x02c3 }
            java.lang.String r2 = "cn"
            r3.c = r1     // Catch:{ SSLException -> 0x02c3 }
            r3.d = r1     // Catch:{ SSLException -> 0x02c3 }
            r3.e = r1     // Catch:{ SSLException -> 0x02c3 }
            r3.f = r1     // Catch:{ SSLException -> 0x02c3 }
            java.lang.String r5 = r3.a     // Catch:{ SSLException -> 0x02c3 }
            char[] r5 = r5.toCharArray()     // Catch:{ SSLException -> 0x02c3 }
            r3.g = r5     // Catch:{ SSLException -> 0x02c3 }
            java.lang.String r5 = r3.a()     // Catch:{ SSLException -> 0x02c3 }
            if (r5 == 0) goto L_0x02b7
        L_0x0081:
            java.lang.String r7 = ""
            int r8 = r3.c     // Catch:{ SSLException -> 0x02c3 }
            int r9 = r3.b     // Catch:{ SSLException -> 0x02c3 }
            if (r8 == r9) goto L_0x02b7
            char[] r10 = r3.g     // Catch:{ SSLException -> 0x02c3 }
            char r10 = r10[r8]     // Catch:{ SSLException -> 0x02c3 }
            r11 = 92
            r12 = 34
            java.lang.String r13 = "Unexpected end of DN: "
            r14 = 59
            r15 = 44
            r6 = 43
            r1 = 32
            if (r10 == r12) goto L_0x01e8
            r12 = 35
            if (r10 == r12) goto L_0x013a
            if (r10 == r6) goto L_0x023a
            if (r10 == r15) goto L_0x023a
            if (r10 == r14) goto L_0x023a
            r3.d = r8     // Catch:{ SSLException -> 0x02c3 }
            r3.e = r8     // Catch:{ SSLException -> 0x02c3 }
        L_0x00ab:
            int r7 = r3.c     // Catch:{ SSLException -> 0x02c3 }
            int r8 = r3.b     // Catch:{ SSLException -> 0x02c3 }
            if (r7 < r8) goto L_0x00bf
            java.lang.String r7 = new java.lang.String     // Catch:{ SSLException -> 0x02c3 }
            char[] r1 = r3.g     // Catch:{ SSLException -> 0x02c3 }
            int r8 = r3.d     // Catch:{ SSLException -> 0x02c3 }
            int r9 = r3.e     // Catch:{ SSLException -> 0x02c3 }
            int r9 = r9 - r8
            r7.<init>(r1, r8, r9)     // Catch:{ SSLException -> 0x02c3 }
            goto L_0x023a
        L_0x00bf:
            char[] r8 = r3.g     // Catch:{ SSLException -> 0x02c3 }
            char r9 = r8[r7]     // Catch:{ SSLException -> 0x02c3 }
            if (r9 == r1) goto L_0x00f8
            if (r9 == r14) goto L_0x00ec
            if (r9 == r11) goto L_0x00da
            if (r9 == r6) goto L_0x00ec
            if (r9 == r15) goto L_0x00ec
            int r10 = r3.e     // Catch:{ SSLException -> 0x02c3 }
            int r12 = r10 + 1
            r3.e = r12     // Catch:{ SSLException -> 0x02c3 }
            r8[r10] = r9     // Catch:{ SSLException -> 0x02c3 }
            int r7 = r7 + 1
            r3.c = r7     // Catch:{ SSLException -> 0x02c3 }
            goto L_0x00ab
        L_0x00da:
            int r7 = r3.e     // Catch:{ SSLException -> 0x02c3 }
            int r9 = r7 + 1
            r3.e = r9     // Catch:{ SSLException -> 0x02c3 }
            char r9 = r3.b()     // Catch:{ SSLException -> 0x02c3 }
            r8[r7] = r9     // Catch:{ SSLException -> 0x02c3 }
            int r7 = r3.c     // Catch:{ SSLException -> 0x02c3 }
            int r7 = r7 + r4
            r3.c = r7     // Catch:{ SSLException -> 0x02c3 }
            goto L_0x00ab
        L_0x00ec:
            java.lang.String r7 = new java.lang.String     // Catch:{ SSLException -> 0x02c3 }
            int r1 = r3.d     // Catch:{ SSLException -> 0x02c3 }
            int r9 = r3.e     // Catch:{ SSLException -> 0x02c3 }
            int r9 = r9 - r1
            r7.<init>(r8, r1, r9)     // Catch:{ SSLException -> 0x02c3 }
            goto L_0x023a
        L_0x00f8:
            int r9 = r3.e     // Catch:{ SSLException -> 0x02c3 }
            r3.f = r9     // Catch:{ SSLException -> 0x02c3 }
            int r7 = r7 + 1
            r3.c = r7     // Catch:{ SSLException -> 0x02c3 }
            int r7 = r9 + 1
            r3.e = r7     // Catch:{ SSLException -> 0x02c3 }
            r8[r9] = r1     // Catch:{ SSLException -> 0x02c3 }
        L_0x0106:
            int r7 = r3.c     // Catch:{ SSLException -> 0x02c3 }
            int r8 = r3.b     // Catch:{ SSLException -> 0x02c3 }
            if (r7 >= r8) goto L_0x011f
            char[] r9 = r3.g     // Catch:{ SSLException -> 0x02c3 }
            char r10 = r9[r7]     // Catch:{ SSLException -> 0x02c3 }
            if (r10 != r1) goto L_0x011f
            int r8 = r3.e     // Catch:{ SSLException -> 0x02c3 }
            int r10 = r8 + 1
            r3.e = r10     // Catch:{ SSLException -> 0x02c3 }
            r9[r8] = r1     // Catch:{ SSLException -> 0x02c3 }
            int r7 = r7 + 1
            r3.c = r7     // Catch:{ SSLException -> 0x02c3 }
            goto L_0x0106
        L_0x011f:
            if (r7 != r8) goto L_0x0122
            goto L_0x012c
        L_0x0122:
            char[] r8 = r3.g     // Catch:{ SSLException -> 0x02c3 }
            char r7 = r8[r7]     // Catch:{ SSLException -> 0x02c3 }
            if (r7 == r15) goto L_0x012c
            if (r7 == r6) goto L_0x012c
            if (r7 != r14) goto L_0x00ab
        L_0x012c:
            java.lang.String r7 = new java.lang.String     // Catch:{ SSLException -> 0x02c3 }
            char[] r1 = r3.g     // Catch:{ SSLException -> 0x02c3 }
            int r8 = r3.d     // Catch:{ SSLException -> 0x02c3 }
            int r9 = r3.f     // Catch:{ SSLException -> 0x02c3 }
            int r9 = r9 - r8
            r7.<init>(r1, r8, r9)     // Catch:{ SSLException -> 0x02c3 }
            goto L_0x023a
        L_0x013a:
            int r7 = r8 + 4
            if (r7 < r9) goto L_0x015a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SSLException -> 0x02c3 }
            java.lang.String r1 = r3.a     // Catch:{ SSLException -> 0x02c3 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ SSLException -> 0x02c3 }
            int r2 = r1.length()     // Catch:{ SSLException -> 0x02c3 }
            if (r2 != 0) goto L_0x0152
            java.lang.String r1 = new java.lang.String     // Catch:{ SSLException -> 0x02c3 }
            r1.<init>(r13)     // Catch:{ SSLException -> 0x02c3 }
            goto L_0x0156
        L_0x0152:
            java.lang.String r1 = r13.concat(r1)     // Catch:{ SSLException -> 0x02c3 }
        L_0x0156:
            r0.<init>(r1)     // Catch:{ SSLException -> 0x02c3 }
            throw r0     // Catch:{ SSLException -> 0x02c3 }
        L_0x015a:
            r3.d = r8     // Catch:{ SSLException -> 0x02c3 }
            int r8 = r8 + 1
            r3.c = r8     // Catch:{ SSLException -> 0x02c3 }
        L_0x0160:
            int r7 = r3.c     // Catch:{ SSLException -> 0x02c3 }
            int r8 = r3.b     // Catch:{ SSLException -> 0x02c3 }
            if (r7 == r8) goto L_0x019d
            char[] r8 = r3.g     // Catch:{ SSLException -> 0x02c3 }
            char r9 = r8[r7]     // Catch:{ SSLException -> 0x02c3 }
            if (r9 != r6) goto L_0x016d
            goto L_0x019d
        L_0x016d:
            if (r9 == r15) goto L_0x019d
            if (r9 == r14) goto L_0x019d
            if (r9 != r1) goto L_0x018a
            r3.e = r7     // Catch:{ SSLException -> 0x02c3 }
            int r7 = r7 + 1
            r3.c = r7     // Catch:{ SSLException -> 0x02c3 }
        L_0x0179:
            int r7 = r3.c     // Catch:{ SSLException -> 0x02c3 }
            int r8 = r3.b     // Catch:{ SSLException -> 0x02c3 }
            if (r7 >= r8) goto L_0x019f
            char[] r8 = r3.g     // Catch:{ SSLException -> 0x02c3 }
            char r8 = r8[r7]     // Catch:{ SSLException -> 0x02c3 }
            if (r8 != r1) goto L_0x019f
            int r7 = r7 + 1
            r3.c = r7     // Catch:{ SSLException -> 0x02c3 }
            goto L_0x0179
        L_0x018a:
            r10 = 65
            if (r9 >= r10) goto L_0x018f
        L_0x018e:
            goto L_0x0198
        L_0x018f:
            r10 = 70
            if (r9 > r10) goto L_0x018e
            int r9 = r9 + 32
            char r9 = (char) r9     // Catch:{ SSLException -> 0x02c3 }
            r8[r7] = r9     // Catch:{ SSLException -> 0x02c3 }
        L_0x0198:
            int r7 = r7 + 1
            r3.c = r7     // Catch:{ SSLException -> 0x02c3 }
            goto L_0x0160
        L_0x019d:
            r3.e = r7     // Catch:{ SSLException -> 0x02c3 }
        L_0x019f:
            int r1 = r3.e     // Catch:{ SSLException -> 0x02c3 }
            int r7 = r3.d     // Catch:{ SSLException -> 0x02c3 }
            int r1 = r1 - r7
            r8 = 5
            if (r1 >= r8) goto L_0x01a8
            goto L_0x01cc
        L_0x01a8:
            r8 = r1 & 1
            if (r8 == 0) goto L_0x01cc
            int r8 = r1 >> 1
            byte[] r9 = new byte[r8]     // Catch:{ SSLException -> 0x02c3 }
            int r7 = r7 + 1
            r10 = 0
        L_0x01b3:
            if (r10 < r8) goto L_0x01c0
            java.lang.String r7 = new java.lang.String     // Catch:{ SSLException -> 0x02c3 }
            char[] r8 = r3.g     // Catch:{ SSLException -> 0x02c3 }
            int r9 = r3.d     // Catch:{ SSLException -> 0x02c3 }
            r7.<init>(r8, r9, r1)     // Catch:{ SSLException -> 0x02c3 }
            goto L_0x023a
        L_0x01c0:
            int r11 = r3.a(r7)     // Catch:{ SSLException -> 0x02c3 }
            byte r11 = (byte) r11     // Catch:{ SSLException -> 0x02c3 }
            r9[r10] = r11     // Catch:{ SSLException -> 0x02c3 }
            int r7 = r7 + 2
            int r10 = r10 + 1
            goto L_0x01b3
        L_0x01cc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SSLException -> 0x02c3 }
            java.lang.String r1 = r3.a     // Catch:{ SSLException -> 0x02c3 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ SSLException -> 0x02c3 }
            int r2 = r1.length()     // Catch:{ SSLException -> 0x02c3 }
            if (r2 != 0) goto L_0x01e0
            java.lang.String r1 = new java.lang.String     // Catch:{ SSLException -> 0x02c3 }
            r1.<init>(r13)     // Catch:{ SSLException -> 0x02c3 }
            goto L_0x01e4
        L_0x01e0:
            java.lang.String r1 = r13.concat(r1)     // Catch:{ SSLException -> 0x02c3 }
        L_0x01e4:
            r0.<init>(r1)     // Catch:{ SSLException -> 0x02c3 }
            throw r0     // Catch:{ SSLException -> 0x02c3 }
        L_0x01e8:
            int r8 = r8 + 1
            r3.c = r8     // Catch:{ SSLException -> 0x02c3 }
            r3.d = r8     // Catch:{ SSLException -> 0x02c3 }
            r3.e = r8     // Catch:{ SSLException -> 0x02c3 }
        L_0x01f0:
            int r7 = r3.c     // Catch:{ SSLException -> 0x02c3 }
            int r8 = r3.b     // Catch:{ SSLException -> 0x02c3 }
            if (r7 != r8) goto L_0x0212
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SSLException -> 0x02c3 }
            java.lang.String r1 = r3.a     // Catch:{ SSLException -> 0x02c3 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ SSLException -> 0x02c3 }
            int r2 = r1.length()     // Catch:{ SSLException -> 0x02c3 }
            if (r2 != 0) goto L_0x020a
            java.lang.String r1 = new java.lang.String     // Catch:{ SSLException -> 0x02c3 }
            r1.<init>(r13)     // Catch:{ SSLException -> 0x02c3 }
            goto L_0x020e
        L_0x020a:
            java.lang.String r1 = r13.concat(r1)     // Catch:{ SSLException -> 0x02c3 }
        L_0x020e:
            r0.<init>(r1)     // Catch:{ SSLException -> 0x02c3 }
            throw r0     // Catch:{ SSLException -> 0x02c3 }
        L_0x0212:
            char[] r8 = r3.g     // Catch:{ SSLException -> 0x02c3 }
            char r9 = r8[r7]     // Catch:{ SSLException -> 0x02c3 }
            if (r9 != r12) goto L_0x029c
            int r7 = r7 + 1
            r3.c = r7     // Catch:{ SSLException -> 0x02c3 }
        L_0x021c:
            int r7 = r3.c     // Catch:{ SSLException -> 0x02c3 }
            int r8 = r3.b     // Catch:{ SSLException -> 0x02c3 }
            if (r7 < r8) goto L_0x0223
            goto L_0x022e
        L_0x0223:
            char[] r8 = r3.g     // Catch:{ SSLException -> 0x02c3 }
            char r8 = r8[r7]     // Catch:{ SSLException -> 0x02c3 }
            if (r8 != r1) goto L_0x022e
            int r7 = r7 + 1
            r3.c = r7     // Catch:{ SSLException -> 0x02c3 }
            goto L_0x021c
        L_0x022e:
            java.lang.String r7 = new java.lang.String     // Catch:{ SSLException -> 0x02c3 }
            char[] r1 = r3.g     // Catch:{ SSLException -> 0x02c3 }
            int r8 = r3.d     // Catch:{ SSLException -> 0x02c3 }
            int r9 = r3.e     // Catch:{ SSLException -> 0x02c3 }
            int r9 = r9 - r8
            r7.<init>(r1, r8, r9)     // Catch:{ SSLException -> 0x02c3 }
        L_0x023a:
            boolean r1 = r2.equalsIgnoreCase(r5)     // Catch:{ SSLException -> 0x02c3 }
            if (r1 != 0) goto L_0x029a
            int r1 = r3.c     // Catch:{ SSLException -> 0x02c3 }
            int r5 = r3.b     // Catch:{ SSLException -> 0x02c3 }
            if (r1 >= r5) goto L_0x0298
            char[] r5 = r3.g     // Catch:{ SSLException -> 0x02c3 }
            char r5 = r5[r1]     // Catch:{ SSLException -> 0x02c3 }
            java.lang.String r7 = "Malformed DN: "
            if (r5 != r15) goto L_0x024f
            goto L_0x026f
        L_0x024f:
            if (r5 == r14) goto L_0x026f
            if (r5 == r6) goto L_0x026f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SSLException -> 0x02c3 }
            java.lang.String r1 = r3.a     // Catch:{ SSLException -> 0x02c3 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ SSLException -> 0x02c3 }
            int r2 = r1.length()     // Catch:{ SSLException -> 0x02c3 }
            if (r2 != 0) goto L_0x0267
            java.lang.String r1 = new java.lang.String     // Catch:{ SSLException -> 0x02c3 }
            r1.<init>(r7)     // Catch:{ SSLException -> 0x02c3 }
            goto L_0x026b
        L_0x0267:
            java.lang.String r1 = r7.concat(r1)     // Catch:{ SSLException -> 0x02c3 }
        L_0x026b:
            r0.<init>(r1)     // Catch:{ SSLException -> 0x02c3 }
            throw r0     // Catch:{ SSLException -> 0x02c3 }
        L_0x026f:
            int r1 = r1 + 1
            r3.c = r1     // Catch:{ SSLException -> 0x02c3 }
            java.lang.String r5 = r3.a()     // Catch:{ SSLException -> 0x02c3 }
            if (r5 != 0) goto L_0x0295
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SSLException -> 0x02c3 }
            java.lang.String r1 = r3.a     // Catch:{ SSLException -> 0x02c3 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ SSLException -> 0x02c3 }
            int r2 = r1.length()     // Catch:{ SSLException -> 0x02c3 }
            if (r2 != 0) goto L_0x028d
            java.lang.String r1 = new java.lang.String     // Catch:{ SSLException -> 0x02c3 }
            r1.<init>(r7)     // Catch:{ SSLException -> 0x02c3 }
            goto L_0x0291
        L_0x028d:
            java.lang.String r1 = r7.concat(r1)     // Catch:{ SSLException -> 0x02c3 }
        L_0x0291:
            r0.<init>(r1)     // Catch:{ SSLException -> 0x02c3 }
            throw r0     // Catch:{ SSLException -> 0x02c3 }
        L_0x0295:
            r1 = 0
            goto L_0x0081
        L_0x0298:
            r6 = 0
            goto L_0x02b8
        L_0x029a:
            r6 = r7
            goto L_0x02b8
        L_0x029c:
            if (r9 != r11) goto L_0x02a7
            int r7 = r3.e     // Catch:{ SSLException -> 0x02c3 }
            char r9 = r3.b()     // Catch:{ SSLException -> 0x02c3 }
            r8[r7] = r9     // Catch:{ SSLException -> 0x02c3 }
            goto L_0x02ab
        L_0x02a7:
            int r7 = r3.e     // Catch:{ SSLException -> 0x02c3 }
            r8[r7] = r9     // Catch:{ SSLException -> 0x02c3 }
        L_0x02ab:
            int r7 = r3.c     // Catch:{ SSLException -> 0x02c3 }
            int r7 = r7 + r4
            r3.c = r7     // Catch:{ SSLException -> 0x02c3 }
            int r7 = r3.e     // Catch:{ SSLException -> 0x02c3 }
            int r7 = r7 + r4
            r3.e = r7     // Catch:{ SSLException -> 0x02c3 }
            goto L_0x01f0
        L_0x02b7:
            r6 = 0
        L_0x02b8:
            if (r6 == 0) goto L_0x02bf
            boolean r1 = a((java.lang.String) r0, (java.lang.String) r6)     // Catch:{ SSLException -> 0x02c3 }
            goto L_0x02c2
        L_0x02bf:
            r1 = 0
            goto L_0x02c2
        L_0x02c1:
            r1 = 0
        L_0x02c2:
            return r1
        L_0x02c3:
            r0 = move-exception
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.banl.verify(java.lang.String, javax.net.ssl.SSLSession):boolean");
    }

    private static final boolean a(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                StringBuilder sb = new StringBuilder(str.length() + 1);
                sb.append(str);
                sb.append('.');
                str = sb.toString();
            }
            if (!str2.endsWith(".")) {
                StringBuilder sb2 = new StringBuilder(str2.length() + 1);
                sb2.append(str2);
                sb2.append('.');
                str2 = sb2.toString();
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (lowerCase.startsWith("*.") && lowerCase.indexOf(42, 1) == -1 && str.length() >= lowerCase.length() && !"*.".equals(lowerCase)) {
                String substring = lowerCase.substring(1);
                if (str.endsWith(substring)) {
                    int length = str.length() - substring.length();
                    if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }
}
