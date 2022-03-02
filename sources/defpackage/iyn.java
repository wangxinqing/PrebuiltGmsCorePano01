package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpClientStack;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.common.internal.ClientContext;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: iyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class iyn extends iyo {
    public final boolean a;
    protected final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final ConcurrentHashMap f;
    public int g;
    public int h;
    private String j;
    private String k;
    private final String l;
    private final String m;

    public iyn(Context context, String str, String str2, boolean z, boolean z2, String str3, String str4) {
        this(context, str, str2, z, z2, str3, str4, (String) null, (byte[]) null);
    }

    public static final int a(int i, Map map) {
        if (i != 7) {
            return i;
        }
        map.put("X-HTTP-Method-Override", HttpClientStack.HttpPatch.METHOD_NAME);
        return 1;
    }

    protected static final RequestQueue c() {
        return ihs.b().getRequestQueue();
    }

    public int a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public iyn(Context context, String str, String str2, boolean z, boolean z2, String str3, String str4, String str5) {
        super(context);
        this.f = new ConcurrentHashMap();
        this.e = str;
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(str2);
        this.d = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        this.a = z;
        this.c = z2;
        this.l = str3;
        this.m = str4;
        this.b = str5;
        this.g = 153;
        this.h = -1;
    }

    private final Object a(ClientContext clientContext, int i, String str, byte[] bArr, Object obj, int i2) {
        String d2 = d(clientContext);
        try {
            return a(d2, clientContext, i, str, bArr, obj, i2).get();
        } catch (InterruptedException e2) {
            throw new VolleyError("Thread interrupted");
        } catch (ExecutionException e3) {
            a(e3, d2);
            throw new VolleyError("Error executing network request", e3);
        }
    }

    public final void b(Request request, String str) {
        a(request, str);
        c().add(request);
    }

    public iyn(Context context, String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, byte[] bArr) {
        this(context, str, str2, z, z2, str3, str4, str5);
        this.g = 151;
    }

    public static boolean a(VolleyError volleyError) {
        String a2;
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse == null || networkResponse.statusCode != 401 || (a2 = jad.a(volleyError)) == null) {
            return false;
        }
        if ("authError".equalsIgnoreCase(a2) || "expired".equalsIgnoreCase(a2)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final RequestFuture a(String str, ClientContext clientContext, int i, String str2, byte[] bArr, Object obj, int i2) {
        ClientContext clientContext2 = clientContext;
        String c2 = c(clientContext2);
        RequestFuture newFuture = RequestFuture.newFuture();
        HashMap a2 = a(this.i, clientContext2);
        int a3 = a(i, (Map) a2);
        String a4 = a(this.d, str2);
        this.h = clientContext2.b;
        izs a5 = a(a3, a4, bArr, obj, str, c2, newFuture, newFuture, a2, i2, b());
        String str3 = str;
        b(a5, str);
        return newFuture;
    }

    /* access modifiers changed from: protected */
    public final RequestFuture a(String str, byte[] bArr, Object obj, String str2, String str3, int i) {
        RequestFuture newFuture = RequestFuture.newFuture();
        HashMap a2 = a(this.i, (ClientContext) null);
        if (!TextUtils.isEmpty(str2)) {
            a2.put("X-Android-Package", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            a2.put("X-Android-Cert", str3);
        }
        b(a(a(1, (Map) a2), a(this.d, str), bArr, obj, (String) null, (String) null, newFuture, newFuture, a2, i, b()), (String) null);
        return newFuture;
    }

    public final izs a(int i, String str, byte[] bArr, Object obj, String str2, String str3, Response.Listener listener, Response.ErrorListener errorListener, HashMap hashMap, int i2, int i3) {
        return new izs(i, str, bArr, obj, listener, errorListener, str2, str3, this.a, hashMap, i2, i3);
    }

    public final Object a(ClientContext clientContext, int i, String str, byte[] bArr, Object obj) {
        int a2 = a();
        try {
            return a(clientContext, i, str, bArr, obj, a2);
        } catch (VolleyError e2) {
            if (a(e2)) {
                return a(clientContext, i, str, bArr, obj, a2);
            }
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(com.google.android.gms.common.internal.ClientContext r11, java.lang.String r12, byte[] r13, java.lang.Object r14, long r15, int r17) {
        /*
            r10 = this;
            java.lang.String r9 = r10.d(r11)     // Catch:{ VolleyError -> 0x0032 }
            r4 = 1
            r1 = r10
            r2 = r9
            r3 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r17
            com.android.volley.toolbox.RequestFuture r0 = r1.a((java.lang.String) r2, (com.google.android.gms.common.internal.ClientContext) r3, (int) r4, (java.lang.String) r5, (byte[]) r6, (java.lang.Object) r7, (int) r8)     // Catch:{ InterruptedException -> 0x0026, ExecutionException -> 0x0019 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0026, ExecutionException -> 0x0019 }
            r2 = r15
            java.lang.Object r0 = r0.get(r2, r1)     // Catch:{ InterruptedException -> 0x0026, ExecutionException -> 0x0019 }
            return r0
        L_0x0019:
            r0 = move-exception
            r8 = r10
            r10.a((java.util.concurrent.ExecutionException) r0, (java.lang.String) r9)     // Catch:{ VolleyError -> 0x0030 }
            com.android.volley.VolleyError r1 = new com.android.volley.VolleyError     // Catch:{ VolleyError -> 0x0030 }
            java.lang.String r2 = "Error executing network request"
            r1.<init>(r2, r0)     // Catch:{ VolleyError -> 0x0030 }
            throw r1     // Catch:{ VolleyError -> 0x0030 }
        L_0x0026:
            r0 = move-exception
            r8 = r10
            com.android.volley.VolleyError r0 = new com.android.volley.VolleyError     // Catch:{ VolleyError -> 0x0030 }
            java.lang.String r1 = "Thread interrupted"
            r0.<init>((java.lang.String) r1)     // Catch:{ VolleyError -> 0x0030 }
            throw r0     // Catch:{ VolleyError -> 0x0030 }
        L_0x0030:
            r0 = move-exception
            goto L_0x0034
        L_0x0032:
            r0 = move-exception
            r8 = r10
        L_0x0034:
            boolean r1 = a(r0)
            if (r1 == 0) goto L_0x0047
            r3 = 1
            r1 = r10
            r2 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r17
            java.lang.Object r0 = r1.a((com.google.android.gms.common.internal.ClientContext) r2, (int) r3, (java.lang.String) r4, (byte[]) r5, (java.lang.Object) r6, (int) r7)
            return r0
        L_0x0047:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iyn.a(com.google.android.gms.common.internal.ClientContext, java.lang.String, byte[], java.lang.Object, long, int):java.lang.Object");
    }

    public final Object a(String str, byte[] bArr, Object obj, String str2, String str3) {
        try {
            return a(str, bArr, obj, str2, str3, a()).get();
        } catch (InterruptedException e2) {
            throw new VolleyError("Thread interrupted");
        } catch (ExecutionException e3) {
            if (e3.getCause() instanceof VolleyError) {
                throw ((VolleyError) e3.getCause());
            }
            throw new VolleyError("Error executing network request", e3);
        }
    }

    public final Object a(String str, byte[] bArr, Object obj, String str2, String str3, long j2, int i) {
        try {
            return a(str, bArr, obj, str2, str3, i).get(j2, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            throw new VolleyError("Thread interrupted");
        } catch (ExecutionException e3) {
            if (e3.getCause() instanceof VolleyError) {
                throw ((VolleyError) e3.getCause());
            }
            throw new VolleyError("Error executing network request", e3);
        }
    }

    public String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        if (!TextUtils.isEmpty(this.l)) {
            sb.append(sb.indexOf("?") == -1 ? "?" : "&");
            sb.append("trace=");
            sb.append(this.l);
            for (Map.Entry entry : this.f.entrySet()) {
                sb.append("&");
                sb.append((String) entry.getKey());
                sb.append("=");
                sb.append((String) entry.getValue());
            }
        }
        String sb2 = sb.toString();
        if (this.b == null) {
            return sb2;
        }
        char c2 = !sb2.contains("?") ? '?' : '&';
        String valueOf = String.valueOf(sb2);
        String str3 = this.b;
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 5 + String.valueOf(str3).length());
        sb3.append(valueOf);
        sb3.append(c2);
        sb3.append("key=");
        sb3.append(str3);
        return sb3.toString();
    }

    public HashMap a(Context context, ClientContext clientContext) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.m)) {
            hashMap.put("X-Google-Backend-Override", this.m);
        }
        if (!(this.b == null || clientContext == null)) {
            String str = clientContext.f;
            if (!TextUtils.equals(str, this.j)) {
                this.j = str;
                this.k = jhg.h(this.i, str);
            }
            hashMap.put("X-Android-Package", this.j);
            hashMap.put("X-Android-Cert", this.k);
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public void a(Request request, String str) {
        request.setRetryPolicy(new iym(this.i, str));
    }

    public final void a(ClientContext clientContext, String str, byte[] bArr, Object obj, Response.Listener listener, Response.ErrorListener errorListener) {
        String str2;
        ClientContext clientContext2 = clientContext;
        int a2 = a();
        if (this.b == null) {
            str2 = c(clientContext);
        } else {
            str2 = null;
        }
        HashMap a3 = a(this.i, clientContext);
        int a4 = a(1, (Map) a3);
        String a5 = a(this.d, str);
        this.h = clientContext2.b;
        b(a(a4, a5, bArr, obj, (String) null, str2, listener, errorListener, a3, a2, b()), (String) null);
    }

    /* access modifiers changed from: protected */
    public final void a(ExecutionException executionException, String str) {
        Throwable cause = executionException.getCause();
        if (cause instanceof VolleyError) {
            VolleyError volleyError = (VolleyError) cause;
            if (a(volleyError)) {
                eig.a(this.i, str);
            }
            throw volleyError;
        }
    }
}
