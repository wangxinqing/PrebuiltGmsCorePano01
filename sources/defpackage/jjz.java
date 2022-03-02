package defpackage;

import java.util.HashMap;

/* renamed from: jjz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jjz {
    public static void a(StringBuilder sb, HashMap hashMap) {
        sb.append("{");
        boolean z = true;
        for (String str : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str2 = (String) hashMap.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
                z = false;
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
                z = false;
            }
        }
        sb.append("}");
    }
}
