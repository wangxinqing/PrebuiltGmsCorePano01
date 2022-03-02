package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ofh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ofh extends oga {
    public static final /* synthetic */ int a = 0;
    private final old l;

    public ofh(Context context, HelpConfig helpConfig, aoru aoru, okc okc, int i, old old) {
        super(context, helpConfig, aoru, okc, i);
        this.l = old;
    }

    public static old a(nze nze, HelpConfig helpConfig) {
        aucd o = old.g.o();
        String a2 = odu.a(helpConfig, nze);
        if (a2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            old old = (old) o.b;
            a2.getClass();
            old.a |= 1;
            old.d = a2;
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

    /* access modifiers changed from: protected */
    public final String b() {
        return Uri.parse(axmj.b()).buildUpon().encodedPath(axmj.B()).build().toString();
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

    public static ole a(old old, int i, Context context, HelpConfig helpConfig, aoru aoru, okc okc) {
        iva.b("Must be called from a worker thread.");
        ofh ofh = new ofh(context, helpConfig, aoru, okc, i, old);
        try {
            ogi k = ofh.k();
            if (!ofh.a(k)) {
                return null;
            }
            try {
                return (ole) aucj.a((aucj) ole.c, k.c, aubs.c());
            } catch (auda e) {
                Log.e("gH_UpdateChatConvoCReq", "Parsing MobileUpdateConversationResponse failed!", e);
                return null;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Log.e("gH_UpdateChatConvoCReq", String.format("Updating conversation failed: [%s]", new Object[]{old}), e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return ogg.a(axmx.a.a().r());
    }

    /* access modifiers changed from: protected */
    public final void a(nzw nzw) {
        nzw.s = this.l;
        b(nzw);
    }
}
