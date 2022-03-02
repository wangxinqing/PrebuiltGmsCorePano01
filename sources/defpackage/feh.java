package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;

/* renamed from: feh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class feh implements aora {
    final /* synthetic */ fei a;

    public feh(fei fei) {
        this.a = fei;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        amri amri = (amri) obj;
        if (amri.a()) {
            this.a.g = (qcv) amri.b();
            this.a.a();
            return;
        }
        this.a.a(new fej(Status.a, amri.b(new SaveAccountLinkingTokenResult((PendingIntent) null))));
    }

    public final void a(Throwable th) {
        Status b = qbf.a(th).b();
        fei.a.d("Encountered an error {error code= %d, error message= %s}", Integer.valueOf(b.i), amrk.b(b.j));
        fei.a.e("Failure during the flow", th, new Object[0]);
        this.a.a(new fej(b, ampu.a));
    }
}
