package defpackage;

import android.os.Build;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreContactsChimeraActivity;

/* renamed from: zwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zwo extends abk {
    final /* synthetic */ ContactsRestoreContactsChimeraActivity a;

    public zwo(ContactsRestoreContactsChimeraActivity contactsRestoreContactsChimeraActivity) {
        this.a = contactsRestoreContactsChimeraActivity;
    }

    public final void c(adb adb, adi adi) {
        super.c(adb, adi);
        if (this.a.b.a() > (n() - m()) + 1) {
            if (!this.a.m || Build.VERSION.SDK_INT < 23) {
                this.a.g.setVisibility(8);
            } else {
                this.a.h.setVerticalScrollBarEnabled(false);
                this.a.g.setVisibility(0);
            }
            ContactsRestoreContactsChimeraActivity contactsRestoreContactsChimeraActivity = this.a;
            contactsRestoreContactsChimeraActivity.h.addOnScrollListener(new zwt(contactsRestoreContactsChimeraActivity));
            return;
        }
        this.a.g.setVisibility(8);
    }
}
