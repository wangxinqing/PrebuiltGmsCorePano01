package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;
import java.lang.ref.WeakReference;

/* renamed from: zye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zye implements acvs {
    private final WeakReference a;

    public zye(ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity) {
        this.a = new WeakReference(contactsRestoreSettingsChimeraActivity);
    }

    public final void a(Exception exc) {
        ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = (ContactsRestoreSettingsChimeraActivity) this.a.get();
        if (contactsRestoreSettingsChimeraActivity != null) {
            if (!azfh.c()) {
                contactsRestoreSettingsChimeraActivity.a((int) R.string.common_something_went_wrong);
            }
            zsi.a().a(10);
            if (!azfh.c()) {
                contactsRestoreSettingsChimeraActivity.a(false);
            }
        }
    }
}
