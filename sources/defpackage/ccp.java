package defpackage;

import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ccp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ccp implements acvf {
    final /* synthetic */ Map a;

    public ccp(Map map) {
        this.a = map;
    }

    public final acwa b(acwa acwa) {
        if (acwa.b()) {
            rhs rhs = (rhs) acwa.d();
            if (rhs == null) {
                ((anih) ((anih) bxk.a.b()).a("ccp", "b", 161, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StandardPlaceAliasManager] Unknown error: null returned from GeoDataClient#getPlaceById");
                return acws.a((Object) null);
            }
            HashMap hashMap = new HashMap();
            Iterator it = rhs.iterator();
            while (it.hasNext()) {
                rhq rhq = (rhq) it.next();
                hashMap.put(rhq.a(), rhq.d());
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : this.a.entrySet()) {
                String str = (String) entry.getKey();
                LatLng latLng = (LatLng) hashMap.get((String) entry.getValue());
                if (latLng != null) {
                    hashMap2.put(str, latLng);
                }
            }
            if (hashMap2.isEmpty()) {
                ((anih) ((anih) bxk.a.b()).a("ccp", "b", 185, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StandardPlaceAliasManager] No LatLng information found for placeId %s", (Object) this.a.values());
            }
            return acws.a((Object) hashMap2);
        }
        anih anih = (anih) bxk.a.b();
        anih.a((Throwable) acwa.e());
        ((anih) anih.a("ccp", "b", 194, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StandardPlaceAliasManager] getPlaceById failed: ");
        return acws.a((Object) null);
    }

    public final /* bridge */ /* synthetic */ Object a(acwa acwa) {
        if (acwa.b()) {
            rhs rhs = (rhs) acwa.d();
            if (rhs == null) {
                ((anih) ((anih) bxk.a.b()).a("ccp", "b", 161, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StandardPlaceAliasManager] Unknown error: null returned from GeoDataClient#getPlaceById");
                return acws.a((Object) null);
            }
            HashMap hashMap = new HashMap();
            Iterator it = rhs.iterator();
            while (it.hasNext()) {
                rhq rhq = (rhq) it.next();
                hashMap.put(rhq.a(), rhq.d());
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : this.a.entrySet()) {
                String str = (String) entry.getKey();
                LatLng latLng = (LatLng) hashMap.get((String) entry.getValue());
                if (latLng != null) {
                    hashMap2.put(str, latLng);
                }
            }
            if (hashMap2.isEmpty()) {
                ((anih) ((anih) bxk.a.b()).a("ccp", "b", 185, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StandardPlaceAliasManager] No LatLng information found for placeId %s", (Object) this.a.values());
            }
            return acws.a((Object) hashMap2);
        }
        anih anih = (anih) bxk.a.b();
        anih.a((Throwable) acwa.e());
        ((anih) anih.a("ccp", "b", 194, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StandardPlaceAliasManager] getPlaceById failed: ");
        return acws.a((Object) null);
    }
}
