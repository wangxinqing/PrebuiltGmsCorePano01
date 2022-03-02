package defpackage;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: xwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xwz {
    public static String a(String str, String str2) {
        return a(str2, c(str));
    }

    public static String b(String str) {
        return a(str)[0];
    }

    public static boolean c(String str) {
        return !TextUtils.isEmpty(a(str)[2]);
    }

    public static String a(String str, boolean z) {
        if (str == null) {
            Log.e("PhotoUrlUtil", "Photo url is null");
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(str);
        if (z) {
            sb.append(" Sync_High_Res");
        }
        return sb.toString();
    }

    public static String[] a(String str) {
        String str2;
        int i = 0;
        String[] strArr = {"", "", ""};
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(" ");
            if (split.length <= 3) {
                while (i < 3 && i < split.length) {
                    strArr[i] = split[i];
                    i++;
                }
                return strArr;
            }
            str2 = "Photo cell has more than 3 parts.";
        } else {
            str2 = "Photo cell is empty.";
        }
        Log.e("PhotoUrlUtil", str2);
        return strArr;
    }
}
