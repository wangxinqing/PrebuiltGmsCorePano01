package defpackage;

import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import com.android.volley.toolbox.NetworkImageView;
import com.google.android.gms.R;
import com.google.android.gms.family.model.InvitationDataModel;

/* renamed from: mnd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mnd extends adl implements View.OnClickListener {
    final NetworkImageView s;
    final TextView t;
    final TextView u;
    final View v;
    final Space w;
    final /* synthetic */ mng x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mnd(mng mng, View view) {
        super(view);
        this.x = mng;
        this.v = view.findViewById(R.id.fm_item_container);
        this.s = (NetworkImageView) view.findViewById(R.id.fm_item_avatar);
        this.t = (TextView) view.findViewById(R.id.fm_item_primary_text);
        this.u = (TextView) view.findViewById(R.id.fm_item_secondary_text);
        this.w = (Space) view.findViewById(R.id.fm_top_item_space);
    }

    public void onClick(View view) {
        int d = d();
        int a = this.x.a(d);
        if (a == 1) {
            this.x.f(d);
        } else if (a == 2) {
            mng mng = this.x;
            mne mne = this.x.a;
            mfv.c("FamilyDashboardFragment", "Manage invitation clicked", new Object[0]);
            ((mob) mne).c.a((InvitationDataModel) mng.h.get(d - mng.g.size()));
        } else if (a == 3) {
            mob mob = (mob) this.x.a;
            mhk mhk = mob.h;
            mob.c.b(mhk.c - (mhk.a.size() + mob.h.b.size()), mob.i.c.g);
        } else if (a == 4) {
            ((mob) this.x.a).c.e();
        }
    }
}
