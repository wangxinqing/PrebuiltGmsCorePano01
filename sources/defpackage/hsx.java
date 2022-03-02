package defpackage;

import android.os.IInterface;
import com.google.android.gms.clearcut.CollectForDebugParcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: hsx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface hsx extends IInterface {
    void a(Status status);

    void a(Status status, long j);

    void a(Status status, CollectForDebugParcelable collectForDebugParcelable);

    void a(DataHolder dataHolder);

    void b(Status status);

    void b(Status status, long j);

    void b(Status status, CollectForDebugParcelable collectForDebugParcelable);

    void c(Status status);
}
