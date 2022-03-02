package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.ClientIdentity;

/* renamed from: ajqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajqg {
    private static ClientIdentity a;

    public static synchronized ClientIdentity a(Context context) {
        ClientIdentity clientIdentity;
        synchronized (ajqg.class) {
            if (a == null) {
                if (jkr.b()) {
                    try {
                        a = new ClientIdentity(jni.b(context).a("com.google.android.location.services", 0).uid, "com.google.android.location.services");
                    } catch (PackageManager.NameNotFoundException e) {
                    }
                }
                if (a == null) {
                    a = new ClientIdentity(context.getApplicationInfo().uid, context.getPackageName());
                }
            }
            clientIdentity = a;
        }
        return clientIdentity;
    }
}
