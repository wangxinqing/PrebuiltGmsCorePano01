package defpackage;

import android.content.Context;
import android.util.Pair;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ClientContext;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: zba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zba extends zay {
    private final String c;

    public zba(ClientContext clientContext, String str, yth yth) {
        super(clientContext, yth);
        this.c = str;
    }

    public final Pair b(Context context, yrr yrr) {
        String str;
        zcr zcr;
        yrr yrr2 = yrr;
        ClientContext clientContext = this.a;
        String str2 = this.c;
        yse yse = yrr2.b;
        String a = yrr2.a(context, clientContext);
        yrx a2 = yrv.a().a(clientContext.b(), str2);
        if (a2 != null) {
            str = a2.a();
        } else {
            str = null;
        }
        try {
            String a3 = zak.a(context.getPackageManager(), clientContext.e);
            zda zda = yse.b;
            String a4 = yse.a(str2);
            JSONArray jSONArray = new JSONArray();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apiVersion", "v1");
                jSONObject.put("jsonrpc", "2.0");
                jSONObject.put("method", "pos.plusones.delete");
                JSONObject jSONObject2 = new JSONObject();
                if (a4 != null) {
                    jSONObject2.put("id", a4);
                }
                if (a3 != null) {
                    jSONObject2.put("container", a3);
                }
                jSONObject2.put("source", "native:android_app");
                if (str != null) {
                    jSONObject2.put("cdx", str);
                }
                jSONObject.put("params", jSONObject2);
                jSONArray.put(jSONObject);
            } catch (Exception e) {
            }
            zal zal = zda.a;
            String d = zal.d(clientContext);
            String c2 = zal.c(clientContext);
            RequestFuture newFuture = RequestFuture.newFuture();
            HashMap a5 = zal.a(zal.i, clientContext);
            zal.h = clientContext.b;
            RequestQueue requestQueue = zal.j;
            String concat = String.valueOf(zal.d).concat("/rpc");
            boolean z = zal.a;
            int i = zal.g;
            int i2 = zal.h;
            requestQueue.add(new iys(-1, concat, jSONArray.toString(), zcz.class, (Object) null, (Response.Listener) newFuture, (Response.ErrorListener) newFuture, d, c2, z, a5, i, i2));
            boolean a6 = yrw.a(((zcy) ((zcz) ((jag) newFuture.get())).a.get(0)).a);
            zcr a7 = yrv.a().a(clientContext.b(), str2, a6);
            if (a7 == null) {
                zcn zcn = new zcn();
                zcn.a(str2);
                zcn.a(a6);
                zcr = zcn.a();
            } else {
                zcr = a7;
            }
            return Pair.create(ConnectionResult.a, yrw.a(context, clientContext.a(), true, str2, zcr, context.getResources().getString(R.string.plus_one_self_removed), (String) null, a).a);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw new izv();
        } catch (ExecutionException e3) {
            throw new VolleyError("Error executing network request for /rpc", e3);
        } catch (VolleyError e4) {
            yrv.a().b(clientContext.b(), str2);
            throw e4;
        }
    }
}
