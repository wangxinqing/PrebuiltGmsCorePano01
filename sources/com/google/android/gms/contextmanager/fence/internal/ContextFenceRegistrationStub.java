package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContextFenceRegistrationStub extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jvc();
    public final String a;
    public ContextFenceStub b;
    public final long c;

    public ContextFenceRegistrationStub(String str, ContextFenceStub contextFenceStub, long j) {
        this.a = str;
        this.b = contextFenceStub;
        this.c = j;
    }

    public static ContextFenceRegistrationStub a(String str, long j, ContextFenceStub contextFenceStub) {
        iva.c(str);
        iva.a((Object) contextFenceStub);
        return new ContextFenceRegistrationStub(str, contextFenceStub, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContextFenceRegistrationStub) {
            ContextFenceRegistrationStub contextFenceRegistrationStub = (ContextFenceRegistrationStub) obj;
            return TextUtils.equals(this.a, contextFenceRegistrationStub.a) && this.c == contextFenceRegistrationStub.c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, i, false);
        ivx.a(parcel, 4, this.c);
        ivx.b(parcel, a2);
    }
}
