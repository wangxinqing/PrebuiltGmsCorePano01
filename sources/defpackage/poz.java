package defpackage;

import android.database.Cursor;
import java.nio.charset.Charset;

/* renamed from: poz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class poz {
    public static long a(Cursor cursor) {
        long j;
        long j2 = 0;
        if (pnz.a()) {
            Charset forName = Charset.forName("UTF-8");
            for (int i = 0; i < cursor.getColumnCount(); i++) {
                int type = cursor.getType(i);
                if (type == 0 || type == 1 || type == 2) {
                    j = 4;
                } else if (type != 3) {
                    if (type == 4) {
                        j2 += (long) cursor.getBlob(i).length;
                    }
                } else {
                    j = (long) cursor.getString(i).getBytes(forName).length;
                }
                j2 += j;
            }
        }
        return j2;
    }

    public static String a(long j) {
        int i = 0;
        while (j >= 1024 && i < 3) {
            j /= 1024;
            i++;
        }
        String valueOf = String.valueOf(j);
        String valueOf2 = String.valueOf(i > 0 ? Character.valueOf("KMG".charAt(i - 1)) : "");
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(valueOf2);
        sb.append("B");
        return sb.toString();
    }
}
