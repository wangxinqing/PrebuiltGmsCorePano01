package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlaceEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: rlk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rlk {
    public static final rlk f = new rlk(1, (Status) null, Collections.emptyList(), -1, (rhq) null);
    public static final rlk g = new rlk(2, (Status) null, Collections.emptyList(), -1, (rhq) null);
    public final int a;
    public final Status b;
    public final List c;
    public final int d;
    public final rhq e;

    public rlk(int i, Status status, List list, int i2, rhq rhq) {
        this.a = i;
        this.b = status;
        this.c = list;
        this.d = i2;
        this.e = rhq;
    }

    public static rlk a(rhg rhg) {
        ArrayList arrayList;
        int i;
        Status aO = rhg.aO();
        if (aO.c()) {
            ArrayList arrayList2 = new ArrayList(rhg.a());
            Iterator it = rhg.iterator();
            while (it.hasNext()) {
                rhf rhf = (rhf) it.next();
                if (rhf.d() != null && rhf.d().length() > 0) {
                    arrayList2.add((rhf) rhf.r());
                }
            }
            arrayList = arrayList2;
            i = 5;
        } else {
            arrayList = Collections.emptyList();
            i = 4;
        }
        return new rlk(i, aO, arrayList, -1, (rhq) null);
    }

    public final boolean a() {
        int i = this.a;
        return i == 6 || i == 7 || i == 8;
    }

    public static rlk a(rlk rlk, int i) {
        return new rlk(6, (Status) null, rlk.c, i, (rhq) null);
    }

    public static rlk a(rlk rlk, rhr rhr) {
        PlaceEntity placeEntity;
        int i;
        if (rlk.a != 6) {
            return rlk;
        }
        Status status = rhr.b;
        if (!status.c() || rhr.a() != 1) {
            placeEntity = null;
            i = 7;
        } else {
            placeEntity = ((rkr) rhr.a(0)).r();
            i = 8;
        }
        return new rlk(i, status, rlk.c, rlk.d, placeEntity);
    }
}
