package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.cast.JGCastService;

/* renamed from: ion  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ion {
    public final Context a;
    public boolean b = true;

    public ion(Context context) {
        this.a = context;
    }

    public final void a(RuntimeException runtimeException) {
        try {
            jis.a(this.a, runtimeException, JGCastService.FLAG_PRIVATE_DISPLAY);
        } catch (RuntimeException e) {
            Log.e("SosLogRequestBuilder", "Couldn't log to dropbox.", e);
        }
    }
}
