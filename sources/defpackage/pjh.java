package defpackage;

import java.util.Map;

/* renamed from: pjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class pjh extends qwf {
    private final String a;
    private final amsv b;
    private final amsv c;
    private final amsv d;
    private final amsv e;
    private final amsv g;

    public pjh(String str, amsv amsv, amsv amsv2, amsv amsv3, amsv amsv4, amsv amsv5) {
        amrl.a((Object) str);
        amrl.a((Object) amsv);
        amrl.a((Object) amsv2);
        amrl.a((Object) amsv3);
        amrl.a((Object) amsv4);
        amrl.a((Object) amsv5);
        this.a = str;
        this.b = amsv;
        this.c = amsv2;
        this.d = amsv3;
        this.e = amsv4;
        this.g = amsv5;
    }

    public final int a(qxz qxz) {
        boolean z;
        try {
            if (((Boolean) this.b.a()).booleanValue()) {
                afbv afbv = (afbv) ((Map) this.c.a()).get(qxz.a);
                if (afbv == null) {
                    phw.e.e("%s started with a missing task for tag %s", this.a, qxz.a);
                    return 2;
                }
                try {
                    pia pia = phw.a;
                    Object[] objArr = new Object[3];
                    objArr[0] = this.a;
                    objArr[1] = qxz.a;
                    if (qxz.b != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objArr[2] = Boolean.valueOf(z);
                    afbv.a(qxz.b).get();
                    return 0;
                } catch (Exception e2) {
                    phw.e.e("%s task %s execution failed.", this.a, qxz.a);
                    if (((Boolean) this.g.a()).booleanValue() && (e2 instanceof InterruptedException)) {
                        ((aetj) this.e.a()).a(10020);
                        return 2;
                    }
                    String str = qxz.a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 27);
                    sb.append("MDH task ");
                    sb.append(str);
                    sb.append(" execution failure");
                    ((pdg) this.d.a()).a(sb.toString(), e2);
                    return 2;
                }
            } else {
                phw.e.a("soft-disabled by way of flag", new Object[0]);
                return 2;
            }
        } catch (Exception e3) {
            ((pdg) this.d.a()).a("MDH task service run task failure", e3);
            return 2;
        }
    }
}
