package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.TransferStateEvent;
import com.google.android.gms.drive.internal.OnEventResponse;

/* renamed from: kwu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kwu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OnEventResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ChangeEvent changeEvent = null;
        CompletionEvent completionEvent = null;
        QueryResultEventParcelable queryResultEventParcelable = null;
        ChangesAvailableEvent changesAvailableEvent = null;
        TransferStateEvent transferStateEvent = null;
        TransferProgressEvent transferProgressEvent = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                i = ivw.g(parcel, readInt);
            } else if (a == 3) {
                changeEvent = (ChangeEvent) ivw.a(parcel, readInt, ChangeEvent.CREATOR);
            } else if (a == 5) {
                completionEvent = (CompletionEvent) ivw.a(parcel, readInt, CompletionEvent.CREATOR);
            } else if (a == 6) {
                queryResultEventParcelable = (QueryResultEventParcelable) ivw.a(parcel, readInt, QueryResultEventParcelable.CREATOR);
            } else if (a == 7) {
                changesAvailableEvent = (ChangesAvailableEvent) ivw.a(parcel, readInt, ChangesAvailableEvent.CREATOR);
            } else if (a == 9) {
                transferStateEvent = (TransferStateEvent) ivw.a(parcel, readInt, TransferStateEvent.CREATOR);
            } else if (a != 10) {
                ivw.b(parcel, readInt);
            } else {
                transferProgressEvent = (TransferProgressEvent) ivw.a(parcel, readInt, TransferProgressEvent.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new OnEventResponse(i, changeEvent, completionEvent, queryResultEventParcelable, changesAvailableEvent, transferStateEvent, transferProgressEvent);
    }
}
