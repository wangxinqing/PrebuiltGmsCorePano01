package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.toolbox.NetworkImageView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.family.v2.model.ContactPickerOptionsData;
import com.google.android.gms.family.v2.model.PageData;
import com.google.android.gms.family.v2.model.PageDataMap;
import com.google.android.gms.family.v2.model.ProfileData;

/* renamed from: mkx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mkx extends Fragment implements mfz {
    public mkt a;
    public String b;
    public Integer c;
    public int d;
    public PageDataMap e;
    public ProfileData f;
    public boolean g;
    public ContactPickerOptionsData h;
    private View i;
    private PageData j;

    public final void a() {
        PageDataMap pageDataMap = this.e;
        if (pageDataMap != null && this.c != null && this.f != null) {
            if (pageDataMap.b(5)) {
                this.j = this.e.a(5);
                this.i.findViewById(R.id.fm_invite_intro_screen).setVisibility(0);
                this.i.findViewById(R.id.fm_invite_skip_screen).setVisibility(8);
                this.i.findViewById(R.id.fm_invite_profile_screen).setVisibility(8);
                this.a.b().b(16);
                NetworkImageView networkImageView = (NetworkImageView) this.i.findViewById(R.id.fm_invite_intro_bookend_layout_header_image);
                networkImageView.setDefaultImageResId(R.drawable.fm_img_bookend_header_loading);
                networkImageView.setErrorImageResId(R.drawable.fm_img_bookend_header_default);
                if (this.j.a.containsKey(1)) {
                    networkImageView.setImageUrl((String) this.j.a.get(1), mgd.a());
                }
                if (this.j.a.containsKey(2)) {
                    mgh.a((TextView) this.i.findViewById(R.id.fm_invite_intro_bookend_layout_header_text), (String) this.j.a.get(2), new mgb(this.j, this, this.b));
                }
                if (this.j.a.containsKey(3)) {
                    mgh.a((TextView) this.i.findViewById(R.id.fm_invite_intro_bookend_layout_body_text), (String) this.j.a.get(3), new mgb(this.j, this, this.b));
                }
                Button button = (Button) this.i.findViewById(R.id.fm_invite_intro_bookend_layout_continue_button);
                if (this.j.a.containsKey(4)) {
                    button.setText((CharSequence) this.j.a.get(4));
                }
                button.setOnClickListener(new mki(this));
                Button button2 = (Button) this.i.findViewById(R.id.fm_invite_intro_bookend_layout_skip_button);
                if (this.j.a.containsKey(5)) {
                    button2.setText((CharSequence) this.j.a.get(5));
                }
                button2.setOnClickListener(new mkj(this));
                this.a.i();
            } else if (this.e.b(17)) {
                this.j = this.e.a(17);
                ProfileData profileData = this.f;
                this.i.findViewById(R.id.fm_invite_intro_screen).setVisibility(8);
                this.i.findViewById(R.id.fm_invite_skip_screen).setVisibility(8);
                this.i.findViewById(R.id.fm_invite_profile_screen).setVisibility(0);
                ((NetworkImageView) this.i.findViewById(R.id.fm_invite_profile_manager_avatar)).setImageUrl(mge.a(profileData.e, getResources().getDimensionPixelSize(R.dimen.fm_profile_image_size)), mgd.a());
                ((TextView) this.i.findViewById(R.id.fm_invite_profile_manager_email)).setText(profileData.a);
                if (this.j.a.containsKey(6)) {
                    mgh.a((TextView) this.i.findViewById(R.id.fm_invite_profile_manager_label), (String) this.j.a.get(6), new mgb(this.j, this, this.b));
                }
                if (this.j.a.containsKey(2)) {
                    mgh.a((TextView) this.i.findViewById(R.id.fm_invite_profile_header_text), (String) this.j.a.get(2), new mgb(this.j, this, this.b));
                }
                if (this.j.a.containsKey(3)) {
                    mgh.a((TextView) this.i.findViewById(R.id.fm_invite_profile_body_text), (String) this.j.a.get(3), new mgb(this.j, this, this.b));
                }
                Button button3 = (Button) this.i.findViewById(R.id.fm_invite_profile_continue_button);
                if (this.j.a.containsKey(4)) {
                    button3.setVisibility(0);
                    button3.setText((CharSequence) this.j.a.get(4));
                }
                button3.setOnClickListener(new mkk(this));
                Button button4 = (Button) this.i.findViewById(R.id.fm_invite_profile_skip_button);
                if (this.j.a.containsKey(5)) {
                    button4.setText((CharSequence) this.j.a.get(5));
                }
                button4.setOnClickListener(new mkl(this));
                this.a.i();
            } else if (this.e.b(15)) {
                this.a.a(this.c.intValue(), this.d);
            } else if (this.e.b(7)) {
                this.j = this.e.a(7);
                this.i.findViewById(R.id.fm_invite_intro_screen).setVisibility(8);
                this.i.findViewById(R.id.fm_invite_skip_screen).setVisibility(0);
                this.i.findViewById(R.id.fm_invite_profile_screen).setVisibility(8);
                this.a.b().b(19);
                NetworkImageView networkImageView2 = (NetworkImageView) this.i.findViewById(R.id.fm_bookend_layout_header_image);
                networkImageView2.setDefaultImageResId(R.drawable.fm_img_bookend_header_loading);
                networkImageView2.setErrorImageResId(R.drawable.fm_img_bookend_header_default);
                if (this.j.a.containsKey(1)) {
                    networkImageView2.setImageUrl((String) this.j.a.get(1), mgd.a());
                }
                if (this.j.a.containsKey(2)) {
                    mgh.a((TextView) this.i.findViewById(R.id.fm_bookend_layout_header_text), (String) this.j.a.get(2), new mgb(this.j, this, this.b));
                }
                if (this.j.a.containsKey(3)) {
                    mgh.a((TextView) this.i.findViewById(R.id.fm_bookend_layout_body_text), (String) this.j.a.get(3), new mgb(this.j, this, this.b));
                }
                Button button5 = (Button) this.i.findViewById(R.id.fm_bookend_layout_continue_button);
                if (this.j.a.containsKey(4)) {
                    button5.setText((CharSequence) this.j.a.get(4));
                }
                button5.setOnClickListener(new mkm(this));
                this.a.i();
            } else {
                b();
                this.a.i();
            }
        }
    }

    public final void b() {
        mfu.a(getActivity(), new mkg(this), new mkh(this)).show();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.a.h();
        getLoaderManager().initLoader(0, (Bundle) null, new mkr(this));
        getLoaderManager().initLoader(1, (Bundle) null, new mks(this));
        if (this.a.p() != null) {
            this.f = this.a.p();
        } else {
            getLoaderManager().initLoader(2, (Bundle) null, new mkw(this));
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a = (mkt) mfy.a(mkt.class, activity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = getArguments().getString("accountName");
        this.d = getArguments().getInt("inviteeRole");
        this.g = getArguments().getBoolean("isDirectAddInvitations");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.i = layoutInflater.inflate(R.layout.fm_fragment_v2_invite_intro, viewGroup, false);
        this.a.h();
        return this.i;
    }

    public final void onDetach() {
        super.onDetach();
        this.a = null;
    }
}
