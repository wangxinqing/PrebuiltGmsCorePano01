package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: dtb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dtb {
    static final String[] a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    private static final Map b = new HashMap(a.length);

    static {
        int i = 0;
        while (true) {
            String[] strArr = a;
            if (i < strArr.length) {
                b.put(strArr[i], Integer.valueOf(i));
                i++;
            } else {
                return;
            }
        }
    }

    public static int a() {
        return a.length;
    }

    public static int a(String str) {
        Integer num = (Integer) b.get(str);
        if (num != null) {
            return num.intValue();
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 44);
        sb.append("[");
        sb.append(str);
        sb.append("] is not a valid global search section name");
        throw new IllegalArgumentException(sb.toString());
    }

    public static String a(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = a;
        if (i < strArr.length) {
            return strArr[i];
        }
        return null;
    }
}
