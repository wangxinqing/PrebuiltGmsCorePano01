package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaResultData;

/* renamed from: zqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zqc implements aora {
    final /* synthetic */ zqd a;

    public zqc(zqd zqd) {
        this.a = zqd;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        String str = (String) obj;
        zqd zqd = this.a;
        Status status = new Status(0);
        zqm zqm = zqd.b;
        if (zqm != null) {
            try {
                zqm.a(status, new RecaptchaResultData(str));
            } catch (RemoteException e) {
            }
        }
    }

    public final void a(Throwable th) {
        if (th instanceof zoz) {
            this.a.b(new Status(8, "Error during initialization step - read/write local cache failed"));
        } else if (th instanceof zoy) {
            Exception exc = (Exception) th.getCause();
            if (exc instanceof zpv) {
                this.a.b(new Status(7, "Error during initialization step - server connection failed"));
            } else if (exc instanceof zor) {
                zqd zqd = this.a;
                int i = ((zor) exc).a;
                StringBuilder sb = new StringBuilder(92);
                sb.append("Error during initialization step - failed to fetch initialization data - status: ");
                sb.append(i);
                zqd.b(new Status(13, sb.toString()));
            }
        } else if (th instanceof zoo) {
            this.a.b(new Status(13, ((zoo) th).getMessage()));
        } else if (th instanceof zpv) {
            this.a.b(new Status(7, ((zpv) th).getMessage()));
        } else if (th instanceof zor) {
            this.a.b(new Status(13, ((zor) th).getMessage()));
        } else {
            this.a.b(new Status(8, "Internal error during execution"));
        }
    }
}
