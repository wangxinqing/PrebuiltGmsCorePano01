package defpackage;

import java.util.Arrays;

/* renamed from: aklr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aklr {
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final int e;
    public final long f;
    public final float g;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aklr(int r2, int r3, int r4, float r5, java.lang.String r6, long r7, float r9) {
        /*
            r1 = this;
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r2 = r6.toLowerCase(r2)
            int r3 = r2.hashCode()
            r4 = 0
            r5 = 3
            r6 = 2
            r0 = 1
            switch(r3) {
                case -1364081155: goto L_0x003b;
                case 102570: goto L_0x0031;
                case 3049826: goto L_0x0027;
                case 3649301: goto L_0x001d;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0045
        L_0x001d:
            java.lang.String r3 = "wifi"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x001c
            r2 = 3
            goto L_0x0046
        L_0x0027:
            java.lang.String r3 = "cell"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x001c
            r2 = 1
            goto L_0x0046
        L_0x0031:
            java.lang.String r3 = "gps"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x001c
            r2 = 0
            goto L_0x0046
        L_0x003b:
            java.lang.String r3 = "cellid"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x001c
            r2 = 2
            goto L_0x0046
        L_0x0045:
            r2 = -1
        L_0x0046:
            if (r2 == 0) goto L_0x0053
            if (r2 == r0) goto L_0x0051
            if (r2 == r6) goto L_0x0051
            if (r2 == r5) goto L_0x004f
            goto L_0x0054
        L_0x004f:
            r4 = 3
            goto L_0x0054
        L_0x0051:
            r4 = 2
            goto L_0x0054
        L_0x0053:
            r4 = 1
        L_0x0054:
            r1.e = r4
            r1.f = r7
            r1.g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aklr.<init>(int, int, int, float, java.lang.String, long, float):void");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aklr)) {
            return false;
        }
        aklr aklr = (aklr) obj;
        return this.a == aklr.a && this.b == aklr.b && this.c == aklr.c && ((Float.isNaN(this.d) && Float.isNaN(aklr.d)) ? true : (this.d > aklr.d ? 1 : (this.d == aklr.d ? 0 : -1)) == 0) && this.e == aklr.e && this.f == aklr.f && this.g == aklr.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.f)});
    }

    public final String toString() {
        String str;
        String str2;
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        String str3 = "";
        if (i3 != 0) {
            StringBuilder sb = new StringBuilder(24);
            sb.append(", accuracyMm=");
            sb.append(i3);
            str = sb.toString();
        } else {
            str = str3;
        }
        if (!Float.isNaN(this.d)) {
            float f2 = this.d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(", altitudeMeters=");
            sb2.append(f2);
            str2 = sb2.toString();
        } else {
            str2 = str3;
        }
        int i4 = this.e;
        long j = this.f;
        float f3 = this.g;
        if (f3 != -1.0f) {
            StringBuilder sb3 = new StringBuilder(38);
            sb3.append(", speedMetersPerSecond=");
            sb3.append(f3);
            str3 = sb3.toString();
        }
        int length = String.valueOf(str).length();
        StringBuilder sb4 = new StringBuilder(length + 113 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb4.append("Position [latE7=");
        sb4.append(i);
        sb4.append(", lngE7=");
        sb4.append(i2);
        sb4.append(str);
        sb4.append(str2);
        sb4.append(", source=");
        sb4.append(i4);
        sb4.append(", positionTimestampMillis=");
        sb4.append(j);
        sb4.append(str3);
        sb4.append("]");
        return sb4.toString();
    }
}
