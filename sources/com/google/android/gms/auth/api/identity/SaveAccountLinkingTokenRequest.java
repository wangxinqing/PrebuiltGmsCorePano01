package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new fso();
    public final PendingIntent a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3) {
        this.a = pendingIntent;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SaveAccountLinkingTokenRequest) {
            SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
            if (this.d.size() != saveAccountLinkingTokenRequest.d.size() || !this.d.containsAll(saveAccountLinkingTokenRequest.d) || !ius.a(this.a, saveAccountLinkingTokenRequest.a) || !ius.a(this.b, saveAccountLinkingTokenRequest.b) || !ius.a(this.c, saveAccountLinkingTokenRequest.c) || !ius.a(this.e, saveAccountLinkingTokenRequest.e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.b(parcel, a2);
    }
}
