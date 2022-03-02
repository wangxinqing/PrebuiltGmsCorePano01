package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.ContextData;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WriteBatchImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jxv();
    public ArrayList a;

    public WriteBatchImpl() {
    }

    public final void a(ContextData contextData) {
        iva.a((Object) contextData);
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.add(contextData);
    }

    public WriteBatchImpl(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 3, this.a, false);
        ivx.b(parcel, a2);
    }

    public final boolean a() {
        ArrayList arrayList = this.a;
        return arrayList != null && !arrayList.isEmpty();
    }
}
