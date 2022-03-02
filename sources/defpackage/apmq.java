package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.ResultSet;
import com.google.firebase.appindexing.internal.GetIndexableResponse;
import java.util.List;

/* renamed from: apmq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface apmq extends IInterface {
    void a(Status status, List list);

    void a(Status status, ResultSet[] resultSetArr);

    void a(GetIndexableResponse getIndexableResponse);
}
