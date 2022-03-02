package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaHandle;

/* renamed from: zqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zqe implements aora {
    final /* synthetic */ zqf a;

    public zqe(zqf zqf) {
        this.a = zqf;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        zqf zqf = this.a;
        Status status = new Status(0);
        aucx aucx = ((zra) obj).c;
        zqn zqn = zqf.d;
        if (zqn != null) {
            try {
                zqn.a(status, new RecaptchaHandle(zqf.b, zqf.c, aucx));
            } catch (RemoteException e) {
            }
        }
    }

    public final void a(Throwable th) {
        if (th instanceof zpv) {
            this.a.b(new Status(7, "Failed to connect to server to fetch data for local cache"));
        } else if (th instanceof zor) {
            zqf zqf = this.a;
            int i = ((zor) th).a;
            StringBuilder sb = new StringBuilder(58);
            sb.append("Failed to fetch data for local cache - status: ");
            sb.append(i);
            zqf.b(new Status(13, sb.toString()));
        } else {
            this.a.b(new Status(8, "Failed to read/write local cache"));
        }
    }
}
