package defpackage;

import com.google.android.gms.nearby.sharing.ContactFilter;

/* renamed from: vik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vik {
    public final ContactFilter a;

    public vik() {
        this.a = new ContactFilter();
    }

    public final void a(Boolean bool) {
        this.a.b = bool;
    }

    public final void b(Boolean bool) {
        this.a.a = bool;
    }

    public vik(ContactFilter contactFilter) {
        ContactFilter contactFilter2 = new ContactFilter();
        this.a = contactFilter2;
        contactFilter2.a = contactFilter.a;
        contactFilter2.b = contactFilter.b;
        contactFilter2.c = contactFilter.c;
        contactFilter2.d = contactFilter.d;
    }
}
