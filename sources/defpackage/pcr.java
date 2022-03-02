package defpackage;

import java.util.List;

/* renamed from: pcr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pcr extends awem {
    private final awef b;
    private final awef c;
    private final awef d;
    private final awef e;
    private final awef f;

    public pcr(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3, awef awef4, awef awef5) {
        super(bapu2, awey.a(pcr.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
        this.e = aweu.a(awef4);
        this.f = aweu.a(awef5);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.d.b(), this.e.b(), this.f.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        pcs pcs;
        List list = (List) obj;
        pia pia = (pia) list.get(0);
        auke auke = (auke) list.get(1);
        aukh aukh = (aukh) list.get(2);
        String str = (String) list.get(3);
        pcp pcp = (pcp) list.get(4);
        if (!str.isEmpty()) {
            aucx aucx = auke.a;
            int size = aucx.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    pcs = pcs.FAIL;
                    break;
                }
                aukd aukd = (aukd) aucx.get(i);
                aukh aukh2 = aukd.c;
                if (aukh2 == null) {
                    aukh2 = aukh.c;
                }
                if (aukh2.equals(aukh)) {
                    aucx aucx2 = aukd.d;
                    int size2 = aucx2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        aujy aujy = (aujy) aucx2.get(i2);
                        if (aujy.a != 1 || !((String) aujy.b).equals(str)) {
                            i2++;
                        } else {
                            aujx a = aujx.a(aujy.c);
                            if (a == null) {
                                a = aujx.UNKNOWN;
                            }
                            pcp pcp2 = pcp.READ;
                            int ordinal = a.ordinal();
                            if (ordinal != 1) {
                                if (ordinal == 2) {
                                    pcs = pcs.PASS;
                                } else if (ordinal != 3) {
                                    pia.d("Found unexpected access level enum '%s' in channel config list.  GmsCore too old for serverside service?", a);
                                    pcs = pcs.FAIL;
                                }
                            }
                            pcs = pcp != pcp.READ ? pcs.FAIL : pcs.PASS;
                        }
                    }
                    continue;
                }
                i++;
            }
        } else {
            pcs = pcs.FAIL;
        }
        return aorl.a((Object) pcs);
    }
}
