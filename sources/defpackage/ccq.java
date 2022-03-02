package defpackage;

import android.content.Context;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ccq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ccq extends cbe {
    final Map a = new HashMap();

    private final acwa a(ContextManagerClientInfo contextManagerClientInfo) {
        if (contextManagerClientInfo.a().b()) {
            ((anih) ((anih) bxk.a.b()).a("ccq", "a", 96, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StandardPlaceAliasManager] Cannot use Places Alias Fences with anonymous accounts.");
            return acws.a((Object) Collections.emptyMap());
        }
        Context f = cbi.f();
        riq riq = new riq();
        riq.a = contextManagerClientInfo.b;
        riq.b = contextManagerClientInfo.d;
        riq.d = contextManagerClientInfo.a;
        return rij.b(f, riq.a()).a().b(cbi.k().a(bvq.a("StandardPlaceAliasManager_getStandardAliases")), new cco());
    }

    public final acwa a(Map map) {
        if (!map.isEmpty()) {
            return rij.b(cbi.f(), (rir) null).a((String[]) map.values().toArray(new String[map.size()])).b(cbi.k().a(bvq.a("StandardPlaceAliasManager_getPlacesByIds")), new ccp(map));
        }
        ((anih) ((anih) bxk.a.b()).a("ccq", "a", 145, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StandardPlaceAliasManager] Cannot use getPlacesByIds with anonymous accounts.");
        return acws.a((Object) null);
    }

    public final Map a(bsz bsz) {
        return (Map) this.a.get(bsz);
    }
}
