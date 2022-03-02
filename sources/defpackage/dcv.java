package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import java.util.Collections;
import java.util.List;

/* renamed from: dcv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dcv extends des {
    public dhm a;
    public boolean b;
    public boolean c;
    private aqsr d;

    public dcv() {
        aqsp aqsp = (aqsp) aqsr.d.o();
        if (aqsp.c) {
            aqsp.c();
            aqsp.c = false;
        }
        aqsr aqsr = (aqsr) aqsp.b;
        aqsr aqsr2 = aqsr.d;
        aqsr.a |= 1;
        aqsr.b = 0;
        this.d = (aqsr) aqsp.i();
    }

    public static dcv a(aqsr aqsr) {
        return new dcv(aqsr);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 3 && i2 == -1) {
            this.a.e();
        }
        if (i == 13) {
            List d2 = jgu.d(getContext(), getContext().getPackageName());
            if (!d2.isEmpty() && !jlh.d(((Account) d2.get(0)).name)) {
                dhm dhm = this.a;
                dhm.a.a(((Account) d2.get(0)).name);
                dhm.a.a(dhm.c.b());
            }
        }
        if ((i == 6 || (awgy.h() && i == 12)) && i2 == -1 && intent != null && intent.hasExtra("authAccount")) {
            String stringExtra = intent.getStringExtra("authAccount");
            dhm dhm2 = this.a;
            if (!dhm2.c().a.equals(stringExtra)) {
                dhm2.a.a(stringExtra);
                dhm2.a.a(dhm2.c.b());
            }
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        did c2 = ((die) activity).c();
        dhm dhm = new dhm(c2.a, c2.b, c2.c, c2.h);
        this.a = dhm;
        dhl dhl = dhm.c;
        bk.b(dhl.d, new dhf(dhl)).a(this, new dcn(this));
        dhe dhe = this.a.b;
        bk.b(dhe.d, new dgx(dhe)).a(this, new dco(this));
        this.a.b.b().a(this, new dcp(this));
        this.a.b.e.a(this, new dcq(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.as_main_fragment, viewGroup, false);
        if (bundle != null) {
            this.b = bundle.getBoolean("outboundActivityStarted");
            this.c = bundle.getBoolean("goBackOnResume");
        } else {
            dhl dhl = this.a.c;
            dhi dhi = (dhi) dhl.d.b();
            dhj dhj = new dhj(dhl.a.d(dhi.a), dhi.b, dhi.c, dhi.d);
            dev a2 = a(dhj);
            deq.a((Fragment) a2, dhj.b);
            deq.a(this, a2, "inner", dep.INSTANT);
        }
        return inflate;
    }

    public final void onPause() {
        super.onPause();
        this.a.c.b.a().b();
    }

    public final void onResume() {
        super.onResume();
        if (!this.c) {
            this.a.c.c();
            aqsr aC = a().aC();
            if (this.b) {
                dfd dfd = this.a.a;
                dfd.a.b(dfd.b());
                this.a.a(aC);
                dis a2 = this.a.d.a();
                aucd o = aqml.e.o();
                int i = aC.b;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aqml aqml = (aqml) o.b;
                aqml.a |= 1;
                aqml.b = i;
                int a3 = csp.a(Collections.unmodifiableMap(aC.c));
                if (a3 != 0) {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    aqml aqml2 = (aqml) o.b;
                    aqml2.a |= 4;
                    aqml2.c = a3;
                }
                int b2 = csp.b(Collections.unmodifiableMap(aC.c));
                if (b2 != -1) {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    aqml aqml3 = (aqml) o.b;
                    aqml3.a |= 8;
                    aqml3.d = b2;
                }
                aucd o2 = aqna.d.o();
                aucf aucf = (aucf) aqmz.l.o();
                aucd o3 = aqlr.f.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aqlr aqlr = (aqlr) o3.b;
                aqml aqml4 = (aqml) o.i();
                aqml4.getClass();
                aqlr.d = aqml4;
                aqlr.a |= 4;
                if (aucf.c) {
                    aucf.c();
                    aucf.c = false;
                }
                aqmz aqmz = (aqmz) aucf.b;
                aqlr aqlr2 = (aqlr) o3.i();
                aqlr2.getClass();
                aqmz.k = aqlr2;
                aqmz.a |= 2048;
                aqlq a4 = a2.a();
                if (aucf.c) {
                    aucf.c();
                    aucf.c = false;
                }
                aqmz aqmz2 = (aqmz) aucf.b;
                a4.getClass();
                aqmz2.h = a4;
                aqmz2.a |= 64;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aqna aqna = (aqna) o2.b;
                aqmz aqmz3 = (aqmz) aucf.i();
                aqmz3.getClass();
                aqna.b = aqmz3;
                aqna.a |= 1;
                a2.a((aqna) o2.i());
                this.a.e();
                this.b = false;
            }
            this.a.b(this.d, aC);
            aqsp aqsp = (aqsp) aqsr.d.o();
            if (aqsp.c) {
                aqsp.c();
                aqsp.c = false;
            }
            aqsr aqsr = (aqsr) aqsp.b;
            aqsr.a |= 1;
            aqsr.b = 0;
            this.d = (aqsr) aqsp.i();
            return;
        }
        this.a.a();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("outboundActivityStarted", this.b);
        bundle.putBoolean("goBackOnResume", this.c);
    }

    public static final dev a(dhj dhj) {
        csl csl = dhj.a;
        aqsr aqsr = csl.a.d;
        if (aqsr == null) {
            aqsr = aqsr.d;
        }
        aqpp b2 = csl.b();
        aqsr h = csm.h(b2);
        if (h != null) {
            dfo a2 = dfo.a(h);
            dac dac = new dac();
            dac.b = dhj;
            Bundle bundle = new Bundle();
            bundle.putByteArray("bottomNavKey", csm.b(((dfe) a2).a));
            dac.setArguments(bundle);
            return dac;
        } else if ((b2.a & 64) != 0) {
            return dee.a(dhx.a(aqsr));
        } else {
            return dch.a(dga.a(csm.m(b2), csm.c(b2), csm.d(b2), csm.e(b2), csm.f(b2), csm.k(b2), csm.l(b2)), dhj);
        }
    }

    public dcv(aqsr aqsr) {
        this.d = aqsr;
    }

    public final dev a() {
        return (dev) getChildFragmentManager().findFragmentByTag("inner");
    }
}
