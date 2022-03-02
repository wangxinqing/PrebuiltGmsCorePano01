package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.family.model.MemberDataModel;
import java.util.List;

/* renamed from: mor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mor extends acg {
    public List a;
    public final mop e;
    public String f;
    public MemberDataModel g = null;
    public String h;
    private final String i;

    public mor(mop mop, List list, String str) {
        this.a = list;
        this.e = mop;
        this.i = str;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            MemberDataModel memberDataModel = (MemberDataModel) list.get(i2);
            int i3 = memberDataModel.g;
            if (i3 == 2) {
                this.g = memberDataModel;
            } else if (i3 == 1) {
                this.h = memberDataModel.a;
            }
        }
    }

    private static final void a(View view, View.OnClickListener onClickListener, boolean z) {
        view.setClickable(z);
        if (z) {
            view.setOnClickListener(onClickListener);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f = null;
    }

    public final int a() {
        return this.a.size();
    }

    public final adl a(ViewGroup viewGroup, int i2) {
        return new moq(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fm_item_manage_parents, viewGroup, false));
    }

    public final void a(adl adl, int i2) {
        boolean z;
        MemberDataModel memberDataModel = (MemberDataModel) this.a.get(i2);
        moq moq = (moq) adl;
        moq.s.setDefaultImageResId(R.drawable.fm_ic_avatar);
        moq.s.setImageUrl(mge.a(memberDataModel.e, moq.u.getResources().getDimensionPixelSize(R.dimen.fm_profile_photo_size_small)), mgd.a());
        if (this.h.equals(memberDataModel.a)) {
            moq.t.setText(this.i);
            moq.s.setVisibility(8);
        } else {
            moq.t.setText(memberDataModel.c);
        }
        String str = this.f;
        if (str != null) {
            z = str.equals(memberDataModel.a);
        } else {
            MemberDataModel memberDataModel2 = this.g;
            if (memberDataModel2 != null) {
                z = memberDataModel2.a.equals(memberDataModel.a);
            } else {
                z = this.h.equals(memberDataModel.a);
            }
        }
        moq.v.setChecked(z);
        moq.v.setClickable(false);
        moq.v.setFocusable(false);
        if (!z) {
            a(moq.u, moq, true);
        } else {
            a(moq.u, moq, false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        this.f = str;
        as();
    }
}
