package defpackage;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FullBackupDataOutput;
import android.os.ParcelFileDescriptor;
import com.google.android.chimera.BackupAgent;
import java.io.File;
import java.io.IOException;

/* renamed from: bkg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bkg extends BackupAgent {
    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        throw new IOException("BackupAgent missing implementation");
    }

    public final void onFullBackup(FullBackupDataOutput fullBackupDataOutput) {
        throw new IOException("BackupAgent missing implementation");
    }

    public final void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        throw new IOException("BackupAgent missing implementation");
    }

    public final void onRestoreFile(ParcelFileDescriptor parcelFileDescriptor, long j, File file, int i, long j2, long j3) {
        throw new IOException("BackupAgent missing implementation");
    }
}
