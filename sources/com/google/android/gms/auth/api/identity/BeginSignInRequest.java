package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fry();
    public final PasswordRequestOptions a;
    public final GoogleIdTokenRequestOptions b;
    public final String c;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new fsf();
        public final boolean a;
        public final String b;
        public final String c;
        public final boolean d;

        public GoogleIdTokenRequestOptions(boolean z, String str, String str2, boolean z2) {
            this.a = z;
            if (z) {
                iva.a((Object) str, (Object) "serverClientId must be provided if Google ID tokens are requested");
            }
            this.b = str;
            this.c = str2;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof GoogleIdTokenRequestOptions) {
                GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
                if (this.a != googleIdTokenRequestOptions.a || !ius.a(this.b, googleIdTokenRequestOptions.b) || !ius.a(this.c, googleIdTokenRequestOptions.c) || this.d != googleIdTokenRequestOptions.d) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d)});
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.a(parcel, 1, this.a);
            ivx.a(parcel, 2, this.b, false);
            ivx.a(parcel, 3, this.c, false);
            ivx.a(parcel, 4, this.d);
            ivx.b(parcel, a2);
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new fsn();
        public final boolean a;

        public PasswordRequestOptions(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PasswordRequestOptions) || this.a != ((PasswordRequestOptions) obj).a) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.a(parcel, 1, this.a);
            ivx.b(parcel, a2);
        }
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str) {
        iva.a((Object) passwordRequestOptions);
        this.a = passwordRequestOptions;
        iva.a((Object) googleIdTokenRequestOptions);
        this.b = googleIdTokenRequestOptions;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BeginSignInRequest) {
            BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
            if (!ius.a(this.a, beginSignInRequest.a) || !ius.a(this.b, beginSignInRequest.b) || !ius.a(this.c, beginSignInRequest.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
