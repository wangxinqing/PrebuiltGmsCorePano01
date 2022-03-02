package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuthAccountResult extends AbstractSafeParcelable implements icl {
    public static final Parcelable.Creator CREATOR = new abdn();
    final int a;
    public int b;
    public Intent c;

    public AuthAccountResult() {
        this(0, (Intent) null);
    }

    public final Status aO() {
        if (this.b == 0) {
            return Status.a;
        }
        return Status.e;
    }

    public AuthAccountResult(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.b(parcel, a2);
    }

    public AuthAccountResult(int i, Intent intent) {
        this(2, i, intent);
    }
}
