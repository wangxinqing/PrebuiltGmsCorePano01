package defpackage;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: dxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dxs implements AdapterView.OnItemClickListener {
    final /* synthetic */ dxx a;

    public dxs(dxx dxx) {
        this.a = dxx;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        dxf dxf = this.a.D;
        ContactPerson contactPerson = dxf.a;
        ContactPerson.ContactMethod a2 = dxf.getItem(i);
        if (!(contactPerson == null || a2 == null)) {
            dye dye = this.a.g;
            if (dye != null) {
                dye.a(a2, !contactPerson.a().equals(a2));
            }
            contactPerson.a(a2);
            this.a.t.b(contactPerson);
            dyj dyj = this.a.u;
            if (dyj != null) {
                dyj.b(contactPerson);
            }
            if (dxx.c(contactPerson)) {
                this.a.e();
            }
        }
        this.a.C.d();
    }
}
