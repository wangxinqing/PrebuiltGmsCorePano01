package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ChangesAvailableEvent extends AbstractSafeParcelable implements DriveEvent {
    public static final Parcelable.Creator CREATOR = new ksk();
    final ChangesAvailableOptions a;

    public ChangesAvailableEvent(ChangesAvailableOptions changesAvailableOptions) {
        this.a = changesAvailableOptions;
    }

    public final int a() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj != this) {
            return ius.a(this.a, ((ChangesAvailableEvent) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return String.format(Locale.US, "ChangesAvailableEvent [changesAvailableOptions=%s]", new Object[]{this.a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 3, this.a, i, false);
        ivx.b(parcel, a2);
    }
}
