package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.family.widget.ScrollToBottomWebView;

/* renamed from: mql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mql extends Fragment implements mrd {
    public byte[] a;
    public String b;
    public mqk c;
    public View d;
    public ScrollToBottomWebView e;
    private String f;
    private String g;
    private String h;

    public static mql a(byte[] bArr, String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle(5);
        bundle.putByteArray("auditToken", bArr);
        bundle.putString("accountName", str);
        bundle.putString("tosContent", str2);
        bundle.putString("tosContinueButtonText", str3);
        bundle.putString("tosMoreButtonText", str4);
        mql mql = new mql();
        mql.setArguments(bundle);
        return mql;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.c = (mqk) mfy.a(mqk.class, activity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = getArguments().getByteArray("auditToken");
        this.b = getArguments().getString("accountName");
        this.f = getArguments().getString("tosContent");
        this.g = getArguments().getString("tosContinueButtonText");
        this.h = getArguments().getString("tosMoreButtonText");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fm_fragment_tos, viewGroup, false);
        this.d = inflate;
        inflate.findViewById(R.id.fm_tos_layout_more_button).setVisibility(0);
        this.d.findViewById(R.id.fm_tos_layout_continue_button).setVisibility(8);
        ScrollToBottomWebView scrollToBottomWebView = (ScrollToBottomWebView) this.d.findViewById(R.id.fm_tos_container);
        this.e = scrollToBottomWebView;
        scrollToBottomWebView.a = this;
        scrollToBottomWebView.setWebViewClient(new mqf(this));
        this.e.loadData(this.f, "text/html; charset=UTF-8", (String) null);
        Button button = (Button) this.d.findViewById(R.id.fm_tos_layout_continue_button);
        button.setText(this.g);
        button.setOnClickListener(new mqh(this));
        Button button2 = (Button) this.d.findViewById(R.id.fm_tos_layout_more_button);
        button2.setText(this.h);
        button2.setOnClickListener(new mqi(this));
        return this.d;
    }

    public final void onDestroyView() {
        ScrollToBottomWebView scrollToBottomWebView = this.e;
        if (scrollToBottomWebView != null) {
            scrollToBottomWebView.a = null;
        }
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        this.c = null;
    }
}
