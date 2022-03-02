package defpackage;

import java.io.PrintWriter;
import java.util.Map;

/* renamed from: ajnu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajnu {
    public static final String[] a = {"key", "value"};

    public static void a(Map map, PrintWriter printWriter) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String valueOf = String.valueOf(entry.getValue());
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            printWriter.println(sb.toString());
        }
    }
}
