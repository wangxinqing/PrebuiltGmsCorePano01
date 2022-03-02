package defpackage;

import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.people.sync.coreui.ContactsSyncCoreChimeraActivity;

/* renamed from: xts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class xts implements ax {
    private final ContactsSyncCoreChimeraActivity a;

    public xts(ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity) {
        this.a = contactsSyncCoreChimeraActivity;
    }

    public final void a(Object obj) {
        ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity = this.a;
        int intValue = ((Integer) obj).intValue();
        FragmentTransaction beginTransaction = contactsSyncCoreChimeraActivity.getSupportFragmentManager().beginTransaction();
        beginTransaction.setCustomAnimations(R.anim.abc_popup_enter, R.anim.abc_popup_exit, R.anim.abc_popup_enter, R.anim.abc_popup_exit);
        if (intValue == 0) {
            beginTransaction.replace(R.id.root, new xue(), "SyncCoreFragment");
        } else if (intValue == 1) {
            beginTransaction.replace(R.id.root, new xst(), "AccountSyncFragment");
        } else if (intValue == 2) {
            beginTransaction.replace(R.id.root, new xtl(), "BackupSyncFragment");
        } else {
            return;
        }
        if (!contactsSyncCoreChimeraActivity.b) {
            beginTransaction.addToBackStack((String) null);
        }
        contactsSyncCoreChimeraActivity.b = false;
        beginTransaction.commitAllowingStateLoss();
    }
}
