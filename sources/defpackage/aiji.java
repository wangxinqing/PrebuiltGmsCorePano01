package defpackage;

import android.content.Context;
import android.location.GeocoderParams;
import com.android.location.provider.GeocodeProvider;
import java.io.IOException;
import java.util.List;

/* renamed from: aiji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiji extends GeocodeProvider {
    private final aijm a;

    public aiji(Context context) {
        this.a = new aijm(context, new aijj(new izd(context, (byte[]) null)), hol.a(context, "LE"));
    }

    public final String onGetFromLocation(double d, double d2, int i, GeocoderParams geocoderParams, List list) {
        try {
            this.a.a(geocoderParams.getLocale(), geocoderParams.getClientPackage(), d, d2, i, list);
            return null;
        } catch (IOException e) {
            return e.getMessage();
        } catch (Exception e2) {
            return null;
        }
    }

    public final String onGetFromLocationName(String str, double d, double d2, double d3, double d4, int i, GeocoderParams geocoderParams, List list) {
        try {
            this.a.a(geocoderParams.getLocale(), geocoderParams.getClientPackage(), str, d, d2, d3, d4, i, list);
            return null;
        } catch (IOException e) {
            return e.getMessage();
        } catch (Exception e2) {
            return null;
        }
    }
}
