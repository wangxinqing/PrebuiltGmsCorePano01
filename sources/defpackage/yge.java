package defpackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: yge  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yge {
    public static final Set a = new HashSet(Arrays.asList(new String[]{"com.google.android.apps.internal.mobdog", "com.google.android.apps.mobileutilities"}));
    public static final agvx b;
    private static final agvw c;

    static {
        agvw agvw = new agvw("direct_boot:com.google.android.gms.phenotype");
        c = agvw;
        b = agvx.a(agvw, "__phenotype_server_token", "");
    }

    public static boolean a(String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(str2, i);
                if (indexOf == -1) {
                    break;
                } else if (!((indexOf == 0 || str.charAt(indexOf - 1) == ',') && (str2.length() + indexOf == str.length() || str.charAt(str2.length() + indexOf) == ','))) {
                    i = indexOf + str2.length() + 1;
                }
            }
            return true;
        }
        return false;
    }
}
