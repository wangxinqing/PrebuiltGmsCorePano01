package com.google.android.gms.contextmanager.fence.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FenceStateMapImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jvg();
    public final Map a;

    public FenceStateMapImpl(Bundle bundle) {
        this.a = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                this.a.put(str, (FenceStateImpl) ivy.a(bundle.getByteArray(str), FenceStateImpl.CREATOR));
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        int a2 = ivx.a(parcel);
        if (this.a != null) {
            bundle = new Bundle();
            for (Map.Entry entry : this.a.entrySet()) {
                bundle.putByteArray((String) entry.getKey(), ivy.a((FenceStateImpl) entry.getValue()));
            }
        } else {
            bundle = null;
        }
        ivx.a(parcel, 2, bundle, false);
        ivx.b(parcel, a2);
    }

    public FenceStateMapImpl(Map map) {
        this.a = map;
    }
}
