package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sue  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sue extends bhv implements sug {
    public sue(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final List a(String str, String str2, AppMetadata appMetadata) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        aQ.writeString(str2);
        bhx.a(aQ, (Parcelable) appMetadata);
        Parcel a = a(16, aQ);
        ArrayList createTypedArrayList = a.createTypedArrayList(ConditionalUserPropertyParcel.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final String b(AppMetadata appMetadata) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) appMetadata);
        Parcel a = a(11, aQ);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final List a(String str, String str2, String str3) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        Parcel a = a(17, aQ);
        ArrayList createTypedArrayList = a.createTypedArrayList(ConditionalUserPropertyParcel.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final List a(String str, String str2, String str3, boolean z) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        bhx.a(aQ, z);
        Parcel a = a(15, aQ);
        ArrayList createTypedArrayList = a.createTypedArrayList(UserAttributeParcel.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final List a(String str, String str2, boolean z, AppMetadata appMetadata) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        aQ.writeString(str2);
        bhx.a(aQ, z);
        bhx.a(aQ, (Parcelable) appMetadata);
        Parcel a = a(14, aQ);
        ArrayList createTypedArrayList = a.createTypedArrayList(UserAttributeParcel.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final void a(long j, String str, String str2, String str3) {
        Parcel aQ = aQ();
        aQ.writeLong(j);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        b(10, aQ);
    }

    public final void a(AppMetadata appMetadata) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) appMetadata);
        b(4, aQ);
    }

    public final void a(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) conditionalUserPropertyParcel);
        b(13, aQ);
    }

    public final void a(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) conditionalUserPropertyParcel);
        bhx.a(aQ, (Parcelable) appMetadata);
        b(12, aQ);
    }

    public final void a(EventParcel eventParcel, AppMetadata appMetadata) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) eventParcel);
        bhx.a(aQ, (Parcelable) appMetadata);
        b(1, aQ);
    }

    public final void a(EventParcel eventParcel, String str, String str2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) eventParcel);
        aQ.writeString(str);
        aQ.writeString(str2);
        b(5, aQ);
    }

    public final void a(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) userAttributeParcel);
        bhx.a(aQ, (Parcelable) appMetadata);
        b(2, aQ);
    }
}
