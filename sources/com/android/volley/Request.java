package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.Cache;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class Request implements Comparable {
    private final String CX;
    private final int CY;
    private Response.ErrorListener CZ;
    private boolean Dc;
    private boolean Dd;
    private boolean De;
    private boolean Df;
    private RetryPolicy Dg;
    private Cache.Entry Dh;
    public final bfa a;
    public final Object b;
    public beu c;
    private final int d;
    private Integer h;
    private RequestQueue i;
    private Object p;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface Method {
        public static final int DELETE = 3;
        public static final int DEPRECATED_GET_OR_POST = -1;
        public static final int GET = 0;
        public static final int HEAD = 4;
        public static final int OPTIONS = 5;
        public static final int PATCH = 7;
        public static final int POST = 1;
        public static final int PUT = 2;
        public static final int TRACE = 6;
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum Priority {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public Request(int i2, String str, Response.ErrorListener errorListener) {
        bfa bfa;
        Uri parse;
        String host;
        if (bfa.a) {
            bfa = new bfa();
        } else {
            bfa = null;
        }
        this.a = bfa;
        this.b = new Object();
        this.Dc = true;
        int i3 = 0;
        this.Dd = false;
        this.De = false;
        this.Df = false;
        this.Dh = null;
        this.d = i2;
        this.CX = str;
        this.CZ = errorListener;
        setRetryPolicy(new DefaultRetryPolicy());
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i3 = host.hashCode();
        }
        this.CY = i3;
    }

    private static final byte[] a(Map map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", new Object[]{entry.getKey(), entry.getValue()}));
                }
                sb.append(URLEncoder.encode((String) entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode((String) entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            String valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() == 0 ? new String("Encoding not supported: ") : "Encoding not supported: ".concat(valueOf), e);
        }
    }

    public void addMarker(String str) {
        if (bfa.a) {
            this.a.a(str, Thread.currentThread().getId());
        }
    }

    public void cancel() {
        synchronized (this.b) {
            this.Dd = true;
            this.CZ = null;
        }
    }

    public int compareTo(Request request) {
        Priority priority = getPriority();
        Priority priority2 = request.getPriority();
        return priority == priority2 ? this.h.intValue() - request.h.intValue() : priority2.ordinal() - priority.ordinal();
    }

    public void deliverError(VolleyError volleyError) {
        Response.ErrorListener errorListener;
        synchronized (this.b) {
            errorListener = this.CZ;
        }
        if (errorListener != null) {
            errorListener.onErrorResponse(volleyError);
        }
    }

    public abstract void deliverResponse(Object obj);

    public byte[] getBody() {
        Map params = getParams();
        if (params == null || params.size() <= 0) {
            return null;
        }
        return a(params, getParamsEncoding());
    }

    public String getBodyContentType() {
        String valueOf = String.valueOf(getParamsEncoding());
        return valueOf.length() == 0 ? new String("application/x-www-form-urlencoded; charset=") : "application/x-www-form-urlencoded; charset=".concat(valueOf);
    }

    public Cache.Entry getCacheEntry() {
        return this.Dh;
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method == 0 || method == -1) {
            return url;
        }
        String num = Integer.toString(method);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(url).length());
        sb.append(num);
        sb.append('-');
        sb.append(url);
        return sb.toString();
    }

    public Response.ErrorListener getErrorListener() {
        Response.ErrorListener errorListener;
        synchronized (this.b) {
            errorListener = this.CZ;
        }
        return errorListener;
    }

    public Map getHeaders() {
        return Collections.emptyMap();
    }

    public int getMethod() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public Map getParams() {
        return null;
    }

    /* access modifiers changed from: protected */
    public String getParamsEncoding() {
        return "UTF-8";
    }

    @Deprecated
    public byte[] getPostBody() {
        Map postParams = getPostParams();
        if (postParams == null || postParams.size() <= 0) {
            return null;
        }
        return a(postParams, getPostParamsEncoding());
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public Map getPostParams() {
        return getParams();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public Priority getPriority() {
        return Priority.NORMAL;
    }

    public RetryPolicy getRetryPolicy() {
        return this.Dg;
    }

    public final int getSequence() {
        Integer num = this.h;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object getTag() {
        return this.p;
    }

    public final int getTimeoutMs() {
        return getRetryPolicy().getCurrentTimeout();
    }

    public int getTrafficStatsTag() {
        return this.CY;
    }

    public String getUrl() {
        return this.CX;
    }

    public boolean hasHadResponseDelivered() {
        boolean z;
        synchronized (this.b) {
            z = this.De;
        }
        return z;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.b) {
            z = this.Dd;
        }
        return z;
    }

    public void markDelivered() {
        synchronized (this.b) {
            this.De = true;
        }
    }

    /* access modifiers changed from: protected */
    public VolleyError parseNetworkError(VolleyError volleyError) {
        return volleyError;
    }

    /* access modifiers changed from: protected */
    public abstract Response parseNetworkResponse(NetworkResponse networkResponse);

    public Request setCacheEntry(Cache.Entry entry) {
        this.Dh = entry;
        return this;
    }

    public Request setRequestQueue(RequestQueue requestQueue) {
        this.i = requestQueue;
        return this;
    }

    public Request setRetryPolicy(RetryPolicy retryPolicy) {
        this.Dg = retryPolicy;
        return this;
    }

    public final Request setSequence(int i2) {
        this.h = Integer.valueOf(i2);
        return this;
    }

    public final Request setShouldCache(boolean z) {
        this.Dc = z;
        return this;
    }

    public final Request setShouldRetryServerErrors(boolean z) {
        this.Df = z;
        return this;
    }

    public Request setTag(Object obj) {
        this.p = obj;
        return this;
    }

    public final boolean shouldCache() {
        return this.Dc;
    }

    public final boolean shouldRetryServerErrors() {
        return this.Df;
    }

    public String toString() {
        String str;
        String valueOf = String.valueOf(Integer.toHexString(getTrafficStatsTag()));
        String str2 = valueOf.length() == 0 ? new String("0x") : "0x".concat(valueOf);
        if (!isCanceled()) {
            str = "[ ] ";
        } else {
            str = "[X] ";
        }
        String url = getUrl();
        String valueOf2 = String.valueOf(getPriority());
        String valueOf3 = String.valueOf(this.h);
        int length = str.length();
        int length2 = String.valueOf(url).length();
        StringBuilder sb = new StringBuilder(length + 3 + length2 + String.valueOf(str2).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append(str);
        sb.append(url);
        sb.append(" ");
        sb.append(str2);
        sb.append(" ");
        sb.append(valueOf2);
        sb.append(" ");
        sb.append(valueOf3);
        return sb.toString();
    }

    @Deprecated
    public Request(String str, Response.ErrorListener errorListener) {
        this(-1, str, errorListener);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        beu beu;
        synchronized (this.b) {
            beu = this.c;
        }
        if (beu != null) {
            beu.a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        RequestQueue requestQueue = this.i;
        if (requestQueue != null) {
            requestQueue.a(this, i2);
        }
    }

    public final void a(beu beu) {
        synchronized (this.b) {
            this.c = beu;
        }
    }

    public final void a(String str) {
        RequestQueue requestQueue = this.i;
        if (requestQueue != null) {
            synchronized (requestQueue.a) {
                requestQueue.a.remove(this);
            }
            synchronized (requestQueue.b) {
                for (RequestQueue.RequestFinishedListener onRequestFinished : requestQueue.b) {
                    onRequestFinished.onRequestFinished(this);
                }
            }
            requestQueue.a(this, 5);
        }
        if (bfa.a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new bex(this, str, id));
                return;
            }
            this.a.a(str, id);
            this.a.a(toString());
        }
    }
}
