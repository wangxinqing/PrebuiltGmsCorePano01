package defpackage;

import android.content.Context;
import com.google.android.chimera.Loader;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.ui.context.section.LoaderSectionInfo;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collection;
import java.util.List;

/* renamed from: dzh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dzh extends Loader implements icm, icb {
    private final String a;
    private final List b;
    private final String[] c;
    private eao d;
    private final icc e;
    private icf f;

    public dzh(Context context, String str, LoaderSectionInfo loaderSectionInfo) {
        super(context);
        this.a = str;
        this.b = loaderSectionInfo.l;
        this.c = loaderSectionInfo.b;
        wlr a2 = wls.a();
        a2.a = 80;
        wls a3 = a2.a();
        ibz ibz = new ibz(context.getApplicationContext());
        ibz.a(this.a);
        ibz.a((icb) this);
        ibz.a(wlt.a, (ibj) a3);
        this.e = ibz.b();
    }

    private final void a() {
        icf icf = this.f;
        if (icf != null) {
            icf.b();
            this.f = null;
        }
    }

    private final void b() {
        this.d = null;
    }

    private final void c() {
        if (!this.e.i() && !this.e.j()) {
            this.e.e();
        }
        ibq ibq = wlt.a;
        icf a2 = xco.a(this.e, this.a, (String) null, (wlb) null);
        this.f = a2;
        a2.a((icm) this);
    }

    /* access modifiers changed from: protected */
    public final void onForceLoad() {
        super.onForceLoad();
        a();
        b();
        c();
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        onStopLoading();
        b();
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        super.onStartLoading();
        if (!takeContentChanged()) {
            eao eao = this.d;
            if (eao != null) {
                deliverResult(eao.a);
            } else if (this.f == null) {
                c();
            }
        } else {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        a();
        icc icc = this.e;
        if (icc != null) {
            icc.g();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        this.e.h();
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        wlc wlc = (wlc) icl;
        this.f = null;
        icc icc = this.e;
        if (icc != null) {
            icc.g();
        }
        if (wlc.aO().c()) {
            xfk b2 = wlc.b();
            if (this.d == null) {
                eao eao = new eao();
                this.d = eao;
                List list = this.b;
                if (list != null) {
                    eao.a((Collection) list);
                }
            }
            for (int i = 0; i < b2.a(); i++) {
                ContactPerson a2 = eap.a(b2.a(i), this.c);
                if (a2 != null) {
                    this.d.a(a2);
                }
            }
            b2.c();
            eao eao2 = this.d;
            getContext();
            eao2.a();
        }
        if (isStarted()) {
            deliverResult(this.d.a);
        }
    }
}
