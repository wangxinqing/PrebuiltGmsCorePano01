package defpackage;

import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.sync.coreui.ContactsSyncCoreChimeraActivity;

/* renamed from: xtt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class xtt implements acvv {
    private final ContactsSyncCoreChimeraActivity a;

    public xtt(ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity) {
        this.a = contactsSyncCoreChimeraActivity;
    }

    public final void a(Object obj) {
        ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity = this.a;
        BackupAndSyncOptInState backupAndSyncOptInState = (BackupAndSyncOptInState) obj;
        contactsSyncCoreChimeraActivity.a(xuk.a(backupAndSyncOptInState));
        if (xus.b(backupAndSyncOptInState)) {
            contactsSyncCoreChimeraActivity.a.e();
        } else {
            contactsSyncCoreChimeraActivity.a.d();
        }
    }
}
