package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.photos.autobackup.model.AutoBackupEngineStatus;
import com.google.android.gms.photos.autobackup.model.AutoBackupStatus;
import com.google.android.gms.photos.autobackup.model.LocalFolder;
import com.google.android.gms.photos.autobackup.model.MigrationStatus;
import java.util.List;

/* renamed from: yjn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yjn extends bhv implements yjp {
    public yjn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
    }

    public final void a(int i, List list) {
        Parcel aQ = aQ();
        aQ.writeInt(0);
        aQ.writeTypedList(list);
        b(3, aQ);
    }

    public final void b() {
        Parcel aQ = aQ();
        aQ.writeInt(8);
        bhx.a(aQ, false);
        aQ.writeString((String) null);
        b(1, aQ);
    }

    public final void c() {
        Parcel aQ = aQ();
        aQ.writeInt(8);
        b(9, aQ);
    }

    public final void d() {
        Parcel aQ = aQ();
        aQ.writeInt(8);
        aQ.writeTypedList((List) null);
        b(4, aQ);
    }

    public final void e() {
        Parcel aQ = aQ();
        aQ.writeInt(8);
        bhx.a(aQ, (Parcelable) null);
        b(13, aQ);
    }

    public final void f() {
        Parcel aQ = aQ();
        aQ.writeInt(8);
        b(7, aQ);
    }

    public final void g() {
        Parcel aQ = aQ();
        aQ.writeInt(8);
        b(14, aQ);
    }

    public final void h() {
        Parcel aQ = aQ();
        aQ.writeInt(8);
        b(8, aQ);
    }

    public final void i() {
        Parcel aQ = aQ();
        aQ.writeInt(8);
        bhx.a(aQ, (Parcelable) null);
        b(10, aQ);
    }

    public final void j() {
        Parcel aQ = aQ();
        aQ.writeInt(8);
        b(11, aQ);
    }

    public final void a(PendingIntent pendingIntent) {
        Parcel aQ = aQ();
        aQ.writeInt(8);
        bhx.a(aQ, (Parcelable) pendingIntent);
        b(2, aQ);
    }

    public final void a(Status status, LocalFolder localFolder) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) localFolder);
        b(5, aQ);
    }

    public final void a(AutoBackupEngineStatus autoBackupEngineStatus) {
        Parcel aQ = aQ();
        aQ.writeInt(0);
        bhx.a(aQ, (Parcelable) autoBackupEngineStatus);
        b(15, aQ);
    }

    public final void a(AutoBackupStatus autoBackupStatus) {
        Parcel aQ = aQ();
        aQ.writeInt(8);
        bhx.a(aQ, (Parcelable) autoBackupStatus);
        b(6, aQ);
    }

    public final void a(MigrationStatus migrationStatus) {
        Parcel aQ = aQ();
        aQ.writeInt(8);
        bhx.a(aQ, (Parcelable) migrationStatus);
        b(12, aQ);
    }
}
