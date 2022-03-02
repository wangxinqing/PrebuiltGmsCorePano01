package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: lnp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lnp {
    public static String a() {
        String str = (String) jzq.o.c();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("token:") : "token:".concat(valueOf);
    }

    public static String b() {
        String str;
        String str2 = (String) jzq.az.c();
        if ("corp".equals(str2) || "scary".equals(str2)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1);
            sb.append('.');
            sb.append(str2);
            str = sb.toString();
        } else {
            str = "";
        }
        return String.format("/drive/v2internal%s/", new Object[]{str});
    }

    public static void a(Uri.Builder builder) {
        String a = a();
        if (a != null) {
            builder.appendQueryParameter("trace", a);
            if (((Boolean) jzq.L.c()).booleanValue()) {
                builder.appendQueryParameter("trace.deb", "genoa:3:all,driveService:3:all,cospel:3:all,DriveService:3:all");
            }
        }
    }
}
