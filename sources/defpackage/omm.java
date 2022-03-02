package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: omm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class omm implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ HelpConfig b;
    final /* synthetic */ String c;
    final /* synthetic */ aoru d;
    final /* synthetic */ okc e;

    public omm(Context context, HelpConfig helpConfig, String str, aoru aoru, okc okc) {
        this.a = context;
        this.b = helpConfig;
        this.c = str;
        this.d = aoru;
        this.e = okc;
    }

    public final void run() {
        try {
            int i = new omn(this.a, this.b, this.c, this.d, this.e).k().a;
            if (i != 200 && i != 202) {
                StringBuilder sb = new StringBuilder(42);
                sb.append("Received bad HTTP status code: ");
                sb.append(i);
                Log.e("AutoDeclineSSCReq", sb.toString());
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Log.e("AutoDeclineSSCReq", "Sending autodecline request failed.", e2);
        }
    }
}
