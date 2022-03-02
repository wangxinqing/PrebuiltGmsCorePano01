package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ofk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ofk extends oga {
    private final olh a;

    public ofk(Context context, HelpConfig helpConfig, aoru aoru, okc okc, olh olh) {
        super(context, helpConfig, aoru, okc, 186);
        this.a = olh;
    }

    public static oli a(olg olg, nze nze, Context context, HelpConfig helpConfig, aoru aoru, okc okc) {
        iva.b("Must be called from a worker thread.");
        aucd o = olh.d.o();
        String a2 = odu.a(helpConfig, nze);
        if (a2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            olh olh = (olh) o.b;
            a2.getClass();
            olh.a |= 1;
            olh.b = a2;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        olh olh2 = (olh) o.b;
        olh2.c = olg.e;
        olh2.a |= 2;
        ofk ofk = new ofk(context, helpConfig, aoru, okc, (olh) o.i());
        try {
            ogi k = ofk.k();
            if (!ofk.a(k)) {
                return null;
            }
            try {
                return (oli) aucj.a((aucj) oli.a, k.c, aubs.c());
            } catch (auda e) {
                Log.e("gH_UpdateTypingStatCReq", "Parsing UpdateTypingStatusRequest failed!", e);
                return null;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Log.e("gH_UpdateTypingStatCReq", String.format("Updating typing status failed: [%s]", new Object[]{o.i()}), e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return Uri.parse(axmj.b()).buildUpon().encodedPath(axmj.a.a().aO()).build().toString();
    }

    /* access modifiers changed from: protected */
    public final int e() {
        return (int) TimeUnit.SECONDS.convert(oap.a(axmj.a.a().t(), axmj.i(), (float) axmj.h()), TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    public final int f() {
        return ((int) axmj.i()) + 1;
    }

    /* access modifiers changed from: protected */
    public final double g() {
        return axmj.h();
    }

    public final void onPreNetworkDispatch() {
        izj.b(3843);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return ogg.a(axmx.a.a().s());
    }

    /* access modifiers changed from: protected */
    public final void a(nzw nzw) {
        nzw.r = this.a;
        b(nzw);
    }
}
