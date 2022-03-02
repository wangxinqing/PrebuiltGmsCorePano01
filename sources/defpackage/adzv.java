package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.StorageInfoResponse;

/* renamed from: adzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adzv extends aeav {
    final /* synthetic */ adzw a;

    public adzv(adzw adzw) {
        this.a = adzw;
    }

    public final void a(StorageInfoResponse storageInfoResponse) {
        this.a.a((icl) new adzx(new Status(storageInfoResponse.a), storageInfoResponse));
    }
}
