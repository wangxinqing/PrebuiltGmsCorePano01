package defpackage;

import com.google.android.gms.nearby.sharing.ContactFilter;
import com.google.android.gms.nearby.sharing.internal.GetContactsCountParams;

/* renamed from: vsx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vsx implements igp {
    private final ContactFilter a;

    public vsx(ContactFilter contactFilter) {
        this.a = contactFilter;
    }

    public final void a(Object obj, Object obj2) {
        ContactFilter contactFilter = this.a;
        waz waz = (waz) obj;
        vxl vxl = new vxl();
        vtk vtk = new vtk((acwd) obj2);
        GetContactsCountParams getContactsCountParams = vxl.a;
        getContactsCountParams.a = vtk;
        if (contactFilter != null) {
            getContactsCountParams.b = contactFilter;
        }
        ((vyk) waz.x()).a(vxl.a);
    }
}
