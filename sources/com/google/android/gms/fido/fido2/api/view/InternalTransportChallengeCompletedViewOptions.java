package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InternalTransportChallengeCompletedViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new nao();
    public final int a;
    public final byte[] b;

    public InternalTransportChallengeCompletedViewOptions(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final JSONObject a() {
        JSONObject a2 = super.a();
        try {
            a2.put("statusCode", this.a);
            byte[] bArr = this.b;
            if (bArr != null) {
                a2.put("signedData", anml.e.a(bArr));
            }
            return a2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public final nax b() {
        return nax.INTERNAL_TRANSPORT_CHALLENGE_COMPLETED;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InternalTransportChallengeCompletedViewOptions) {
            InternalTransportChallengeCompletedViewOptions internalTransportChallengeCompletedViewOptions = (InternalTransportChallengeCompletedViewOptions) obj;
            if (this.a != internalTransportChallengeCompletedViewOptions.a || !Arrays.equals(this.b, internalTransportChallengeCompletedViewOptions.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }
}
