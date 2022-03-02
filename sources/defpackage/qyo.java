package defpackage;

import android.util.Base64;
import android.util.Log;
import java.util.Collections;
import java.util.Map;

/* renamed from: qyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qyo implements amqy {
    private String a = "";
    private Map b = anfu.b;

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Map map;
        auco auco = (auco) obj;
        String K = azrk.a.a().K();
        if (K == null) {
            K = "";
        }
        synchronized (this) {
            if (!this.a.equals(K)) {
                try {
                    this.b = Collections.unmodifiableMap(((aunm) aucj.a((aucj) aunm.b, Base64.decode(K, 0), aubs.c())).a);
                    this.a = K;
                } catch (auda | IllegalArgumentException e) {
                    Log.e("CachingPoliciesDecoder", "Could not decode sync policies", e);
                }
            }
            map = this.b;
        }
        return (auop) map.get(Integer.valueOf(auco.a()));
    }
}
