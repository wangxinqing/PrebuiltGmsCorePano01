package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.setupdesign.GlifRecyclerLayout;
import com.google.android.setupdesign.items.ItemGroup;
import java.util.List;
import java.util.Map;

/* renamed from: acly  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acly extends Fragment implements alil {
    public static final iwd a = acqa.a("Setup", "UI", "RecyclerLayoutDiscoveryFragment");
    public aclw b;
    public Handler c;
    public GlifRecyclerLayout d;
    public alhg e;
    public alin f;
    public ItemGroup g;
    final Map h = new nz();
    public boolean i = false;
    public boolean j = false;
    public final Runnable k = new aclr(this);
    private abqf l;
    private View m;
    private boolean n = false;
    private final abst o = new aclq(this);
    private final Runnable p = new acls(this);
    private final Runnable q = new aclt(this);

    public final void a() {
        a.b("startSearching", new Object[0]);
        this.n = false;
        this.d.c(R.string.smartdevice_searching_for_devices);
        a(true);
        this.e.a(8);
        c();
        this.c.removeCallbacks(this.k);
        this.c.postDelayed(this.q, 25000);
    }

    public final void b() {
        if (!this.n) {
            this.n = true;
            this.d.c(R.string.smartdevice_choose_device);
            this.c.removeCallbacks(this.q);
            if (azlf.a.a().U()) {
                this.c.postDelayed(this.k, 5000);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (!this.j) {
            abst abst = this.o;
            long a2 = azjk.a.a().a();
            if (a2 > 0 && !this.i) {
                abst = new abnl(new qvr(Looper.getMainLooper()), a2, abst, new aclv(this));
            }
            this.l.a(abst);
            this.j = true;
            this.b.f();
        }
    }

    public final void d() {
        a.b("Stopping scan", new Object[0]);
        this.l.p();
        this.j = false;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.b = (aclw) activity;
        } catch (ClassCastException e2) {
            throw new RuntimeException("Containing activity must implement DiscoveryFragment.Listener", e2);
        }
    }

    public final void onCreate(Bundle bundle) {
        a.b("onCreate", new Object[0]);
        super.onCreate(bundle);
        if (bundle != null) {
            this.i = bundle.getBoolean("didAutoConnect");
        }
        if (getActivity() != null) {
            Context context = getContext();
            iva.a((Object) context);
            this.l = abmr.b(context);
        }
        this.c = new qvr();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a.b("onCreateView", new Object[0]);
        GlifRecyclerLayout glifRecyclerLayout = (GlifRecyclerLayout) layoutInflater.inflate(R.layout.smartdevice_setup_discovery_recycler_layout, viewGroup, false);
        this.d = glifRecyclerLayout;
        alhf alhf = new alhf(this.d.getContext());
        alhf.a(R.string.smartdevice_search_again);
        alhf.b = new aclu(this);
        alhf.c = 5;
        alhf.d = 2132018060;
        alhg a2 = alhf.a();
        this.e = a2;
        ((alhe) glifRecyclerLayout.a(alhe.class)).a(a2);
        this.e.a(8);
        alhv alhv = new alhv();
        alhv.a(new ColorDrawable(this.d.getResources().getColor(17170445)));
        alja alja = this.d.a;
        alja.b.removeItemDecoration(alja.d);
        alja.d = alhv;
        alja.b.addItemDecoration(alja.d);
        alja.a();
        return this.d;
    }

    public final void onPause() {
        a.b("onPause", new Object[0]);
        this.c.removeCallbacks(this.k);
        this.c.removeCallbacks(this.p);
        this.c.removeCallbacks(this.q);
        d();
        super.onPause();
    }

    public final void onResume() {
        a.b("onResume", new Object[0]);
        super.onResume();
        ItemGroup itemGroup = this.g;
        if (!itemGroup.a.isEmpty()) {
            int a2 = itemGroup.a();
            List list = itemGroup.a;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((alih) list.get(i2)).b(itemGroup);
            }
            itemGroup.c = true;
            itemGroup.a.clear();
            itemGroup.b(0, a2);
        }
        this.h.clear();
        this.c.postDelayed(this.p, 300);
        this.c.postDelayed(this.q, 25000);
        a();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("didAutoConnect", this.i);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        a.b("onViewCreated", new Object[0]);
        super.onViewCreated(view, bundle);
        this.d.b(true);
        this.m = ((aliz) this.d.a(aliz.class)).a();
        acg adapter = this.d.a.b.getAdapter();
        if (adapter instanceof aljo) {
            adapter = ((aljo) adapter).a;
        }
        alin alin = (alin) adapter;
        this.f = alin;
        alin.f = this;
        this.g = (ItemGroup) alin.a.c();
    }

    public final void a(boolean z) {
        if (!z) {
            this.m.setVisibility(4);
        } else {
            this.m.setVisibility(0);
        }
    }
}
