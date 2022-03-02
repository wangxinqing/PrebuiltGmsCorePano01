package defpackage;

import android.util.Log;
import com.google.android.gms.people.sync.coreui.ContactsSyncCoreChimeraActivity;

/* renamed from: xtw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class xtw implements acvs {
    private final ContactsSyncCoreChimeraActivity a;

    public xtw(ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity) {
        this.a = contactsSyncCoreChimeraActivity;
    }

    public final void a(Exception exc) {
        ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity = this.a;
        contactsSyncCoreChimeraActivity.e();
        Log.e("SyncCoreActivity", "BackupClient failure", exc);
        contactsSyncCoreChimeraActivity.a.e();
    }
}
