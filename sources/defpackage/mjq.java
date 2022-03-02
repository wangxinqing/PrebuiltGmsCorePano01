package defpackage;

import android.view.View;
import com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity;
import com.google.android.gms.family.v2.model.PageData;

/* renamed from: mjq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mjq implements View.OnClickListener {
    final /* synthetic */ mju a;

    public mjq(mju mju) {
        this.a = mju;
    }

    public void onClick(View view) {
        PageData pageData = !this.a.a.u() ? this.a.d : this.a.e;
        if (pageData != null) {
            mfu.a((FamilyCreationChimeraActivity) this.a.getActivity(), pageData, this.a.b, new mjo(this), new mjp(), true).show();
        } else {
            this.a.a.t();
        }
    }
}
