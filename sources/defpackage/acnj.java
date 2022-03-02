package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.setupdesign.GlifLayout;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: acnj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acnj extends Fragment implements acmv {
    public static final iwd a = acqa.a("Setup", "UI", "SelectAccountFragment");
    public acnh b;
    public boolean c;
    public GlifLayout d;
    public List e;
    public Set f = new HashSet();
    public Set g = new HashSet();
    public Set h = new HashSet();
    public boolean i = false;
    public abov j = abov.UNKNOWN;
    public boolean k = false;
    public boolean l = false;
    private boolean m;
    private String n;
    private boolean o;
    private acmw p;
    private acjy q;
    private acnf r;
    private boolean s;

    public static acnj a(String str, boolean z, boolean z2, abov abov) {
        acnj acnj = new acnj();
        Bundle bundle = new Bundle();
        bundle.putBoolean("smartdevice.accountRequired", true);
        bundle.putString("smartdevice.title", str);
        bundle.putBoolean("isMagicWand", z);
        bundle.putBoolean("singleAccount", z2);
        bundle.putString("device_type", abov.name());
        acnj.setArguments(bundle);
        return acnj;
    }

    public final void b() {
        acng acng;
        boolean z;
        int count = this.r.getCount();
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            Account account = (Account) this.e.get(i2);
            iwd iwd = a;
            String valueOf = String.valueOf(account.name);
            iwd.b(valueOf.length() == 0 ? new String("Display account ") : "Display account ".concat(valueOf), new Object[0]);
            if (count > 0) {
                acng = (acng) this.r.getItem(i2);
            } else {
                acng = new acng();
            }
            acng.a = account.name;
            acmw acmw = this.p;
            String str = account.name;
            acqf.a();
            acng.b = (String) acmw.c.get(str);
            acmw acmw2 = this.p;
            String str2 = account.name;
            acqf.a();
            acng.c = (Bitmap) acmw2.d.get(str2);
            if (!azjh.b() || this.j != abov.AUTO || !this.f.contains(account)) {
                z = false;
            } else {
                z = true;
            }
            acng.d = z;
            if (count <= 0) {
                this.r.add(acng);
            }
        }
        this.r.notifyDataSetChanged();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.b = (acnh) activity;
        } catch (ClassCastException e2) {
            throw new RuntimeException("Containing activity must implement SelectAccountFragment.Listener", e2);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.k = bundle.getBoolean("smartdevice.selectAccountFragment.accountSelected", false);
            this.l = bundle.getBoolean("smartdevice.selectAccountFragment.triedToSelectUnsupported", false);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.m = arguments.getBoolean("smartdevice.accountRequired", false);
            this.j = abov.a(arguments.getString("device_type"));
            this.n = arguments.getString("smartdevice.title", getString(R.string.common_choose_account_label));
            this.c = arguments.getBoolean("isMagicWand", false);
            this.o = arguments.getBoolean("singleAccount", false);
        }
        Activity activity = getActivity();
        this.s = azjq.b();
        if (activity != null) {
            this.p = new acmw(activity);
        }
        Context context = getContext();
        iva.a((Object) context);
        this.q = new acjy(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = this.c;
        int i2 = R.layout.smartdevice_account_list;
        if (z) {
            i2 = this.o ? R.layout.magicwand_account_confirmation : R.layout.magicwand_account_list;
        } else if (azjh.d() && this.j == abov.AUTO) {
            i2 = R.layout.smartdevice_account_list_v2;
        }
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate(i2, viewGroup, false);
        this.d = glifLayout;
        if (this.c && this.o) {
            alhf alhf = new alhf(this.d.getContext());
            alhf.a(R.string.common_sign_in);
            alhf.c = 5;
            alhf.d = 2132018060;
            ((alhe) glifLayout.a(alhe.class)).a(alhf.a());
        }
        return this.d;
    }

    public final void onPause() {
        acmw acmw = this.p;
        acqf.a();
        acmw.e.remove(this);
        if (!this.s) {
            this.p.b.g();
        }
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        if (this.s) {
            acmw acmw = this.p;
            Context context = getContext();
            iva.a((Object) context);
            wlr wlr = new wlr();
            wlr.a = 80;
            wls a2 = wlr.a();
            iby iby = new iby(context, a2, (byte[]) null);
            iby iby2 = new iby(context, a2);
            wkz wkz = new wkz();
            wkz.c = 1;
            iby2.a(wkz).a((icm) new acmp(acmw, iby));
        } else {
            this.p.b.e();
        }
        acmw acmw2 = this.p;
        acqf.a();
        acmw2.e.add(this);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("smartdevice.selectAccountFragment.accountSelected", this.k);
        bundle.putBoolean("smartdevice.selectAccountFragment.triedToSelectUnsupported", this.l);
    }

    public final void onStop() {
        a.b("onStop", new Object[0]);
        Activity activity = getActivity();
        if (activity != null && !activity.isChangingConfigurations() && !this.k) {
            a.b("User is leaving select account screen", new Object[0]);
            this.b.b(a((Account) null));
        }
        super.onStop();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.d.a((CharSequence) this.n);
        Activity activity = getActivity();
        if (activity != null) {
            this.e = acpe.a(activity);
            boolean d2 = azjh.d();
            int i2 = R.layout.smartdevice_account_list_item;
            if (d2 && this.j == abov.AUTO) {
                i2 = R.layout.smartdevice_account_list_item_v2;
            }
            this.r = new acnf(activity, i2);
            ListView listView = (ListView) view.findViewById(R.id.account_list);
            listView.setAdapter(this.r);
            if (!azjh.d() || this.j != abov.AUTO) {
                listView.setDivider((Drawable) null);
            } else {
                TextView textView = (TextView) view.findViewById(R.id.message);
                if (textView != null) {
                    textView.setText(getResources().getString(R.string.smartdevice_auto_selectaccount_description));
                    textView.setVisibility(0);
                }
            }
            if (this.c && this.o) {
                ((alhe) this.d.a(alhe.class)).c.f = new acmy(this);
            } else {
                listView.setOnItemClickListener(new acmz(this));
            }
            if (!this.m) {
                View inflate = activity.getLayoutInflater().inflate(R.layout.smartdevice_account_list_footer, listView, false);
                inflate.setOnClickListener(new acne(this));
                listView.addFooterView(inflate);
            }
            if (!azjh.b() || this.j != abov.AUTO) {
                b();
                return;
            }
            this.i = true;
            aorr a2 = aorl.a(a("service_HOSTED"), azjh.e(), TimeUnit.MILLISECONDS, jfm.a(1, 9));
            aorr a3 = aorl.a(a("service_usm"), azjh.e(), TimeUnit.MILLISECONDS, jfm.a(1, 9));
            aorl.b(a2, a3).a((Runnable) new acna(this, a2, a3), (Executor) aoqm.a).a(new acnb(this), aoqm.a);
        }
    }

    private final aorr a(String str) {
        acjy acjy = this.q;
        List list = this.e;
        HashMap a2 = anet.a(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Account account = (Account) list.get(i2);
            a2.put(account, ahe.a(new acjw(acjy, account, str)));
        }
        return aorl.b((Iterable) a2.values()).a((Callable) new acnc(a2, str), (Executor) aoqm.a);
    }

    public final acni a(Account account) {
        return new acni(account, this.e.size(), this.g.size(), this.h.size(), this.l);
    }

    public final void a() {
        if (!azjh.b() || !this.i) {
            b();
        } else {
            a.b("Waiting on unsupported accounts to be populated", new Object[0]);
        }
    }
}
