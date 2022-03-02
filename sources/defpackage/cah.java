package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: cah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cah extends bwp {
    private final Collection c;
    private final List d;
    private final PendingIntent e;

    public cah(Collection collection, PendingIntent pendingIntent, Collection collection2) {
        super("UpdateGeofencesOperation");
        boolean z = true;
        if ((collection2 == null || collection2.isEmpty()) && (collection == null || collection.isEmpty() || pendingIntent == null)) {
            z = false;
        }
        iva.b(z);
        this.c = collection;
        ArrayList arrayList = null;
        if (collection2 != null && !collection2.isEmpty()) {
            arrayList = new ArrayList(collection2.size());
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(((ParcelableGeofence) it.next()).a);
            }
        }
        this.d = arrayList;
        this.e = pendingIntent;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        iby a = ren.a(cbi.f());
        List list = this.d;
        if (list != null && !list.isEmpty()) {
            a.a(this.d).a((acvp) new bva("[UpdateGeofencesOperation] remove geofences %s", this.d));
        }
        Collection collection = this.c;
        if (collection != null && !collection.isEmpty()) {
            rdv rdv = new rdv();
            for (ParcelableGeofence a2 : this.c) {
                rdv.a(a2);
            }
            a.a(rdv.a(), this.e).a((acvp) new bva("[UpdateGeofencesOperation] add geofences %s", this.c));
        }
    }
}
