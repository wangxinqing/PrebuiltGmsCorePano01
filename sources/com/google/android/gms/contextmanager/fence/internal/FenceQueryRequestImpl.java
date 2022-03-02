package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.FenceQueryRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FenceQueryRequestImpl extends FenceQueryRequest {
    public static final Parcelable.Creator CREATOR = new jve();
    public final QueryFenceOperation a;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class QueryFenceOperation extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new jvv();
        public final int a;
        public final List b;

        public QueryFenceOperation(int i, List list) {
            this.a = i;
            this.b = list;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.b(parcel, 2, this.a);
            ivx.b(parcel, 3, this.b, false);
            ivx.b(parcel, a2);
        }
    }

    public FenceQueryRequestImpl() {
        this(new QueryFenceOperation(1, (List) null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.b(parcel, a2);
    }

    public FenceQueryRequestImpl(QueryFenceOperation queryFenceOperation) {
        this.a = queryFenceOperation;
    }
}
