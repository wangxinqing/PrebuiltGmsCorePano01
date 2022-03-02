package defpackage;

import android.util.Log;

/* renamed from: atfx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atfx {
    private static final int a;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    static {
        /*
            atgc r0 = defpackage.atgc.a
            java.lang.String r1 = "debug.mapview.logs"
            java.lang.String r2 = "NOTHING"
            java.lang.String r0 = r0.a(r1, r2)
            java.lang.String r0 = r0.toUpperCase()
            int r1 = r0.hashCode()
            r3 = 2
            r4 = 6
            r5 = 3
            r6 = 5
            r7 = 4
            r8 = 1
            r9 = 7
            r10 = 0
            switch(r1) {
                case -1938386595: goto L_0x0062;
                case -1447660627: goto L_0x005a;
                case 64897: goto L_0x0050;
                case 2251950: goto L_0x0046;
                case 2656902: goto L_0x003c;
                case 64921139: goto L_0x0032;
                case 66247144: goto L_0x0028;
                case 1069090146: goto L_0x001e;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x006c
        L_0x001e:
            java.lang.String r1 = "VERBOSE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001d
            r0 = 2
            goto L_0x006d
        L_0x0028:
            java.lang.String r1 = "ERROR"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001d
            r0 = 6
            goto L_0x006d
        L_0x0032:
            java.lang.String r1 = "DEBUG"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001d
            r0 = 3
            goto L_0x006d
        L_0x003c:
            java.lang.String r1 = "WARN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001d
            r0 = 5
            goto L_0x006d
        L_0x0046:
            java.lang.String r1 = "INFO"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001d
            r0 = 4
            goto L_0x006d
        L_0x0050:
            java.lang.String r1 = "ALL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001d
            r0 = 0
            goto L_0x006d
        L_0x005a:
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x001d
            r0 = 1
            goto L_0x006d
        L_0x0062:
            java.lang.String r1 = "PERTAG"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001d
            r0 = 7
            goto L_0x006d
        L_0x006c:
            r0 = -1
        L_0x006d:
            switch(r0) {
                case 0: goto L_0x007d;
                case 1: goto L_0x007b;
                case 2: goto L_0x007e;
                case 3: goto L_0x0079;
                case 4: goto L_0x0077;
                case 5: goto L_0x0075;
                case 6: goto L_0x0073;
                case 7: goto L_0x0071;
                default: goto L_0x0070;
            }
        L_0x0070:
            goto L_0x007b
        L_0x0071:
            r3 = 7
            goto L_0x007e
        L_0x0073:
            r3 = 6
            goto L_0x007e
        L_0x0075:
            r3 = 5
            goto L_0x007e
        L_0x0077:
            r3 = 4
            goto L_0x007e
        L_0x0079:
            r3 = 3
            goto L_0x007e
        L_0x007b:
            r3 = 0
            goto L_0x007e
        L_0x007d:
            r3 = 1
        L_0x007e:
            a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atfx.<clinit>():void");
    }

    public static final boolean a(String str, int i) {
        switch (a) {
            case 0:
                return false;
            case 1:
            case 2:
            case 3:
                return true;
            case 4:
                return i >= 4;
            case 5:
                return i >= 5;
            case 6:
                return i >= 6;
            default:
                return Log.isLoggable(str, i);
        }
    }
}
