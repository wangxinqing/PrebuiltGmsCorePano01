package defpackage;

import android.accounts.Account;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;
import java.lang.ref.WeakReference;

/* renamed from: zxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zxn implements acvv {
    final WeakReference a;

    public zxn(ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity) {
        this.a = new WeakReference(contactsRestoreSettingsChimeraActivity);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Account account = (Account) obj;
        ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = (ContactsRestoreSettingsChimeraActivity) this.a.get();
        contactsRestoreSettingsChimeraActivity.b.a(account != null ? account.name : null);
        contactsRestoreSettingsChimeraActivity.a(false);
    }
}
