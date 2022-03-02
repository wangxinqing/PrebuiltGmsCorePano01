package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* renamed from: akvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akvu extends akwd {
    private final String b;
    private final rjx c;

    public akvu(String str, PlacesParams placesParams, rjx rjx, akuy akuy, akvn akvn, akhj akhj) {
        super(65, "GetPhotoMetadata", placesParams, akuy, akvn, "", akhj);
        iva.a((Object) str);
        iva.a((Object) rjx);
        this.b = str;
        this.c = rjx;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return 1;
    }

    public final aoei c() {
        aoei c2 = akig.c(5, this.a);
        aucd aucd = (aucd) c2.c(5);
        aucd.a((aucj) c2);
        aucd o = aoez.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoez aoez = (aoez) o.b;
        aoez.b = 0;
        aoez.a |= 1;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoei aoei = (aoei) aucd.b;
        aoez aoez2 = (aoez) o.i();
        aoei aoei2 = aoei.w;
        aoez2.getClass();
        aoei.l = aoez2;
        aoei.a |= 512;
        return (aoei) aucd.i();
    }

    public final void a(Context context) {
        ArrayList arrayList;
        super.a(context);
        aksc f = f();
        try {
            String str = this.b;
            PlacesParams placesParams = this.a;
            iyn iyn = f.e;
            String str2 = f.c;
            String str3 = f.d;
            Context context2 = f.a;
            aucd o = assb.d.o();
            asuu a = aksd.a(context2, placesParams);
            if (o.c) {
                o.c();
                o.c = false;
            }
            assb assb = (assb) o.b;
            a.getClass();
            assb.b = a;
            int i = assb.a | 1;
            assb.a = i;
            str.getClass();
            assb.a = i | 2;
            assb.c = str;
            assc assc = (assc) f.a((aktf) new akss(iyn, str2, str3, "getPlacePhotoMetadata", ((assb) o.i()).k(), assc.c, 9, 10266), placesParams);
            Context context3 = f.a;
            if (assc != null) {
                if (assc.b.size() != 0) {
                    asuv asuv = assc.a;
                    if (asuv == null) {
                        asuv = asuv.c;
                    }
                    aksd.a(context3, asuv);
                    arrayList = new ArrayList(assc.b.size());
                    for (int i2 = 0; i2 < assc.b.size(); i2++) {
                        asun asun = (asun) assc.b.get(i2);
                        arrayList.add(new rkp(asun.d, asun.a, asun.b, asun.c, i2));
                    }
                    alfs.a(0, (List) arrayList, this.c);
                }
            }
            arrayList = new ArrayList();
            alfs.a(0, (List) arrayList, this.c);
        } catch (VolleyError | eif | TimeoutException e) {
            throw akwd.a(e);
        }
    }

    public final void a(Status status) {
        alfs.a(status.i, Collections.emptyList(), this.c);
    }
}
