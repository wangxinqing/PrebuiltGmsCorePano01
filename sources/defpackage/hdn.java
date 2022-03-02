package defpackage;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FullBackupDataOutput;
import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.google.android.chimera.BackupAgent;
import com.google.android.chimera.ModuleContext;
import java.io.File;

/* renamed from: hdn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class hdn extends bkh {
    private njy c = null;

    protected hdn() {
        hem.a();
    }

    public final void a(BackupAgent backupAgent, Context context) {
        njy njy;
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext != null && (moduleContext.getModuleApk() instanceof bkw)) {
            context = new ihh(context);
        }
        if (axda.a.a().e()) {
            njy = new njy(context, (Class) backupAgent.getClass(), 21);
        } else {
            njy = null;
        }
        this.c = njy;
        Context a = njw.a(context);
        if (this.a == null) {
            this.a = backupAgent;
            backupAgent.setProxy(this, a);
            return;
        }
        throw new IllegalStateException("Implementation already set");
    }

    public final boolean c(Context context) {
        return true;
    }

    public final void d() {
        hey.a(true);
    }

    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        amky a = njy.a(this.c, "onBackup");
        try {
            this.a.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onCreate() {
        amky a = njy.a(this.c, "onCreate");
        try {
            this.a.onCreate();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        amky a = njy.a(this.c, "onDestroy");
        try {
            this.a.onDestroy();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onFullBackup(FullBackupDataOutput fullBackupDataOutput) {
        amky a = njy.a(this.c, "onFullBackup");
        try {
            this.a.onFullBackup(fullBackupDataOutput);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onQuotaExceeded(long j, long j2) {
        amky a = njy.a(this.c, "onQuotaExceeded");
        try {
            this.a.onQuotaExceeded(j, j2);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        amky a = njy.a(this.c, "onRestore");
        try {
            this.a.onRestore(backupDataInput, i, parcelFileDescriptor);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onRestoreFile(ParcelFileDescriptor parcelFileDescriptor, long j, File file, int i, long j2, long j3) {
        Throwable th;
        amky a = njy.a(this.c, "onRestoreFile");
        try {
            this.a.onRestoreFile(parcelFileDescriptor, j, file, i, j2, j3);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
        throw th;
    }

    public final void onRestoreFinished() {
        amky a = njy.a(this.c, "onRestoreFinished");
        try {
            this.a.onRestoreFinished();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onRestore(BackupDataInput backupDataInput, long j, ParcelFileDescriptor parcelFileDescriptor) {
        amky a = njy.a(this.c, "onRestore");
        try {
            this.a.onRestore(backupDataInput, j, parcelFileDescriptor);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Context context) {
        a((BackupAgent) obj, context);
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        if (!ihs.b().getInSafeBoot()) {
            return bkh.b.a(this, this);
        }
        return false;
    }
}
