package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.Collections;
import java.util.List;

/* renamed from: dac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dac extends dey {
    public dfp a;
    public dhj b;
    public djk c;
    public BottomNavigationView d;
    public List e = Collections.emptyList();
    public boolean f;
    private aqsr g;

    public static final int a(int i) {
        return i + 1;
    }

    public static final int b(int i) {
        return i - 1;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.c = ((czx) activity).b().a();
        dfp a2 = ((die) activity).c().a(dfo.a(csm.d(getArguments().getByteArray("bottomNavKey"))));
        this.a = a2;
        a2.b.a(this, new czy(this));
        this.a.d.a.a(this, new cse(new czz(this)));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.as_bottom_nav_frame_fragment, viewGroup, false);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) inflate.findViewById(R.id.bottom_nav);
        this.d = bottomNavigationView;
        que.a((View) bottomNavigationView, 3);
        this.d.d = new daa(this);
        if (bundle == null) {
            dev b2 = b(this.b);
            if (e()) {
                b2.b(this.m);
            }
            deq.a((Fragment) b2, this.b.b);
            deq.a(this, b2, "inner", dep.INSTANT);
            this.g = csm.i(this.b.a.b());
        }
        return inflate;
    }

    private static final dev b(dhj dhj) {
        csl csl = dhj.a;
        aqsr aqsr = csl.a.d;
        if (aqsr == null) {
            aqsr = aqsr.d;
        }
        aqpp b2 = csl.b();
        if ((b2.a & 64) != 0) {
            return dee.a(dhx.a(aqsr));
        }
        return dch.a(dga.a(csm.m(b2), csm.c(b2), csm.d(b2), csm.e(b2), csm.f(b2), csm.k(b2), csm.l(b2)), dhj);
    }

    /* access modifiers changed from: protected */
    public final dev a() {
        return (dev) getChildFragmentManager().findFragmentByTag("inner");
    }

    public final void a(dhj dhj) {
        csl csl = dhj.a;
        if (a(csl)) {
            this.g = csm.i(csl.b());
            b();
            dev a2 = a();
            if (a2.a(dhj.a)) {
                a2.a(dhj);
                return;
            }
            aqsr aqsr = csl.a.d;
            if (aqsr == null) {
                aqsr = aqsr.d;
            }
            boolean a3 = ius.a(aqsr, aC());
            dev b2 = b(dhj);
            dep dep = dep.INSTANT;
            if (!a3) {
                deq.a((Fragment) b2, dhj.b);
                if (!dhj.c) {
                    dep = dep.PUSH;
                } else {
                    dep = dep.POP;
                }
            }
            deq.a(this, b2, "inner", dep);
        }
    }

    public final void b() {
        int i;
        int i2;
        aqsr aqsr = this.g;
        if (aqsr != null) {
            i = 0;
            while (true) {
                if (i >= this.e.size()) {
                    i = -1;
                    break;
                }
                aqpz aqpz = (aqpz) this.e.get(i);
                if (aqpz.b == 2 && ((aqsr) aqpz.c).equals(aqsr)) {
                    break;
                }
                i++;
            }
        } else {
            i = -1;
        }
        if (i == -1) {
            int i3 = 0;
            while (true) {
                if (i < this.e.size()) {
                    if (((aqpz) this.e.get(i)).b == 2) {
                        break;
                    }
                    i3 = i + 1;
                } else {
                    i = -1;
                    break;
                }
            }
        }
        if (i == -1) {
            i = 0;
        }
        int a2 = a(i);
        this.f = true;
        int b2 = b(this.d.b.e);
        if (i < this.e.size()) {
            BottomNavigationView bottomNavigationView = this.d;
            MenuItem findItem = bottomNavigationView.a.findItem(a2);
            if (findItem != null && !bottomNavigationView.a.a(findItem, (xh) bottomNavigationView.c, 0)) {
                findItem.setChecked(true);
            }
            aqpz aqpz2 = (aqpz) this.e.get(i);
            if ((aqpz2.a & 4) != 0) {
                aqrl aqrl = aqpz2.f;
                if (aqrl == null) {
                    aqrl = aqrl.g;
                }
                i2 = aqrl.b;
            } else {
                i2 = 0;
            }
            int a3 = cxz.a(getContext(), aqrk.a(i2));
            if (awgy.d()) {
                this.d.a.getItem(i).setIcon(cxz.b(getContext(), aqrk.a(i2)));
            } else {
                this.d.a.getItem(i).setIcon(a3);
            }
            if (b2 != i) {
                aqrl aqrl2 = ((aqpz) this.e.get(b2)).e;
                if (aqrl2 == null) {
                    aqrl2 = aqrl.g;
                }
                int i4 = aqrl2.b;
                int a4 = cxz.a(getContext(), aqrk.a(i4));
                if (awgy.d()) {
                    this.d.a.getItem(b2).setIcon(cxz.b(getContext(), aqrk.a(i4)));
                } else {
                    this.d.a.getItem(b2).setIcon(a4);
                }
            }
            dim.a(this.d, (AccessibilityManager) null, ((aqpz) this.e.get(i)).d);
        }
        this.f = false;
    }

    public final boolean a(csl csl) {
        return ius.a(csm.h(csl.b()), this.a.a());
    }
}
