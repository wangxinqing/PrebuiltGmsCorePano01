package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeResult;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.contactssync.model.BackupAndSyncSuggestion;
import java.util.List;

/* renamed from: wta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class wta extends bhw implements wtb {
    public wta() {
        super("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
    }

    public void a(Status status) {
    }

    public void a(Status status, BackupAndSyncOptInState backupAndSyncOptInState) {
    }

    public void a(Status status, BackupAndSyncSuggestion backupAndSyncSuggestion) {
    }

    public final void a(Status status, List list) {
    }

    public final void b(Status status) {
    }

    public final void c(Status status) {
    }

    public void d(Status status) {
    }

    public final void e(Status status) {
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) bhx.a(parcel, Status.CREATOR);
                return true;
            case 2:
                Status status2 = (Status) bhx.a(parcel, Status.CREATOR);
                BackupAndSyncOptInState backupAndSyncOptInState = (BackupAndSyncOptInState) bhx.a(parcel, BackupAndSyncOptInState.CREATOR);
                return true;
            case 3:
                a((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 4:
                Status status3 = (Status) bhx.a(parcel, Status.CREATOR);
                return true;
            case 5:
                Status status4 = (Status) bhx.a(parcel, Status.CREATOR);
                return true;
            case 6:
                d((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 7:
                a((Status) bhx.a(parcel, Status.CREATOR), (BackupAndSyncOptInState) bhx.a(parcel, BackupAndSyncOptInState.CREATOR));
                return true;
            case 8:
                a((Status) bhx.a(parcel, Status.CREATOR), (BackupAndSyncSuggestion) bhx.a(parcel, BackupAndSyncSuggestion.CREATOR));
                return true;
            case 9:
                Status status5 = (Status) bhx.a(parcel, Status.CREATOR);
                return true;
            case 10:
                Status status6 = (Status) bhx.a(parcel, Status.CREATOR);
                parcel.createTypedArrayList(ClassifyAccountTypeResult.CREATOR);
                return true;
            default:
                return false;
        }
    }
}
