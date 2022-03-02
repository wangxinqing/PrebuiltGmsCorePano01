package defpackage;

import com.google.android.chimera.Activity;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: zad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zad implements yut {
    final /* synthetic */ zae a;

    public zad(zae zae) {
        this.a = zae;
    }

    public final void a(ConnectionResult connectionResult, ysy ysy) {
        zae zae = this.a;
        zae.l = false;
        Activity activity = zae.getActivity();
        if (activity != null) {
            if (connectionResult.b() && ysy != null) {
                this.a.h = ysy;
            } else if (this.a.h == null) {
                activity.showDialog(1);
                activity.setResult(0);
            }
            zae zae2 = this.a;
            zae2.a(zae2.h);
            zae zae3 = this.a;
            zae3.a(zae3.m);
        }
    }
}
