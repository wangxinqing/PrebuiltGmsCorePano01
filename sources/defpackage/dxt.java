package defpackage;

import android.view.View;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: dxt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dxt implements View.OnClickListener {
    final /* synthetic */ dxx a;

    public dxt(dxx dxx) {
        this.a = dxx;
    }

    public void onClick(View view) {
        dxx dxx = this.a;
        ContactPerson contactPerson = dxx.D.a;
        if (contactPerson != null) {
            dxx.a(contactPerson, 4, dxx.d(contactPerson));
        }
        this.a.C.d();
    }
}
