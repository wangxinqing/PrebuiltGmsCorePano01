package defpackage;

import android.content.Context;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;

/* renamed from: zxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zxo implements aqk {
    final ContactsRestoreSettingsChimeraActivity a;

    public zxo(ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity) {
        this.a = contactsRestoreSettingsChimeraActivity;
    }

    public final void a() {
        ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = this.a;
        if (!contactsRestoreSettingsChimeraActivity.d) {
            contactsRestoreSettingsChimeraActivity.a(false);
        } else if (zyk.a((Context) contactsRestoreSettingsChimeraActivity)) {
            if (this.a.c.e()) {
                this.a.h();
            }
            this.a.e();
        } else {
            this.a.f();
            this.a.a(false);
        }
    }
}
