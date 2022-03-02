package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class KeyFilterImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jxm();
    public final ArrayList a;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Inclusion extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new jxn();
        public final String[] a;
        public final String[] b;
        public final String[] c;

        public Inclusion(String[] strArr, String[] strArr2, String[] strArr3) {
            this.a = strArr;
            this.b = strArr2;
            this.c = strArr3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Inclusion) {
                Inclusion inclusion = (Inclusion) obj;
                return Arrays.equals(this.a, inclusion.a) && Arrays.equals(this.b, inclusion.b) && Arrays.equals(this.c, inclusion.c);
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(this.a) + Arrays.hashCode(this.b) + Arrays.hashCode(this.c);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.a(parcel, 2, this.a, false);
            ivx.a(parcel, 3, this.b, false);
            ivx.a(parcel, 4, this.c, false);
            ivx.b(parcel, a2);
        }
    }

    public KeyFilterImpl(ArrayList arrayList) {
        this.a = arrayList;
    }

    public static boolean a(String str, String[] strArr) {
        if (strArr == null || (r1 = strArr.length) == 0) {
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            for (String equals : strArr) {
                if (TextUtils.equals(equals, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyFilterImpl) {
            return this.a.equals(((KeyFilterImpl) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 2, this.a, false);
        ivx.b(parcel, a2);
    }
}
