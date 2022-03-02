package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: yxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yxh {
    private static yxh a;

    private yxh() {
    }

    public static void a() {
        synchronized (yxh.class) {
            if (a == null) {
                a = new yxh();
            }
        }
    }

    public static final void a(HashMap hashMap, String str, boolean z, boolean z2) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        if (z) {
            str2 = "9";
        } else {
            str2 = !z2 ? "2" : "3";
        }
        StringBuilder sb = new StringBuilder();
        String str3 = (String) hashMap.get("X-Api-Client");
        if (str3 != null && str3.length() > 0) {
            sb.append(str3);
            sb.append(';');
        }
        sb.append("device=");
        sb.append(str2);
        sb.append(";platform=2;application=");
        sb.append(str);
        hashMap.put("X-Api-Client", sb.toString());
    }
}
