package defpackage;

import android.text.TextUtils;

/* renamed from: iwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iwp {
    static final boolean a(String str) {
        String a = axaf.a.a().a();
        if (!TextUtils.isEmpty(a)) {
            for (String trim : a.split(",")) {
                if (trim.trim().equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }
}
