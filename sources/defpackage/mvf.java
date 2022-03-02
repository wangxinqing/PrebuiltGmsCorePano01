package defpackage;

import android.os.Binder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: mvf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mvf extends Binder {
    final /* synthetic */ ParcelFileDescriptor a;

    public mvf(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        this.a.writeToParcel(parcel2, 0);
        return true;
    }
}
