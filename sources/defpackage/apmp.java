package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.ResultSet;
import com.google.firebase.appindexing.internal.GetIndexableResponse;
import java.util.List;

/* renamed from: apmp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class apmp extends bhw implements apmq {
    public apmp() {
        super("com.google.firebase.appindexing.internal.IAppIndexingCallback");
    }

    public final void a(Status status, List list) {
        throw new UnsupportedOperationException();
    }

    public final void a(Status status, ResultSet[] resultSetArr) {
        throw new UnsupportedOperationException();
    }

    public void a(GetIndexableResponse getIndexableResponse) {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            a((GetIndexableResponse) bhx.a(parcel, GetIndexableResponse.CREATOR));
            return true;
        } else if (i == 3) {
            a((Status) bhx.a(parcel, Status.CREATOR), (ResultSet[]) parcel.createTypedArray(ResultSet.CREATOR));
            return true;
        } else if (i != 4) {
            return false;
        } else {
            a((Status) bhx.a(parcel, Status.CREATOR), (List) bhx.b(parcel));
            return true;
        }
    }
}
