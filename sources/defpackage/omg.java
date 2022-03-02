package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: omg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class omg extends oga {
    private final String a;

    public omg(Context context, HelpConfig helpConfig, aoru aoru, okc okc, String str) {
        super(context, helpConfig, aoru, okc, 179);
        this.a = str;
    }

    public static omf a(Context context, HelpConfig helpConfig, aoru aoru, okc okc, String str) {
        iva.b("Must be called from a worker thread.");
        if (!jkf.a(context)) {
            return omf.a(b(str), context);
        }
        omg omg = new omg(context, helpConfig, aoru, okc, str);
        try {
            ogi k = omg.k();
            if (!omg.a(k)) {
                return omf.a(b(omg.a), omg.c);
            }
            int b = b(omg.a);
            String a2 = omj.a(omg.d.c, omg.a);
            try {
                avol avol = ((avme) aucj.a((aucj) avme.b, k.c, aubs.c())).a;
                if (avol == null) {
                    avol = avol.e;
                }
                Map a3 = oab.a(a2, avol, omg.d);
                if (a3.size() <= 1) {
                    return omf.b(b, omg.c);
                }
                return new omf(a2, a3, b);
            } catch (auda e) {
                Log.e("gH_RecsCronetRequest", "Parsing incoming recommendations failed.");
                return omf.a(b, omg.c);
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Log.e("gH_RecsCronetRequest", "Fetching recommendations failed.", e2);
            return omf.a(b(str), context);
        }
    }

    private static int b(String str) {
        return TextUtils.isEmpty(str) ? 16 : 7;
    }

    /* access modifiers changed from: protected */
    public final void a(nzw nzw) {
        nzw.c = this.a;
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return Uri.parse(axmj.b()).buildUpon().encodedPath(axmj.a.a().az()).appendQueryParameter("hl", oal.a()).appendQueryParameter("e", axmj.k()).build().toString();
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return ogg.a(axmx.a.a().p());
    }
}
