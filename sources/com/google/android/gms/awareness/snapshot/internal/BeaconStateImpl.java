package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.awareness.state.BeaconState$TypeFilter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class BeaconStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gri();
    public final ArrayList a;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class BeaconInfoImpl extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new grh();
        public final String a;
        public final String b;
        public final byte[] c;

        public BeaconInfoImpl(String str, String str2, byte[] bArr) {
            iva.c(str);
            this.a = str;
            iva.c(str2);
            this.b = str2;
            this.c = bArr;
        }

        public final String toString() {
            byte[] bArr = this.c;
            String str = bArr != null ? new String(bArr) : "<null>";
            String str2 = this.a;
            String str3 = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 6 + String.valueOf(str3).length() + str.length());
            sb.append("(");
            sb.append(str2);
            sb.append(", ");
            sb.append(str3);
            sb.append(", ");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.a(parcel, 2, this.a, false);
            ivx.a(parcel, 3, this.b, false);
            ivx.a(parcel, 4, this.c, false);
            ivx.b(parcel, a2);
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class TypeFilterImpl extends BeaconState$TypeFilter {
        public static final Parcelable.Creator CREATOR = new gru();
        private final atjf a;

        public TypeFilterImpl(String str, String str2) {
            aucd o = atjf.e.o();
            iva.c(str);
            if (o.c) {
                o.c();
                o.c = false;
            }
            atjf atjf = (atjf) o.b;
            str.getClass();
            atjf.a |= 1;
            atjf.b = str;
            iva.c(str2);
            if (o.c) {
                o.c();
                o.c = false;
            }
            atjf atjf2 = (atjf) o.b;
            str2.getClass();
            atjf2.a |= 2;
            atjf2.c = str2;
            this.a = (atjf) o.i();
        }

        public final String a() {
            atjf atjf = this.a;
            if (atjf != null) {
                return atjf.b;
            }
            return null;
        }

        public final String b() {
            atjf atjf = this.a;
            if (atjf != null) {
                return atjf.c;
            }
            return null;
        }

        public final byte[] c() {
            atjf atjf = this.a;
            if (atjf == null || atjf.d.a() == 0) {
                return null;
            }
            return this.a.d.k();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TypeFilterImpl) {
                TypeFilterImpl typeFilterImpl = (TypeFilterImpl) obj;
                return TextUtils.equals(a(), typeFilterImpl.a()) && TextUtils.equals(b(), typeFilterImpl.b()) && Arrays.equals(c(), typeFilterImpl.c());
            }
        }

        public final int hashCode() {
            Object[] objArr = new Object[3];
            int i = 0;
            objArr[0] = a();
            objArr[1] = b();
            if (c() != null) {
                i = Arrays.hashCode(c());
            }
            objArr[2] = Integer.valueOf(i);
            return Arrays.hashCode(objArr);
        }

        public final String toString() {
            String a2 = a();
            String b = b();
            String str = c() != null ? new String(c()) : "null";
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 4 + String.valueOf(b).length() + str.length());
            sb.append("(");
            sb.append(a2);
            sb.append(",");
            sb.append(b);
            sb.append(",");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final boolean a(String str, String str2, byte[] bArr) {
            if (!TextUtils.equals(str, a()) || !TextUtils.equals(str2, b())) {
                return false;
            }
            return c() == null || Arrays.equals(bArr, c());
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.a(parcel, 2, this.a.k(), false);
            ivx.b(parcel, a2);
        }

        public TypeFilterImpl(byte[] bArr) {
            atjf atjf;
            try {
                atjf = (atjf) aucj.a((aucj) atjf.e, bArr, aubs.c());
            } catch (auda e) {
                bxl.a("BeaconStateImpl", "Could not deserialize BeaconFence.BeaconTypeFilter");
                atjf = null;
            }
            this.a = atjf;
        }
    }

    public BeaconStateImpl(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final String toString() {
        ArrayList arrayList = this.a;
        if (arrayList == null || arrayList.isEmpty()) {
            return "BeaconState: empty";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("BeaconState: ");
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            sb.append((BeaconInfoImpl) arrayList2.get(i));
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 2, this.a, false);
        ivx.b(parcel, a2);
    }
}
