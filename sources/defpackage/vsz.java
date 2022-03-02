package defpackage;

import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.internal.UnmarkContactAsSelectedParams;

/* renamed from: vsz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vsz implements igp {
    private final Contact a;

    public vsz(Contact contact) {
        this.a = contact;
    }

    public final void a(Object obj, Object obj2) {
        Contact contact = this.a;
        int i = vts.a;
        wbe wbe = new wbe();
        wbe.a.a = contact;
        ifu b = vts.b((acwd) obj2);
        UnmarkContactAsSelectedParams unmarkContactAsSelectedParams = wbe.a;
        unmarkContactAsSelectedParams.b = b;
        ((vyk) ((waz) obj).x()).a(unmarkContactAsSelectedParams);
    }
}
