package defpackage;

import android.app.backup.BackupAgent;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FullBackupDataOutput;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.chimera.BackupAgent;
import com.google.android.chimera.config.InvalidConfigException;
import java.io.File;

/* renamed from: bkh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bkh extends BackupAgent implements BackupAgent.ProxyCallbacks, bou, bku {
    public static final bkf b = new bkf();
    public com.google.android.chimera.BackupAgent a;

    public void a(com.google.android.chimera.BackupAgent backupAgent, Context context) {
        throw null;
    }

    public /* bridge */ /* synthetic */ void a(Object obj, Context context) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (!a()) {
            try {
                a((com.google.android.chimera.BackupAgent) new bkg(), boo.a().a((Context) this));
            } catch (PackageManager.NameNotFoundException | bop | InvalidConfigException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Failed to load fallback:");
                sb.append(valueOf);
                Log.e("BackupAgentProxy", sb.toString());
            }
            bkv.a((Context) this).a((bku) this);
        }
    }

    public final void chimeraSuperOnCreate() {
        super.onCreate();
    }

    public final void chimeraSuperOnDestroy() {
        super.onDestroy();
    }

    public final void chimeraSuperOnFullBackup(FullBackupDataOutput fullBackupDataOutput) {
        super.onFullBackup(fullBackupDataOutput);
    }

    public final void chimeraSuperOnRestore(BackupDataInput backupDataInput, long j, ParcelFileDescriptor parcelFileDescriptor) {
        super.onRestore(backupDataInput, j, parcelFileDescriptor);
    }

    public final void chimeraSuperOnRestoreFile(ParcelFileDescriptor parcelFileDescriptor, long j, File file, int i, long j2, long j3) {
        super.onRestoreFile(parcelFileDescriptor, j, file, i, j2, j3);
    }

    public final void chimeraSuperOnRestoreFinished() {
        super.onRestoreFinished();
    }

    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        this.a.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
    }

    public void onCreate() {
        this.a.onCreate();
    }

    public void onDestroy() {
        this.a.onDestroy();
    }

    public void onFullBackup(FullBackupDataOutput fullBackupDataOutput) {
        this.a.onFullBackup(fullBackupDataOutput);
    }

    public void onQuotaExceeded(long j, long j2) {
        this.a.onQuotaExceeded(j, j2);
    }

    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.a.onRestore(backupDataInput, i, parcelFileDescriptor);
    }

    public void onRestoreFile(ParcelFileDescriptor parcelFileDescriptor, long j, File file, int i, long j2, long j3) {
        this.a.onRestoreFile(parcelFileDescriptor, j, file, i, j2, j3);
    }

    public void onRestoreFinished() {
        this.a.onRestoreFinished();
    }

    public final void superOnQuotaExceeded(long j, long j2) {
        super.onQuotaExceeded(j, j2);
    }

    public void onRestore(BackupDataInput backupDataInput, long j, ParcelFileDescriptor parcelFileDescriptor) {
        this.a.onRestore(backupDataInput, j, parcelFileDescriptor);
    }

    public final boolean a(boz boz) {
        return boz.f().O() != null;
    }
}
