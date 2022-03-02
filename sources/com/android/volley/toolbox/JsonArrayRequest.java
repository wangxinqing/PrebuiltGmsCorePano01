package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class JsonArrayRequest extends JsonRequest {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JsonArrayRequest(int r7, java.lang.String r8, org.json.JSONArray r9, com.android.volley.Response.Listener r10, com.android.volley.Response.ErrorListener r11) {
        /*
            r6 = this;
            if (r9 == 0) goto L_0x0008
            java.lang.String r9 = r9.toString()
            r3 = r9
            goto L_0x000a
        L_0x0008:
            r9 = 0
            r3 = r9
        L_0x000a:
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.JsonArrayRequest.<init>(int, java.lang.String, org.json.JSONArray, com.android.volley.Response$Listener, com.android.volley.Response$ErrorListener):void");
    }

    /* access modifiers changed from: protected */
    public Response parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            return Response.success(new JSONArray(new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers, "utf-8"))), HttpHeaderParser.parseCacheHeaders(networkResponse));
        } catch (UnsupportedEncodingException e) {
            return Response.error(new ParseError((Throwable) e));
        } catch (JSONException e2) {
            return Response.error(new ParseError((Throwable) e2));
        }
    }

    public JsonArrayRequest(String str, Response.Listener listener, Response.ErrorListener errorListener) {
        super(0, str, (String) null, listener, errorListener);
    }
}
