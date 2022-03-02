package defpackage;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BaseHttpStack;
import com.android.volley.toolbox.BasicNetwork;
import java.util.Map;

/* renamed from: djq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class djq extends BasicNetwork {
    private final int a;

    public djq(BaseHttpStack baseHttpStack, int i) {
        super(baseHttpStack);
        this.a = i;
    }

    public final NetworkResponse performRequest(Request request) {
        int i;
        izj.a(4102, this.a);
        agev agev = new agev(request.getUrl());
        agev.a();
        try {
            NetworkResponse performRequest = super.performRequest(request);
            if (performRequest != null) {
                Map map = performRequest.headers;
                if (map != null) {
                    agev.a((String) map.get("Content-Type"));
                }
                byte[] bArr = performRequest.data;
                int i2 = 0;
                if (bArr != null) {
                    i = bArr.length;
                } else {
                    i = 0;
                }
                if (request.getBody() != null) {
                    i2 = request.getBody().length;
                }
                agev.a(i, i2);
                agev.a(performRequest.statusCode);
            }
            izj.a();
            agfu.a().a(agev);
            return performRequest;
        } catch (VolleyError e) {
            NetworkResponse networkResponse = e.networkResponse;
            if (networkResponse != null) {
                agev.a(networkResponse.statusCode);
            }
            throw e;
        } catch (Throwable th) {
            izj.a();
            agfu.a().a(agev);
            throw th;
        }
    }
}
