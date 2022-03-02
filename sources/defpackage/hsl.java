package defpackage;

import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* renamed from: hsl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hsl extends idf {
    private final hoi a;

    public hsl(hoi hoi, icc icc) {
        super(hol.a, icc);
        this.a = hoi;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        hoi hoi;
        hsn hsn = (hsn) ibf;
        hsw hsw = new hsw(this);
        try {
            hoi hoi2 = this.a;
            hol hol = hoi2.a;
            ibq ibq = hol.a;
            Iterator it = hol.q.iterator();
            while (true) {
                hoi = null;
                if (!it.hasNext()) {
                    Iterator it2 = hol.p.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            hoi = hoi2;
                            break;
                        }
                        hoi2 = ((hoh) it2.next()).a();
                        if (hoi2 == null) {
                            break;
                        }
                    }
                } else {
                    hoi2 = ((hoh) it.next()).a();
                    if (hoi2 == null) {
                        break;
                    }
                }
            }
            if (hoi == null) {
                hsw.a(Status.a);
            } else if (hoi.a.o.a(hoi.d, hoi.e, ((avrm) hoi.i.b).f)) {
                try {
                    LogEventParcelable a2 = hoi.a();
                    avrm avrm = a2.j;
                    aucd aucd = (aucd) avrm.c(5);
                    aucd.a((aucj) avrm);
                    aucf aucf = (aucf) aucd;
                    if (a2.k != null) {
                        if (a2.j.j.a() == 0) {
                            auay a3 = auay.a(a2.k.a());
                            if (aucf.c) {
                                aucf.c();
                                aucf.c = false;
                            }
                            avrm avrm2 = (avrm) aucf.b;
                            avrm avrm3 = avrm.t;
                            a3.getClass();
                            avrm2.a |= 1024;
                            avrm2.j = a3;
                        }
                    }
                    a2.j = (avrm) aucf.i();
                    a2.b = a2.j.k();
                    ((hta) hsn.x()).a((hsx) hsw, a2);
                } catch (RuntimeException e) {
                    Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
                    a(new Status(10, "MessageProducer"));
                }
            } else {
                a((icl) Status.a);
            }
        } catch (RuntimeException e2) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.EventModifier ", e2);
            a(new Status(10, "EventModifier"));
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return status;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        super.a((icl) obj);
    }
}
