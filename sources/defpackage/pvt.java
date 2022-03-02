package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pvt extends Fragment {
    public List a;
    public pui b;
    public ListView c;
    public View d;
    public View e;
    public final ArrayList f = new ArrayList();
    public ListView g;
    public pwl h;
    public final ArrayList i = new ArrayList();
    public ListView j;
    public pup k;
    public Button l;
    public TextView m;
    public TextView n;
    public Toast o;
    public Toast p;
    public SwipeRefreshLayout q;
    public Activity r;
    public String s;
    public boolean t;
    private TextView u;
    private TextView v;
    private Button w;
    private String x;

    /* access modifiers changed from: package-private */
    public final void a() {
        new pvr(this).execute(new String[]{this.s});
    }

    public final boolean b() {
        boolean z = getActivity().getPreferences(0).getBoolean("errorCacheEnabled", false);
        if (!((Boolean) ozx.at.c()).booleanValue() || !z) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        boolean z = getActivity().getPreferences(0).getBoolean("errorCacheEnabled", false);
        if (!((Boolean) ozx.aw.c()).booleanValue() || !z) {
            return false;
        }
        return true;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.r = activity;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.package_details_fragment, viewGroup, false);
        this.d = inflate.findViewById(R.id.package_details_main_view);
        this.e = inflate.findViewById(R.id.package_details_progress_bar);
        ListView listView = (ListView) inflate.findViewById(R.id.corpora_list_view);
        this.c = listView;
        listView.setEmptyView(inflate.findViewById(R.id.no_indexable_types_message));
        this.a = new ArrayList();
        pui pui = new pui(getActivity(), this.a);
        this.b = pui;
        this.c.setAdapter(pui);
        this.c.setOnItemClickListener(new pvj(this));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_container);
        this.q = swipeRefreshLayout;
        swipeRefreshLayout.a = new pvk(this);
        if (c()) {
            TextView textView = (TextView) inflate.findViewById(R.id.user_actions_section_label);
            this.u = textView;
            textView.setVisibility(0);
            inflate.findViewById(R.id.user_actions_separator).setVisibility(0);
            ListView listView2 = (ListView) inflate.findViewById(R.id.user_action_type_list_view);
            this.g = listView2;
            listView2.setVisibility(0);
            this.g.setEmptyView(inflate.findViewById(R.id.no_user_actions_message));
            pwl pwl = new pwl(getActivity(), this.f);
            this.h = pwl;
            this.g.setAdapter(pwl);
            this.g.setOnItemClickListener(new pvl(this));
        }
        if (b()) {
            TextView textView2 = (TextView) inflate.findViewById(R.id.errors_section_label);
            this.v = textView2;
            textView2.setVisibility(0);
            inflate.findViewById(R.id.errors_separator).setVisibility(0);
            ListView listView3 = (ListView) inflate.findViewById(R.id.errors_list_view);
            this.j = listView3;
            listView3.setVisibility(0);
            this.j.setEmptyView(inflate.findViewById(R.id.no_errors_message));
            pup pup = new pup(getActivity(), this.i);
            this.k = pup;
            this.j.setAdapter(pup);
            this.j.setOnItemClickListener(new pvm(this));
            Button button = (Button) inflate.findViewById(R.id.clear_cache_button);
            this.l = button;
            button.setEnabled(false);
            this.l.setVisibility(0);
            this.l.setOnClickListener(new pvn(this));
            this.p = Toast.makeText(getActivity(), R.string.error_cache_cleared_toast, 0);
        }
        TextView textView3 = (TextView) inflate.findViewById(R.id.update_index_description);
        this.m = textView3;
        if (!this.t) {
            textView3.setText(this.r.getString(R.string.update_index_description_cannot_respond, new Object[]{"UPDATE_INDEX"}));
        }
        Button button2 = (Button) inflate.findViewById(R.id.send_intent_button);
        this.w = button2;
        button2.setOnClickListener(new pvo(this));
        this.o = Toast.makeText(getActivity(), this.r.getString(R.string.update_index_toast, new Object[]{"UPDATE_INDEX"}), 0);
        this.s = getArguments().getString("packageName");
        this.x = getArguments().getString("appName");
        boolean z = getArguments().getBoolean("supportsRebuild");
        this.t = z;
        this.w.setEnabled(z);
        TextView textView4 = (TextView) inflate.findViewById(R.id.missing_broadcast_receiver);
        this.n = textView4;
        textView4.setText(pue.b(this.r.getString(R.string.missing_broadcast_receiver, new Object[]{"UPDATE_INDEX"})));
        this.n.setMovementMethod(LinkMovementMethod.getInstance());
        int i2 = Build.VERSION.SDK_INT;
        inflate.findViewById(R.id.update_index_description).setTextDirection(5);
        inflate.findViewById(R.id.indexable_types_section_label).setTextDirection(5);
        inflate.findViewById(R.id.user_actions_section_label).setTextDirection(5);
        inflate.findViewById(R.id.errors_section_label).setTextDirection(5);
        inflate.findViewById(R.id.update_index_label).setTextDirection(5);
        inflate.findViewById(R.id.no_indexable_types_message).setTextDirection(5);
        inflate.findViewById(R.id.no_user_actions_message).setTextDirection(5);
        inflate.findViewById(R.id.no_errors_message).setTextDirection(5);
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        getActivity().setTitle((int) R.string.package_details_title);
        sg aE = ((bjs) getActivity()).aE();
        if (aE != null) {
            aE.b((CharSequence) this.x);
        }
        a();
    }
}
