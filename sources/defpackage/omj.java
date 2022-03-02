package defpackage;

import android.text.TextUtils;

/* renamed from: omj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class omj {
    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder("context:");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(":query:");
            sb.append(str2);
        }
        return sb.toString();
    }
}
