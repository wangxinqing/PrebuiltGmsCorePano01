package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* renamed from: zod  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface zod extends IInterface {
    void a(Status status);

    void a(Status status, long j);

    void a(Status status, PseudonymousIdToken pseudonymousIdToken);
}
