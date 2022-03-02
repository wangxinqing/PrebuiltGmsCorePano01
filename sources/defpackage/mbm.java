package defpackage;

import android.media.MediaDrm;
import android.util.Log;
import java.io.IOException;

/* renamed from: mbm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mbm extends Thread {
    final /* synthetic */ mbn a;
    private final MediaDrm b;

    public mbm(mbn mbn, MediaDrm mediaDrm) {
        this.a = mbn;
        this.b = mediaDrm;
    }

    public final void run() {
        try {
            mbn mbn = this.a;
            int i = mbn.d;
            mbn.a = false;
            mbn.b = true;
            try {
                MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
                String defaultUrl = provisionRequest.getDefaultUrl();
                String str = new String(provisionRequest.getData(), "UTF-8");
                StringBuilder sb = new StringBuilder(String.valueOf(defaultUrl).length() + 15 + str.length());
                sb.append(defaultUrl);
                sb.append("&signedRequest=");
                sb.append(str);
                this.a.a(lyq.a(sb.toString(), auay.b).k(), this.b);
                this.a.a = true;
            } catch (IOException e) {
                Log.e("DG.WV", "Could not communicate with the provisioning server.", e);
            }
            this.a.b = false;
        } catch (Exception e2) {
            mbn mbn2 = this.a;
            int i2 = mbn.d;
            mbn2.c.a((Throwable) e2);
        }
    }
}
