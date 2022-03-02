package defpackage;

import android.view.View;
import com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity;
import com.google.android.gms.family.v2.model.PageData;

/* renamed from: mkb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mkb implements View.OnClickListener {
    final /* synthetic */ mkf a;

    public mkb(mkf mkf) {
        this.a = mkf;
    }

    public void onClick(View view) {
        PageData pageData = !this.a.a.u() ? this.a.d : this.a.e;
        if (pageData != null) {
            mfu.a((FamilyCreationChimeraActivity) this.a.getActivity(), pageData, this.a.b, new mjz(this), new mka(), true).show();
        } else {
            this.a.a.t();
        }
    }
}
