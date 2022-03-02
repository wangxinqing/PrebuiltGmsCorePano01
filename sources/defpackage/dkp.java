package defpackage;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: dkp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class dkp {
    public static String a() {
        return a((Object) null, 1);
    }

    public abstract void a(dkp dkp);

    public static String a(Object obj) {
        return a(obj, 0);
    }

    private static String a(Object obj, int i) {
        if (i > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            if (!TextUtils.isEmpty((String) obj)) {
                return obj.toString();
            }
            return "";
        } else if (obj instanceof Integer) {
            if (((Integer) obj).intValue() != 0) {
                return obj.toString();
            }
            return "";
        } else if (obj instanceof Long) {
            if (((Long) obj).longValue() != 0) {
                return obj.toString();
            }
            return "";
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() != 0.0d) {
                return obj.toString();
            }
            return "";
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return obj.toString();
            }
            return "";
        } else if (obj instanceof List) {
            StringBuilder sb = new StringBuilder();
            if (i > 0) {
                sb.append("[");
            }
            int length = sb.length();
            for (Object next : (List) obj) {
                if (sb.length() > length) {
                    sb.append(", ");
                }
                sb.append(a(next, i + 1));
            }
            if (i > 0) {
                sb.append("]");
            }
            return sb.toString();
        } else if (!(obj instanceof Map)) {
            return obj.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            boolean z = false;
            int i2 = 0;
            for (Map.Entry entry : new TreeMap((Map) obj).entrySet()) {
                String a = a(entry.getValue(), i + 1);
                if (!TextUtils.isEmpty(a)) {
                    if (i > 0 && !z) {
                        sb2.append("{");
                        i2 = sb2.length();
                        z = true;
                    }
                    if (sb2.length() > i2) {
                        sb2.append(", ");
                    }
                    sb2.append((String) entry.getKey());
                    sb2.append('=');
                    sb2.append(a);
                }
            }
            if (z) {
                sb2.append("}");
            }
            return sb2.toString();
        }
    }
}
