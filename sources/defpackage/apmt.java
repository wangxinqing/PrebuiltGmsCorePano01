package defpackage;

import android.os.IInterface;
import com.google.firebase.appindexing.internal.CallStatus;
import com.google.firebase.appindexing.internal.GetIndexableRequest;
import com.google.firebase.appindexing.internal.MutateRequest;

/* renamed from: apmt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface apmt extends IInterface {
    CallStatus a(ifu ifu, MutateRequest mutateRequest);

    void a(apmq apmq, GetIndexableRequest getIndexableRequest);
}
