package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: akzz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akzz {
    public static final /* synthetic */ int q = 0;
    private static final PlaceFilter t;
    public final icc a;
    public final PlaceFilter b;
    public final AutocompleteFilter c;
    public akzw d;
    public akzu e;
    public akzs f;
    public akzt g;
    public akzq h;
    public icf i;
    public icf j;
    public icf k;
    public icf l;
    public icf m;
    public icf n;
    public icf o;
    public String p;
    private final Context r;
    private icf s;

    static {
        rhw d2 = PlaceFilter.d();
        d2.a = Arrays.asList(new Integer[]{1007});
        t = d2.a();
    }

    public akzz(Context context, String str, String str2, PlaceFilter placeFilter, String str3) {
        iva.a((Object) context);
        this.r = context;
        ibz ibz = new ibz(this.r);
        ibq ibq = rij.a;
        riq riq = new riq();
        riq.a = str;
        riq.b = str3;
        riq.c = 2;
        ibz.a(ibq, (ibj) riq.a());
        ibq ibq2 = rij.b;
        riq riq2 = new riq();
        riq2.a = str;
        riq2.b = str3;
        riq2.c = 2;
        ibz.a(ibq2, (ibj) riq2.a());
        if (!TextUtils.isEmpty(str2)) {
            ibz.a(str2);
        }
        this.a = ibz.b();
        this.b = placeFilter;
        boolean b2 = hya.a(context).b(str);
        rhd rhd = new rhd();
        rhd.a = b2;
        this.c = rhd.a();
    }

    public static rhq[] a(rhr rhr) {
        if (rhr == null) {
            return new rhq[0];
        }
        rhq[] rhqArr = new rhq[rhr.a()];
        for (int i2 = 0; i2 < rhr.a(); i2++) {
            rhqArr[i2] = ((rkr) rhr.a(i2)).r();
        }
        return rhqArr;
    }

    public static String b(rhr rhr) {
        String str;
        if (rhr == null || (str = rhr.c) == null) {
            return null;
        }
        return str.toString();
    }

    public final void b() {
        icf icf = this.n;
        if (icf != null) {
            icf.b();
        }
        icf icf2 = this.o;
        if (icf2 != null) {
            icf2.b();
        }
        ibq ibq = rij.a;
        icf a2 = rjl.a(this.a);
        this.n = a2;
        a2.a(new akzm(this), azcc.d(), TimeUnit.MILLISECONDS);
    }

    public final void a() {
        icf icf = this.j;
        if (icf != null) {
            icf.b();
        }
        icf icf2 = this.i;
        if (icf2 != null) {
            icf2.b();
        }
        icf icf3 = this.s;
        if (icf3 != null) {
            icf3.b();
        }
        icf icf4 = this.k;
        if (icf4 != null) {
            icf4.b();
        }
        icf icf5 = this.l;
        if (icf5 != null) {
            icf5.b();
        }
        icf icf6 = this.m;
        if (icf6 != null) {
            icf6.b();
        }
        icf icf7 = this.n;
        if (icf7 != null) {
            icf7.b();
        }
        icf icf8 = this.o;
        if (icf8 != null) {
            icf8.b();
        }
    }

    public final void a(LatLng latLng) {
        icf icf = this.s;
        if (icf != null) {
            icf.b();
        }
        ibq ibq = rij.a;
        icf a2 = rjl.a(this.a, new LatLngBounds(latLng, latLng), 1, (String) null, t);
        this.s = a2;
        a2.a(new akzv(this), azcc.d(), TimeUnit.MILLISECONDS);
    }

    public final void a(String[] strArr) {
        icf icf = this.j;
        if (icf != null) {
            icf.b();
        }
        icf icf2 = this.i;
        if (icf2 != null) {
            icf2.b();
        }
        icf icf3 = this.k;
        if (icf3 != null) {
            icf3.b();
        }
        ibq ibq = rij.a;
        icf a2 = rjl.a(this.a, strArr);
        this.k = a2;
        a2.a(new akzr(this), azcc.d(), TimeUnit.MILLISECONDS);
    }
}
