package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;

/* renamed from: mwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mwo {
    private final Context a;
    private final Set b = jir.b();
    private String c;
    private final Set d = jir.b();
    private String e;

    public mwo(Context context) {
        new myp();
        this.a = context;
    }

    public static String a(auoz auoz) {
        if ((auoz.a & 128) == 0) {
            return null;
        }
        aupk aupk = auoz.i;
        if (aupk == null) {
            aupk = aupk.e;
        }
        return aupk.c;
    }

    public static String b(auoz auoz) {
        if ((auoz.a & 2) == 0) {
            return null;
        }
        aupa aupa = auoz.c;
        if (aupa == null) {
            aupa = aupa.i;
        }
        return aupa.h;
    }

    public static String a(boolean z, int i, String str, String str2) {
        Uri.Builder builder;
        if (z && i == 1) {
            builder = Uri.parse(axgy.a.a().y()).buildUpon();
        } else {
            builder = Uri.parse(axgy.a.a().A()).buildUpon();
        }
        if (TextUtils.isEmpty(str)) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            builder.appendQueryParameter("ct", str);
        }
        return builder.toString();
    }

    public final boolean a(ErrorReport errorReport, HelpConfig helpConfig, aoru aoru) {
        try {
            File a2 = mxj.a(this.a, mxj.b(errorReport, this.a));
            try {
                if (a(errorReport.P, errorReport.R)) {
                    Log.w("gF_HttpHelper", "Dropped report.");
                    a2.delete();
                    return true;
                }
                Context context = this.a;
                iva.b("Must be called from a worker thread.");
                return mwh.a(mwh.a(context, helpConfig, aoru, a(errorReport.E, errorReport.a.type, errorReport.P, errorReport.R), mwn.a(a2), true));
            } catch (IOException e2) {
                Log.w("gF_HttpHelper", e2.getMessage() == null ? "Could not send report, IOException" : e2.getMessage());
                return false;
            } finally {
                a2.delete();
            }
        } catch (IOException e3) {
            Log.w("gF_HttpHelper", e3.getMessage() == null ? "Could not write report, IOException" : e3.getMessage());
            return false;
        } catch (mxd e4) {
            Log.w("gF_HttpHelper", e4.getMessage() == null ? "Could not write report, report packageName is null" : e4.getMessage());
            return false;
        }
    }

    public final boolean a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            String c2 = axgy.a.a().c();
            if (this.b.isEmpty() || !TextUtils.equals(this.c, c2)) {
                this.b.clear();
                Collections.addAll(this.b, ofx.a(c2));
                this.c = c2;
            }
            if (this.b.contains(str)) {
                String valueOf = String.valueOf(str);
                Log.i("gF_HttpHelper", valueOf.length() == 0 ? new String("Category tag blacklisted: ") : "Category tag blacklisted: ".concat(valueOf));
                return true;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        String d2 = axgy.a.a().d();
        if (this.d.isEmpty() || !TextUtils.equals(this.e, d2)) {
            this.d.clear();
            Collections.addAll(this.d, ofx.a(d2));
            this.e = d2;
        }
        if (!this.d.contains(str2)) {
            return false;
        }
        String valueOf2 = String.valueOf(str2);
        Log.i("gF_HttpHelper", valueOf2.length() == 0 ? new String("Submitting package name blacklisted: ") : "Submitting package name blacklisted: ".concat(valueOf2));
        return true;
    }
}
