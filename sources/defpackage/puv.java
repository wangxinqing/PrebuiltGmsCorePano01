package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: puv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class puv extends Fragment {
    public View a;
    public View b;
    public View c;
    private TextView d;
    private TextView e;
    private TextView f;
    private pux g;
    private View h;
    private Button i;
    private put j;
    private pud k;
    private puc l;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.k = new pud(activity);
        this.l = new puc(activity);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.generic_details_fragment, viewGroup, false);
        this.a = inflate.findViewById(R.id.generic_info_main_view);
        this.b = inflate.findViewById(R.id.progress_bar);
        this.d = (TextView) inflate.findViewById(R.id.created_timestamp_text_view);
        TextView textView = (TextView) inflate.findViewById(R.id.accessed_timestamp_text_view);
        this.e = textView;
        textView.setVisibility(0);
        TextView textView2 = (TextView) inflate.findViewById(R.id.url_text_view);
        this.f = textView2;
        textView2.setOnClickListener(this.k);
        View findViewById = inflate.findViewById(R.id.thing_view);
        this.c = findViewById;
        findViewById.setVisibility(0);
        Bundle arguments = getArguments();
        pux pux = r7;
        pux pux2 = new pux(arguments.getString("indexableName"), arguments.getString("indexableUrl"), arguments.getLong("createdTimestamp"), arguments.getLong("accessedTimestamp"), arguments.getString("packageName"), arguments.getString("corpusName"), arguments.getString("indexableType"));
        this.g = pux;
        this.k.a = pux.e;
        if (!pux.a.isEmpty()) {
            View findViewById2 = inflate.findViewById(R.id.in_apps_preview_view);
            this.h = findViewById2;
            findViewById2.setVisibility(0);
            this.i = (Button) inflate.findViewById(R.id.in_apps_preview_button);
            puc puc = this.l;
            puc.a = this.g;
            this.i.setOnClickListener(puc);
        }
        int i2 = Build.VERSION.SDK_INT;
        inflate.findViewById(R.id.in_apps_preview_description).setTextDirection(5);
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
        this.d.setText(Html.fromHtml(getActivity().getString(R.string.created_timestamp, new Object[]{pue.a(this.g.c)})));
        this.e.setText(Html.fromHtml(getActivity().getString(R.string.accessed_timestamp, new Object[]{pue.a(this.g.d)})));
        pue.a(this.f, this.g.b);
        puu puu = new puu(this, getActivity().getString(R.string.indexable_not_indexed, new Object[]{"Indexable"}));
        this.j = puu;
        pux pux3 = this.g;
        puu.execute(new String[]{pux3.b, pux3.e});
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
        getActivity().setTitle((CharSequence) getActivity().getString(R.string.indexable_details_title, new Object[]{"Indexable"}));
        sg aE = ((bjs) getActivity()).aE();
        if (aE != null) {
            aE.b((CharSequence) "");
        }
    }
}
