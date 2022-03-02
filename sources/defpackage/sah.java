package defpackage;

import android.os.IInterface;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;

/* renamed from: sah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface sah extends IInterface {
    void a(ifu ifu, LatestFootprintFilter latestFootprintFilter, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable);

    void a(ifu ifu, SyncStatus syncStatus);

    void a(ifu ifu, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable);
}
