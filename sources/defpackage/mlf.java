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

/* renamed from: mlf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mlf extends Fragment implements mfz, mrc {
    public mle a;
    public ScrollToBottomView b;
    public String c;
    private View d;
    private PageData e;
    private byte[] f;

    public final acwa a(String str, int i) {
        egm a2 = egj.a(getActivity());
        egr egr = new egr();
        egr.b = this.c;
        egr.a = 40;
        egr.b();
        aqnk aqnk = (aqnk) aqnl.g.o();
        aucd o = aqnt.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqnt aqnt = (aqnt) o.b;
        aqnt.b = 1;
        aqnt.a |= 1;
        aucd o2 = aqnr.d.o();
        aucd o3 = aqnq.c.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aqnq aqnq = (aqnq) o3.b;
        str.getClass();
        aqnq.a |= 1;
        aqnq.b = str;
        aqnq aqnq2 = (aqnq) o3.i();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqnr aqnr = (aqnr) o2.b;
        aqnq2.getClass();
        aqnr.b = aqnq2;
        aqnr.a |= 1;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqnt aqnt2 = (aqnt) o.b;
        aqnr aqnr2 = (aqnr) o2.i();
        aqnr2.getClass();
        aqnt2.c = aqnr2;
        aqnt2.a |= 2;
        aqnk.a(o);
        aucd o4 = aqnt.d.o();
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        aqnt aqnt3 = (aqnt) o4.b;
        aqnt3.b = 2;
        aqnt3.a |= 1;
        aucd o5 = aqnr.d.o();
        aucd o6 = aqnq.c.o();
        if (o6.c) {
            o6.c();
            o6.c = false;
        }
        aqnq aqnq3 = (aqnq) o6.b;
        str.getClass();
        aqnq3.a |= 1;
        aqnq3.b = str;
        aqnq aqnq4 = (aqnq) o6.i();
        if (o5.c) {
            o5.c();
            o5.c = false;
        }
        aqnr aqnr3 = (aqnr) o5.b;
        aqnq4.getClass();
        aqnr3.b = aqnq4;
        aqnr3.a |= 1;
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        aqnt aqnt4 = (aqnt) o4.b;
        aqnr aqnr4 = (aqnr) o5.i();
        aqnr4.getClass();
        aqnt4.c = aqnr4;
        aqnt4.a |= 2;
        aqnk.a(o4);
        aucd o7 = aqnu.d.o();
        if (o7.c) {
            o7.c();
            o7.c = false;
        }
        aqnu aqnu = (aqnu) o7.b;
        aqnu.b = 36;
        aqnu.a |= 1;
        aucd o8 = aqnv.f.o();
        aucd o9 = aqnx.c.o();
        if (o9.c) {
            o9.c();
            o9.c = false;
        }
        aqnx aqnx = (aqnx) o9.b;
        aqnx.b = i - 1;
        aqnx.a |= 1;
        aqnx aqnx2 = (aqnx) o9.i();
        if (o8.c) {
            o8.c();
            o8.c = false;
        }
        aqnv aqnv = (aqnv) o8.b;
        aqnx2.getClass();
        aqnv.e = aqnx2;
        aqnv.a |= 1024;
        if (o7.c) {
            o7.c();
            o7.c = false;
        }
        aqnu aqnu2 = (aqnu) o7.b;
        aqnv aqnv2 = (aqnv) o8.i();
        aqnv2.getClass();
        aqnu2.c = aqnv2;
        aqnu2.a |= 2;
        if (aqnk.c) {
            aqnk.c();
            aqnk.c = false;
        }
        aqnl aqnl = (aqnl) aqnk.b;
        aqnu aqnu3 = (aqnu) o7.i();
        aqnu3.getClass();
        aqnl.e = aqnu3;
        aqnl.a |= 4;
        aucd o10 = aqob.d.o();
        if (o10.c) {
            o10.c();
            o10.c = false;
        }
        aqob aqob = (aqob) o10.b;
        aqob.b = 44;
        aqob.a |= 1;
        if (aqnk.c) {
            aqnk.c();
            aqnk.c = false;
        }
        aqnl aqnl2 = (aqnl) aqnk.b;
        aqob aqob2 = (aqob) o10.i();
        aqob2.getClass();
        aqnl2.f = aqob2;
        aqnl2.a |= 8;
        egr.a(((aqnl) aqnk.i()).k());
        egr.c = this.f;
        return a2.a(egr.a());
    }

    public final acwa b() {
        acwd acwd = new acwd();
        new mld(this, acwd).start();
        return acwd.a;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a = (mle) mfy.a(mle.class, activity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f = getArguments().getByteArray("auditToken");
        this.c = getArguments().getString("accountName");
        this.e = (PageData) getArguments().getParcelable("pageData");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fm_layout_v2_product_intro, viewGroup, false);
        this.d = inflate;
        inflate.findViewById(R.id.fm_product_intro_layout_more_button).setVisibility(0);
        this.d.findViewById(R.id.fm_product_intro_layout_continue_button).setVisibility(8);
        this.d.findViewById(R.id.fm_product_intro_layout_skip_button).setVisibility(8);
        ScrollToBottomView scrollToBottomView = (ScrollToBottomView) this.d.findViewById(R.id.fm_product_intro_scrollview);
        this.b = scrollToBottomView;
        scrollToBottomView.a = this;
        ((NetworkImageView) this.d.findViewById(R.id.fm_product_intro_layout_header_image)).setImageUrl((String) this.e.a.get(1), mgd.a());
        if (this.e.a.containsKey(2)) {
            mgh.a((TextView) this.d.findViewById(R.id.fm_product_intro_layout_header_text), (String) this.e.a.get(2), new mgb(this.e, this, this.c));
        }
        if (this.e.a.containsKey(12)) {
            mgh.a((TextView) this.d.findViewById(R.id.fm_product_intro_layout_subheader_text), (String) this.e.a.get(12), new mgb(this.e, this, this.c));
        }
        if (this.e.a.containsKey(3)) {
            mgh.a((TextView) this.d.findViewById(R.id.fm_product_intro_layout_body_text), (String) this.e.a.get(3), new mgb(this.e, this, this.c));
        }
        this.a.b().b(33);
        Button button = (Button) this.d.findViewById(R.id.fm_product_intro_layout_continue_button);
        if (this.e.a.containsKey(4)) {
            button.setText((CharSequence) this.e.a.get(4));
        }
        button.setOnClickListener(new mkz(this));
        Button button2 = (Button) this.d.findViewById(R.id.fm_product_intro_layout_skip_button);
        if (this.e.a.containsKey(5)) {
            button2.setText((CharSequence) this.e.a.get(5));
        }
        button2.setOnClickListener(new mlb(this));
        Button button3 = (Button) this.d.findViewById(R.id.fm_product_intro_layout_more_button);
        if (this.e.a.containsKey(7)) {
            button3.setText((CharSequence) this.e.a.get(7));
        }
        button3.setOnClickListener(new mlc(this));
        return this.d;
    }

    public final void onDestroyView() {
        ScrollToBottomView scrollToBottomView = this.b;
        if (scrollToBottomView != null) {
            scrollToBottomView.a = null;
        }
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        this.a = null;
    }

    public final void a() {
        View view = this.d;
        if (view != null) {
            view.findViewById(R.id.fm_product_intro_layout_more_button).setVisibility(8);
            if (this.e.a.containsKey(4)) {
                this.d.findViewById(R.id.fm_product_intro_layout_continue_button).setVisibility(0);
            }
            if (this.e.a.containsKey(5)) {
                this.d.findViewById(R.id.fm_product_intro_layout_skip_button).setVisibility(0);
            }
        }
    }
}
