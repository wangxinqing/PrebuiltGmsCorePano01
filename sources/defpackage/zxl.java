package defpackage;

import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;

/* renamed from: zxl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class zxl implements acvs {
    private final ContactsRestoreSettingsChimeraActivity a;

    public zxl(ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity) {
        this.a = contactsRestoreSettingsChimeraActivity;
    }

    public final void a(Exception exc) {
        ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = this.a;
        contactsRestoreSettingsChimeraActivity.e.a((Throwable) exc, "Getting contact counts failed");
        zsi.a().c(4);
        contactsRestoreSettingsChimeraActivity.a(false);
        contactsRestoreSettingsChimeraActivity.j();
        contactsRestoreSettingsChimeraActivity.i();
    }
}
