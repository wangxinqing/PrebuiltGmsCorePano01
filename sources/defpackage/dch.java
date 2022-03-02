package defpackage;

import android.accounts.Account;
import android.animation.AnimatorInflater;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: dch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dch extends dey {
    public dgb a;
    public dbp b;
    public View c;
    public View d;
    public final dcg e = new dcg();
    public AccountParticleDisc f;
    public cxv g;
    public View.OnClickListener h;
    public String i;
    public List j = amzy.h();
    public aqsr k;
    private dhj n;
    private AppBarLayout o;

    public static dch a(dga dga, dhj dhj) {
        dch dch = new dch();
        dch.n = dhj;
        Bundle bundle = new Bundle();
        dfg dfg = (dfg) dga;
        int i2 = dfg.g;
        int i3 = i2 - 1;
        if (i2 != 0) {
            bundle.putInt("headerType", i3);
            bundle.putByteArray("welcomeHeaderKey", csm.c(dfg.a));
            bundle.putByteArray("overflowMenuKey", csm.c(dfg.b));
            bundle.putByteArray("helpItemTarget", csm.c(dfg.c));
            bundle.putByteArray("leafScreenHeader", csm.a(dfg.d));
            bundle.putBoolean("closeButton", dfg.e);
            bundle.putBoolean("hasTopNav", dfg.f);
            dch.setArguments(bundle);
            return dch;
        }
        throw null;
    }

    public final dhh c() {
        dhh c2 = a().c();
        c2.c = this.b.a();
        return c2;
    }

    public final void d() {
        Intent intent;
        if (awgy.a.a().d()) {
            Account account = new Account(this.a.b().a, "com.google");
            hwu hwu = new hwu();
            hwu.a(Arrays.asList(new String[]{"com.google"}));
            hwu.e = "com.google.android.gms";
            hwu.a = account;
            hwu.c = getString(R.string.common_choose_account);
            hwu.f = 1001;
            hwu.c();
            intent = hwy.a(hwu.a());
        } else {
            intent = hwy.a((Account) null, (ArrayList) null, new String[]{"com.google"}, true, (String) null, false, 1, 2, (String) null, true);
            if (!intent.hasExtra("realClientPackage")) {
                intent.putExtra("realClientPackage", "com.google.android.gms");
            }
            pyt a2 = pyu.a();
            a2.a(amri.b(1001));
            a2.b(amri.b(getContext().getResources().getString(R.string.common_choose_account)));
            intent.putExtra("first_party_options_bundle", a2.a().a);
        }
        startActivityForResult(intent, 10);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.g = new cxv(this.f, ((cxx) getActivity()).a());
        this.a.c.c.a(this, new dcb(this));
        this.a.c.d.a(this, new dcc(this));
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 10 && i3 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("authAccount");
            dgb dgb = this.a;
            dgb.b.a(dgb.e.b().b, 0, 11);
            dgb.d.a();
            dgb.c.a(stringExtra);
            dgb.c.a(dgb.e.b());
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        Bundle arguments = getArguments();
        dga a2 = dga.a(new int[]{1, 2, 3}[arguments.getInt("headerType", 2)], csm.b(arguments.getByteArray("welcomeHeaderKey")), csm.b(arguments.getByteArray("overflowMenuKey")), csm.b(arguments.getByteArray("helpItemTarget")), csm.c(arguments.getByteArray("leafScreenHeader")), arguments.getBoolean("closeButton"), arguments.getBoolean("hasTopNav"));
        did c2 = ((die) activity).c();
        dgb dgb = new dgb(a2, c2.a, c2.b, c2.c, c2.h);
        this.a = dgb;
        dgb.f.a(this, new dbq(this));
        this.a.g.a(this, new dbw(this));
        this.k = ((dfg) this.a.a).c;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dev dev;
        boolean z = false;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) layoutInflater.inflate(R.layout.as_header_frame_fragment, viewGroup, false);
        this.o = (AppBarLayout) coordinatorLayout.findViewById(R.id.appbar);
        dbp dbp = new dbp(getContext(), this.o);
        this.b = dbp;
        dbp.q = new dbx(this);
        this.c = coordinatorLayout.findViewById(R.id.fragment_container);
        this.f = (AccountParticleDisc) coordinatorLayout.findViewById(R.id.account_particle_disc);
        this.b.p = new dby(this, coordinatorLayout);
        if (((dfg) this.a.a).f) {
            int i2 = Build.VERSION.SDK_INT;
            this.o.setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), R.anim.as_appbar_not_elevated));
        }
        if (bundle == null) {
            dcg dcg = this.e;
            dhj dhj = this.n;
            dhh dhh = dhj.b;
            if (dhh == null || !dhh.c) {
                z = true;
            }
            dcg.b = z;
            csl csl = dhj.a;
            aqsr aqsr = csl.a.d;
            if (aqsr == null) {
                aqsr = aqsr.d;
            }
            aqpp b2 = csl.b();
            aqsr g2 = csm.g(b2);
            if (g2 != null) {
                dhq a2 = dhq.a(g2);
                ddp ddp = new ddp((byte[]) null);
                ddp.b = dhj;
                Bundle bundle2 = new Bundle();
                bundle2.putByteArray("topNavKey", csm.b(((dfj) a2).a));
                ddp.setArguments(bundle2);
                dev = ddp;
            } else if ((b2.a & 32) == 0) {
                dgv a3 = dgv.a(aqsr);
                dev = new dcm();
                Bundle bundle3 = new Bundle();
                bundle3.putByteArray("screenKey", csm.b(((dfh) a3).a));
                dev.setArguments(bundle3);
            } else {
                dev = dbi.a(dfw.a(aqsr));
            }
            if (e()) {
                dev.b(this.m);
            }
            deq.a((Fragment) dev, this.n.b);
            deq.a(this, dev, "inner", dep.INSTANT);
        } else {
            this.e.b = bundle.getBoolean("headerWasExpanded", false);
        }
        return coordinatorLayout;
    }

    public final void onDetach() {
        this.b.p = null;
        super.onDetach();
    }

    public final void onPrepareOptionsMenu(Menu menu) {
        ActionMenuView actionMenuView;
        super.onPrepareOptionsMenu(menu);
        Toolbar toolbar = this.b.k;
        if (toolbar != null) {
            actionMenuView = (ActionMenuView) toolbar.findViewById(R.id.custom_menu);
        } else {
            actionMenuView = null;
        }
        if (actionMenuView != null) {
            Menu a2 = actionMenuView.a();
            a2.clear();
            aqsr aqsr = this.k;
            if (!(aqsr == null || aqsr.b == 90000)) {
                MenuItem add = a2.add(R.string.common_list_apps_menu_help_and_feedback);
                add.setShowAsAction(1);
                add.setIcon(R.drawable.quantum_ic_help_outline_vd_theme_24);
                add.setOnMenuItemClickListener(new dbz(this));
            }
            for (aqsa aqsa : this.j) {
                MenuItem add2 = a2.add(aqsa.b);
                if ((aqsa.a & 2) != 0) {
                    add2.setOnMenuItemClickListener(new dca(this, aqsa));
                }
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("headerWasExpanded", !this.b.b() ? this.e.b : !this.b.a());
    }

    /* access modifiers changed from: protected */
    public final dev a() {
        return (dev) getChildFragmentManager().findFragmentByTag("inner");
    }

    public final void a(View view, View.OnClickListener onClickListener, String str) {
        boolean z;
        int i2 = 1;
        if (onClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        view.setOnClickListener(onClickListener);
        view.setClickable(z);
        if (onClickListener == null) {
            i2 = 2;
        }
        qb.b(view, i2);
        if (z && !jlh.d(str)) {
            qb.a(view, (oz) new dcf(this, str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r0.equals(aC()) == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.dhj r3) {
        /*
            r2 = this;
            csl r0 = r3.a
            boolean r1 = r2.a((defpackage.csl) r0)
            if (r1 == 0) goto L_0x003a
            aqso r0 = r0.a
            int r1 = r0.a
            r1 = r1 & 1
            if (r1 != 0) goto L_0x0011
            goto L_0x0021
        L_0x0011:
            aqsr r0 = r0.d
            if (r0 != 0) goto L_0x0017
            aqsr r0 = defpackage.aqsr.d
        L_0x0017:
            aqsr r1 = r2.aC()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0032
        L_0x0021:
            dbp r0 = r2.b
            dbo r1 = r0.m
            if (r1 != 0) goto L_0x0028
            goto L_0x0032
        L_0x0028:
            boolean r1 = r1.e
            if (r1 == 0) goto L_0x0032
            com.google.android.material.appbar.AppBarLayout r0 = r0.b
            r1 = 0
            r0.a((boolean) r1)
        L_0x0032:
            dev r0 = r2.a()
            r0.a((defpackage.dhj) r3)
            return
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dch.a(dhj):void");
    }

    public final boolean a(csl csl) {
        boolean z;
        aqpp b2 = csl.b();
        dga dga = this.a.a;
        if ((b2.a & 64) == 0) {
            dfg dfg = (dfg) dga;
            if (ius.a(csm.c(b2), dfg.a) && csm.k(b2) == dfg.e && csm.l(b2) == dfg.f) {
                if (csm.g(csl.b()) == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z == (a() instanceof ddp)) {
                    return a().a(csl);
                }
            }
        }
        return false;
    }
}
