package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.toolbox.NetworkImageView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.family.model.MemberDataModel;
import com.google.android.gms.family.v2.model.PageData;

/* renamed from: moo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class moo extends Fragment {
    public mon a;
    public String b;
    private View c;
    private MemberDataModel d;
    private boolean e;

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean a(com.google.android.gms.family.v2.model.PageData r0, int r1) {
        /*
            if (r0 == 0) goto L_0x0014
            java.util.HashMap r0 = r0.a
            if (r0 == 0) goto L_0x0014
            int r1 = r1 + -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0014
            r0 = 1
            return r0
        L_0x0014:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.moo.a(com.google.android.gms.family.v2.model.PageData, int):boolean");
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a = (mon) mfy.a(mon.class, getActivity());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c = layoutInflater.inflate(R.layout.fm_fragment_manage_member, viewGroup, false);
        this.d = (MemberDataModel) getArguments().getParcelable("member_data");
        this.b = getArguments().getString("hoh_given_name");
        this.e = getArguments().getBoolean("can_be_removed");
        MemberDataModel memberDataModel = this.d;
        mgj.a((Toolbar) this.c.findViewById(R.id.fm_toolbar), jlh.a(memberDataModel.c), getActivity());
        NetworkImageView networkImageView = (NetworkImageView) this.c.findViewById(R.id.fm_item_avatar);
        networkImageView.setDefaultImageResId(R.drawable.fm_ic_avatar);
        networkImageView.setImageUrl(mge.a(memberDataModel.e, getResources().getDimensionPixelSize(R.dimen.fm_profile_photo_size_small)), mgd.a());
        ((TextView) this.c.findViewById(R.id.fm_item_primary_text)).setText(jlh.a(memberDataModel.b));
        Button button = (Button) this.c.findViewById(R.id.fm_remove_member_button);
        PageData pageData = (PageData) getArguments().getParcelable("manage_member_pd");
        if (axga.c() && memberDataModel.g == 5) {
            TextView textView = (TextView) this.c.findViewById(R.id.fm_item_secondary_text);
            if (a(pageData, 33)) {
                textView.setText((CharSequence) pageData.a.get(32));
            }
            if (a(pageData, 31)) {
                TextView textView2 = (TextView) this.c.findViewById(R.id.fm_manage_member_body_text);
                textView2.setVisibility(0);
                textView2.setText((CharSequence) pageData.a.get(30));
            }
        }
        if (a(pageData, 24) && (!axfo.b() || this.e)) {
            button.setText((CharSequence) pageData.a.get(23));
            button.setVisibility(0);
        }
        button.setOnClickListener(new mom(this, memberDataModel));
        return this.c;
    }

    public final void onDetach() {
        super.onDetach();
        this.a = null;
    }
}
