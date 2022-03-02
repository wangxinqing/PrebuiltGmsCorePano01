package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: joe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class joe {
    private static volatile joe a;

    private joe() {
    }

    public static void a() {
        if (a == null) {
            synchronized (joe.class) {
                if (a == null) {
                    a = new joe();
                }
            }
        }
    }

    public static final void a(Context context, String str, String str2) {
        Intent intent = new Intent(str);
        intent.setClassName(context, "com.google.android.gms.config.ConfigService");
        intent.setData(Uri.parse(str2.length() == 0 ? new String("package:") : "package:".concat(str2)));
        context.startService(intent);
    }
}
