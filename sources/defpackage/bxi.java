package defpackage;

import com.google.android.chimera.FragmentTransaction;
import com.google.android.contextmanager.interest.InterestRecordStub;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl;
import java.util.ArrayList;

/* renamed from: bxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bxi extends bwp {
    private final jxf c;
    private final ContextManagerClientInfo d;
    private final InterestUpdateBatchImpl e;

    public bxi(jxf jxf, ContextManagerClientInfo contextManagerClientInfo, InterestUpdateBatchImpl interestUpdateBatchImpl) {
        super("UpdateInterestsOperation");
        this.c = jxf;
        this.d = contextManagerClientInfo;
        this.e = interestUpdateBatchImpl;
    }

    private final void a(int i) {
        atog atog;
        atnr atnr;
        bwf.a(this.c, i);
        btx G = cbi.G();
        ContextManagerClientInfo contextManagerClientInfo = this.d;
        InterestUpdateBatchImpl interestUpdateBatchImpl = this.e;
        aucd a = btx.a(contextManagerClientInfo, 11, i);
        aucd o = atoh.b.o();
        ArrayList arrayList = interestUpdateBatchImpl.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            InterestUpdateBatchImpl.Operation operation = (InterestUpdateBatchImpl.Operation) arrayList.get(i2);
            if (operation == null) {
                atog = atog.d;
            } else {
                aucd o2 = atog.d.o();
                atof atof = (atof) amrh.a(atof.a(operation.a), atof.UNKNOWN_UPDATE_INTEREST_OPERATION_TYPE);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                atog atog2 = (atog) o2.b;
                atog2.b = atof.d;
                atog2.a |= 1;
                InterestRecordStub interestRecordStub = operation.b;
                if (interestRecordStub != null) {
                    aucd o3 = atnr.c.o();
                    atjv b = jtj.b(interestRecordStub.a());
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    atnr atnr2 = (atnr) o3.b;
                    atnr2.b = b.bA;
                    atnr2.a |= 1;
                    atnr = (atnr) o3.i();
                } else {
                    atnr = null;
                }
                if (atnr != null) {
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    atog atog3 = (atog) o2.b;
                    atnr.getClass();
                    atog3.c = atnr;
                    atog3.a |= 2;
                }
                atog = (atog) o2.i();
            }
            if (atog != null) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atoh atoh = (atoh) o.b;
                atog.getClass();
                if (!atoh.a.a()) {
                    atoh.a = aucj.a(atoh.a);
                }
                atoh.a.add(atog);
            }
        }
        if (a.c) {
            a.c();
            a.c = false;
        }
        atnj atnj = (atnj) a.b;
        atoh atoh2 = (atoh) o.i();
        atnj atnj2 = atnj.o;
        atoh2.getClass();
        atnj.n = atoh2;
        atnj.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
        G.a((atnj) a.i());
    }

    /* access modifiers changed from: protected */
    public final void b(int i) {
        cas cas;
        if (!ibt.c(i)) {
            a(i);
            return;
        }
        cap r = cbi.r();
        long a = cbi.i().a();
        ArrayList arrayList = this.e.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            InterestUpdateBatchImpl.Operation operation = (InterestUpdateBatchImpl.Operation) arrayList.get(i2);
            int i3 = operation.a;
            boolean z = true;
            if (i3 == 1) {
                atke atke = operation.a().a;
                ContextManagerClientInfo contextManagerClientInfo = this.d;
                atkd atkd = operation.a().a.h;
                if (atkd == null) {
                    atkd = atkd.e;
                }
                cas cas2 = new cas(atke, car.a(contextManagerClientInfo, atkd.d));
                cas2.a(a);
                r.a(cas2);
            } else if (i3 != 2) {
                ((anih) ((anih) bxk.a.c()).a("bxi", "b", 96, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[UpdateInterestsOperation] Unknown operation type=%s", operation.a);
            } else {
                ContextManagerClientInfo contextManagerClientInfo2 = this.d;
                if (i3 != 2) {
                    z = false;
                }
                iva.a(z);
                car a2 = car.a(contextManagerClientInfo2, operation.c);
                r.b(a2);
                if (!r.d || r.a(a2)) {
                    if (r.a.containsKey(a2.c) && (cas = (cas) ((cax) r.a.get(a2.c)).a.get(a2)) != null) {
                        r.b(cas, false);
                    }
                    r.b.a(a2);
                }
            }
        }
        a(0);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.d.b()) {
            InterestUpdateBatchImpl interestUpdateBatchImpl = this.e;
            if (interestUpdateBatchImpl != null) {
                ArrayList arrayList = interestUpdateBatchImpl.a;
                if (arrayList == null || arrayList.isEmpty()) {
                    a(0);
                    return;
                }
                if (!this.d.a().b()) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        InterestUpdateBatchImpl.Operation operation = (InterestUpdateBatchImpl.Operation) arrayList.get(i);
                        if (operation.a == 1 && operation.a().a() == 18) {
                            a(bwp.a(this.d));
                            return;
                        }
                    }
                }
                b(0);
                return;
            }
            a(0);
            return;
        }
        a(7504);
    }
}
