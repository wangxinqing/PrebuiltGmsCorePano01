package com.google.android.chimera;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FullBackupDataOutput;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.ParcelFileDescriptor;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.io.File;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class BackupAgent extends ContextWrapper implements bnu {
    private android.app.backup.BackupAgent a;
    private ProxyCallbacks b;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface ProxyCallbacks {
        void chimeraSuperOnCreate();

        void chimeraSuperOnDestroy();

        void chimeraSuperOnFullBackup(FullBackupDataOutput fullBackupDataOutput);

        void chimeraSuperOnRestore(BackupDataInput backupDataInput, long j, ParcelFileDescriptor parcelFileDescriptor);

        void chimeraSuperOnRestoreFile(ParcelFileDescriptor parcelFileDescriptor, long j, File file, int i, long j2, long j3);

        void chimeraSuperOnRestoreFinished();

        void superOnQuotaExceeded(long j, long j2);
    }

    public BackupAgent() {
        super((Context) null);
    }

    public final void fullBackupFile(File file, FullBackupDataOutput fullBackupDataOutput) {
        this.a.fullBackupFile(file, fullBackupDataOutput);
    }

    public Object getChimeraImpl() {
        return this;
    }

    public abstract void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2);

    public void onCreate() {
        this.b.chimeraSuperOnCreate();
    }

    public void onDestroy() {
        this.b.chimeraSuperOnDestroy();
    }

    public void onFullBackup(FullBackupDataOutput fullBackupDataOutput) {
        this.b.chimeraSuperOnFullBackup(fullBackupDataOutput);
    }

    public void onQuotaExceeded(long j, long j2) {
        this.b.superOnQuotaExceeded(j, j2);
    }

    public abstract void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor);

    public void onRestore(BackupDataInput backupDataInput, long j, ParcelFileDescriptor parcelFileDescriptor) {
        this.b.chimeraSuperOnRestore(backupDataInput, j, parcelFileDescriptor);
    }

    public void onRestoreFile(ParcelFileDescriptor parcelFileDescriptor, long j, File file, int i, long j2, long j3) {
        this.b.chimeraSuperOnRestoreFile(parcelFileDescriptor, j, file, i, j2, j3);
    }

    public void onRestoreFinished() {
        this.b.chimeraSuperOnRestoreFinished();
    }

    public void setProxy(android.app.backup.BackupAgent backupAgent, Context context) {
        this.a = backupAgent;
        this.b = (ProxyCallbacks) backupAgent;
        attachBaseContext(context);
    }
}
