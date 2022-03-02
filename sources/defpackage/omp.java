package defpackage;

import android.content.Context;
import android.util.Log;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: omp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class omp extends nzn {
    private final oab j;

    private omp(Context context, HelpConfig helpConfig, String str, oab oab, RequestFuture requestFuture) {
        super(context, helpConfig, 0, str, requestFuture, requestFuture);
        this.j = oab;
        this.h.put("If-None-Match", this.j.l);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.oab a(defpackage.nzu r18, defpackage.oab r19) {
        /*
            java.lang.String r0 = "Must be called from a worker thread."
            defpackage.iva.b((java.lang.String) r0)
            com.android.volley.toolbox.RequestFuture r7 = com.android.volley.toolbox.RequestFuture.newFuture()
            r5 = r19
            java.lang.String r0 = r5.f
            java.lang.String r1 = "components"
            java.lang.String r2 = "PCT_CONTEXT_SELECTOR"
            java.lang.String r0 = defpackage.oau.a(r0, r1, r2)
            java.lang.String r2 = "extra_params"
            java.lang.String r3 = "api_client.ghandroid"
            java.lang.String r2 = defpackage.oau.a(r0, r2, r3)
            com.google.android.gms.googlehelp.common.HelpConfig r0 = r18.f()
            r3 = 0
            r8 = 0
            if (r0 == 0) goto L_0x00be
            com.google.android.gms.googlehelp.common.HelpConfig r0 = r18.f()
            r18.k()
            r4 = r18
            android.content.Context r4 = (android.content.Context) r4
            java.util.List r0 = r0.a((android.content.Context) r4)
            if (r0 == 0) goto L_0x00be
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x00be
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            int r6 = r0.size()
            r9 = 0
            r10 = 0
        L_0x0047:
            java.lang.String r11 = "gH_UrlUtil"
            if (r9 >= r6) goto L_0x0097
            java.lang.Object r12 = r0.get(r9)
            olz r12 = (defpackage.olz) r12
            int r13 = r12.a     // Catch:{ JSONException -> 0x008f }
            r14 = r13 & 1
            if (r14 == 0) goto L_0x008d
            r13 = r13 & 2
            if (r13 != 0) goto L_0x005c
            goto L_0x008a
        L_0x005c:
            java.lang.String r13 = r12.b     // Catch:{ JSONException -> 0x008f }
            int r13 = r13.length()     // Catch:{ JSONException -> 0x008f }
            int r10 = r10 + r13
            java.lang.String r13 = r12.c     // Catch:{ JSONException -> 0x008f }
            int r13 = r13.length()     // Catch:{ JSONException -> 0x008f }
            int r10 = r10 + r13
            long r13 = (long) r10     // Catch:{ JSONException -> 0x008f }
            axmj r15 = defpackage.axmj.a     // Catch:{ JSONException -> 0x008f }
            axmk r15 = r15.a()     // Catch:{ JSONException -> 0x008f }
            long r15 = r15.aw()     // Catch:{ JSONException -> 0x008f }
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 <= 0) goto L_0x0083
            java.lang.String r0 = "PSD LIMIT REACHED! Dropping PSD for request."
            android.util.Log.w(r11, r0)     // Catch:{ JSONException -> 0x008f }
            defpackage.okg.g(r18)     // Catch:{ JSONException -> 0x008f }
            r0 = r8
            goto L_0x00bf
        L_0x0083:
            java.lang.String r13 = r12.b     // Catch:{ JSONException -> 0x008f }
            java.lang.String r12 = r12.c     // Catch:{ JSONException -> 0x008f }
            r4.put(r13, r12)     // Catch:{ JSONException -> 0x008f }
        L_0x008a:
            int r9 = r9 + 1
            goto L_0x0047
        L_0x008d:
            r0 = r8
            goto L_0x00bf
        L_0x008f:
            r0 = move-exception
            java.lang.String r4 = "Converting PSD to JSONObject failed."
            android.util.Log.e(r11, r4, r0)
            r0 = r8
            goto L_0x00bf
        L_0x0097:
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "UTF-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r4, r0)     // Catch:{ UnsupportedEncodingException -> 0x00a2 }
            goto L_0x00bf
        L_0x00a2:
            r0 = move-exception
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "Failed when encoding "
            int r9 = r4.length()
            if (r9 != 0) goto L_0x00b5
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x00b9
        L_0x00b5:
            java.lang.String r4 = r6.concat(r4)
        L_0x00b9:
            android.util.Log.e(r11, r4, r0)
            r0 = r8
            goto L_0x00bf
        L_0x00be:
            r0 = r8
        L_0x00bf:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x00ea
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r0
            java.lang.String r0 = "&psd=%s"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            if (r3 != 0) goto L_0x00e5
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            r2 = r0
            goto L_0x00eb
        L_0x00e5:
            java.lang.String r2 = r2.concat(r0)
            goto L_0x00eb
        L_0x00ea:
        L_0x00eb:
            com.google.android.gms.googlehelp.common.HelpConfig r0 = r18.f()
            if (r0 == 0) goto L_0x0169
            com.google.android.gms.googlehelp.common.HelpConfig r0 = r18.f()
            java.lang.String r3 = r0.r
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0118
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = r0.r
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            if (r4 != 0) goto L_0x0114
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            r2 = r3
            goto L_0x0118
        L_0x0114:
            java.lang.String r2 = r2.concat(r3)
        L_0x0118:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            android.accounts.Account r3 = r0.d
            if (r3 == 0) goto L_0x0123
            java.lang.String r3 = "1"
            goto L_0x0125
        L_0x0123:
            java.lang.String r3 = "0"
        L_0x0125:
            java.lang.String r4 = r0.e
            java.lang.String r6 = java.lang.String.valueOf(r2)
            int r6 = r6.length()
            int r9 = r3.length()
            java.lang.String r10 = java.lang.String.valueOf(r4)
            int r10 = r10.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r6 = r6 + 11
            int r6 = r6 + r9
            int r6 = r6 + r10
            r11.<init>(r6)
            r11.append(r2)
            java.lang.String r2 = "&visit_id="
            r11.append(r2)
            r11.append(r3)
            java.lang.String r2 = "-"
            r11.append(r2)
            r11.append(r4)
            java.lang.String r2 = r11.toString()
            android.accounts.Account r0 = r0.d
            if (r0 != 0) goto L_0x0167
            java.lang.String r0 = "PCT_SIGNED_OUT"
            java.lang.String r0 = defpackage.oau.a(r2, r1, r0)
            r4 = r0
            goto L_0x016a
        L_0x0167:
            r4 = r2
            goto L_0x016a
        L_0x0169:
            r4 = r2
        L_0x016a:
            omp r0 = new omp
            r18.k()
            r1 = r18
            android.content.Context r1 = (android.content.Context) r1
            android.content.Context r2 = r1.getApplicationContext()
            com.google.android.gms.googlehelp.common.HelpConfig r3 = r18.f()
            r1 = r0
            r5 = r19
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r0.e()
            axmj r0 = defpackage.axmj.a     // Catch:{ InterruptedException -> 0x019c, ExecutionException -> 0x019a, TimeoutException -> 0x0198 }
            axmk r0 = r0.a()     // Catch:{ InterruptedException -> 0x019c, ExecutionException -> 0x019a, TimeoutException -> 0x0198 }
            long r0 = r0.U()     // Catch:{ InterruptedException -> 0x019c, ExecutionException -> 0x019a, TimeoutException -> 0x0198 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x019c, ExecutionException -> 0x019a, TimeoutException -> 0x0198 }
            java.lang.Object r0 = r7.get(r0, r2)     // Catch:{ InterruptedException -> 0x019c, ExecutionException -> 0x019a, TimeoutException -> 0x0198 }
            oab r0 = (defpackage.oab) r0     // Catch:{ InterruptedException -> 0x019c, ExecutionException -> 0x019a, TimeoutException -> 0x0198 }
            return r0
        L_0x0198:
            r0 = move-exception
            goto L_0x019d
        L_0x019a:
            r0 = move-exception
            goto L_0x019d
        L_0x019c:
            r0 = move-exception
        L_0x019d:
            java.lang.String r1 = "gH_LeafContentRequest"
            java.lang.String r2 = "Fetching leaf content failed."
            android.util.Log.e(r1, r2, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.omp.a(nzu, oab):oab");
    }

    public final Request.Priority getPriority() {
        return Request.Priority.HIGH;
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        oab oab;
        oab oab2 = this.j;
        if (networkResponse.statusCode == 304) {
            return Response.success(oab.a, (Cache.Entry) null);
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers)));
            if (jSONObject.has("validation_error")) {
                if (jSONObject.getJSONArray("validation_error").length() > 0) {
                    oab = null;
                    return Response.success(oab, (Cache.Entry) null);
                }
            }
            oab = oab.a(jSONObject, oab2);
            return Response.success(oab, (Cache.Entry) null);
        } catch (UnsupportedEncodingException e) {
            Log.e("gH_RenderingApiUtils", "Parsing leaf content response data failed.", e);
            return Response.error(new ParseError((Throwable) e));
        } catch (JSONException e2) {
            Log.e("gH_RenderingApiUtils", "Parsing leaf content response data failed.", e2);
            return Response.error(new VolleyError((Throwable) e2));
        }
    }
}
