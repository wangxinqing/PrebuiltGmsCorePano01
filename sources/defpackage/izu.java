package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: izu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class izu {
    private static final HashMap a = new HashMap();

    public static synchronized String a(Context context, String str) {
        synchronized (izu.class) {
            if (TextUtils.isEmpty(str)) {
                str = "GMS/1.0";
            }
            String str2 = (String) a.get(str);
            if (str2 != null) {
                return str2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Mozilla 5.0 (Linux; U; Android ");
            sb.append(Build.VERSION.RELEASE);
            sb.append("; ");
            sb.append(Locale.getDefault().toString());
            String str3 = Build.MODEL;
            if (!TextUtils.isEmpty(str3)) {
                sb.append("; ");
                sb.append(str3);
            }
            String str4 = Build.ID;
            if (!TextUtils.isEmpty(str4)) {
                sb.append("; Build/");
                sb.append(str4);
            }
            sb.append("); ");
            sb.append(context.getPackageName());
            sb.append('/');
            int i = 0;
            try {
                i = jni.b(context).b(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
            }
            sb.append(i);
            sb.append("; FastParser/1.1; ");
            sb.append(str);
            sb.append("; (gzip)");
            String sb2 = sb.toString();
            a.put(str, sb2);
            return sb2;
        }
    }
}
