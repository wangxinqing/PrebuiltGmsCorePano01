package defpackage;

import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.internal.MarkContactAsSelectedParams;

/* renamed from: vsy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vsy implements igp {
    private final Contact a;

    public vsy(Contact contact) {
        this.a = contact;
    }

    public final void a(Object obj, Object obj2) {
        Contact contact = this.a;
        int i = vts.a;
        vyy vyy = new vyy();
        vyy.a.a = contact;
        ifu b = vts.b((acwd) obj2);
        MarkContactAsSelectedParams markContactAsSelectedParams = vyy.a;
        markContactAsSelectedParams.b = b;
        ((vyk) ((waz) obj).x()).a(markContactAsSelectedParams);
    }
}
