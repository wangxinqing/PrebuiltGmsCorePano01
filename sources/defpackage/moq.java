package defpackage;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import com.android.volley.toolbox.NetworkImageView;
import com.google.android.gms.R;
import com.google.android.gms.family.model.MemberDataModel;

/* renamed from: moq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class moq extends adl implements View.OnClickListener {
    final NetworkImageView s;
    final TextView t;
    final View u;
    final RadioButton v;
    final /* synthetic */ mor w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public moq(mor mor, View view) {
        super(view);
        this.w = mor;
        this.u = view.findViewById(R.id.fm_item_container);
        this.s = (NetworkImageView) view.findViewById(R.id.fm_manage_parents_item_avatar);
        this.t = (TextView) view.findViewById(R.id.fm_manage_parents_item_primary_text);
        this.v = (RadioButton) view.findViewById(R.id.fm_manage_parents_item_radiobutton);
    }

    public void onClick(View view) {
        int d = d();
        mor mor = this.w;
        MemberDataModel memberDataModel = (MemberDataModel) mor.a.get(d);
        if (mor.g == null) {
            mor.e.a().a(33);
            mor.a(memberDataModel.a);
            mor.e.a(memberDataModel);
        } else if (memberDataModel.a.equals(mor.h)) {
            mor.e.a().a(35);
            MemberDataModel memberDataModel2 = mor.g;
            mor.a(mor.h);
            mor.e.a(memberDataModel2);
        } else {
            mor.e.a().a(34);
            mor.a(memberDataModel.a);
            mor.e.a(memberDataModel);
        }
    }
}
