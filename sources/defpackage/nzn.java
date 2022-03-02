package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.google.android.gms.common.server.NetworkCallbacks;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.Map;

/* renamed from: nzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class nzn extends Request implements NetworkCallbacks {
    static final String d = System.getProperty("http.agent");
    public static final /* synthetic */ int i = 0;
    protected final Context e;
    protected final HelpConfig f;
    protected final Account g;
    protected final Map h;
    private final RequestQueue j;
    private final Response.Listener k;
    private myp l;
    private okc m;
    private String n;
    private int o;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public nzn(Context context, HelpConfig helpConfig, int i2, String str, Response.Listener listener, Response.ErrorListener errorListener) {
        this(context, helpConfig, helpConfig != null ? helpConfig.d : null, i2, str, listener, errorListener);
    }

    public final void a(int i2, okc okc) {
        myp myp = new myp();
        myp.c();
        this.l = myp;
        this.o = i2;
        this.m = okc;
    }

    /* access modifiers changed from: protected */
    public int b() {
        return (int) axmj.a.a().A();
    }

    /* access modifiers changed from: protected */
    public int c() {
        return (int) axmj.a.a().z();
    }

    /* access modifiers changed from: protected */
    public float d() {
        return (float) axmj.a.a().y();
    }

    public final void deliverResponse(Object obj) {
        HelpConfig helpConfig;
        myp myp = this.l;
        if (!(myp == null || (helpConfig = this.f) == null)) {
            okg.a(this.e, helpConfig, this.m, this.o, myp.a());
        }
        Response.Listener listener = this.k;
        if (listener != null) {
            listener.onResponse(obj);
        }
    }

    public final void e() {
        this.j.add(this);
    }

    public Map getHeaders() {
        return this.h;
    }

    public final void onPostNetworkDispatch() {
        izj.a();
    }

    public void onPreNetworkDispatch() {
        izj.b(3840);
    }

    public nzn(Context context, HelpConfig helpConfig, Account account, int i2, String str, Response.Listener listener, Response.ErrorListener errorListener) {
        super(i2, str, errorListener);
        this.e = context;
        this.f = helpConfig;
        this.g = account;
        this.j = ihs.b().getRequestQueue();
        this.k = listener;
        String str2 = d;
        Map b = jir.b(Math.max(1, 1), true);
        b.put("User-Agent", str2);
        this.h = b;
        a(false);
        setShouldCache(false);
        setRetryPolicy(new nzm(this, b(), c(), d()));
        setShouldRetryServerErrors(true);
    }

    public final void a(boolean z) {
        if (this.g != null) {
            if (z) {
                try {
                    eig.b(this.e, this.n);
                } catch (Exception e2) {
                    String valueOf = String.valueOf(this.g.name);
                    Log.e("gH_BaseRequest", valueOf.length() == 0 ? new String("Updating auth token failed for ") : "Updating auth token failed for ".concat(valueOf), e2);
                    return;
                }
            }
            String a = eig.a(this.e, this.g, "oauth2:https://www.googleapis.com/auth/supportcontent");
            this.n = a;
            iyt.a(this.h, a, (String) null);
        }
    }
}
