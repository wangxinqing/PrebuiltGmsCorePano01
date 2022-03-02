package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConsentInformation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adrt();
    public static final ConsentInformation a = new ConsentInformation((List) null, false, false);
    public boolean b;
    public boolean c;
    private List d;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class AccountConsentInformation extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new adrr();
        public final String a;
        public final byte[] b;
        private List c;

        public AccountConsentInformation(String str, byte[] bArr, List list) {
            this.a = str;
            this.b = bArr;
            this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        }

        public final List a() {
            return new ArrayList(this.c);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof AccountConsentInformation) {
                AccountConsentInformation accountConsentInformation = (AccountConsentInformation) obj;
                return ius.a(this.a, accountConsentInformation.a) && ius.a(this.b, accountConsentInformation.b) && ius.a(this.c, accountConsentInformation.c);
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.a(parcel, 1, this.a, false);
            ivx.a(parcel, 2, this.b, false);
            ivx.a(parcel, 3, a(), false);
            ivx.b(parcel, a2);
        }
    }

    public ConsentInformation(List list, boolean z, boolean z2) {
        this.d = list == null ? new ArrayList(0) : new ArrayList(list);
        this.b = z;
        this.c = z2;
    }

    public static adrs b() {
        return new adrs();
    }

    public final List a() {
        return new ArrayList(this.d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConsentInformation) {
            ConsentInformation consentInformation = (ConsentInformation) obj;
            return ius.a(this.d, consentInformation.d) && ius.a(Boolean.valueOf(this.b), Boolean.valueOf(consentInformation.b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, Boolean.valueOf(this.b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, a(), false);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
