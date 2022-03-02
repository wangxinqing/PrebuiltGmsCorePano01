package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ApplicationInformation extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new gdx();
    final int a;
    public String b;
    public String c;
    public boolean d;
    public boolean e;

    public ApplicationInformation(int i, String str, String str2, boolean z, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ApplicationInformation) {
            ApplicationInformation applicationInformation = (ApplicationInformation) obj;
            if (!TextUtils.equals(this.b, applicationInformation.b) || !TextUtils.equals(this.c, applicationInformation.c) || this.d != applicationInformation.d || this.e != applicationInformation.e) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    public ApplicationInformation(String str, String str2, boolean z, boolean z2) {
        this.a = 1;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.b(parcel, a2);
    }
}
