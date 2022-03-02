package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.ResultSet;
import com.google.firebase.appindexing.internal.GetIndexableResponse;
import java.util.List;

/* renamed from: apmo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apmo extends bhv implements apmq {
    public apmo(IBinder iBinder) {
        super(iBinder, "com.google.firebase.appindexing.internal.IAppIndexingCallback");
    }

    public final void a(Status status, List list) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeList(list);
        c(4, aQ);
    }

    public final void a(Status status, ResultSet[] resultSetArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeTypedArray(resultSetArr, 0);
        c(3, aQ);
    }

    public final void a(GetIndexableResponse getIndexableResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getIndexableResponse);
        c(2, aQ);
    }
}
