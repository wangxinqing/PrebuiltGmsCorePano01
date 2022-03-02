package defpackage;

import android.text.TextUtils;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: btq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class btq {
    public static int a(bsz bsz) {
        if (bsz.b() || cbi.B().a(bsz)) {
            return 1;
        }
        new Object[1][0] = bsz;
        return 2;
    }

    public static int b(bsz bsz) {
        if (!bsz.b() && !cbi.B().a(bsz)) {
            new Object[1][0] = bsz;
            if (!cbi.B().b(bsz)) {
                new Object[1][0] = bsz;
                return 2;
            }
        }
        return 1;
    }

    public static int c(bsz bsz) {
        if (bsz.b() || cbi.B().b(bsz)) {
            return 1;
        }
        new Object[1][0] = bsz;
        return 2;
    }

    public static int a(String str, ContextManagerClientInfo contextManagerClientInfo, boolean z) {
        String str2;
        int i;
        String str3 = contextManagerClientInfo.b;
        if (contextManagerClientInfo.c() && !TextUtils.isEmpty(contextManagerClientInfo.g)) {
            str3 = contextManagerClientInfo.g;
        }
        if ("android.permission.PACKAGE_USAGE_STATS".equals(str)) {
            return cbi.l().a.d("android:get_usage_stats", contextManagerClientInfo.c, contextManagerClientInfo.b) == 0 ? 1 : 2;
        }
        if (cbi.f().getPackageManager().checkPermission(str, str3) != 0) {
            return 2;
        }
        bti l = cbi.l();
        if (str.equals("com.google.android.gms.permission.ACTIVITY_RECOGNITION") && jkr.h()) {
            str2 = "android:activity_recognition";
        } else {
            str2 = l.a.a(str);
        }
        if (str2 != null) {
            int i2 = contextManagerClientInfo.c;
            String str4 = contextManagerClientInfo.b;
            if (contextManagerClientInfo.c() && !TextUtils.isEmpty(contextManagerClientInfo.g)) {
                i2 = contextManagerClientInfo.i;
                str4 = contextManagerClientInfo.g;
            }
            if (!str2.equals("android:fine_location") || !jkr.g() || !awwt.b()) {
                i = l.a.d(str2, i2, str4);
            } else {
                i = !z ? l.a.e(str2, i2, str4) : l.a.c(str2, i2, str4);
            }
        } else {
            i = 0;
        }
        if (i == 0) {
            return 1;
        }
        if (i != 4) {
            return 2;
        }
        return 6;
    }
}
