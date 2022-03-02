package com.google.android.gms.auth.api.credentials.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InternalCredentialWrapper extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new fgk();
    public final Credential a;
    public final Account b;

    public InternalCredentialWrapper(Credential credential, Account account) {
        iva.a((Object) credential);
        this.a = credential;
        this.b = account;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InternalCredentialWrapper) {
            InternalCredentialWrapper internalCredentialWrapper = (InternalCredentialWrapper) obj;
            return ius.a(this.a, internalCredentialWrapper.a) && ius.a(this.b, internalCredentialWrapper.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.b(parcel, a2);
    }
}
