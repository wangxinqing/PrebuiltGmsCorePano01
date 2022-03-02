package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: ajqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajqm {
    private static final SimpleDateFormat a = new SimpleDateFormat("MM-dd HH:mm:ss", Locale.US);

    public static String a(long j) {
        return a.format(new Date(j));
    }

    public static String b(long j) {
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append("-");
            j = -j;
        }
        if (j >= 86400000) {
            sb.append(j / 86400000);
            sb.append("d");
            j %= 86400000;
        }
        if (j >= 3600000) {
            sb.append(j / 3600000);
            sb.append("h");
            j %= 3600000;
        }
        if (j >= 60000) {
            sb.append(j / 60000);
            sb.append("m");
            j %= 60000;
        }
        if (j >= 1000) {
            sb.append(j / 1000);
            sb.append("s");
            j %= 1000;
        }
        if (j > 0) {
            sb.append(j);
            sb.append("ms");
        }
        return sb.toString();
    }
}
