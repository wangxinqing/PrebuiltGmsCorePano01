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
import com.google.android.gms.family.widget.ScrollToBottomView;

/* renamed from: mkf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mkf extends Fragment implements mfz, mrc, mia {
    public mke a;
    public String b;
    public PageData c;
    public PageData d;
    public PageData e;
    public ScrollToBottomView f;
    private View g;

    public static mkf a(String str, PageData pageData, PageData pageData2, PageData pageData3) {
        mkf mkf = new mkf();
        Bundle bundle = new Bundle(4);
        bundle.putString("accountName", str);
        bundle.putParcelable("pageData", pageData);
        bundle.putParcelable("fopCancelDialogData", pageData2);
        bundle.putParcelable("postFopCancelDialogData", pageData3);
        mkf.setArguments(bundle);
        return mkf;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a = (mke) mfy.a(mke.class, activity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = (PageData) getArguments().getParcelable("pageData");
        this.b = getArguments().getString("accountName");
        this.d = (PageData) getArguments().getParcelable("fopCancelDialogData");
        this.e = (PageData) getArguments().getParcelable("postFopCancelDialogData");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fm_layout_v2_headless_fop, viewGroup, false);
        this.g = inflate;
        inflate.findViewById(R.id.fm_headless_fop_layout_one_button_bar).setVisibility(0);
        this.g.findViewById(R.id.fm_headless_fop_layout_two_button_bar).setVisibility(8);
        ScrollToBottomView scrollToBottomView = (ScrollToBottomView) this.g.findViewById(R.id.fm_headless_fop_scrollview);
        this.f = scrollToBottomView;
        scrollToBottomView.a = this;
        NetworkImageView networkImageView = (NetworkImageView) this.g.findViewById(R.id.fm_headless_fop_layout_header_image);
        networkImageView.setDefaultImageResId(R.drawable.fm_img_bookend_header_loading);
        networkImageView.setErrorImageResId(R.drawable.fm_img_bookend_header_default);
        this.a.b().b(13);
        if (this.c.a.containsKey(1)) {
            networkImageView.setImageUrl((String) this.c.a.get(1), mgd.a());
        }
        if (this.c.a.containsKey(11)) {
            ((TextView) this.g.findViewById(R.id.fm_headless_fop_layout_card_info)).setText((CharSequence) this.c.a.get(11));
        }
        if (this.c.a.containsKey(2)) {
            mgh.a((TextView) this.g.findViewById(R.id.fm_headless_fop_layout_header_text), (String) this.c.a.get(2), new mgb(this.c, this, this.b));
        }
        if (this.c.a.containsKey(3)) {
            mgh.a((TextView) this.g.findViewById(R.id.fm_headless_fop_layout_body_text), (String) this.c.a.get(3), new mgb(this.c, this, this.b));
        }
        if (this.c.a.containsKey(12)) {
            mgh.a((TextView) this.g.findViewById(R.id.fm_headless_fop_layout_footer_text), (String) this.c.a.get(12), new mgb(this.c, this, this.b));
        }
        Button button = (Button) this.g.findViewById(R.id.fm_headless_fop_layout_continue_button);
        if (this.c.a.containsKey(16) && !this.a.u()) {
            button.setText((CharSequence) this.c.a.get(16));
        } else if (this.c.a.containsKey(4)) {
            button.setText((CharSequence) this.c.a.get(4));
        }
        button.setOnClickListener(new mjy(this));
        Button button2 = (Button) this.g.findViewById(R.id.fm_headless_fop_layout_cancel_button);
        if (this.c.a.containsKey(5)) {
            button2.setText((CharSequence) this.c.a.get(5));
        }
        button2.setOnClickListener(new mkb(this));
        Button button3 = (Button) this.g.findViewById(R.id.fm_headless_fop_layout_change_button);
        if (!this.c.a.containsKey(13) || this.a.u()) {
            button3.setVisibility(8);
        } else {
            button3.setText((CharSequence) this.c.a.get(13));
            button3.setOnClickListener(new mkc(this));
        }
        Button button4 = (Button) this.g.findViewById(R.id.fm_headless_fop_layout_more_button);
        if (this.c.a.containsKey(7)) {
            button4.setText((CharSequence) this.c.a.get(7));
        }
        button4.setOnClickListener(new mkd(this));
        return this.g;
    }

    public final void onDetach() {
        super.onDetach();
        this.a = null;
    }

    public final void onResume() {
        super.onResume();
        Button button = (Button) this.g.findViewById(R.id.fm_headless_fop_layout_change_button);
        Button button2 = (Button) this.g.findViewById(R.id.fm_headless_fop_layout_continue_button);
        if (this.a.u()) {
            button.setVisibility(8);
            if (this.c.a.containsKey(4)) {
                button2.setText((CharSequence) this.c.a.get(4));
            }
        }
    }

    public final void a() {
        View view = this.g;
        if (view != null) {
            view.findViewById(R.id.fm_headless_fop_layout_one_button_bar).setVisibility(8);
            this.g.findViewById(R.id.fm_headless_fop_layout_two_button_bar).setVisibility(0);
        }
    }

    public final void a(PageData pageData) {
        View view = this.g;
        if (view != null) {
            NetworkImageView networkImageView = (NetworkImageView) view.findViewById(R.id.fm_headless_fop_layout_header_image);
            if (pageData.a.containsKey(1)) {
                networkImageView.setImageUrl((String) this.c.a.get(1), mgd.a());
            }
            if (pageData.a.containsKey(11)) {
                ((TextView) this.g.findViewById(R.id.fm_headless_fop_layout_card_info)).setText((CharSequence) this.c.a.get(11));
            }
        }
    }
}
