package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: obh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class obh extends oga {
    public obh(Context context, HelpConfig helpConfig, aoru aoru, okc okc) {
        super(context, helpConfig, aoru, okc, 13);
    }

    public static avnq a(Context context, HelpConfig helpConfig, aoru aoru, okc okc) {
        iva.b("Must be called from a worker thread.");
        if (!jkf.a(context)) {
            return null;
        }
        obh obh = new obh(context, helpConfig, aoru, okc);
        try {
            ogi k = obh.k();
            if (!obh.a(k)) {
                return null;
            }
            try {
                return (avnq) aucj.a((aucj) avnq.j, k.c, aubs.c());
            } catch (auda e) {
                Log.e("gH_EscOptionsCronetReq", "Parsing EscalationOptions failed!", e);
                return null;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Log.e("gH_EscOptionsCronetReq", "Fetching EscalationOptions failed.", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return Uri.parse(axmj.b()).buildUpon().encodedPath(axmj.a.a().F()).appendQueryParameter("e", axmj.k()).build().toString();
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return ogg.a(axmx.a.a().n());
    }
}
