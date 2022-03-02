package defpackage;

import android.content.Context;

/* renamed from: ajpu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajpu {
    public static int a = -1;
    public static String b;

    public static boolean a(Context context) {
        b(context);
        return "com.google.android.gms.location.history".equals(b);
    }

    public static void b(Context context) {
        if (b == null) {
            int i = jhg.i(context, "com.google.android.gms.location.history");
            if (i == -1) {
                b = "com.google.android.gms";
                a = jhg.i(context, "com.google.android.gms");
                return;
            }
            b = "com.google.android.gms.location.history";
            a = i;
        }
    }
}
