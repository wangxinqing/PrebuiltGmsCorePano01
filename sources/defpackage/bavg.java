package defpackage;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;

/* renamed from: bavg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bavg implements Runnable {
    final /* synthetic */ bawc a;

    public bavg(bawc bawc) {
        this.a = bawc;
    }

    public final void run() {
        bavb bavb = this.a.r;
        if (bavb != null) {
            try {
                bavb.b();
            } catch (IOException e) {
                Log.e(bawc.a, "Exception when closing OutputChannel", e);
            }
        }
        HttpURLConnection httpURLConnection = this.a.q;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.a.q = null;
        }
    }
}
