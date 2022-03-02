package defpackage;

import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;

/* renamed from: udl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class udl {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.String r6) {
        /*
            int r0 = r6.hashCode()
            r1 = -1724415528(0xffffffff993781d8, float:-9.4871E-24)
            r2 = 0
            r3 = 2
            r4 = -1
            r5 = 1
            if (r0 == r1) goto L_0x002c
            r1 = -618582347(0xffffffffdb212eb5, float:-4.5368826E16)
            if (r0 == r1) goto L_0x0022
            r1 = -292229199(0xffffffffee94efb1, float:-2.3046775E28)
            if (r0 == r1) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r0 = "DEVICES_REBRANDED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0022:
            java.lang.String r0 = "DEVICES_WITHIN_REACH_REBRANDED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x002c:
            java.lang.String r0 = "DEVICES_WITH_YOUR_ACCOUNT"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x0050
            if (r0 == r5) goto L_0x004f
            if (r0 != r3) goto L_0x003f
            r6 = -2
            return r6
        L_0x003f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r2] = r6
            java.lang.String r6 = "Unexpected channel %s: unknown priority"
            java.lang.String r6 = java.lang.String.format(r6, r1)
            r0.<init>(r6)
            throw r0
        L_0x004f:
            return r4
        L_0x0050:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udl.a(java.lang.String):int");
    }

    public static boolean a() {
        return aymq.a.a().y() && Build.VERSION.SDK_INT >= 26;
    }

    static boolean a(Context context, String str) {
        NotificationChannel a = ((thb) thl.a(context, thb.class)).a(str);
        return (a == null || a.getImportance() == 0 || a.getImportance() == -1000) ? false : true;
    }
}
