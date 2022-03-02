package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.StorageInfoResponse;

/* renamed from: adzx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adzx implements icl {
    public final StorageInfoResponse a;
    private final Status b;

    public adzx(Status status, StorageInfoResponse storageInfoResponse) {
        this.b = status;
        this.a = storageInfoResponse;
    }

    public final Status aO() {
        return this.b;
    }
}
