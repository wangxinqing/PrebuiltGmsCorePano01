package defpackage;

import android.os.RemoteException;
import android.os.WorkSource;
import com.google.android.gms.beacon.BleFilter;
import com.google.location.nearby.direct.client.internal.OperationRequest;
import com.google.location.nearby.direct.client.internal.OperationResponse;
import java.util.Set;

/* renamed from: asek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asek implements ased {
    private final asgz a;

    public asek(asgz asgz) {
        this.a = asgz;
    }

    private static final asfz a() {
        aucd o = asfz.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asfz asfz = (asfz) o.b;
        "".getClass();
        asfz.a |= 1;
        asfz.b = "";
        asgb asgb = asgb.OPERATION_STATUS_UNKNOWN;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asfz asfz2 = (asfz) o.b;
        asfz2.c = asgb.j;
        asfz2.a |= 2;
        return (asfz) o.i();
    }

    private static final asfz a(OperationResponse operationResponse) {
        return operationResponse != null ? operationResponse.b : a();
    }

    private final boolean a(asha asha) {
        try {
            return this.a.d(new OperationRequest(asha, new asej()));
        } catch (RemoteException e) {
            return false;
        }
    }

    public final asfz a(asel asel, asgs asgs) {
        aucd o = asha.j.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asha asha = (asha) o.b;
        asha.b = 8;
        int i = asha.a | 1;
        asha.a = i;
        asel.getClass();
        asha.i = asel;
        asha.a = i | 128;
        try {
            return a(this.a.a(new OperationRequest((asha) o.i(), new asee(asgs))));
        } catch (RemoteException e) {
            return a();
        }
    }

    public final asfz a(asep asep, asgs asgs) {
        aucd o = asha.j.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asha asha = (asha) o.b;
        asha.b = 4;
        int i = asha.a | 1;
        asha.a = i;
        asep.getClass();
        asha.e = asep;
        asha.a = i | 8;
        try {
            return a(this.a.a(new OperationRequest((asha) o.i(), new aseh(asgs))));
        } catch (RemoteException e) {
            return a();
        }
    }

    public final asfz a(asfj asfj, asgs asgs) {
        aucd o = asha.j.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asha asha = (asha) o.b;
        asha.b = 2;
        int i = asha.a | 1;
        asha.a = i;
        asfj.getClass();
        asha.c = asfj;
        asha.a = i | 2;
        try {
            return a(this.a.a(new OperationRequest((asha) o.i(), new aseg(asgs))));
        } catch (RemoteException e) {
            return a();
        }
    }

    public final asfz a(asgc asgc, asgs asgs) {
        return a(asgc, asgs, (WorkSource) null, (Set) null);
    }

    public final asfz a(asgc asgc, asgs asgs, WorkSource workSource, Set set) {
        BleFilter[] bleFilterArr;
        aucd o = asha.j.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asha asha = (asha) o.b;
        asha.b = 5;
        int i = asha.a | 1;
        asha.a = i;
        asgc.getClass();
        asha.f = asgc;
        asha.a = i | 16;
        asha asha2 = (asha) o.i();
        asei asei = new asei(asgs);
        try {
            asgz asgz = this.a;
            if (set != null) {
                bleFilterArr = (BleFilter[]) set.toArray(new BleFilter[0]);
            } else {
                bleFilterArr = null;
            }
            return a(asgz.a(new OperationRequest(asha2, (asgw) asei, workSource, bleFilterArr)));
        } catch (RemoteException e) {
            return a();
        }
    }

    public final void a(asgk asgk, asgs asgs) {
        aucd o = asha.j.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asha asha = (asha) o.b;
        asha.b = 3;
        int i = asha.a | 1;
        asha.a = i;
        asgk.getClass();
        asha.d = asgk;
        asha.a = i | 4;
        try {
            a(this.a.a(new OperationRequest((asha) o.i(), new asef(asgs))));
        } catch (RemoteException e) {
            a();
        }
    }

    public final void a(asgm asgm) {
        aucd o = asha.j.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asha asha = (asha) o.b;
        asha.b = 7;
        int i = asha.a | 1;
        asha.a = i;
        asgm.getClass();
        asha.h = asgm;
        asha.a = i | 64;
        try {
            this.a.c(new OperationRequest((asha) o.i(), (asgw) null));
        } catch (RemoteException e) {
        }
    }

    public final void a(asgp asgp) {
        aucd o = asha.j.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asha asha = (asha) o.b;
        asha.b = 6;
        asha.a |= 1;
        aucd o2 = ashe.d.o();
        int a2 = asgr.a(asgp.b);
        if (a2 == 0) {
            a2 = 1;
        }
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ashe ashe = (ashe) o2.b;
        ashe.b = a2 - 1;
        int i = ashe.a | 1;
        ashe.a = i;
        String str = asgp.c;
        str.getClass();
        ashe.a = i | 2;
        ashe.c = str;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asha asha2 = (asha) o.b;
        ashe ashe2 = (ashe) o2.i();
        ashe2.getClass();
        asha2.g = ashe2;
        asha2.a |= 32;
        try {
            this.a.b(new OperationRequest((asha) o.i(), (asgw) null));
        } catch (RemoteException e) {
        }
    }

    public final void a(String str) {
        try {
            a(this.a.a(str));
        } catch (RemoteException e) {
            a();
        }
    }

    public final boolean a(asep asep) {
        aucd o = asha.j.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asha asha = (asha) o.b;
        asha.b = 4;
        int i = asha.a | 1;
        asha.a = i;
        asep.getClass();
        asha.e = asep;
        asha.a = i | 8;
        return a((asha) o.i());
    }

    public final boolean a(asgc asgc) {
        aucd o = asha.j.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asha asha = (asha) o.b;
        asha.b = 5;
        int i = asha.a | 1;
        asha.a = i;
        asgc.getClass();
        asha.f = asgc;
        asha.a = i | 16;
        return a((asha) o.i());
    }
}
