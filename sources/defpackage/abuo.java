package defpackage;

import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;

/* renamed from: abuo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abuo implements Runnable {
    final /* synthetic */ abup a;

    public abuo(abup abup) {
        this.a = abup;
    }

    public final void run() {
        abtz abtz;
        int i;
        abup abup = this.a;
        abvc abvc = abup.a;
        abxq abxq = abup.b;
        abvc.a.c(2);
        abug abug = abvc.b;
        if (abug.j && (abtz = abug.g) != null) {
            String str = ((abuc) abtz).n;
            if (azjt.d() && TextUtils.isEmpty(str)) {
                abug.a(abxq, new Status(13));
                return;
            }
            acbs acbs = ((abuc) abug.g).h;
            if (acbs != null) {
                i = acbs.b().d();
            } else {
                i = 1;
            }
            Uri.Builder buildUpon = Uri.parse(azjt.f()).buildUpon();
            int i2 = i - 1;
            if (i != 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
                sb.append(i2);
                sb.append(str);
                String builder = buildUpon.appendPath(sb.toString()).toString();
                String str2 = abug.k;
                if (str2 == null) {
                    str2 = "";
                }
                try {
                    abxq.a(Status.a, new AdvertisingInfo(builder, str2, jhy.b(((abuc) abug.g).p), str));
                } catch (RemoteException e) {
                    abug.a.a((Throwable) e);
                }
            } else {
                throw null;
            }
        } else {
            abug.a(abxq, new Status(10552));
        }
    }
}
