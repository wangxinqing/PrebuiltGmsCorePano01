package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.android.gms.R;
import org.json.JSONObject;

/* renamed from: dgk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dgk {
    public final dfd a;
    public final au b;
    public aqrx c;
    private final djs d;
    private final as e;
    private final as f;
    private final as g;
    private final as h;
    private final as i;

    public dgk(dfd dfd, aqsr aqsr, djs djs) {
        this.d = djs;
        this.a = dfd;
        this.e = dfd.c(aqsr);
        this.g = dfd.b(aqsr);
        this.f = bk.b(this.e, new dgc(dfd));
        this.h = dfd.a.d();
        this.i = dfd.a.a();
        au auVar = new au();
        this.b = auVar;
        auVar.b(new csh(1));
        this.b.a(this.g, new dgd(this));
        this.b.a(this.e, new dge(this));
        this.b.a(this.f, new dgf(this));
        this.b.a(this.h, new dgg(this));
        this.b.a(this.i, new dgh(this));
    }

    public final void a() {
        this.b.a(this.g);
        this.b.a(this.e);
        this.b.a(this.f);
        this.b.a(this.h);
        this.b.a(this.i);
    }

    public final void b() {
        csh csh = new csh(4);
        a();
        this.b.b(csh);
    }

    public final csh c() {
        return (csh) this.b.b();
    }

    public final aqsr d() {
        return csm.j(((csl) this.e.b()).b());
    }

    public final void e() {
        aqrx aqrx;
        aqrx aqrx2;
        if (this.g.b() != null && this.e.b() != null && this.f.b() != null && this.h.b() != null && this.i.b() != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (((csn) this.g.b()).c != null) {
                b();
            } else if (((Boolean) this.i.b()).booleanValue()) {
                csl csl = (csl) this.e.b();
                if (csl.a()) {
                    this.b.b(new csh(2));
                } else if (c().c != 4) {
                    Resources resources = ihs.b().getResources();
                    Configuration configuration = resources.getConfiguration();
                    int a2 = cyd.a(configuration.screenWidthDp, (Context) ihs.b());
                    int a3 = cyd.a(configuration.screenHeightDp, (Context) ihs.b());
                    if (configuration.orientation == 2 || a2 > resources.getDimensionPixelSize(R.dimen.as_ob_max_display_width) || a3 > resources.getDimensionPixelSize(R.dimen.as_ob_max_display_height)) {
                        b();
                    } else if (csm.j(csl.b()) == null) {
                        b();
                    } else if (((Boolean) this.h.b()).booleanValue()) {
                        csl csl2 = (csl) this.f.b();
                        if (csl2.a()) {
                            this.b.b(new csh(2));
                            return;
                        }
                        aqso aqso = csl2.a;
                        if (aqso.b == 11) {
                            aqrx = (aqrx) aqso.c;
                        } else {
                            aqrx = aqrx.f;
                        }
                        this.c = aqrx;
                        if (csl2.a.b != 11 || (aqrx2 = this.c) == null || (aqrx2.a & 1) == 0 || this.a.a.e().contains(Long.valueOf(this.c.b)) || this.c.d.isEmpty()) {
                            b();
                            return;
                        }
                        a();
                        this.b.b(new csh(2));
                        djs djs = this.d;
                        djs.a.add(new JsonObjectRequest(0, this.c.d, (JSONObject) null, new dgi(this), new dgj(this)));
                    }
                }
            }
        }
    }
}
