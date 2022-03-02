package defpackage;

import com.google.android.gms.nearby.sharing.ContactFilter;
import com.google.android.gms.nearby.sharing.internal.GetContactsParams;

/* renamed from: vsw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vsw implements igp {
    private final int a;
    private final int b;
    private final ContactFilter c;

    public vsw(int i, int i2, ContactFilter contactFilter) {
        this.a = i;
        this.b = i2;
        this.c = contactFilter;
    }

    public final void a(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        ContactFilter contactFilter = this.c;
        waz waz = (waz) obj;
        vxn vxn = new vxn();
        GetContactsParams getContactsParams = vxn.a;
        getContactsParams.b = i;
        getContactsParams.c = i2;
        vyc vyc = new vyc((acwd) obj2);
        GetContactsParams getContactsParams2 = vxn.a;
        getContactsParams2.a = vyc;
        if (contactFilter != null) {
            getContactsParams2.d = contactFilter;
        }
        ((vyk) waz.x()).a(vxn.a);
    }
}
