package defpackage;

import android.content.Intent;
import java.util.ArrayList;

/* renamed from: dcq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dcq implements ax {
    private final dcv a;

    public dcq(dcv dcv) {
        this.a = dcv;
    }

    public final void a(Object obj) {
        int i;
        aqsr aqsr;
        aqsr aqsr2;
        dcv dcv = this.a;
        amri amri = (amri) obj;
        if (amri.a()) {
            dcv.c = false;
            dcv.a.b();
            aqsr aC = dcv.a().aC();
            dhl dhl = dcv.a.c;
            dhd dhd = dhd.BACK;
            int ordinal = ((dhd) amri.b()).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    aqsr g = csm.g(dhl.a.d(((dhi) dhl.d.b()).a).b());
                    if (g != null) {
                        int size = dhl.c.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                if (!g.equals(((dhk) dhl.c.get(size)).b)) {
                                    i = size;
                                    break;
                                }
                                size--;
                            } else {
                                i = -1;
                                break;
                            }
                        }
                    } else {
                        i = dhl.a();
                    }
                } else if (ordinal == 2) {
                    aqsr h = csm.h(dhl.a.d(((dhi) dhl.d.b()).a).b());
                    if (h != null) {
                        int size2 = dhl.c.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                if (!h.equals(((dhk) dhl.c.get(size2)).c)) {
                                    i = size2;
                                    break;
                                }
                                size2--;
                            } else {
                                i = -1;
                                break;
                            }
                        }
                    } else {
                        i = dhl.a();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                i = dhl.a();
            }
            if (i != -1) {
                dhk dhk = (dhk) dhl.c.get(i);
                ArrayList arrayList = dhl.c;
                arrayList.subList(i, arrayList.size()).clear();
                dhl.d.b(new dhi(dhk.a, dhk.e, true, dhl.a(dhk, ((dhi) dhl.d.b()).a)));
                dhl.c();
                aqsr = dhk.a;
            } else {
                aqsr = null;
            }
            dhm dhm = dcv.a;
            if (aqsr == null) {
                aqsp aqsp = (aqsp) aqsr.d.o();
                if (aqsp.c) {
                    aqsp.c();
                    aqsp.c = false;
                }
                aqsr aqsr3 = (aqsr) aqsp.b;
                aqsr3.a = 1 | aqsr3.a;
                aqsr3.b = 0;
                aqsr2 = (aqsr) aqsp.i();
            } else {
                aqsr2 = aqsr;
            }
            dhm.d.a(aC, aqsr2, 7);
            if (aqsr == null) {
                if (awgy.h()) {
                    dcv.getActivity().setResult(-1, new Intent().putExtra("authAccount", dcv.a.c().a));
                }
                dcv.getActivity().finish();
                return;
            }
            dcv.a.b(aC, aqsr);
            dcv.a.a(aqsr);
        }
    }
}
