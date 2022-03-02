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
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;

/* renamed from: puk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class puk extends Fragment {
    private AppIndexingErrorInfo a;
    private View b;
    private View c;
    private Thing d;
    private ActionImpl e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private String k;
    private pud l;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.l = new pud(activity);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.generic_details_fragment, viewGroup, false);
        inflate.findViewById(R.id.error_details_fields).setVisibility(0);
        this.f = (TextView) inflate.findViewById(R.id.call_type_text_view);
        this.g = (TextView) inflate.findViewById(R.id.error_code_text_view);
        this.h = (TextView) inflate.findViewById(R.id.error_message_text_view);
        this.i = (TextView) inflate.findViewById(R.id.created_timestamp_text_view);
        TextView textView = (TextView) inflate.findViewById(R.id.url_text_view);
        this.j = textView;
        textView.setOnClickListener(this.l);
        this.b = inflate.findViewById(R.id.thing_view);
        this.c = inflate.findViewById(R.id.user_action_view);
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
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        getActivity().setTitle((int) R.string.error_details_title);
        sg aE = ((bjs) getActivity()).aE();
        if (aE != null) {
            aE.b((CharSequence) "");
        }
        AppIndexingErrorInfo appIndexingErrorInfo = (AppIndexingErrorInfo) getArguments().getParcelable("error");
        this.a = appIndexingErrorInfo;
        this.d = appIndexingErrorInfo.f;
        this.e = appIndexingErrorInfo.g;
        String str = appIndexingErrorInfo.a;
        this.k = str;
        this.l.a = str;
        this.f.setText(pue.a((aolv) amrh.a(aolv.a(appIndexingErrorInfo.b), aolv.UNRECOGNIZED)));
        this.g.setText(pue.a((aolx) amrh.a(aolx.a(this.a.c), aolx.UNRECOGNIZED)));
        this.h.setText(this.a.d);
        this.i.setText(pue.a(this.a.e));
        Thing thing = this.d;
        if (thing != null) {
            pue.a(this.j, thing.d);
            pue.a(this.b.findViewById(R.id.indexable_text), this.d);
            this.b.setVisibility(0);
            this.c.setVisibility(8);
            return;
        }
        ActionImpl actionImpl = this.e;
        if (actionImpl != null) {
            pue.a(this.j, actionImpl.c);
            pue.a(this.c, this.e);
            this.b.setVisibility(8);
            this.c.setVisibility(0);
            return;
        }
        this.j.setText("null");
        this.b.setVisibility(8);
        this.c.setVisibility(8);
    }
}
