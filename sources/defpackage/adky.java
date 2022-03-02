package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutionException;

/* renamed from: adky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adky {
    public static final adqz a = new adkx();
    private static final iwd b = adnt.d("ExperimentControl");
    private static final adri c = new adro("control.experiment.exp_id_key", "");
    private static final adri d = new adro("control.experiment.exp_name_space_key", "");
    private static final adri e = new adro("control.experiment.exp_log_source_key", "");
    private final ihs f;
    private final adrn g = ((adrn) adrn.a.b());

    public adky(ihs ihs) {
        this.f = ihs;
    }

    private final boolean a(String str, String str2, String str3) {
        try {
            yey a2 = yef.a((Context) this.f);
            int[] iArr = !str3.equals("") ? new int[]{Integer.parseInt(str3)} : new int[0];
            iha b2 = ihb.b();
            b2.a = new yeu(str, str2, iArr);
            acws.a(a2.a(b2.a()));
            this.g.a(c.b(str3));
            this.g.a(d.b(str));
            this.g.a(e.b(str2));
            b.b("Experiment config id: %s name_space: %s log_source: %s", str3, str, str2);
            adlc adlc = (adlc) adlc.a.b();
            aucd o = anqg.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anqg anqg = (anqg) o.b;
            int i = anqg.a | 1;
            anqg.a = i;
            anqg.b = 1;
            str3.getClass();
            anqg.a = i | 2;
            anqg.c = str3;
            adns adns = adlc.b;
            anqg anqg2 = (anqg) o.i();
            aucd a3 = adns.a(10);
            if (a3.c) {
                a3.c();
                a3.c = false;
            }
            anqb anqb = (anqb) a3.b;
            anqb anqb2 = anqb.l;
            anqg2.getClass();
            anqb.k = anqg2;
            anqb.a |= 1024;
            adns.a((anqb) a3.i());
            return true;
        } catch (InterruptedException | NumberFormatException | ExecutionException e2) {
            b.e("Unable to set experiment config id: %s name_space: %s, log_source: %s.", ayqf.d(), ayqf.f(), ayqf.e());
            return false;
        }
    }

    public final void a() {
        if (ayqf.a.a().a()) {
            String f2 = ayqf.f();
            String e2 = ayqf.e();
            String d2 = ayqf.d().equals(ayqf.a.a().g()) ? (String) this.g.b(c) : ayqf.d();
            if (((String) this.g.b(c)).equals(d2) && ((String) this.g.b(d)).equals(f2) && ((String) this.g.b(e)).equals(e2)) {
                return;
            }
            if ((((String) this.g.b(c)).equals(d2) || !((String) this.g.b(d)).equals(f2) || !((String) this.g.b(e)).equals(e2)) && !((String) this.g.b(c)).equals("") && !a((String) this.g.b(d), (String) this.g.b(e), "")) {
                b.d("Unable to clear current experiment, abort updating experiment config.", new Object[0]);
            } else {
                a(f2, e2, d2);
            }
        }
    }
}
