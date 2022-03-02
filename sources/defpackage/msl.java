package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: msl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class msl extends Fragment {
    public arxt a;
    public List b;
    public Spinner c;
    public SwitchCompat d;
    public View e;
    public ProgressBar f;
    public RecyclerView g;
    public mrx h;
    private final List i = new ArrayList();
    private Executor j;
    private msi k;
    private TextView l;
    private final AdapterView.OnItemSelectedListener m = new msh(this);

    private final void d() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.addAll((Collection) this.a.a((Account) this.b.get(this.c.getSelectedItemPosition())).get());
        } catch (InterruptedException | ExecutionException e2) {
            anih anih = (anih) mte.a.c();
            anih.a(e2);
            ((anih) anih.a("msl", "d", 247, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error getting devices from Footprints.");
        }
        if (getActivity() != null) {
            getActivity().runOnUiThread(new mse(this, arrayList));
        }
    }

    public final void a() {
        ((anih) ((anih) mte.a.d()).a("msl", "a", 204, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairAccountSettingsFragment: updateAccountSelection");
        Account b2 = b();
        try {
            this.l.setText(getString(R.string.fast_pair_saved_to_account, b2.name));
        } catch (NullPointerException e2) {
            anih anih = (anih) mte.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("msl", "a", 210, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Fast Pair resource string not found.");
        }
        this.f.setVisibility(0);
        this.h.a(amzy.h());
        this.d.setEnabled(false);
        if (getContext() != null) {
            mtd.a(getContext(), asom.FAST_PAIR_ACCOUNT_SETTINGS_SWITCHED);
        }
        c().execute(new msd(this, b2));
    }

    public final Account b() {
        return (Account) this.b.get(this.c.getSelectedItemPosition());
    }

    public final Executor c() {
        if (this.j == null) {
            this.j = jfm.b(9);
        }
        return this.j;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        List d2 = jgu.d(getContext(), getContext().getPackageName());
        this.b = d2;
        if (d2.isEmpty()) {
            ((anih) ((anih) mte.a.c()).a("msl", "onCreate", 88, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No accounts on device, we shouldn't be here!");
            getActivity().getFragmentManager().popBackStackImmediate();
        }
        this.a = new arxt(getContext(), arwg.a("FastPair").c());
        mtd.a(getContext(), asom.FAST_PAIR_ACCOUNT_SETTINGS_LAUNCHED);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.devices_menu, menu);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fast_pair_fragment_account_settings, viewGroup, false);
        bjs bjs = (bjs) getActivity();
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        bjs.a(toolbar);
        bjs.aE().c((int) R.string.fast_pair_account_settings_title);
        bjs.aE().b(true);
        bjs.aE().a(true);
        setHasOptionsMenu(true);
        toolbar.a((View.OnClickListener) new mry(this));
        SwitchCompat switchCompat = (SwitchCompat) inflate.findViewById(R.id.save_devices);
        this.d = switchCompat;
        switchCompat.setOnCheckedChangeListener(new mrz(this));
        inflate.findViewById(R.id.save_devices_preference).setOnClickListener(new msa(this));
        this.c = (Spinner) inflate.findViewById(R.id.account_spinner);
        msi msi = new msi(bjs, this.b);
        this.k = msi;
        this.c.setAdapter(msi);
        this.c.setOnItemSelectedListener(this.m);
        this.e = inflate.findViewById(R.id.list_title_holder);
        this.l = (TextView) inflate.findViewById(R.id.saved_to_account);
        this.f = (ProgressBar) inflate.findViewById(R.id.loading_indicator);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.list);
        this.g = recyclerView;
        getContext();
        recyclerView.setLayoutManager(new abk());
        mrx mrx = new mrx(getActivity(), this.g);
        this.h = mrx;
        this.g.setAdapter(mrx);
        a();
        for (Account account : this.b) {
            msk msk = new msk(account, this);
            this.i.add(msk);
            this.a.a((afht) msk, account);
        }
        return inflate;
    }

    public final void onDestroyView() {
        this.a.c();
        List list = this.i;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            msk msk = (msk) list.get(i2);
            msk.a = null;
            msk.b = null;
        }
        this.i.clear();
        super.onDestroyView();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        mrl.a(getActivity());
        mtd.a(getContext(), asom.FAST_PAIR_ACCOUNT_SETTINGS_ACTION_BAR_HELP_LINK_CLICKED);
        return true;
    }

    public final void onResume() {
        super.onResume();
        ((mrm) getActivity()).a(R.string.fast_pair_account_settings_title);
    }
}
