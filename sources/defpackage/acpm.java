package defpackage;

import android.app.KeyguardManager;
import android.content.Context;

/* renamed from: acpm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acpm {
    public static boolean a(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        return keyguardManager != null && keyguardManager.isKeyguardSecure();
    }
}
