package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.volley.toolbox.NetworkImageView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.family.model.InvitationDataModel;
import java.text.DateFormat;

/* renamed from: mol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mol extends Fragment {
    public mok a;
    private View b;

    public final void onActivityCreated(Bundle bundle) {
        String str;
        super.onActivityCreated(bundle);
        InvitationDataModel invitationDataModel = (InvitationDataModel) getArguments().getParcelable("invitation");
        mgj.a((Toolbar) this.b.findViewById(R.id.fm_toolbar), invitationDataModel.a(), getActivity());
        NetworkImageView networkImageView = (NetworkImageView) this.b.findViewById(R.id.fm_item_avatar);
        networkImageView.setDefaultImageResId(R.drawable.fm_ic_avatar);
        networkImageView.setImageUrl(mge.a(invitationDataModel.e, getResources().getDimensionPixelSize(R.dimen.fm_profile_photo_size_small)), mgd.a());
        TextView textView = (TextView) this.b.findViewById(R.id.fm_item_primary_text);
        if (TextUtils.isEmpty(invitationDataModel.d)) {
            str = jlh.a(invitationDataModel.c);
        } else {
            str = invitationDataModel.d;
        }
        textView.setText(str);
        DateFormat dateInstance = DateFormat.getDateInstance(1, getResources().getConfiguration().locale);
        TextView textView2 = (TextView) this.b.findViewById(R.id.fm_item_secondary_text);
        int i = invitationDataModel.g - 1;
        if (i == 2) {
            textView2.setText(getResources().getString(R.string.fm_invitation_sent, new Object[]{dateInstance.format(invitationDataModel.f)}));
        } else if (i != 4) {
            textView2.setText(getResources().getString(R.string.fm_invitation_state_not_sent));
        } else {
            textView2.setText(getResources().getString(R.string.fm_invitation_state_expired));
        }
        this.b.findViewById(R.id.fm_manage_invitation_container).setVisibility(0);
        this.b.findViewById(R.id.fm_manage_invitation_progress_bar).setVisibility(8);
        this.b.findViewById(R.id.fm_uninvite_button).setOnClickListener(new moj(this, invitationDataModel));
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a = (mok) mfy.a(mok.class, getActivity());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fm_fragment_manage_invitation, viewGroup, false);
        this.b = inflate;
        inflate.findViewById(R.id.fm_manage_invitation_container).setVisibility(8);
        this.b.findViewById(R.id.fm_manage_invitation_progress_bar).setVisibility(0);
        return this.b;
    }

    public final void onDetach() {
        super.onDetach();
        this.a = null;
    }
}
