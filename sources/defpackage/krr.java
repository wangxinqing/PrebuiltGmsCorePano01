package defpackage;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.query.Query;
import java.util.Set;

/* renamed from: krr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface krr {
    void a();

    void a(DriveId driveId, long j, kwj kwj);

    void a(DriveId driveId, kwj kwj);

    void a(DriveId driveId, kwj kwj, TransferProgressOptions transferProgressOptions);

    void a(ChangeEvent changeEvent, kmp kmp);

    void a(TransferProgressEvent transferProgressEvent, DriveId driveId);

    void a(String str, boolean z);

    void a(Set set);

    void a(ktn ktn);

    void a(kwj kwj);

    void a(kwj kwj, long j, ChangesAvailableOptions changesAvailableOptions, Set set);

    void a(kwj kwj, Query query, String str, kea kea, Set set, boolean z);

    void a(ldm ldm);

    boolean a(DriveId driveId);

    void b(TransferProgressEvent transferProgressEvent, DriveId driveId);

    void b(kwj kwj);
}
