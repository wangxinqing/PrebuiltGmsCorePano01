package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ofd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ofd extends oga {
    private final okw a;

    public ofd(Context context, HelpConfig helpConfig, aoru aoru, okc okc, okw okw) {
        super(context, helpConfig, aoru, okc, 52);
        this.a = okw;
    }

    public static okx a(nze nze, Context context, HelpConfig helpConfig, aoru aoru, okc okc) {
        iva.b("Must be called from a worker thread.");
        aucd o = okw.d.o();
        String a2 = odu.a(helpConfig, nze);
        if (a2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            okw okw = (okw) o.b;
            a2.getClass();
            okw.a |= 1;
            okw.b = a2;
        }
        aufd a3 = aufd.a(odu.c(nze));
        if (o.c) {
            o.c();
            o.c = false;
        }
        okw okw2 = (okw) o.b;
        a3.getClass();
        okw2.c = a3;
        okw2.a |= 2;
        axnx.c();
        ofd ofd = new ofd(context, helpConfig, aoru, okc, (okw) o.i());
        try {
            ogi k = ofd.k();
            if (!ofd.a(k)) {
                return null;
            }
            try {
                return (okx) aucj.a((aucj) okx.b, k.c, aubs.c());
            } catch (auda e) {
                Log.e("gH_ListConvoEventsCReq", "Parsing ListChatConversationEventsRequest failed!", e);
                return null;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Log.e("gH_ListConvoEventsCReq", String.format("Fetching chat conversation events failed: [%s]", new Object[]{o.i()}), e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return Uri.parse(axmj.b()).buildUpon().encodedPath(axmj.a.a().V()).build().toString();
    }

    /* access modifiers changed from: protected */
    public final int e() {
        return (int) TimeUnit.SECONDS.convert(oap.a(axmj.e(), axmj.d(), (float) axmj.c()), TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    public final int f() {
        return ((int) axmj.d()) + 1;
    }

    /* access modifiers changed from: protected */
    public final double g() {
        return axmj.c();
    }

    public final void onPreNetworkDispatch() {
        izj.b(3842);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return ogg.a(axmx.a.a().o());
    }

    /* access modifiers changed from: protected */
    public final void a(nzw nzw) {
        nzw.t = this.a;
        b(nzw);
    }
}
