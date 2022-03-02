package defpackage;

import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.romanesco.protomodel.SourceStatsEntity;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;
import java.util.List;

/* renamed from: zxk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class zxk implements acvv {
    private final ContactsRestoreSettingsChimeraActivity a;
    private final gsj b;

    public zxk(ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity, gsj gsj) {
        this.a = contactsRestoreSettingsChimeraActivity;
        this.b = gsj;
    }

    public final void a(Object obj) {
        ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = this.a;
        gsj gsj = this.b;
        List<SourceStatsEntity> list = (List) obj;
        zsi.a().c(3);
        if (list == null) {
            contactsRestoreSettingsChimeraActivity.e.d("fetchGmsBackupStats failed to get any source stats");
            contactsRestoreSettingsChimeraActivity.a(false);
            contactsRestoreSettingsChimeraActivity.j();
            contactsRestoreSettingsChimeraActivity.i();
            return;
        }
        zyh zyh = new zyh((String) null, gsj.d);
        zyh.b = Long.valueOf(gsj.b);
        zyh.k = gsj;
        zyh.d = gsj.c;
        for (SourceStatsEntity a2 : list) {
            zyh.a(a2);
        }
        zyi a3 = zyh.a();
        if (a3.h <= 0 && a3.g <= 0) {
            contactsRestoreSettingsChimeraActivity.e.d("No device or sim contact fond in backup.");
            contactsRestoreSettingsChimeraActivity.a(false);
            Toast.makeText(contactsRestoreSettingsChimeraActivity, R.string.romanesco_no_contacts_in_backup_error, 1).show();
            return;
        }
        contactsRestoreSettingsChimeraActivity.a(false);
        contactsRestoreSettingsChimeraActivity.a(contactsRestoreSettingsChimeraActivity.b.e, zyh.a());
        contactsRestoreSettingsChimeraActivity.i();
    }
}
