package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: zcb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zcb extends zax {
    private final ClientContext a;
    private final String b;

    public zcb(ClientContext clientContext, String str) {
        this.a = clientContext;
        this.b = str;
    }

    public final void a(Context context, yrr yrr) {
        ClientContext clientContext = this.a;
        String str = this.b;
        try {
            zdb zdb = yrr.e.a;
            zdb.a.a(clientContext, 3, String.format("moments/%1$s", new Object[]{iyv.a(str)}), (Object) null);
        } catch (eif e) {
        } catch (VolleyError e2) {
        }
    }
}
