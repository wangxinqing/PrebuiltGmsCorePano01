package defpackage;

import com.google.android.chimera.Activity;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: zaa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zaa implements yup {
    final /* synthetic */ zae a;

    public zaa(zae zae) {
        this.a = zae;
    }

    public final void a(ConnectionResult connectionResult, ysx ysx) {
        Activity activity = this.a.getActivity();
        if (activity == null) {
            return;
        }
        if (ysx != null && connectionResult.b()) {
            this.a.e = ysx.b();
            zae zae = this.a;
            zae.i = false;
            zae.f.a(zae.o, zae.b, zae.e);
            return;
        }
        activity.showDialog(1);
        activity.setResult(0);
    }
}
