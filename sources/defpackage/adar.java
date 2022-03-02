package defpackage;

import com.google.android.gms.location.reporting.ReportingState;
import java.util.ArrayList;

/* renamed from: adar  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class adar implements acvz {
    static final acvz a = new adar();

    private adar() {
    }

    public final acwa a(Object obj) {
        boolean z;
        ReportingState reportingState = (ReportingState) obj;
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        if (reportingState == null) {
            aucd o = atyt.f.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            atyt atyt = (atyt) o.b;
            atyt.c = 2;
            int i = atyt.a | 2;
            atyt.a = i;
            atyt.a = i | 1;
            atyt.b = 15;
            arrayList.add((atyt) o.i());
            aucd o2 = atyt.f.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atyt atyt2 = (atyt) o2.b;
            atyt2.c = 2;
            int i2 = atyt2.a | 2;
            atyt2.a = i2;
            atyt2.a = 1 | i2;
            atyt2.b = 2;
            arrayList.add((atyt) o2.i());
        } else {
            if (!reportingState.a || !reportingState.e()) {
                z = false;
            } else {
                z = true;
            }
            if (!reportingState.c() && !reportingState.e()) {
                z2 = false;
            }
            arrayList.add(adat.a(atzo.LOCATION_REPORTING, rma.a(reportingState.a()), z, z2));
            arrayList.add(adat.a(atzo.LOCATION_HISTORY, rma.a(reportingState.b()), z, z2));
        }
        return acws.a((Object) arrayList);
    }
}
