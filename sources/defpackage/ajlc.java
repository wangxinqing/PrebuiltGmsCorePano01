package defpackage;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.Response;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.response.FieldMappingDictionary;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* renamed from: ajlc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajlc extends ajkx {
    private final Context n;

    public ajlc(Context context) {
        super(context, aztb.a.a().g(), aztb.a.a().e(), aztb.a.a().f());
        this.n = context;
        this.g = 1538;
    }

    /* access modifiers changed from: protected */
    public final iys a(ClientContext clientContext, int i, String str, Object obj, Class cls, FieldMappingDictionary fieldMappingDictionary, String str2, String str3, Response.Listener listener, Response.ErrorListener errorListener, HashMap hashMap) {
        if (obj != null && aztb.a.a().bV()) {
            try {
                byte[] bytes = obj.toString().getBytes("utf-8");
                byte[] a = ajnw.a(bytes);
                if (bytes.length > a.length) {
                    hashMap.put("Content-Encoding", "gzip");
                    boolean z = this.a;
                    int i2 = this.g;
                    return new ajlb(i, str, cls, fieldMappingDictionary, listener, errorListener, str2, str3, z, hashMap, i2, this.h, a);
                }
            } catch (UnsupportedEncodingException e) {
                ajix.a("GCoreUlr", 46, "Failed to compress JSON", e);
            } catch (IOException e2) {
                ajix.a("GCoreUlr", 47, "Failed to compress JSON", e2);
            }
        }
        return super.a(clientContext, i, str, obj, cls, fieldMappingDictionary, str2, str3, listener, errorListener, hashMap);
    }

    /* access modifiers changed from: protected */
    public final void a(Request request, String str) {
        if (request.getUrl().contains("/reports")) {
            String str2 = str;
            request.setRetryPolicy(new iym(this.n, str2, (int) aztb.a.a().bU(), (int) aztb.a.a().bT(), (float) aztb.a.a().bR()));
            return;
        }
        super.a(request, str);
    }
}
