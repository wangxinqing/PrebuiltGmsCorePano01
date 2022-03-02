package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import java.io.IOException;

/* renamed from: mdf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mdf extends BroadcastReceiver {
    final /* synthetic */ mdg a;

    public mdf(mdg mdg) {
        this.a = mdg;
    }

    public final void onReceive(Context context, Intent intent) {
        try {
            mdg mdg = this.a;
            long longExtra = intent.getLongExtra("last_modified_time", 0);
            int i = mdg.d;
            synchronized (mdg) {
                if (!(mdg.c == null || longExtra == mdg.b)) {
                    try {
                        mdg.a(context, -1);
                    } catch (InvalidConfigException | IOException e) {
                        Log.e("DynamiteLoaderV2Impl", "Failed to load config.", e);
                    }
                }
            }
        } catch (Throwable th) {
            if (!jim.a()) {
                jis.a(context, th);
            }
            throw th;
        }
    }
}
