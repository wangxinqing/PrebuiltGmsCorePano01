package defpackage;

import android.accounts.Account;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;

/* renamed from: zxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class zxu implements acvz {
    private final zyg a;
    private final String b;

    public zxu(zyg zyg, String str) {
        this.a = zyg;
        this.b = str;
    }

    public final acwa a(Object obj) {
        String str;
        zyg zyg = this.a;
        String str2 = this.b;
        Account account = (Account) obj;
        ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = zyg.a;
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        contactsRestoreSettingsChimeraActivity.b.a(str);
        gst gst = zyg.e;
        Account account2 = new Account(str2, "com.google");
        iha b2 = ihb.b();
        b2.a = new gsp(account2);
        return gst.b(b2.a());
    }
}
