package defpackage;

import com.google.android.chimera.Activity;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: zac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zac implements yup {
    final /* synthetic */ zae a;

    public zac(zae zae) {
        this.a = zae;
    }

    public final void a(ConnectionResult connectionResult, ysx ysx) {
        zae zae = this.a;
        zae.j = false;
        Activity activity = zae.getActivity();
        if (activity != null) {
            zae zae2 = this.a;
            zae2.a(zae2.m);
            if (!connectionResult.b()) {
                activity.showDialog(1);
                activity.setResult(0);
                return;
            }
            activity.setResult(-1);
        }
    }
}
