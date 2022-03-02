package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConsentFlowConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new acye();
    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public int g;

    public ConsentFlowConfig() {
        this(false, true, false, 0, 0, true, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsentFlowConfig) {
            ConsentFlowConfig consentFlowConfig = (ConsentFlowConfig) obj;
            return this.a == consentFlowConfig.a && this.b == consentFlowConfig.b && this.c == consentFlowConfig.c && this.d == consentFlowConfig.d && this.e == consentFlowConfig.e && this.f == consentFlowConfig.f && this.g == consentFlowConfig.g;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f), Integer.valueOf(this.g)});
    }

    public ConsentFlowConfig(boolean z, boolean z2, boolean z3, int i, int i2, boolean z4, int i3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = i2;
        this.f = z4;
        this.g = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c);
        ivx.b(parcel, 5, this.d);
        ivx.b(parcel, 6, this.e);
        ivx.a(parcel, 7, this.f);
        ivx.b(parcel, 8, this.g);
        ivx.b(parcel, a2);
    }
}
