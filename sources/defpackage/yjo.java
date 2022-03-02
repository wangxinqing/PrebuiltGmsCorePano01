package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.chimera.Service;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.photos.autobackup.model.AutoBackupEngineStatus;
import com.google.android.gms.photos.autobackup.model.AutoBackupSettings;
import com.google.android.gms.photos.autobackup.model.AutoBackupStatus;
import com.google.android.gms.photos.autobackup.model.LocalFolder;
import com.google.android.gms.photos.autobackup.model.MediaState;
import com.google.android.gms.photos.autobackup.model.MigrationStatus;
import com.google.android.gms.photos.autobackup.model.SyncSettings;
import java.util.List;
import org.chromium.net.UrlRequest;

/* renamed from: yjo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class yjo extends bhw implements yjp {
    public yjo() {
        super("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
    }

    public void a(int i, List list) {
    }

    public final void a(PendingIntent pendingIntent) {
    }

    public final void a(Status status, LocalFolder localFolder) {
    }

    public final void a(AutoBackupEngineStatus autoBackupEngineStatus) {
    }

    public final void a(AutoBackupStatus autoBackupStatus) {
    }

    public final void a(MigrationStatus migrationStatus) {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void g() {
    }

    public final void h() {
    }

    public final void i() {
    }

    public final void j() {
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel.readInt();
                bhx.a(parcel);
                parcel.readString();
                break;
            case 2:
                parcel.readInt();
                PendingIntent pendingIntent = (PendingIntent) bhx.a(parcel, PendingIntent.CREATOR);
                break;
            case 3:
                a(parcel.readInt(), (List) parcel.createTypedArrayList(AutoBackupSettings.CREATOR));
                break;
            case 4:
                parcel.readInt();
                parcel.createTypedArrayList(LocalFolder.CREATOR);
                break;
            case 5:
                Status status = (Status) bhx.a(parcel, Status.CREATOR);
                LocalFolder localFolder = (LocalFolder) bhx.a(parcel, LocalFolder.CREATOR);
                break;
            case 6:
                parcel.readInt();
                AutoBackupStatus autoBackupStatus = (AutoBackupStatus) bhx.a(parcel, AutoBackupStatus.CREATOR);
                break;
            case 7:
                parcel.readInt();
                break;
            case 8:
                parcel.readInt();
                break;
            case 9:
                parcel.readInt();
                break;
            case 10:
                parcel.readInt();
                SyncSettings syncSettings = (SyncSettings) bhx.a(parcel, SyncSettings.CREATOR);
                break;
            case 11:
                parcel.readInt();
                break;
            case 12:
                parcel.readInt();
                MigrationStatus migrationStatus = (MigrationStatus) bhx.a(parcel, MigrationStatus.CREATOR);
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                parcel.readInt();
                MediaState mediaState = (MediaState) bhx.a(parcel, MediaState.CREATOR);
                break;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                parcel.readInt();
                break;
            case Service.START_CONTINUATION_MASK:
                parcel.readInt();
                AutoBackupEngineStatus autoBackupEngineStatus = (AutoBackupEngineStatus) bhx.a(parcel, AutoBackupEngineStatus.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
