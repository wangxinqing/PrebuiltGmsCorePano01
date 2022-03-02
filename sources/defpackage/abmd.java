package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.chimera.Loader;
import com.google.android.gms.smart_profile.SmartProfilePerson;

/* renamed from: abmd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abmd extends Loader implements icm {
    private final String a;
    private final String b;
    private final String c;
    private abmc d;
    private final iby e;

    public abmd(Context context, String str, String str2, String str3, int i) {
        super(context);
        this.a = str;
        this.b = str2;
        this.c = str3;
        wlr a2 = wls.a();
        a2.a = i;
        this.e = wlt.b(context, a2.a());
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        int i;
        wvs wvs = (wvs) icl;
        if (!wvs.d()) {
            i = wvs.e() ? 2 : 3;
        } else {
            i = 1;
        }
        ilh b2 = wvs.b();
        if (b2 != null) {
            try {
                if (b2.a() > 0) {
                    abmc abmc = new abmc((SmartProfilePerson) b2.a(0), i);
                    this.d = abmc;
                    deliverResult(abmc);
                }
                if (i == 1) {
                    b2.c();
                }
            } catch (Throwable th) {
                if (i == 1) {
                    b2.c();
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        onStopLoading();
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        super.onStartLoading();
        takeContentChanged();
        this.d = null;
        wvv wvv = new wvv();
        wvv.b = true;
        wvv.b();
        wvv.d = this;
        wvt wvt = new wvt();
        if (!TextUtils.isEmpty(this.b)) {
            wvt.a = this.b;
        } else {
            wvt.a = "";
        }
        if (!TextUtils.isEmpty(this.c)) {
            wvt.b = this.c;
        }
        wvv.a(wvt.a());
        wvw a2 = wvv.a();
        iby iby = this.e;
        wxi wxi = new wxi();
        String str = this.a;
        ibq ibq = wlt.a;
        icc icc = iby.j;
        iva.b(true ^ TextUtils.isEmpty(str));
        wxq wxq = new wxq(icc, a2, wxi, new String[]{str});
        icc.a((idf) wxq);
        icm icm = a2.e;
        if (icm != null) {
            wxq.a(icm);
        }
        wxq.a((icm) this);
    }
}
