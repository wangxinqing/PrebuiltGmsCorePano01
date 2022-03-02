package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.fastpair.devices.DevicesListFragment$1;

/* renamed from: mrt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mrt extends Fragment {
    public mrk a;
    public mtc b;
    public final Handler c = new qvr();
    public arxg d;
    private arxe e;
    private final BroadcastReceiver f = new DevicesListFragment$1(this, "nearby");
    private View g;
    private TextView h;

    private final void c() {
        this.c.removeCallbacksAndMessages((Object) null);
        this.g.setVisibility(8);
        mtc mtc = this.b;
        mtc.b.clear();
        mtc.c.clear();
        mtc.a();
    }

    public final boolean b() {
        return this.g.getVisibility() == 0;
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.devices_menu, menu);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.devices_fragment_devices_list, viewGroup, false);
        mrm mrm = (mrm) getActivity();
        mrm.a((Toolbar) inflate.findViewById(R.id.toolbar));
        mrm.aE().b(true);
        mrm.aE().a(true);
        setHasOptionsMenu(true);
        this.d = new arxg(getContext());
        CompoundButton compoundButton = (CompoundButton) inflate.findViewById(R.id.show_notifications);
        compoundButton.setChecked(this.d.e());
        ((LinearLayout) inflate.findViewById(R.id.notifications)).setOnClickListener(new mrn(compoundButton));
        compoundButton.setOnCheckedChangeListener(new mro(this));
        View findViewById = inflate.findViewById(R.id.fast_pair_devices);
        if (jgu.d(getContext(), getContext().getPackageName()).isEmpty()) {
            inflate.findViewById(R.id.save_devices).setEnabled(false);
            inflate.findViewById(R.id.no_accounts_error).setVisibility(0);
        } else {
            findViewById.setOnClickListener(new mrp(mrm));
        }
        this.g = inflate.findViewById(R.id.scanning_indicator);
        this.h = (TextView) inflate.findViewById(R.id.error);
        mrk mrk = new mrk(getContext());
        this.a = mrk;
        TextView textView = this.h;
        View view = mrk.f;
        if (view != null) {
            view.setVisibility(8);
        }
        mrk.f = textView;
        mrk.c();
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.list);
        getContext();
        recyclerView.setLayoutManager(new abk());
        recyclerView.setAdapter(this.a);
        mtc mtc = new mtc(getContext());
        this.b = mtc;
        mtc.d = new mrq(this);
        return inflate;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        mrl.a(getActivity());
        mtd.a(getContext(), asom.DEVICES_LIST_VIEW_ACTION_BAR_HELP_LINK_CLICKED);
        return true;
    }

    public final void onResume() {
        super.onResume();
        ((mrm) getActivity()).a(R.string.common_devices);
    }

    public final void onStart() {
        super.onStart();
        if (this.e == null) {
            this.e = new arxe(getContext(), "com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_ACTIVITY", new mrr(this));
        }
        this.e.a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.location.PROVIDERS_CHANGED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        getContext().registerReceiver(this.f, intentFilter);
        a();
    }

    public final void onStop() {
        c();
        getContext().unregisterReceiver(this.f);
        this.e.b();
        mtd.a(getContext(), asom.DEVICES_LIST_VIEW_EXIT);
        super.onStop();
    }

    public final void a() {
        if (arxk.a(getContext()) || aymq.f()) {
            this.h.setText((CharSequence) null);
        } else {
            this.h.setText(R.string.devices_no_loc);
        }
        if (!arxk.a(getContext(), tfx.a(getContext()))) {
            c();
        } else if (!b()) {
            getContext().startService(arza.a(getContext()));
            this.g.setVisibility(0);
            this.c.postDelayed(new mrs(this), 12000);
        }
    }
}
