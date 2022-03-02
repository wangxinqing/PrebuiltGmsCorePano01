package defpackage;

import android.content.Context;
import android.util.Log;

/* renamed from: ims  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ims {
    public static void a(RuntimeException runtimeException, Context context, aogr aogr, String str) {
        if (aogr == aogr.STARTUP || aogr == aogr.SAFEBOOT_STARTUP) {
            try {
                jis.a(context, runtimeException, 0);
                String valueOf = String.valueOf(str);
                Log.e("ExceptionUtil", valueOf.length() == 0 ? new String("RuntimeException while safely performing function: ") : "RuntimeException while safely performing function: ".concat(valueOf), runtimeException);
            } catch (RuntimeException e) {
            }
        } else {
            throw runtimeException;
        }
    }

    public static void a(RuntimeException runtimeException, inb inb, String str) {
        a(runtimeException, inb.b, inb.a, str);
    }
}
