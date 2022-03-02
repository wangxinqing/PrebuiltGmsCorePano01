package defpackage;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.ResponseDelivery;
import com.android.volley.VolleyError;

/* renamed from: atgz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class atgz implements ResponseDelivery {
    private static final String a = atgz.class.getSimpleName();

    private static String a(Request request) {
        String str;
        String str2;
        String str3;
        try {
            byte[] body = request.getBody();
            if (body != null) {
                int length = body.length;
                StringBuilder sb = new StringBuilder(19);
                sb.append("[");
                sb.append(length);
                sb.append(" bytes]");
                str = sb.toString();
            } else {
                str = "<empty>";
            }
        } catch (AuthFailureError e) {
            str = "[Error retrieving body]";
        }
        try {
            str2 = String.valueOf(request.getHeaders());
        } catch (AuthFailureError e2) {
            str2 = "[Error retriving headers]";
        }
        atgf a2 = atgf.a(request);
        a2.a("URL", request.getUrl());
        a2.a("Headers", str2);
        int method = request.getMethod();
        if (method == 0) {
            str3 = "GET";
        } else if (method != 1) {
            StringBuilder sb2 = new StringBuilder(13);
            sb2.append("(");
            sb2.append(method);
            sb2.append(")");
            str3 = sb2.toString();
        } else {
            str3 = "POST";
        }
        a2.a("Method", str3);
        a2.a("Body", str);
        a2.a("BodyContentType", request.getBodyContentType());
        return a2.toString();
    }

    public void postError(Request request, VolleyError volleyError) {
        if (atfx.a(a, 3)) {
            String a2 = a(request);
            String a3 = a(volleyError);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 17 + String.valueOf(a3).length());
            sb.append("REQUEST: ");
            sb.append(a2);
            sb.append("\nERROR: ");
            sb.append(a3);
            sb.toString();
        }
    }

    public void postResponse(Request request, Response response) {
        if (atfx.a(a, 3)) {
            String a2 = a(request);
            String a3 = a(response);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 20 + String.valueOf(a3).length());
            sb.append("REQUEST: ");
            sb.append(a2);
            sb.append("\nRESPONSE: ");
            sb.append(a3);
            sb.toString();
        }
    }

    public void postResponse(Request request, Response response, Runnable runnable) {
        if (atfx.a(a, 3)) {
            String a2 = a(request);
            String a3 = a(response);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 20 + String.valueOf(a3).length());
            sb.append("REQUEST: ");
            sb.append(a2);
            sb.append("\nRESPONSE: ");
            sb.append(a3);
            sb.toString();
        }
    }

    private static String a(Response response) {
        if (response.isSuccess()) {
            return "Response{OK}";
        }
        String a2 = a(response.error);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 16);
        sb.append("Response{Error=");
        sb.append(a2);
        sb.append("}");
        return sb.toString();
    }

    private static String a(VolleyError volleyError) {
        String str;
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse != null) {
            byte[] bArr = networkResponse.data;
            atgf a2 = atgf.a(volleyError);
            a2.a("ResponseCode", String.valueOf(networkResponse.statusCode));
            a2.a("Headers", String.valueOf(networkResponse.headers));
            if (bArr != null) {
                int length = bArr.length;
                StringBuilder sb = new StringBuilder(19);
                sb.append("[");
                sb.append(length);
                sb.append(" bytes]");
                str = sb.toString();
            } else {
                str = "<empty>";
            }
            a2.a("Data", str);
            return a2.toString();
        }
        String message = volleyError.getMessage();
        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 15);
        sb2.append("VolleyError(\"");
        sb2.append(message);
        sb2.append("\")");
        return sb2.toString();
    }
}
