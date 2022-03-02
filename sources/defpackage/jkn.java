package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: jkn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jkn {
    private static volatile jkn a = null;

    public static jkn a(Context context) {
        if (jkr.b() && jni.b(context).a("android.permission.OBSERVE_GRANT_REVOKE_PERMISSIONS") == 0) {
            return new jkp(context.getPackageManager());
        }
        if (a == null) {
            a = new jkn();
        }
        return a;
    }

    public void a(jkm jkm, Handler handler) {
    }

    public boolean a() {
        return false;
    }

    public void b() {
    }
}
