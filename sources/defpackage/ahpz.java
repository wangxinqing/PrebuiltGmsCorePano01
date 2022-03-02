package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ahpz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahpz {
    private static long a = 0;
    private static final Map b = new HashMap();

    public static synchronized void a(long j) {
        synchronized (ahpz.class) {
            long j2 = j - a;
            if (j2 > 600000) {
                a = j;
                for (String str : b.keySet()) {
                    ahpy ahpy = (ahpy) b.get(str);
                    String[] split = str.split("/");
                    if (split.length != 3) {
                        String valueOf = String.valueOf(str);
                        if (valueOf.length() == 0) {
                            new String("Bad key: ");
                        } else {
                            "Bad key: ".concat(valueOf);
                        }
                    } else {
                        ahpx.a(split[0], split[1], split[2], ahpy.a);
                    }
                }
                b.clear();
                return;
            }
            StringBuilder sb = new StringBuilder(56);
            sb.append("Not ready for upload, ");
            sb.append((600000 - j2) / 1000);
            sb.append(" seconds left.");
            sb.toString();
        }
    }

    public static synchronized void a(String str, String str2, String str3, long j) {
        synchronized (ahpz.class) {
            StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
            sb.append(str);
            sb.append("/");
            sb.append(str2);
            sb.append("/");
            sb.append(str3);
            String sb2 = sb.toString();
            ahpy ahpy = (ahpy) b.get(sb2);
            if (ahpy == null) {
                b.put(sb2, new ahpy(j));
            } else {
                ahpy.a += j;
            }
        }
    }
}
