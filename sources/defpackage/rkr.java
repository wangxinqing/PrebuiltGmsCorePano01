package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceExtendedDetailsEntity;
import com.google.android.gms.location.places.internal.PlaceOpeningHoursEntity;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: rkr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rkr extends ilj implements rhq {
    private final String c = a("place_id", "");
    private final PlaceExtendedDetailsEntity d;

    private final List v() {
        return b("place_attributions", Collections.emptyList());
    }

    public final String a() {
        return this.c;
    }

    public final List b() {
        return a("place_types", Collections.emptyList());
    }

    public final Locale c() {
        String a = a("place_locale_language", "");
        if (!TextUtils.isEmpty(a)) {
            return new Locale(a, a("place_locale_country", ""));
        }
        String a2 = a("place_locale", "");
        if (!TextUtils.isEmpty(a2)) {
            return new Locale(a2);
        }
        return Locale.getDefault();
    }

    public final LatLng d() {
        return (LatLng) a("place_lat_lng", LatLng.CREATOR);
    }

    public final float e() {
        return a("place_level_number", 0.0f);
    }

    public final LatLngBounds f() {
        return (LatLngBounds) a("place_viewport", LatLngBounds.CREATOR);
    }

    public final TimeZone g() {
        return null;
    }

    public final Uri h() {
        String a = a("place_website_uri", (String) null);
        if (a != null) {
            return Uri.parse(a);
        }
        return null;
    }

    public final CharSequence i() {
        return rjd.a(v());
    }

    public final float k() {
        return a("place_rating", -1.0f);
    }

    public final int l() {
        return a("place_price_level", -1);
    }

    public final String m() {
        return a("place_adr_address", "");
    }

    public final SafeParcelable n() {
        return r();
    }

    public final CharSequence o() {
        return a("place_phone_number", "");
    }

    public final CharSequence p() {
        return a("place_name", "");
    }

    public final CharSequence q() {
        return a("place_address", "");
    }

    /* renamed from: u */
    public final PlaceEntity r() {
        rkj rkj = new rkj();
        rkj.l = q().toString();
        rkj.n = v();
        rkj.a = this.c;
        rkj.h = j();
        rkj.c = d();
        rkj.d = e();
        rkj.b = p().toString();
        rkj.m = o().toString();
        rkj.j = l();
        rkj.i = k();
        rkj.k = b();
        rkj.e = f();
        rkj.g = h();
        rkj.o = (PlaceOpeningHoursEntity) a("place_opening_hours", PlaceOpeningHoursEntity.CREATOR);
        rkj.p = this.d;
        rkj.q = m();
        PlaceEntity a = rkj.a();
        a.r = c();
        return a;
    }

    public rkr(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        PlaceExtendedDetailsEntity placeExtendedDetailsEntity = null;
        if (b().size() > 0 || ((o() != null && o().length() > 0) || ((h() != null && !h().equals(Uri.EMPTY)) || k() >= 0.0f || l() >= 0))) {
            placeExtendedDetailsEntity = new PlaceExtendedDetailsEntity(b(), o() != null ? o().toString() : null, h(), k(), l());
        }
        this.d = placeExtendedDetailsEntity;
    }

    public final boolean j() {
        if (!a("place_is_permanently_closed") || f("place_is_permanently_closed")) {
            return false;
        }
        return c("place_is_permanently_closed");
    }
}
