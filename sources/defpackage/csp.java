package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: csp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class csp {
    public static int a(aqsr aqsr) {
        return a((String) Collections.unmodifiableMap(aqsr.c).get("screenFlavor"));
    }

    public static int b(Map map) {
        try {
            return Integer.parseInt((String) map.get("gmscoreSettingsCategoryId"));
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static int a(Map map) {
        try {
            return Integer.parseInt((String) map.get("gmscoreSettingsItemId"));
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
