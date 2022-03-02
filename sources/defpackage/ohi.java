package defpackage;

import android.content.Context;
import android.util.Log;

/* renamed from: ohi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ohi implements Runnable {
    final /* synthetic */ Context a;

    public ohi(Context context) {
        this.a = context;
    }

    public final void run() {
        String str;
        Context context = this.a;
        int i = hxy.a;
        try {
            str = qdc.a(context).a(axmj.a.a().I(), axmj.a.a().K());
        } catch (Exception e) {
            Log.w("gH_GcmTokenManager", "Could not get GCM token from IID.", e);
            str = null;
        }
        ohj.a = str;
    }
}
