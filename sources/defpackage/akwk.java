package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlacesClientIdentifier;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: akwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akwk implements akwg {
    private final rka a;
    private final ifu b;
    private final PlacesClientIdentifier c;

    public akwk(PlacesClientIdentifier placesClientIdentifier, ifu ifu) {
        iva.a((Object) ifu);
        iva.a((Object) placesClientIdentifier);
        this.c = placesClientIdentifier;
        this.a = null;
        this.b = ifu;
    }

    private final void a(int i, String str) {
        rka rka = this.a;
        if (rka != null) {
            alfs.a(i, str, rka);
        } else if (this.b != null) {
            try {
                this.b.a(str != null ? ris.b(i, str) : ris.h(i));
            } catch (RemoteException e) {
            }
        }
    }

    public final int a() {
        return 3;
    }

    public final int b() {
        return 1;
    }

    public final String c() {
        return "";
    }

    public final boolean d() {
        return false;
    }

    @Deprecated
    public akwk(PlacesClientIdentifier placesClientIdentifier, rka rka) {
        this.c = placesClientIdentifier;
        this.a = rka;
        this.b = null;
    }

    public final aoei a(PlacesParams placesParams) {
        PlacesClientIdentifier placesClientIdentifier = this.c;
        String str = placesClientIdentifier.a;
        String str2 = placesClientIdentifier.b;
        aoei c2 = akig.c(15, placesParams);
        aucd aucd = (aucd) c2.c(5);
        aucd.a((aucj) c2);
        aucd o = aode.d.o();
        if (str != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aode aode = (aode) o.b;
            str.getClass();
            aode.a |= 1;
            aode.b = str;
        }
        if (str2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aode aode2 = (aode) o.b;
            str2.getClass();
            aode2.a |= 2;
            aode2.c = str2;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoei aoei = (aoei) aucd.b;
        aode aode3 = (aode) o.i();
        aoei aoei2 = aoei.w;
        aode3.getClass();
        aoei.t = aode3;
        aoei.a |= 524288;
        return (aoei) aucd.i();
    }

    public final void a(Context context, akvf akvf, PlacesParams placesParams) {
        akvn akvn = new akvn(2);
        try {
            PlacesClientIdentifier placesClientIdentifier = this.c;
            akvn.a(placesClientIdentifier.a, placesClientIdentifier.b);
            a(9201, "This app is whitelisted to receive personalized place inference results");
        } catch (nja e) {
            a(9202, "This app is not whitelisted to receive personalized place inference results");
        }
    }

    public final void a(Status status) {
        a(status.i, status.j);
    }
}
