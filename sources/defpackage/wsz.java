package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.contactssync.model.BackupAndSyncSuggestion;
import java.util.List;

/* renamed from: wsz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wsz extends bhv implements wtb {
    public wsz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(3, aQ);
    }

    public final void b(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(4, aQ);
    }

    public final void c(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(5, aQ);
    }

    public final void d(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(6, aQ);
    }

    public final void e(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(9, aQ);
    }

    public final void a(Status status, BackupAndSyncOptInState backupAndSyncOptInState) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) backupAndSyncOptInState);
        c(7, aQ);
    }

    public final void a(Status status, BackupAndSyncSuggestion backupAndSyncSuggestion) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) backupAndSyncSuggestion);
        c(8, aQ);
    }

    public final void a(Status status, List list) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeTypedList(list);
        c(10, aQ);
    }
}
