package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.internal.model.people.PersonEntity;

/* renamed from: ytf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ytf extends bhv implements yth {
    public ytf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.plus.internal.IPlusCallbacks");
    }

    public final void a(int i, Bundle bundle) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        b(7, aQ);
    }

    public final void a(int i, Bundle bundle, Bundle bundle2) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        bhx.a(aQ, (Parcelable) bundle2);
        b(1, aQ);
    }

    public final void a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) null);
        bhx.a(aQ, (Parcelable) parcelFileDescriptor);
        b(2, aQ);
    }

    public final void a(int i, Bundle bundle, SafeParcelResponse safeParcelResponse) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        bhx.a(aQ, (Parcelable) safeParcelResponse);
        b(5, aQ);
    }

    public final void a(int i, PersonEntity personEntity) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) personEntity);
        b(9, aQ);
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        b(10, aQ);
    }

    public final void a(DataHolder dataHolder, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) dataHolder);
        aQ.writeString(str);
        b(4, aQ);
    }

    public final void a(DataHolder dataHolder, String str, String str2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) dataHolder);
        aQ.writeString(str);
        aQ.writeString(str2);
        b(6, aQ);
    }
}
