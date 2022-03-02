package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* renamed from: cpx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cpx {
    final String a;
    final String b;
    final String c;
    final long d;
    final String e;
    final boolean f;
    Integer g;
    Uri h;
    Long i;
    Integer j;
    Uri k;
    Long l;
    Integer m;
    String n;
    String o;
    String p;
    final int q;
    Long r;
    int s;
    Uri t;
    boolean u;
    String v;
    String w;

    public cpx(String str, String str2, Uri uri, long j2, String str3, int i2, boolean z, int i3) {
        this(str, str2, uri.toString(), j2, str3, i2, z, Integer.valueOf(i3));
        this.t = uri;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = r0.split("@", -1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.cpx a(java.lang.String r31) {
        /*
            r0 = r31
            java.lang.String r1 = "null"
            if (r0 == 0) goto L_0x0164
            r3 = -1
            java.lang.String r4 = "@"
            java.lang.String[] r3 = r0.split(r4, r3)
            int r0 = r3.length
            r4 = 16
            if (r0 < r4) goto L_0x0162
            r5 = 0
            r6 = r3[r5]     // Catch:{ NumberFormatException -> 0x015f }
            boolean r6 = r6.equals(r1)     // Catch:{ NumberFormatException -> 0x015f }
            if (r6 != 0) goto L_0x0022
            r6 = r3[r5]     // Catch:{ NumberFormatException -> 0x015f }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ NumberFormatException -> 0x015f }
            goto L_0x0023
        L_0x0022:
            r6 = 0
        L_0x0023:
            r7 = 1
            r9 = r3[r7]     // Catch:{ NumberFormatException -> 0x015f }
            r7 = 2
            r11 = r3[r7]     // Catch:{ NumberFormatException -> 0x015f }
            r7 = 3
            r10 = r3[r7]     // Catch:{ NumberFormatException -> 0x015f }
            r7 = 4
            r7 = r3[r7]     // Catch:{ NumberFormatException -> 0x015f }
            long r12 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x015f }
            r7 = 5
            r14 = r3[r7]     // Catch:{ NumberFormatException -> 0x015f }
            r7 = 6
            r7 = r3[r7]     // Catch:{ NumberFormatException -> 0x015f }
            int r15 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x015f }
            r7 = 7
            r7 = r3[r7]     // Catch:{ NumberFormatException -> 0x015f }
            boolean r16 = java.lang.Boolean.parseBoolean(r7)     // Catch:{ NumberFormatException -> 0x015f }
            r7 = 8
            r8 = r3[r7]     // Catch:{ NumberFormatException -> 0x015f }
            boolean r8 = r8.equals(r1)     // Catch:{ NumberFormatException -> 0x015f }
            if (r8 != 0) goto L_0x0071
            r7 = r3[r7]     // Catch:{ NumberFormatException -> 0x015f }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ NumberFormatException -> 0x015f }
            r8 = 9
            r8 = r3[r8]     // Catch:{ NumberFormatException -> 0x015f }
            long r17 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x015f }
            java.lang.Long r8 = java.lang.Long.valueOf(r17)     // Catch:{ NumberFormatException -> 0x015f }
            r17 = 10
            r17 = r3[r17]     // Catch:{ NumberFormatException -> 0x015f }
            int r17 = java.lang.Integer.parseInt(r17)     // Catch:{ NumberFormatException -> 0x015f }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)     // Catch:{ NumberFormatException -> 0x015f }
            r18 = r8
            r19 = r17
            goto L_0x0076
        L_0x0071:
            r7 = 0
            r18 = 0
            r19 = 0
        L_0x0076:
            r8 = 11
            r5 = r3[r8]     // Catch:{ NumberFormatException -> 0x015f }
            boolean r5 = r5.equals(r1)     // Catch:{ NumberFormatException -> 0x015f }
            r2 = 18
            r4 = 17
            if (r5 != 0) goto L_0x00d5
            r5 = r3[r8]     // Catch:{ NumberFormatException -> 0x015f }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ NumberFormatException -> 0x015f }
            r8 = 12
            r8 = r3[r8]     // Catch:{ NumberFormatException -> 0x015f }
            long r20 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x015f }
            java.lang.Long r8 = java.lang.Long.valueOf(r20)     // Catch:{ NumberFormatException -> 0x015f }
            r20 = 13
            r20 = r3[r20]     // Catch:{ NumberFormatException -> 0x015f }
            int r20 = java.lang.Integer.parseInt(r20)     // Catch:{ NumberFormatException -> 0x015f }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r20)     // Catch:{ NumberFormatException -> 0x015f }
            r21 = 14
            r21 = r3[r21]     // Catch:{ NumberFormatException -> 0x015f }
            r22 = 15
            r22 = r3[r22]     // Catch:{ NumberFormatException -> 0x015f }
            if (r0 >= r2) goto L_0x00b6
            r24 = r5
            r2 = r8
            r28 = r21
            r29 = r22
            r30 = 0
            goto L_0x00e0
        L_0x00b6:
            r2 = r3[r4]     // Catch:{ NumberFormatException -> 0x015f }
            boolean r2 = r2.equals(r1)     // Catch:{ NumberFormatException -> 0x015f }
            if (r2 == 0) goto L_0x00c9
            r24 = r5
            r2 = r8
            r28 = r21
            r29 = r22
            r30 = 0
            goto L_0x00e0
        L_0x00c9:
            r2 = r3[r4]     // Catch:{ NumberFormatException -> 0x015f }
            r30 = r2
            r24 = r5
            r2 = r8
            r28 = r21
            r29 = r22
            goto L_0x00e0
        L_0x00d5:
            r2 = 0
            r20 = 0
            r24 = 0
            r28 = 0
            r29 = 0
            r30 = 0
        L_0x00e0:
            if (r0 < r4) goto L_0x00f2
            r0 = 16
            r0 = r3[r0]     // Catch:{ NumberFormatException -> 0x00ef }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00ef }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ef }
            goto L_0x00f3
        L_0x00ef:
            r0 = move-exception
            r0 = 0
            goto L_0x00f3
        L_0x00f2:
            r0 = 0
        L_0x00f3:
            int r4 = r3.length     // Catch:{ NumberFormatException -> 0x015f }
            r5 = 21
            if (r4 < r5) goto L_0x012e
            r4 = 18
            r4 = r3[r4]     // Catch:{ NumberFormatException -> 0x015f }
            boolean r5 = java.lang.Boolean.parseBoolean(r4)     // Catch:{ NumberFormatException -> 0x015f }
            r4 = 19
            r8 = r3[r4]     // Catch:{ NumberFormatException -> 0x015f }
            boolean r8 = r8.equals(r1)     // Catch:{ NumberFormatException -> 0x015f }
            if (r8 != 0) goto L_0x0111
            r4 = r3[r4]     // Catch:{ NumberFormatException -> 0x015f }
            java.lang.String r4 = c(r4)     // Catch:{ NumberFormatException -> 0x015f }
            goto L_0x0112
        L_0x0111:
            r4 = 0
        L_0x0112:
            r8 = 20
            r31 = r4
            r4 = r3[r8]     // Catch:{ NumberFormatException -> 0x015f }
            boolean r1 = r4.equals(r1)     // Catch:{ NumberFormatException -> 0x015f }
            if (r1 != 0) goto L_0x0127
            r1 = r3[r8]     // Catch:{ NumberFormatException -> 0x015f }
            java.lang.String r1 = c(r1)     // Catch:{ NumberFormatException -> 0x015f }
            r17 = r1
            goto L_0x0129
        L_0x0127:
            r17 = 0
        L_0x0129:
            r1 = r31
            r3 = r17
            goto L_0x0131
        L_0x012e:
            r1 = 0
            r3 = 0
            r5 = 0
        L_0x0131:
            cpx r4 = new cpx
            r8 = r4
            r17 = r0
            r8.<init>((java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (long) r12, (java.lang.String) r14, (int) r15, (boolean) r16, (java.lang.Integer) r17)
            if (r7 == 0) goto L_0x0146
            long r8 = r18.longValue()
            int r0 = r19.intValue()
            r4.a(r7, r8, r0)
        L_0x0146:
            if (r24 != 0) goto L_0x0149
            goto L_0x0156
        L_0x0149:
            long r25 = r2.longValue()
            int r27 = r20.intValue()
            r23 = r4
            r23.a(r24, r25, r27, r28, r29, r30)
        L_0x0156:
            r4.u = r5
            r4.v = r1
            r4.w = r3
            r4.r = r6
            return r4
        L_0x015f:
            r0 = move-exception
            r1 = 0
            return r1
        L_0x0162:
            r1 = 0
            return r1
        L_0x0164:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpx.a(java.lang.String):cpx");
    }

    static String b(String str) {
        try {
            return Base64.encodeToString(str.getBytes("UTF-8"), 11);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    static String c(String str) {
        try {
            return new String(Base64.decode(str, 11), "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final void a() {
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final void b() {
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }

    public final String d() {
        return a(this.a, this.b);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        Uri uri = this.h;
        if (uri != null) {
            String valueOf = String.valueOf(uri);
            String valueOf2 = String.valueOf(this.i);
            String valueOf3 = String.valueOf(this.j);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
            sb.append(valueOf);
            sb.append("@");
            sb.append(valueOf2);
            sb.append("@");
            sb.append(valueOf3);
            str = sb.toString();
        } else {
            str = "null@null@null";
        }
        Uri uri2 = this.k;
        if (uri2 != null) {
            String valueOf4 = String.valueOf(uri2);
            String valueOf5 = String.valueOf(this.l);
            String valueOf6 = String.valueOf(this.m);
            String str4 = this.n;
            String str5 = this.o;
            int length = String.valueOf(valueOf4).length();
            int length2 = String.valueOf(valueOf5).length();
            StringBuilder sb2 = new StringBuilder(length + 4 + length2 + String.valueOf(valueOf6).length() + String.valueOf(str4).length() + String.valueOf(str5).length());
            sb2.append(valueOf4);
            sb2.append("@");
            sb2.append(valueOf5);
            sb2.append("@");
            sb2.append(valueOf6);
            sb2.append("@");
            sb2.append(str4);
            sb2.append("@");
            sb2.append(str5);
            str2 = sb2.toString();
        } else {
            str2 = "null@null@null@null@null";
        }
        String valueOf7 = String.valueOf(this.r);
        String str6 = this.a;
        String str7 = this.c;
        String str8 = this.b;
        long j2 = this.d;
        String str9 = this.e;
        int i2 = this.q;
        boolean z = this.f;
        Integer num = this.g;
        if (num == null) {
            num = "null";
        }
        String valueOf8 = String.valueOf(num);
        String str10 = this.p;
        if (str10 == null) {
            str10 = "null";
        }
        String str11 = "null";
        boolean z2 = this.u;
        String str12 = this.v;
        if (str12 != null) {
            str3 = b(str12);
        } else {
            str3 = str11;
        }
        boolean z3 = z;
        String str13 = this.w;
        String b2 = str13 != null ? b(str13) : str11;
        int length3 = String.valueOf(valueOf7).length();
        int length4 = String.valueOf(str6).length();
        int length5 = String.valueOf(str7).length();
        int length6 = String.valueOf(str8).length();
        int length7 = String.valueOf(str9).length();
        int length8 = String.valueOf(str).length();
        int length9 = String.valueOf(str2).length();
        int length10 = String.valueOf(valueOf8).length();
        StringBuilder sb3 = new StringBuilder(length3 + 56 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + str10.length() + String.valueOf(str3).length() + String.valueOf(b2).length());
        sb3.append(valueOf7);
        sb3.append("@");
        sb3.append(str6);
        sb3.append("@");
        sb3.append(str7);
        sb3.append("@");
        sb3.append(str8);
        sb3.append("@");
        sb3.append(j2);
        sb3.append("@");
        sb3.append(str9);
        sb3.append("@");
        sb3.append(i2);
        sb3.append("@");
        sb3.append(z3);
        sb3.append("@");
        sb3.append(str);
        sb3.append("@");
        sb3.append(str2);
        sb3.append("@");
        sb3.append(valueOf8);
        sb3.append("@");
        sb3.append(str10);
        sb3.append("@");
        sb3.append(z2);
        sb3.append("@");
        sb3.append(str3);
        sb3.append("@");
        sb3.append(b2);
        sb3.append("@");
        return sb3.toString();
    }

    public final String c() {
        Long l2 = this.r;
        if (l2 == null) {
            return a(this.a, this.b);
        }
        return Long.toString(l2.longValue());
    }

    private cpx(String str, String str2, String str3, long j2, String str4, int i2, boolean z, Integer num) {
        this.r = null;
        this.s = 0;
        this.u = false;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j2;
        this.e = str4;
        this.q = i2;
        this.f = z;
        this.g = num;
        a();
        b();
    }

    static String a(String str, String str2) {
        return "_" + str + ":" + str2;
    }

    public final void a(Uri uri, long j2, int i2) {
        this.h = uri;
        this.i = Long.valueOf(j2);
        this.j = Integer.valueOf(i2);
    }

    public final void a(Uri uri, long j2, int i2, String str, String str2, String str3) {
        this.k = uri;
        this.l = Long.valueOf(j2);
        this.m = Integer.valueOf(i2);
        this.n = str;
        this.o = str2;
        this.p = str3;
    }
}
