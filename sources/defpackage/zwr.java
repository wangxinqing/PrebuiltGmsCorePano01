package defpackage;

import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreContactsChimeraActivity;
import java.lang.ref.WeakReference;

/* renamed from: zwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zwr implements acvs {
    private final WeakReference a;

    public zwr(ContactsRestoreContactsChimeraActivity contactsRestoreContactsChimeraActivity) {
        this.a = new WeakReference(contactsRestoreContactsChimeraActivity);
    }

    public final void a(Exception exc) {
        ContactsRestoreContactsChimeraActivity contactsRestoreContactsChimeraActivity = (ContactsRestoreContactsChimeraActivity) this.a.get();
        if (contactsRestoreContactsChimeraActivity != null) {
            Toast.makeText(contactsRestoreContactsChimeraActivity, R.string.common_something_went_wrong, 1).show();
            contactsRestoreContactsChimeraActivity.e();
            contactsRestoreContactsChimeraActivity.a.a("error:restore_contacts_activity:no_data");
            contactsRestoreContactsChimeraActivity.a.a(false);
            if (contactsRestoreContactsChimeraActivity.o) {
                contactsRestoreContactsChimeraActivity.f.a(false);
            }
        }
    }
}
