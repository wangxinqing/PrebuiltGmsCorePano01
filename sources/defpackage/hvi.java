package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Log;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: hvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hvi {
    private static final Pattern a = Pattern.compile(".* \\(code -?([0-9]+)\\).*");

    static anax a(Context context) {
        String string = context.getSharedPreferences("LogStoreUtil", 0).getString("log_source_batching_blacklist", (String) null);
        if (string == null || string.isEmpty()) {
            return anfv.a;
        }
        return anax.a((Object[]) string.split(","));
    }

    public static avtn a(byte[] bArr) {
        if (bArr != null) {
            try {
                return (avtn) aucj.a((aucj) avtn.o, bArr, aubs.c());
            } catch (auda e) {
                Log.e("LogStoreUtil", "Couldn't parse PlayLoggerContext proto.", e);
                return null;
            }
        } else {
            Log.e("LogStoreUtil", "Tried to deserialize a null PLC.");
            return null;
        }
    }

    public static String a(String str, Throwable th) {
        if (th instanceof SQLiteException) {
            Matcher matcher = a.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(group).length());
                sb.append(str);
                sb.append("_SQLERR_");
                sb.append(group);
                return sb.toString();
            }
        }
        Throwable cause = th.getCause();
        int i = Build.VERSION.SDK_INT;
        if (cause instanceof ErrnoException) {
            int i2 = ((ErrnoException) cause).errno;
            String errnoName = OsConstants.errnoName(i2);
            if (errnoName == null) {
                errnoName = Integer.toString(i2);
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(errnoName).length());
            sb2.append(str);
            sb2.append("_ERRNO_");
            sb2.append(errnoName);
            return sb2.toString();
        } else if (cause != null) {
            String simpleName = cause.getClass().getSimpleName();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(simpleName).length());
            sb3.append(str);
            sb3.append("_");
            sb3.append(simpleName);
            return sb3.toString();
        } else if (!(th instanceof IOException) || th.getClass() == IOException.class) {
            return str;
        } else {
            String simpleName2 = th.getClass().getSimpleName();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(simpleName2).length());
            sb4.append(str);
            sb4.append("_");
            sb4.append(simpleName2);
            return sb4.toString();
        }
    }

    public static byte[] a(avrm avrm) {
        int b = aubk.b((audx) avrm);
        long e = awtf.e();
        if (((long) b) <= e) {
            byte[] bArr = new byte[b];
            aubk a2 = aubk.a(bArr);
            a2.a((audx) avrm);
            if (a2.a() == 0) {
                return bArr;
            }
            int a3 = a2.a();
            StringBuilder sb = new StringBuilder(53);
            sb.append("Could not serialize proto: spaceLeft=");
            sb.append(a3);
            sb.append(" != 0");
            throw new IOException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(65);
        sb2.append("Log entry exceeds size limits: ");
        sb2.append(b);
        sb2.append(" > ");
        sb2.append(e);
        throw new IOException(sb2.toString());
    }
}
