package defpackage;

import android.widget.FrameLayout;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: aljh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aljh {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.content.Context r4) {
        /*
            alhb r0 = defpackage.alhb.a(r4)
            alha r1 = defpackage.alha.CONFIG_LAYOUT_GRAVITY
            java.lang.String r4 = r0.c(r4, r1)
            r0 = 0
            if (r4 == 0) goto L_0x0044
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r1)
            int r1 = r4.hashCode()
            r2 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            r3 = 1
            if (r1 == r2) goto L_0x002d
            r2 = 109757538(0x68ac462, float:5.219839E-35)
            if (r1 == r2) goto L_0x0023
        L_0x0022:
            goto L_0x0037
        L_0x0023:
            java.lang.String r1 = "start"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0022
            r4 = 1
            goto L_0x0038
        L_0x002d:
            java.lang.String r1 = "center"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0022
            r4 = 0
            goto L_0x0038
        L_0x0037:
            r4 = -1
        L_0x0038:
            if (r4 == 0) goto L_0x0041
            if (r4 == r3) goto L_0x003d
            return r0
        L_0x003d:
            r4 = 8388611(0x800003, float:1.1754948E-38)
            return r4
        L_0x0041:
            r4 = 17
            return r4
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aljh.a(android.content.Context):int");
    }

    public static boolean a(FrameLayout frameLayout) {
        if (!(frameLayout instanceof GlifLayout) || !((GlifLayout) frameLayout).g) {
            return false;
        }
        return true;
    }
}
