package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* renamed from: hxk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class hxk {
    public static final int c = hxz.b;
    public static final hxk d = new hxk();

    public final int b(Context context) {
        int i = hxz.b;
        return hxz.b(context, 0) ? 18 : 0;
    }

    public final PendingIntent c(Context context, int i, String str) {
        Intent b = b(context, i, str);
        if (b != null) {
            return PendingIntent.getActivity(context, 0, b, 134217728);
        }
        return null;
    }

    public final Intent b(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context != null) {
                jix.j(context);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(c);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(jni.b(context).b(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException e) {
                }
            }
            return itg.a("com.google.android.gms", sb.toString());
        } else if (i != 3) {
            return null;
        } else {
            return itg.a("com.google.android.gms");
        }
    }
}
