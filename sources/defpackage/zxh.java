package defpackage;

import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;
import java.util.concurrent.Callable;

/* renamed from: zxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class zxh implements Callable {
    private final ContactsRestoreSettingsChimeraActivity a;
    private final String b;

    public zxh(ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity, String str) {
        this.a = contactsRestoreSettingsChimeraActivity;
        this.b = str;
    }

    public final Object call() {
        ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = this.a;
        if (zyq.a(contactsRestoreSettingsChimeraActivity.getApplicationContext(), this.b, true)) {
            return true;
        }
        contactsRestoreSettingsChimeraActivity.e.d("Restore from settings shared preference cannot be committed");
        throw new IllegalStateException("Preference could not be committed");
    }
}
