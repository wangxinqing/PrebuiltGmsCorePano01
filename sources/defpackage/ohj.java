package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.googlehelp.gcm.InvalidateGcmTokenGcmTaskChimeraService;
import com.google.android.gms.googlehelp.helpactivities.ClickToCallChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: ohj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ohj {
    public static String a;
    private static aoru b;

    public static synchronized void a(Context context) {
        synchronized (ohj.class) {
            jfz jfz = new jfz(1, 10);
            b = jfz;
            jfz.execute(new ohi(context));
            b.shutdown();
        }
    }

    public static String b(Context context) {
        if (b == null) {
            Log.w("gH_GcmTokenManager", "initTokenAsync() should have been called on this process before calling getToken().");
            a(context);
        }
        try {
            b.awaitTermination(axmj.a.a().L(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Log.w("gH_GcmTokenManager", "Interrupted while waiting for GCM token.", e);
        }
        if (!TextUtils.isEmpty(a)) {
            InvalidateGcmTokenGcmTaskChimeraService.a(context);
            if ((context instanceof ClickToCallChimeraActivity) && ofx.a(((nzu) context).f().b, axmj.a.a().aS())) {
                InvalidateGcmTokenGcmTaskChimeraService.a(context, (int) axmj.a.a().J());
            }
            return a;
        } else if (!(context instanceof nzu)) {
            return null;
        } else {
            okg.c((nzu) context);
            return null;
        }
    }
}
