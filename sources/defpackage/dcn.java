package defpackage;

import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: dcn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dcn implements ax {
    private final dcv a;

    public dcn(dcv dcv) {
        this.a = dcv;
    }

    public final void a(Object obj) {
        dcv dcv = this.a;
        dhj dhj = (dhj) obj;
        dev a2 = dcv.a();
        if ((csm.h(dhj.a.b()) != null) == (dcv.a() instanceof dac) && a2.a(dhj.a)) {
            a2.a(dhj);
            return;
        }
        aqpp b = dhj.a.b();
        if (((jkf.a(dcv.getContext()) || (b.a & 2) == 0) && dhj.a.c()) || !cyo.a(b) || dcv.c) {
            aqsr aqsr = dhj.a.a.d;
            if (aqsr == null) {
                aqsr = aqsr.d;
            }
            boolean a3 = ius.a(aqsr, dcv.a().aC());
            dev a4 = dcv.a(dhj);
            dep dep = dep.INSTANT;
            if (!a3) {
                deq.a((Fragment) a4, dhj.b);
                if (!dhj.d) {
                    dep = !dhj.c ? dep.PUSH : dep.POP;
                } else {
                    dep = !dhj.c ? dep.OPEN : dep.CLOSE;
                }
            }
            a4.b((long) dcv.getResources().getInteger(R.integer.as_screen_transition_duration));
            deq.a(dcv, a4, "inner", dep);
            return;
        }
        aqsr aC = dcv.a().aC();
        aqsr aqsr2 = dhj.a.a.d;
        if (aqsr2 == null) {
            aqsr2 = aqsr.d;
        }
        dcv.a.a(aC, aqsr2);
        new cyo(b, dcv, dcv.a.c(), dcv.a.d(), new dct(dcv, aC, aqsr2), new dcu(dcv)).a();
        if (!awgy.f()) {
            dcv.c = true;
        }
    }
}
