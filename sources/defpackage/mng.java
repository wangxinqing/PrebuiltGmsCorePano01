package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.family.model.InvitationDataModel;
import com.google.android.gms.family.model.MemberDataModel;
import com.google.android.gms.family.model.ViewerDataModel;
import com.google.android.gms.family.v2.model.PageData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mng  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mng extends acg {
    public final mne a;
    public final int[] e = new int[3];
    public int f = 0;
    public List g = new ArrayList();
    public List h = new ArrayList();
    public ViewerDataModel i;
    public int j;
    public PageData k;
    public PageData l;
    public PageData m;
    public String n;
    final boolean o;
    final boolean p;
    final boolean q;
    private final Context r;

    public mng(Context context, mne mne, boolean z, boolean z2, boolean z3) {
        this.o = z;
        this.p = z2;
        this.q = z3;
        this.r = context;
        this.a = mne;
    }

    private static final void a(View view, View.OnClickListener onClickListener, boolean z) {
        view.setClickable(z);
        if (z) {
            TypedValue typedValue = new TypedValue();
            view.getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
            view.setBackgroundResource(typedValue.resourceId);
            view.setOnClickListener(onClickListener);
            return;
        }
        view.setBackgroundResource(0);
    }

    public final void f(int i2) {
        boolean z;
        MemberDataModel memberDataModel = (MemberDataModel) this.g.get(i2);
        String str = this.n;
        if (str == null || !str.equals(memberDataModel.a)) {
            z = false;
        } else {
            z = true;
        }
        mne mne = this.a;
        mfv.c("FamilyDashboardFragment", "Member row clicked, delegating to activity onMemberClicked()", new Object[0]);
        mob mob = (mob) mne;
        mob.c.b().a(4);
        if (axgp.a.a().b()) {
            int i3 = Build.VERSION.SDK_INT;
            if (memberDataModel.a()) {
                mob.c.b(memberDataModel);
                return;
            }
        }
        int i4 = memberDataModel.g;
        if (i4 == 4) {
            mob.c.a(memberDataModel);
        } else if (z && i4 == 5) {
            mob.c.o();
        } else {
            mob.c.a(memberDataModel, mob.g, z, mob.f.b.contains(memberDataModel.a));
        }
    }

    private static final void a(mnd mnd, PageData pageData) {
        mnd.s.setDefaultImageResId(R.drawable.fm_ic_add);
        mnd.t.setText((CharSequence) pageData.a.get(18));
        if (pageData.a.containsKey(19)) {
            String str = (String) pageData.a.get(19);
            if (!TextUtils.isEmpty(str)) {
                mnd.u.setText(str);
            }
        }
        if (pageData.a.containsKey(20)) {
            String str2 = (String) pageData.a.get(20);
            if (!TextUtils.isEmpty(str2)) {
                mnd.s.setImageUrl(mge.a(str2, mnd.v.getResources().getDimensionPixelSize(R.dimen.fm_profile_photo_size_small)), mgd.a());
            }
        }
    }

    private static final void a(mnd mnd, String str, String str2, String str3, boolean z) {
        mnd.s.setDefaultImageResId(R.drawable.fm_ic_avatar);
        mnd.s.setImageUrl(mge.a(str, mnd.v.getResources().getDimensionPixelSize(R.dimen.fm_profile_photo_size_small)), mgd.a());
        mnd.t.setText(str2);
        mnd.u.setText(str3);
        a(mnd.v, mnd, z);
    }

    private final boolean a(MemberDataModel memberDataModel) {
        boolean z;
        String str = this.n;
        if (str == null || !str.equals(memberDataModel.a)) {
            z = false;
        } else {
            z = true;
        }
        if (axgp.a.a().a()) {
            int i2 = Build.VERSION.SDK_INT;
            if (memberDataModel.a()) {
                return this.i.a.contains(memberDataModel.a);
            }
        }
        int i3 = memberDataModel.g;
        if (i3 == 4) {
            return this.i.a.contains(memberDataModel.a) && this.q;
        }
        if (z && i3 == 5) {
            return true;
        }
        if (axfo.c() && this.p && memberDataModel.a()) {
            return this.i.a.contains(memberDataModel.a);
        }
        if (this.o) {
            return this.i.a.contains(memberDataModel.a);
        }
        return !z && this.i.b.contains(memberDataModel.a);
    }

    public final int a() {
        return this.g.size() + this.h.size() + this.f;
    }

    public final int a(int i2) {
        if (i2 < this.g.size()) {
            return !TextUtils.isEmpty(((MemberDataModel) this.g.get(i2)).f) ? 1 : 0;
        }
        if (i2 >= this.g.size() && i2 < this.g.size() + this.h.size()) {
            return 2;
        }
        return this.e[(i2 - this.g.size()) - this.h.size()];
    }

    public final adl a(ViewGroup viewGroup, int i2) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i2 == 0) {
            return new mnc(this, from.inflate(R.layout.fm_item_1_line_with_avatar, viewGroup, false));
        }
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            return new mnd(this, from.inflate(R.layout.fm_item_2_line_with_avatar, viewGroup, false));
        }
        if (i2 == 5) {
            return new mnf(from.inflate(R.layout.fm_item_manage_parent_row, viewGroup, false));
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Invalid view type: ");
        sb.append(i2);
        mfv.f("DashboardAdapter", sb.toString(), new Object[0]);
        return null;
    }

    public final void a(adl adl, int i2) {
        String str;
        if ((adl instanceof mnd) && i2 == 0) {
            ((mnd) adl).w.setVisibility(0);
        } else if ((adl instanceof mnc) && i2 == 0) {
            ((mnc) adl).v.setVisibility(0);
        }
        int a2 = a(i2);
        if (a2 == 0) {
            MemberDataModel memberDataModel = (MemberDataModel) this.g.get(i2);
            mnc mnc = (mnc) adl;
            String str2 = memberDataModel.e;
            String str3 = memberDataModel.c;
            boolean a3 = a(memberDataModel);
            mnc.s.setDefaultImageResId(R.drawable.fm_ic_avatar);
            mnc.s.setImageUrl(mge.a(str2, mnc.u.getResources().getDimensionPixelSize(R.dimen.fm_profile_photo_size_small)), mgd.a());
            mnc.t.setText(str3);
            a(mnc.u, mnc, a3);
        } else if (a2 == 1) {
            MemberDataModel memberDataModel2 = (MemberDataModel) this.g.get(i2);
            a((mnd) adl, memberDataModel2.e, memberDataModel2.c, memberDataModel2.f, a(memberDataModel2));
        } else if (a2 == 2) {
            mnd mnd = (mnd) adl;
            InvitationDataModel invitationDataModel = (InvitationDataModel) this.h.get(i2 - this.g.size());
            String str4 = invitationDataModel.e;
            String a4 = invitationDataModel.a();
            int i3 = invitationDataModel.g;
            Resources resources = this.r.getResources();
            int i4 = i3 - 1;
            if (i4 == 2) {
                str = resources.getString(R.string.fm_invitation_state_pending);
            } else if (i4 != 4) {
                str = resources.getString(R.string.fm_invitation_state_not_sent);
            } else {
                str = resources.getString(R.string.fm_invitation_state_expired);
            }
            a(mnd, str4, a4, str, this.i.a(2));
            TextView textView = mnd.u;
            int i5 = invitationDataModel.g;
            Resources resources2 = this.r.getResources();
            if (i5 - 1 != 2) {
                textView.setTextColor(resources2.getColor(R.color.fm_invitiations_failure_color));
            } else {
                textView.setTextColor(resources2.getColor(R.color.fm_invitations_sent_color));
            }
        } else if (a2 == 3) {
            mnd mnd2 = (mnd) adl;
            PageData pageData = this.l;
            if (pageData == null) {
                mfv.c("DashboardAdapter", "InviteMember Pagedata null but populateInviteButtonView() called", new Object[0]);
                return;
            }
            a(mnd2, pageData);
            a(mnd2.v, mnd2, true);
        } else if (a2 == 4) {
            mnd mnd3 = (mnd) adl;
            PageData pageData2 = this.k;
            if (pageData2 == null) {
                mfv.c("DashboardAdapter", "CreateAccount PageData null but populateCreateAccountButtonView() called", new Object[0]);
                return;
            }
            a(mnd3, pageData2);
            a(mnd3.v, mnd3, true);
        } else if (a2 == 5) {
            mnf mnf = (mnf) adl;
            mnf.s.setText((CharSequence) this.m.a.get(18));
            mnf.s.setOnClickListener(new mnb(this));
        }
    }
}
