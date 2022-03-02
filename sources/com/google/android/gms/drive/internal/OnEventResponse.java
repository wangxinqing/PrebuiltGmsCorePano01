package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.TransferStateEvent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OnEventResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kwu();
    final int a;
    final ChangeEvent b;
    final CompletionEvent c;
    final QueryResultEventParcelable d;
    final ChangesAvailableEvent e;
    final TransferStateEvent f;
    final TransferProgressEvent g;

    public OnEventResponse(int i, ChangeEvent changeEvent, CompletionEvent completionEvent, QueryResultEventParcelable queryResultEventParcelable, ChangesAvailableEvent changesAvailableEvent, TransferStateEvent transferStateEvent, TransferProgressEvent transferProgressEvent) {
        this.a = i;
        this.b = changeEvent;
        this.c = completionEvent;
        this.d = queryResultEventParcelable;
        this.e = changesAvailableEvent;
        this.f = transferStateEvent;
        this.g = transferProgressEvent;
    }

    public final DriveEvent a() {
        int i = this.a;
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i == 3) {
            return this.d;
        }
        if (i == 4) {
            return this.e;
        }
        if (i == 7) {
            return this.f;
        }
        if (i == 8) {
            return this.g;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unexpected event type ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public OnEventResponse(DriveEvent driveEvent) {
        int a2 = driveEvent.a();
        this.a = a2;
        if (a2 == 1) {
            this.b = (ChangeEvent) driveEvent;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
        } else if (a2 == 2) {
            this.b = null;
            this.c = (CompletionEvent) driveEvent;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
        } else if (a2 == 3) {
            this.b = null;
            this.c = null;
            this.d = (QueryResultEventParcelable) driveEvent;
            this.e = null;
            this.f = null;
            this.g = null;
        } else if (a2 == 4) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = (ChangesAvailableEvent) driveEvent;
            this.f = null;
            this.g = null;
        } else if (a2 == 7) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = (TransferStateEvent) driveEvent;
            this.g = null;
        } else if (a2 == 8) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = (TransferProgressEvent) driveEvent;
        } else {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unexpected event type ");
            sb.append(a2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b, i, false);
        ivx.a(parcel, 5, this.c, i, false);
        ivx.a(parcel, 6, this.d, i, false);
        ivx.a(parcel, 7, this.e, i, false);
        ivx.a(parcel, 9, this.f, i, false);
        ivx.a(parcel, 10, this.g, i, false);
        ivx.b(parcel, a2);
    }
}
