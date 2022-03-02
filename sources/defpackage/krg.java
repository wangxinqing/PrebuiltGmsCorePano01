package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Set;

/* renamed from: krg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class krg {
    public static final Set a = new ob();
    private final krf b = new krf(axeb.a.a().d(), axeb.a.a().k(), true, false, true);
    private final krf c = new krf(axeb.a.a().a(), axeb.a.a().i(), true, true, true);
    private final krf d = new krf(axeb.a.a().b(), axeb.a.a().j(), false, false, false);
    private final krf e = new krf(axeb.a.a().f(), axeb.a.a().m(), false, false, true);
    private final krf f = new krf(axeb.a.a().e(), axeb.a.a().l(), true, true, false);

    public static String a(String str, Context context) {
        try {
            return jni.b(context).b(str).toString();
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.krf a(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -543674259: goto L_0x0034;
                case 1111774: goto L_0x002a;
                case 40819247: goto L_0x0020;
                case 578428293: goto L_0x0016;
                case 1515161932: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x003e
        L_0x000c:
            java.lang.String r0 = "com.google.android.keep"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003e
            r6 = 4
            goto L_0x003f
        L_0x0016:
            java.lang.String r0 = "com.google.android.calendar"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003e
            r6 = 1
            goto L_0x003f
        L_0x0020:
            java.lang.String r0 = "com.google.android.apps.plus"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003e
            r6 = 3
            goto L_0x003f
        L_0x002a:
            java.lang.String r0 = "com.google.android.apps.classroom"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003e
            r6 = 2
            goto L_0x003f
        L_0x0034:
            java.lang.String r0 = "com.google.android.gm"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003e
            r6 = 0
            goto L_0x003f
        L_0x003e:
            r6 = -1
        L_0x003f:
            if (r6 == 0) goto L_0x0057
            if (r6 == r4) goto L_0x0054
            if (r6 == r3) goto L_0x0051
            if (r6 == r2) goto L_0x004e
            if (r6 == r1) goto L_0x004b
            r6 = 0
            return r6
        L_0x004b:
            krf r6 = r5.f
            return r6
        L_0x004e:
            krf r6 = r5.e
            return r6
        L_0x0051:
            krf r6 = r5.d
            return r6
        L_0x0054:
            krf r6 = r5.c
            return r6
        L_0x0057:
            krf r6 = r5.b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.krg.a(java.lang.String):krf");
    }
}
