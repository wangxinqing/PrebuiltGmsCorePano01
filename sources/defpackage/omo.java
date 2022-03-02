package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: omo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class omo extends oga {
    public omo(Context context, HelpConfig helpConfig, aoru aoru, okc okc) {
        super(context, helpConfig, aoru, okc, 14);
    }

    public static oln a(Context context, HelpConfig helpConfig, aoru aoru, okc okc) {
        iva.b("Must be called from a worker thread.");
        omo omo = new omo(context, helpConfig, aoru, okc);
        try {
            ogi k = omo.k();
            if (!omo.a(k)) {
                return null;
            }
            try {
                return (oln) aucj.a((aucj) oln.e, k.c, aubs.c());
            } catch (auda e) {
                Log.e("gH_ConfigsCronetRequest", "Parsing GetConfigurationsResponse failed!", e);
                return null;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Log.e("gH_ConfigsCronetRequest", "Fetching configurations failed.", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return Uri.parse(axmj.b()).buildUpon().encodedPath(axmj.a.a().N()).build().toString();
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return ogg.a(axmx.a.a().c());
    }

    /* access modifiers changed from: protected */
    public final void a(nzw nzw) {
        String str;
        if (axqq.b() && !TextUtils.isEmpty(this.d.L)) {
            str = this.d.L;
        } else {
            str = this.d.b;
        }
        aucd o = olt.c.o();
        for (nzh nzh : nzh.b().values()) {
            if (!nzh.equals(nzh.b)) {
                if (nzh.equals(nzh.d)) {
                    String str2 = nzh.d.u.b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
                    sb.append(str2);
                    sb.append(":");
                    sb.append(str);
                    o.a(oaq.a(sb.toString()));
                } else {
                    oll oll = nzh.u;
                    if (oll.c != -1) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        olt olt = (olt) o.b;
                        oll.getClass();
                        if (!olt.b.a()) {
                            olt.b = aucj.a(olt.b);
                        }
                        olt.b.add(oll);
                    } else {
                        o.a(oll);
                    }
                }
            }
        }
        nzw.l = (olt) o.i();
    }
}
