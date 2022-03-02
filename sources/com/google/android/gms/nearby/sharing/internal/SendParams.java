package com.google.android.gms.nearby.sharing.internal;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SendParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wam();
    public ShareTarget a;
    public Intent b;
    public ifu c;

    public SendParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SendParams) {
            SendParams sendParams = (SendParams) obj;
            return ius.a(this.a, sendParams.a) && ius.a(this.b, sendParams.b) && ius.a(this.c, sendParams.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public SendParams(ShareTarget shareTarget, Intent intent, IBinder iBinder) {
        ifu ifu;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            ifu = queryLocalInterface instanceof ifu ? (ifu) queryLocalInterface : new ifs(iBinder);
        } else {
            ifu = null;
        }
        this.a = shareTarget;
        this.b = intent;
        this.c = ifu;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c.asBinder());
        ivx.b(parcel, a2);
    }
}
