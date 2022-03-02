package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* renamed from: ltm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ltm {
    private static final anax a = anax.a((Object) "!");

    public static amrm a(String str) {
        amrm amrm;
        ArrayList arrayList = new ArrayList();
        for (String a2 : amsk.a(";").a((CharSequence) str)) {
            ArrayList arrayList2 = new ArrayList();
            for (String ltl : amsk.a(",").a((CharSequence) a2)) {
                ltl ltl2 = new ltl(ltl);
                String a3 = ltl2.a((Set) a);
                lti lti = (lti) ltl2.a((Map) anaf.a("MAC", ltk.MAC, "NAM", ltk.NAME, "MAJ", lth.MAJOR_CLASS, "CLS", lth.CLASS, "PROF", ltf.a));
                if (lti != null) {
                    amrm = lti.a(ltl2);
                    if (a3 != null) {
                        amrm = new amrp(amrm);
                    }
                } else {
                    amrm = amrq.ALWAYS_FALSE;
                }
                arrayList2.add(amrm);
            }
            arrayList.add(new amrn(amrs.a((Iterable) arrayList2)));
        }
        return new amrr(amrs.a((Iterable) arrayList));
    }
}
