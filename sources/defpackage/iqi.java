package defpackage;

import android.content.Context;
import android.os.Binder;

/* renamed from: iqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iqi {
    public final Context a;

    public iqi(Context context) {
        iva.a((Object) context);
        this.a = context;
    }

    public static String a(Context context) {
        return Long.toHexString(b(context, "android_id"));
    }

    public static long b(Context context, String str) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return aeeg.a(context.getContentResolver(), str, 0);
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public static String a(Context context, String str) {
        return a(context, str, (String) null);
    }

    public static String a(Context context, String str, String str2) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return aeeg.a(context.getContentResolver(), str, str2);
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
