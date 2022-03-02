package defpackage;

import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.sync.coreui.ContactsSyncCoreChimeraActivity;

/* renamed from: xtv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class xtv implements acvv {
    private final ContactsSyncCoreChimeraActivity a;

    public xtv(ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity) {
        this.a = contactsSyncCoreChimeraActivity;
    }

    public final void a(Object obj) {
        ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity = this.a;
        BackupAndSyncOptInState backupAndSyncOptInState = (BackupAndSyncOptInState) obj;
        contactsSyncCoreChimeraActivity.a(xuk.a(backupAndSyncOptInState));
        if (xus.a(backupAndSyncOptInState)) {
            contactsSyncCoreChimeraActivity.a.g();
        } else if (xus.b(backupAndSyncOptInState)) {
            contactsSyncCoreChimeraActivity.a.e();
        } else if (ayqr.g()) {
            contactsSyncCoreChimeraActivity.a.g();
        } else {
            contactsSyncCoreChimeraActivity.a.e();
        }
    }
}
