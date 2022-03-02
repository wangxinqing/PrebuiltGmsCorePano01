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
import com.google.android.gms.family.v2.model.PageData;

/* renamed from: mhs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mhs extends Fragment implements mfz {
    public mhr a;
    private PageData b;
    private String c;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a = (mhr) mfy.a(mhr.class, activity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = getArguments().getString("accountName");
        this.b = (PageData) getArguments().getParcelable("pageData");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fm_layout_v2_bookend, viewGroup, false);
        NetworkImageView networkImageView = (NetworkImageView) inflate.findViewById(R.id.fm_bookend_layout_header_image);
        networkImageView.setDefaultImageResId(R.drawable.fm_img_bookend_header_loading);
        networkImageView.setErrorImageResId(R.drawable.fm_img_bookend_header_default);
        this.a.b().b(10);
        if (this.b.a.containsKey(1)) {
            networkImageView.setImageUrl((String) this.b.a.get(1), mgd.a());
        }
        if (this.b.a.containsKey(2)) {
            mgh.a((TextView) inflate.findViewById(R.id.fm_bookend_layout_header_text), (String) this.b.a.get(2), new mgb(this.b, this, this.c));
        }
        if (this.b.a.containsKey(3)) {
            mgh.a((TextView) inflate.findViewById(R.id.fm_bookend_layout_body_text), (String) this.b.a.get(3), new mgb(this.b, this, this.c));
        }
        Button button = (Button) inflate.findViewById(R.id.fm_bookend_layout_continue_button);
        if (this.b.a.containsKey(4)) {
            button.setText((CharSequence) this.b.a.get(4));
        }
        button.setOnClickListener(new mhq(this));
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        this.a = null;
    }
}
