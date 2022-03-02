package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.contactssync.model.BackupAndSyncSuggestion;
import java.util.List;

/* renamed from: wtb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface wtb extends IInterface {
    void a(Status status);

    void a(Status status, BackupAndSyncOptInState backupAndSyncOptInState);

    void a(Status status, BackupAndSyncSuggestion backupAndSyncSuggestion);

    void a(Status status, List list);

    void b(Status status);

    void c(Status status);

    void d(Status status);

    void e(Status status);
}
