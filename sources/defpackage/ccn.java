package defpackage;

import java.util.Map;

/* renamed from: ccn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ccn implements acvf {
    public final /* bridge */ /* synthetic */ Object a(acwa acwa) {
        Map map = (Map) acwa.d();
        new Object[1][0] = map;
        if (jir.a(map)) {
            return acws.a((Object) null);
        }
        if (!map.isEmpty()) {
            return rij.b(cbi.f(), (rir) null).a((String[]) map.values().toArray(new String[map.size()])).b(cbi.k().a(bvq.a("StandardPlaceAliasManager_getPlacesByIds")), new ccp(map));
        }
        ((anih) ((anih) bxk.a.b()).a("ccq", "a", 145, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StandardPlaceAliasManager] Cannot use getPlacesByIds with anonymous accounts.");
        return acws.a((Object) null);
    }
}
