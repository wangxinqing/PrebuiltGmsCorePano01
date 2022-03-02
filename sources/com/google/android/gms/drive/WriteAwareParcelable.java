package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class WriteAwareParcelable extends AbstractSafeParcelable {
    public volatile transient boolean a = false;

    /* access modifiers changed from: protected */
    public abstract void a(Parcel parcel, int i);

    public final void writeToParcel(Parcel parcel, int i) {
        iva.a(!this.a);
        this.a = true;
        a(parcel, i);
    }
}
