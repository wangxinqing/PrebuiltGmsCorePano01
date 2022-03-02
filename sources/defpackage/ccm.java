package defpackage;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Map;

/* renamed from: ccm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ccm implements acvf {
    final /* synthetic */ ContextManagerClientInfo a;
    final /* synthetic */ ccq b;

    public ccm(ccq ccq, ContextManagerClientInfo contextManagerClientInfo) {
        this.b = ccq;
        this.a = contextManagerClientInfo;
    }

    public final /* bridge */ /* synthetic */ Object a(acwa acwa) {
        if (acwa.b()) {
            Map map = (Map) acwa.d();
            if (jir.a(map)) {
                return acws.a((Object) false);
            }
            this.b.a.put(this.a.a(), map);
            new Object[1][0] = map;
            return acws.a((Object) true);
        }
        new Object[1][0] = acwa.e();
        return acws.a((Object) false);
    }
}
