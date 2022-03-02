package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;

/* renamed from: pwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pwi extends Fragment {
    public View a;
    public View b;
    public TextView c;
    private AppIndexingUserActionInfo d;
    private View e;
    private View f;
    private TextView g;
    private TextView h;
    private String i;
    private put j;
    private pud k;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.k = new pud(activity);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.generic_details_fragment, viewGroup, false);
        this.a = inflate.findViewById(R.id.generic_info_main_view);
        this.b = inflate.findViewById(R.id.progress_bar);
        this.g = (TextView) inflate.findViewById(R.id.created_timestamp_text_view);
        TextView textView = (TextView) inflate.findViewById(R.id.url_text_view);
        this.h = textView;
        textView.setOnClickListener(this.k);
        View findViewById = inflate.findViewById(R.id.user_action_view);
        this.e = findViewById;
        findViewById.setVisibility(0);
        if (((Boolean) ozx.az.c()).booleanValue()) {
            View findViewById2 = inflate.findViewById(R.id.thing_view);
            this.f = findViewById2;
            findViewById2.setVisibility(0);
            ((TextView) this.f.findViewById(R.id.indexable_label)).setText(getActivity().getString(R.string.associated_indexable_label, new Object[]{"INDEXABLE"}));
            this.c = (TextView) this.f.findViewById(R.id.indexable_text);
        }
        AppIndexingUserActionInfo appIndexingUserActionInfo = (AppIndexingUserActionInfo) getArguments().getParcelable("userAction");
        this.d = appIndexingUserActionInfo;
        String str = appIndexingUserActionInfo.a;
        this.i = str;
        this.k.a = str;
        this.g.setText(pue.a(appIndexingUserActionInfo.b));
        pue.a(this.h, this.d.c.c);
        pue.a(this.e, this.d.c);
        int i2 = Build.VERSION.SDK_INT;
        inflate.findViewById(R.id.user_action_label).setTextDirection(5);
        inflate.findViewById(R.id.error_code_label).setTextDirection(5);
        inflate.findViewById(R.id.call_type_label).setTextDirection(5);
        inflate.findViewById(R.id.error_message_label).setTextDirection(5);
        inflate.findViewById(R.id.timestamp_label).setTextDirection(5);
        inflate.findViewById(R.id.url_label).setTextDirection(5);
        inflate.findViewById(R.id.indexable_label).setTextDirection(5);
        inflate.findViewById(R.id.in_apps_preview_label).setTextDirection(5);
        inflate.findViewById(R.id.user_action_text).setTextDirection(5);
        inflate.findViewById(R.id.error_code_text_view).setTextDirection(5);
        inflate.findViewById(R.id.call_type_text_view).setTextDirection(5);
        inflate.findViewById(R.id.error_message_text_view).setTextDirection(5);
        inflate.findViewById(R.id.created_timestamp_text_view).setTextDirection(5);
        inflate.findViewById(R.id.accessed_timestamp_text_view).setTextDirection(5);
        inflate.findViewById(R.id.url_text_view).setTextDirection(5);
        inflate.findViewById(R.id.indexable_text).setTextDirection(5);
        String str2 = this.d.c.c;
        if (((Boolean) ozx.az.c()).booleanValue()) {
            pwh pwh = new pwh(this, getActivity().getString(R.string.no_matching_indexable, new Object[]{"User Action", "FirebaseAppIndex.update()"}));
            this.j = pwh;
            pwh.execute(new String[]{str2, this.i});
        }
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        put put = this.j;
        if (put != null) {
            put.cancel(false);
        }
    }

    public final void onResume() {
        super.onResume();
        getActivity().setTitle((CharSequence) getActivity().getString(R.string.user_action_details_title, new Object[]{"User Action"}));
        sg aE = ((bjs) getActivity()).aE();
        if (aE != null) {
            aE.b((CharSequence) "");
        }
    }
}
