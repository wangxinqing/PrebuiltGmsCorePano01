package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreDialogChimeraActivity;

/* renamed from: zwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zwz implements View.OnClickListener {
    final /* synthetic */ ContactsRestoreDialogChimeraActivity a;

    public zwz(ContactsRestoreDialogChimeraActivity contactsRestoreDialogChimeraActivity) {
        this.a = contactsRestoreDialogChimeraActivity;
    }

    public void onClick(View view) {
        GoogleHelp googleHelp;
        ContactsRestoreDialogChimeraActivity contactsRestoreDialogChimeraActivity = this.a;
        Uri parse = Uri.parse("https://support.google.com/nexus?p=contacts_restore");
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = 1;
        if (azfh.f()) {
            googleHelp = new GoogleHelp("contacts_restore");
            googleHelp.q = parse;
            mwc mwc = new mwc((Context) contactsRestoreDialogChimeraActivity);
            mwc.c = "com.google.android.gms.contacts_restore.USER_INITIATED_FEEDBACK_REPORT";
            mwc.b(iby.a(contactsRestoreDialogChimeraActivity.getContainerActivity()));
            googleHelp.a(mwc.a(), contactsRestoreDialogChimeraActivity.getCacheDir());
            googleHelp.s = themeSettings;
        } else {
            googleHelp = new GoogleHelp("contacts_restore");
            googleHelp.q = parse;
            googleHelp.s = themeSettings;
        }
        new nyw(contactsRestoreDialogChimeraActivity).a(googleHelp.a());
    }
}
