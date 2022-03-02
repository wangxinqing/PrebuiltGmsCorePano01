package defpackage;

import com.google.android.gms.nearby.sharing.ContactFilter;

/* renamed from: vvx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vvx extends cm {
    public static final cs e;
    public final vts f;
    public final vvw g;
    public final ContactFilter h;

    static {
        cr crVar = new cr();
        int i = crVar.a;
        if (i < 0) {
            crVar.a = 15;
            i = 15;
        }
        e = new cs(i);
    }

    public vvx(vts vts, ContactFilter contactFilter, vvw vvw) {
        this.f = vts;
        this.h = contactFilter;
        this.g = vvw;
    }

    public final void a(ck ckVar, cj cjVar) {
        vik vik;
        ContactFilter contactFilter = this.h;
        if (contactFilter == null) {
            vik = new vik();
        } else {
            vik = new vik(contactFilter);
        }
        vik.a.c = true;
        this.f.a(0, (int) ayni.a.a().ar(), vik.a).a((acvv) new vvt(this, ckVar, cjVar));
    }

    public final void a(cl clVar, ci ciVar) {
        this.f.a(((Integer) clVar.a).intValue(), 5, this.h).a((acvv) new vvv(this, ciVar, clVar));
    }
}
