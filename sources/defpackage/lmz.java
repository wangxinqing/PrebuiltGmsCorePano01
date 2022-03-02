package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.drive.realtime.internal.event.FieldChangedDetails;
import com.google.android.gms.drive.realtime.internal.event.ObjectChangedDetails;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEvent;
import com.google.android.gms.drive.realtime.internal.event.ReferenceShiftedDetails;
import com.google.android.gms.drive.realtime.internal.event.TextDeletedDetails;
import com.google.android.gms.drive.realtime.internal.event.TextInsertedDetails;
import com.google.android.gms.drive.realtime.internal.event.ValueChangedDetails;
import com.google.android.gms.drive.realtime.internal.event.ValuesAddedDetails;
import com.google.android.gms.drive.realtime.internal.event.ValuesRemovedDetails;
import com.google.android.gms.drive.realtime.internal.event.ValuesSetDetails;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* renamed from: lmz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lmz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParcelableEvent[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        String str3 = null;
        String str4 = null;
        TextInsertedDetails textInsertedDetails = null;
        TextDeletedDetails textDeletedDetails = null;
        ValuesAddedDetails valuesAddedDetails = null;
        ValuesRemovedDetails valuesRemovedDetails = null;
        ValuesSetDetails valuesSetDetails = null;
        ValueChangedDetails valueChangedDetails = null;
        ReferenceShiftedDetails referenceShiftedDetails = null;
        ObjectChangedDetails objectChangedDetails = null;
        FieldChangedDetails fieldChangedDetails = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 4:
                    arrayList = ivw.C(parcel2, readInt);
                    break;
                case 5:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 6:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 7:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 8:
                    textInsertedDetails = (TextInsertedDetails) ivw.a(parcel2, readInt, TextInsertedDetails.CREATOR);
                    break;
                case 9:
                    textDeletedDetails = (TextDeletedDetails) ivw.a(parcel2, readInt, TextDeletedDetails.CREATOR);
                    break;
                case 10:
                    valuesAddedDetails = (ValuesAddedDetails) ivw.a(parcel2, readInt, ValuesAddedDetails.CREATOR);
                    break;
                case 11:
                    valuesRemovedDetails = (ValuesRemovedDetails) ivw.a(parcel2, readInt, ValuesRemovedDetails.CREATOR);
                    break;
                case 12:
                    valuesSetDetails = (ValuesSetDetails) ivw.a(parcel2, readInt, ValuesSetDetails.CREATOR);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    valueChangedDetails = (ValueChangedDetails) ivw.a(parcel2, readInt, ValueChangedDetails.CREATOR);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    referenceShiftedDetails = (ReferenceShiftedDetails) ivw.a(parcel2, readInt, ReferenceShiftedDetails.CREATOR);
                    break;
                case Service.START_CONTINUATION_MASK:
                    objectChangedDetails = (ObjectChangedDetails) ivw.a(parcel2, readInt, ObjectChangedDetails.CREATOR);
                    break;
                case 16:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 17:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 18:
                    fieldChangedDetails = (FieldChangedDetails) ivw.a(parcel2, readInt, FieldChangedDetails.CREATOR);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new ParcelableEvent(str, str2, arrayList, z, z2, z3, str3, str4, textInsertedDetails, textDeletedDetails, valuesAddedDetails, valuesRemovedDetails, valuesSetDetails, valueChangedDetails, referenceShiftedDetails, objectChangedDetails, fieldChangedDetails);
    }
}
