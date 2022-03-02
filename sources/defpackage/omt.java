package defpackage;

import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: omt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class omt {
    public static String a(HelpConfig helpConfig) {
        String str;
        String str2 = helpConfig.e;
        if (str2 != null && str2.contains("_")) {
            return helpConfig.e;
        }
        if (helpConfig.d != null) {
            str = "1";
        } else {
            str = "0";
        }
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        return sb.toString();
    }
}
