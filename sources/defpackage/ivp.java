package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.SignInButtonConfig;

/* renamed from: ivp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ivp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SignInButtonConfig[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        int i = 0;
        Scope[] scopeArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                i2 = ivw.g(parcel, readInt);
            } else if (a == 3) {
                i3 = ivw.g(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                scopeArr = (Scope[]) ivw.b(parcel, readInt, Scope.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new SignInButtonConfig(i, i2, i3, scopeArr);
    }
}
