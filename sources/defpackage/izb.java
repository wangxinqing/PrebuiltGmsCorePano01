package defpackage;

import android.content.Context;
import android.net.Uri;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.response.FieldMappingDictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ExecutionException;

/* renamed from: izb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class izb extends iyn {
    public final RequestQueue j;
    protected final ThreadLocal k;
    public final izf l;

    public izb(Context context, String str, String str2, boolean z, boolean z2, String str3, String str4) {
        this(context, str, str2, z, z2, str3, str4, (byte[]) null);
    }

    public static izb a(Context context) {
        return new izb(context, (String) null, (String) null, false, true, (String) null, (String) null);
    }

    private final void b(ClientContext clientContext, int i, String str, Object obj) {
        String d = d(clientContext);
        RequestFuture newFuture = RequestFuture.newFuture();
        HashMap a = a(this.i, clientContext);
        int a2 = iyn.a(i, (Map) a);
        String a3 = a(this.d, str);
        a((Request) new izp(a2, a3, obj, a(a3, (Response.Listener) newFuture), a(a3, (Response.ErrorListener) newFuture), d, a, a(), b()), false, d);
        try {
            newFuture.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new izv();
        } catch (ExecutionException e2) {
            ExecutionException executionException = e2;
            a(executionException, d);
            String valueOf = String.valueOf(str);
            throw new VolleyError(valueOf.length() == 0 ? new String("Error executing network request for ") : "Error executing network request for ".concat(valueOf), executionException);
        }
    }

    public final void d() {
        ((Stack) this.k.get()).add(new iza());
    }

    public final void e() {
        iyq f = f();
        if (f != null) {
            f.d.await();
        }
    }

    public final iyq f() {
        irk.a(g(), (Object) "Not currently in an Apiary batch.");
        iza iza = (iza) ((Stack) this.k.get()).pop();
        if (iza.a.size() == 0) {
            return null;
        }
        iyq iyq = new iyq(this.e, iza.a);
        this.j.add(iyq);
        return iyq;
    }

    public final boolean g() {
        return ((Stack) this.k.get()).size() > 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public izb(Context context, String str, String str2, boolean z, boolean z2, String str3, String str4, byte[] bArr) {
        super(context, str, str2, z, z2, str3, str4, (String) null);
        this.k = new iyx();
        this.j = iyn.c();
        this.g = 152;
        this.l = izf.a;
    }

    public final Response.ErrorListener a(String str, Response.ErrorListener errorListener) {
        return new iyz(this, str, errorListener);
    }

    public final Response.Listener a(String str, Response.Listener listener) {
        return new iyy(this, str, listener);
    }

    /* access modifiers changed from: protected */
    public iys a(ClientContext clientContext, int i, String str, Object obj, Class cls, FieldMappingDictionary fieldMappingDictionary, String str2, String str3, Response.Listener listener, Response.ErrorListener errorListener, HashMap hashMap) {
        String str4 = str;
        return new iys(i, str4, obj, cls, (Object) fieldMappingDictionary, a(str4, listener), a(str4, errorListener), str2, str3, this.a, hashMap, a(), b());
    }

    public final jag a(ClientContext clientContext, int i, String str, Object obj, Class cls) {
        return a(clientContext, i, str, obj, cls, (FieldMappingDictionary) null);
    }

    public final jag b(ClientContext clientContext, int i, String str, Object obj, Class cls, FieldMappingDictionary fieldMappingDictionary) {
        ClientContext clientContext2 = clientContext;
        String d = d(clientContext);
        String c = c(clientContext);
        RequestFuture newFuture = RequestFuture.newFuture();
        HashMap a = a(this.i, clientContext2);
        int a2 = iyn.a(i, (Map) a);
        this.h = clientContext2.b;
        a((Request) a(clientContext, a2, a(this.d, str), obj, cls, fieldMappingDictionary, d, c, newFuture, newFuture, a), false, d);
        try {
            return (jag) newFuture.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new izv();
        } catch (ExecutionException e2) {
            a(e2, d);
            String valueOf = String.valueOf(str);
            throw new VolleyError(valueOf.length() == 0 ? new String("Error executing network request for ") : "Error executing network request for ".concat(valueOf), e2);
        }
    }

    public final jag a(ClientContext clientContext, int i, String str, Object obj, Class cls, FieldMappingDictionary fieldMappingDictionary) {
        try {
            return b(clientContext, i, str, obj, cls, fieldMappingDictionary);
        } catch (VolleyError e) {
            if (iyn.a(e)) {
                return b(clientContext, i, str, obj, cls, fieldMappingDictionary);
            }
            throw e;
        }
    }

    public void a(Request request, boolean z, String str) {
        a(request, str);
        if (g()) {
            irk.a(z, (Object) "Non-batchable request in batch");
            irk.a(request instanceof iyw, (Object) "Non-batchable request in batch");
            ((iza) ((Stack) this.k.get()).peek()).a.add((iyw) request);
            return;
        }
        this.j.add(request);
    }

    public final void a(ClientContext clientContext, int i, String str, Object obj) {
        try {
            b(clientContext, i, str, obj);
        } catch (VolleyError e) {
            if (iyn.a(e)) {
                b(clientContext, i, str, obj);
                return;
            }
            throw e;
        }
    }

    public final void a(ClientContext clientContext, String str, Class cls, Response.Listener listener, Response.ErrorListener errorListener) {
        a(clientContext, str, cls, (FieldMappingDictionary) null, listener, errorListener);
    }

    public final void a(ClientContext clientContext, String str, Class cls, FieldMappingDictionary fieldMappingDictionary, Response.Listener listener, Response.ErrorListener errorListener) {
        ClientContext clientContext2 = clientContext;
        String b = b(clientContext);
        String c = c(clientContext);
        if (b != null) {
            HashMap a = a(this.i, clientContext);
            int a2 = iyn.a(0, (Map) a);
            this.h = clientContext2.b;
            a((Request) a(clientContext, a2, a(this.d, str), (Object) null, cls, fieldMappingDictionary, b, c, listener, errorListener, a), true, b);
            return;
        }
        errorListener.onErrorResponse(new VolleyError("Unable to obtain auth token - is the device online?"));
    }

    public final byte[] a(Context context, Uri uri, String str) {
        RequestFuture newFuture = RequestFuture.newFuture();
        a((Request) new izo(context, uri, str, this.a, a(str, (Response.Listener) newFuture), a(str, (Response.ErrorListener) newFuture), a(), b()), false, (String) null);
        try {
            return (byte[]) newFuture.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new izv();
        } catch (ExecutionException e2) {
            String valueOf = String.valueOf(str);
            throw new VolleyError(valueOf.length() == 0 ? new String("Error executing network request for ") : "Error executing network request for ".concat(valueOf), e2);
        }
    }

    public final byte[] a(Context context, String str) {
        RequestFuture newFuture = RequestFuture.newFuture();
        a((Request) new izo(context, (Uri) null, str, this.a, a(str, (Response.Listener) newFuture), a(str, (Response.ErrorListener) newFuture), a(), b()), false, (String) null);
        try {
            return (byte[]) newFuture.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new izv();
        } catch (ExecutionException e2) {
            String valueOf = String.valueOf(str);
            throw new VolleyError(valueOf.length() == 0 ? new String("Error executing network request for ") : "Error executing network request for ".concat(valueOf), e2);
        }
    }
}
