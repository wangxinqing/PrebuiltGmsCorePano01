package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ofj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ofj extends nzl {
    public static final /* synthetic */ int j = 0;
    private final old k;

    public ofj(Context context, HelpConfig helpConfig, String str, old old, RequestFuture requestFuture) {
        super(context, helpConfig, str, requestFuture, requestFuture);
        this.k = old;
    }

    public static old a(nze nze, HelpConfig helpConfig) {
        aucd o = old.g.o();
        String a = odu.a(helpConfig, nze);
        if (a != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            old old = (old) o.b;
            a.getClass();
            old.a |= 1;
            old.d = a;
        }
        aucd o2 = aufd.b.o();
        long c = odu.c(nze);
        if (c != -1) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ((aufd) o2.b).a = c;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        old old2 = (old) o.b;
        aufd aufd = (aufd) o2.i();
        aufd.getClass();
        old2.e = aufd;
        old2.a |= 2;
        return (old) o.i();
    }

    private static int f() {
        return (int) axmj.e();
    }

    private static int g() {
        return (int) axmj.d();
    }

    private static float h() {
        return (float) axmj.c();
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return f();
    }

    /* access modifiers changed from: protected */
    public final int c() {
        return g();
    }

    /* access modifiers changed from: protected */
    public final float d() {
        return h();
    }

    public final void onPreNetworkDispatch() {
        izj.b(3842);
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        if (networkResponse.statusCode == 200) {
            try {
                return Response.success((ole) aucj.a((aucj) ole.c, networkResponse.data, aubs.c()), (Cache.Entry) null);
            } catch (auda e) {
                Log.e("gH_UpdateChatConvoReq", "Parsing MobileUpdateConversationResponse failed!", e);
            }
        }
        return Response.error(new VolleyError(networkResponse));
    }

    public static ole a(old old, int i, Context context, HelpConfig helpConfig, okc okc) {
        iva.b("Must be called from a worker thread.");
        RequestFuture newFuture = RequestFuture.newFuture();
        ofj ofj = new ofj(context, helpConfig, Uri.parse(axmj.b()).buildUpon().encodedPath(axmj.B()).build().toString(), old, newFuture);
        ofj.a(i, okc);
        ofj.e();
        try {
            return (ole) newFuture.get(oap.a((long) f(), (long) g(), h()), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("gH_UpdateChatConvoReq", String.format("Updating conversation failed: [%s]", new Object[]{old}), e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(nzw nzw) {
        nzw.s = this.k;
        odu.a(this.e, this.f, nzw);
    }
}
