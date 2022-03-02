package defpackage;

import android.content.Context;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreContactsChimeraActivity;

/* renamed from: zwu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zwu implements aqk {
    final ContactsRestoreContactsChimeraActivity a;

    public zwu(ContactsRestoreContactsChimeraActivity contactsRestoreContactsChimeraActivity) {
        this.a = contactsRestoreContactsChimeraActivity;
    }

    public final void a() {
        ContactsRestoreContactsChimeraActivity contactsRestoreContactsChimeraActivity = this.a;
        if (!contactsRestoreContactsChimeraActivity.n) {
            contactsRestoreContactsChimeraActivity.e();
        } else if (zyk.a((Context) contactsRestoreContactsChimeraActivity)) {
            if (this.a.d.e()) {
                this.a.d.d();
            }
            ContactsRestoreContactsChimeraActivity contactsRestoreContactsChimeraActivity2 = this.a;
            contactsRestoreContactsChimeraActivity2.a(contactsRestoreContactsChimeraActivity2.j, contactsRestoreContactsChimeraActivity2.k, contactsRestoreContactsChimeraActivity2.l, 4);
        } else {
            this.a.d.c();
            this.a.e();
        }
    }
}
