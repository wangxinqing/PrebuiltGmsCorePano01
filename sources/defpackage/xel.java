package defpackage;

import android.util.Log;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;

/* renamed from: xel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xel extends xem {
    final /* synthetic */ xen a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xel(xen xen, boolean z, boolean z2) {
        super(xen, z, z2);
        this.a = xen;
    }

    public final void a() {
        if (!this.b) {
            xfb xfb = this.a.d;
            xfb.c.a("UPDATE ac_people SET sync_is_alive=0 WHERE owner_id=?", (Object[]) new String[]{xfb.d});
        }
    }

    public final void b() {
        xfb xfb = this.a.d;
        xfb.c.a("DELETE FROM ac_people WHERE owner_id=? AND sync_is_alive=0", (Object[]) new String[]{xfb.d});
    }

    public final void a(Person person) {
        if (!xeg.p(person)) {
            xen xen = this.a;
            xen.d.a(person, false, !this.c, xen.a);
            return;
        }
        Log.w("PeopleSync", "Deleted person detected in full sync");
    }
}
