package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.server.NetworkCallbacks;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.chromium.net.CronetEngine;
import org.chromium.net.UploadDataProvider;

/* renamed from: ogg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ogg implements NetworkCallbacks {
    static final String b = System.getProperty("http.agent");
    protected final Context c;
    protected final HelpConfig d;
    protected final Account e;
    protected final CronetEngine f;
    protected final aoru g;
    public myp h;
    public final okc i;
    public String j;
    public final int k;

    protected ogg(Context context, HelpConfig helpConfig, Account account, aoru aoru, okc okc, int i2) {
        iva.b("Must be called from a worker thread.");
        this.c = context;
        this.d = helpConfig;
        this.e = account;
        this.f = (CronetEngine) ogh.b().a();
        this.g = aoru;
        this.i = okc;
        this.k = i2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static int a(java.lang.String r6) {
        /*
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r0)
            int r0 = r6.hashCode()
            r1 = 0
            r2 = 1
            r3 = 4
            r4 = 3
            r5 = 2
            switch(r0) {
                case -1096862286: goto L_0x003b;
                case -1078030475: goto L_0x0031;
                case 107348: goto L_0x0027;
                case 3227604: goto L_0x001d;
                case 915484836: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0045
        L_0x0013:
            java.lang.String r0 = "highest"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0012
            r6 = 0
            goto L_0x0046
        L_0x001d:
            java.lang.String r0 = "idle"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0012
            r6 = 4
            goto L_0x0046
        L_0x0027:
            java.lang.String r0 = "low"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0012
            r6 = 2
            goto L_0x0046
        L_0x0031:
            java.lang.String r0 = "medium"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0012
            r6 = 1
            goto L_0x0046
        L_0x003b:
            java.lang.String r0 = "lowest"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0012
            r6 = 3
            goto L_0x0046
        L_0x0045:
            r6 = -1
        L_0x0046:
            if (r6 == 0) goto L_0x0052
            if (r6 == r5) goto L_0x0051
            if (r6 == r4) goto L_0x0050
            if (r6 == r3) goto L_0x004f
            return r4
        L_0x004f:
            return r1
        L_0x0050:
            return r2
        L_0x0051:
            return r5
        L_0x0052:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogg.a(java.lang.String):int");
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract String b();

    /* access modifiers changed from: protected */
    public boolean c() {
        return true;
    }

    /* access modifiers changed from: protected */
    public int e() {
        return (int) axmj.q();
    }

    /* access modifiers changed from: protected */
    public int f() {
        return (int) axmx.a.a().h();
    }

    /* access modifiers changed from: protected */
    public double g() {
        return axmx.a.a().f();
    }

    /* access modifiers changed from: protected */
    public String h() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public UploadDataProvider i() {
        return null;
    }

    public final ogi k() {
        int i2;
        aorr l = l();
        try {
            ogi ogi = (ogi) l.get((long) e(), TimeUnit.SECONDS);
            okc okc = this.i;
            if (!(okc == null || (i2 = this.k) == 0)) {
                okg.a(this.c, this.d, okc, i2, this.h.a());
            }
            return ogi;
        } catch (TimeoutException e2) {
            l.cancel(true);
            throw e2;
        }
    }

    public final void onPostNetworkDispatch() {
        izj.a();
    }

    public void onPreNetworkDispatch() {
        izj.b(3840);
    }

    /* access modifiers changed from: protected */
    public void a(Map map) {
        map.put("User-Agent", b);
    }

    /* access modifiers changed from: protected */
    public final aorr l() {
        anno anno = new anno(new annm((int) axmx.a.a().g(), g(), f()));
        ogb ogb = new ogb(this);
        ogc ogc = new ogc(this);
        aoru aoru = this.g;
        anny anny = new anny();
        anny.a = amri.b(aoru);
        amrl.b(anny.a.a(), (Object) "Either executor or scheduledExecutorService needs to be set.");
        return new anoa(ogb, anno, ogc, (Executor) anny.a.a(anny.b).b(), annz.a, anny.c);
    }

    protected ogg(Context context, HelpConfig helpConfig, aoru aoru, okc okc, int i2) {
        this(context, helpConfig, helpConfig.d, aoru, okc, i2);
    }

    /* access modifiers changed from: protected */
    public final boolean a(ogi ogi) {
        if (!ogi.a()) {
            Log.e("gH_CronetBaseRequest", String.format("Received non-success status code %d for %s", new Object[]{Integer.valueOf(ogi.a), getClass().getSimpleName()}));
            return false;
        } else if (ogi.c != null) {
            return true;
        } else {
            String valueOf = String.valueOf(getClass().getSimpleName());
            Log.e("gH_CronetBaseRequest", valueOf.length() == 0 ? new String("Received no data for successful response for ") : "Received no data for successful response for ".concat(valueOf));
            return false;
        }
    }
}
