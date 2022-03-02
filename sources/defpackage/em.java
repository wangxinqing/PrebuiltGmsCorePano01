package defpackage;

import java.util.Locale;

/* renamed from: em  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class em {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    public final int e;
    public final String f;
    private final int g;

    public em(String str, String str2, boolean z, int i, String str3, int i2) {
        this.a = str;
        this.b = str2;
        this.d = z;
        this.e = i;
        int i3 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i3 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i3 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.c = i3;
        this.f = str3;
        this.g = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        r1 = r5.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 == r6) goto L_0x0070
            boolean r1 = r6 instanceof defpackage.em
            r2 = 0
            if (r1 == 0) goto L_0x006f
            em r6 = (defpackage.em) r6
            int r1 = android.os.Build.VERSION.SDK_INT
            int r1 = r5.e
            int r3 = r6.e
            if (r1 != r3) goto L_0x006f
            java.lang.String r1 = r5.a
            java.lang.String r3 = r6.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006f
            boolean r1 = r5.d
            boolean r3 = r6.d
            if (r1 != r3) goto L_0x006f
            int r1 = r5.g
            r3 = 2
            if (r1 != r0) goto L_0x0039
            int r1 = r6.g
            if (r1 != r3) goto L_0x0039
            java.lang.String r1 = r5.f
            if (r1 == 0) goto L_0x0039
            java.lang.String r4 = r6.f
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            return r2
        L_0x0039:
            int r1 = r5.g
            if (r1 == r3) goto L_0x003e
            goto L_0x004f
        L_0x003e:
            int r1 = r6.g
            if (r1 != r0) goto L_0x004f
            java.lang.String r1 = r6.f
            if (r1 == 0) goto L_0x004f
            java.lang.String r3 = r5.f
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x004f
            return r2
        L_0x004f:
            int r1 = r5.g
            int r3 = r6.g
            if (r1 != r3) goto L_0x0067
            java.lang.String r1 = r5.f
            if (r1 == 0) goto L_0x0062
            java.lang.String r3 = r6.f
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0066
            goto L_0x0067
        L_0x0062:
            java.lang.String r1 = r6.f
            if (r1 == 0) goto L_0x0067
        L_0x0066:
            return r2
        L_0x0067:
            int r1 = r5.c
            int r6 = r6.c
            if (r1 != r6) goto L_0x006e
            return r0
        L_0x006e:
            return r2
        L_0x006f:
            return r2
        L_0x0070:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.em.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.c) * 31) + (!this.d ? 1237 : 1231)) * 31) + this.e;
    }

    public final String toString() {
        return "Column{name='" + this.a + "', type='" + this.b + "', affinity='" + this.c + "', notNull=" + this.d + ", primaryKeyPosition=" + this.e + ", defaultValue='" + this.f + "'}";
    }
}
