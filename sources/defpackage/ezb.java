package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Activity;

/* renamed from: ezb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ezb extends qcg {
    public fce a;
    public eze b;
    public ow c;
    public ow d;
    public ow e;
    public aoru f;
    public gck g;
    public fsj h;
    private fop i;

    public final int a() {
        return jhg.i(getContext().getApplicationContext(), this.b.c);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.a.b();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f = jfb.a(2, 9);
        this.g = pzx.a(getContext().getApplicationContext());
        this.c = new eyi(this);
        this.d = new eyr(this);
        this.e = new eys(this);
        Activity activity = getActivity();
        eze eze = (eze) qck.a(activity).a(eze.class);
        this.b = eze;
        eze.h.a(this, new eyk(this));
        this.b.j.a(this, new eyl(this));
        fop fop = (fop) qck.a(activity).a(fop.class);
        this.i = fop;
        fop.c.a(this, new eym(this));
        Context applicationContext = getContext().getApplicationContext();
        fsh a2 = fsi.a();
        a2.a = this.b.d.c;
        this.h = fsg.a(applicationContext, a2.a());
        String str = this.b.d.c;
        hol hol = new hol(getContext(), "IDENTITY_GMSCORE", (String) null);
        fcd a3 = fce.a();
        a3.a = qct.RETRIEVE_ACCOUNT_LIST;
        a3.a(qct.RETRIEVE_ACCOUNT_LIST, new eyt(this));
        a3.a(qct.REAUTH_ACCOUNT, new eyu(this));
        a3.a(qct.DISPLAY_CONSENT_SCREEN, new eyv(this));
        a3.a(qct.RECORD_CONSENT_GRANT, new eyw(this));
        a3.a(qct.UPDATE_DEFAULT_GOOGLE_ACCOUNT, new eyx(this));
        a3.b = new eyy(this);
        a3.c = new eyz(this);
        a3.a(hol, str, eyj.a);
        this.a = a3.a();
    }
}
