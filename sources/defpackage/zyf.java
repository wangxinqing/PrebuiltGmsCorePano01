package defpackage;

import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: zyf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zyf implements acvv {
    private final WeakReference a;
    private final zyg b;
    private final String c;

    public zyf(ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity, zyg zyg, String str) {
        this.a = new WeakReference(contactsRestoreSettingsChimeraActivity);
        this.b = zyg;
        this.c = str;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity;
        List list = (List) obj;
        if (!azfh.c() && (contactsRestoreSettingsChimeraActivity = (ContactsRestoreSettingsChimeraActivity) this.a.get()) != null) {
            zsg zsg = zyg.c;
            this.b.a(this.c, list, (List) null);
            zsi.a().a(9);
            contactsRestoreSettingsChimeraActivity.a(false);
        }
    }
}
