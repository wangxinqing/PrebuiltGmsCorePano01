package defpackage;

import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.photos.autobackup.model.AutoBackupEngineStatus;
import com.google.android.gms.photos.autobackup.model.AutoBackupStatus;
import com.google.android.gms.photos.autobackup.model.LocalFolder;
import com.google.android.gms.photos.autobackup.model.MigrationStatus;
import java.util.List;

/* renamed from: yjp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface yjp extends IInterface {
    void a(int i, List list);

    void a(PendingIntent pendingIntent);

    void a(Status status, LocalFolder localFolder);

    void a(AutoBackupEngineStatus autoBackupEngineStatus);

    void a(AutoBackupStatus autoBackupStatus);

    void a(MigrationStatus migrationStatus);

    void b();

    void c();

    void d();

    void e();

    void f();

    void g();

    void h();

    void i();

    void j();
}
