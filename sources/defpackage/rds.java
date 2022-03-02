package defpackage;

import java.util.List;

/* renamed from: rds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class rds implements igp {
    private final List a;

    public rds(List list) {
        this.a = list;
    }

    public final void a(Object obj, Object obj2) {
        boolean z;
        List list = this.a;
        rgu rgu = (rgu) obj;
        rdt rdt = new rdt((acwd) obj2);
        rgu.w();
        if (list == null || list.size() <= 0) {
            z = false;
        } else {
            z = true;
        }
        iva.b(z, "geofenceRequestIds can't be null nor empty.");
        iva.a((Object) rdt, (Object) "ResultHolder not provided.");
        rgt rgt = new rgt(rdt);
        ((rgk) rgu.x()).a((String[]) list.toArray(new String[0]), (rgh) rgt, rgu.c.getPackageName());
    }
}
