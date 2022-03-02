package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ActionImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apma();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final MetadataImpl e;
    public final String f;
    public final Bundle g;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class MetadataImpl extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new apmw();
        public int a;
        public final boolean b;
        public final String c;
        public final String d;
        public final byte[] e;
        public final boolean f;

        public MetadataImpl(int i, boolean z, String str, String str2, byte[] bArr, boolean z2) {
            this.a = i;
            this.b = z;
            this.c = str;
            this.d = str2;
            this.e = bArr;
            this.f = z2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MetadataImpl { { eventStatus: '");
            sb.append(this.a);
            sb.append("' } { uploadable: '");
            sb.append(this.b);
            sb.append("' } ");
            if (this.c != null) {
                sb.append("{ completionToken: '");
                sb.append(this.c);
                sb.append("' } ");
            }
            if (this.d != null) {
                sb.append("{ accountName: '");
                sb.append(this.d);
                sb.append("' } ");
            }
            if (this.e != null) {
                sb.append("{ ssbContext: [ ");
                for (byte hexString : this.e) {
                    sb.append("0x");
                    sb.append(Integer.toHexString(hexString));
                    sb.append(" ");
                }
                sb.append("] } ");
            }
            sb.append("{ contextOnly: '");
            sb.append(this.f);
            sb.append("' } }");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.b(parcel, 1, this.a);
            ivx.a(parcel, 2, this.b);
            ivx.a(parcel, 3, this.c, false);
            ivx.a(parcel, 4, this.d, false);
            ivx.a(parcel, 5, this.e, false);
            ivx.a(parcel, 6, this.f);
            ivx.b(parcel, a2);
        }
    }

    public ActionImpl(String str, String str2, String str3, String str4, MetadataImpl metadataImpl, String str5, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = metadataImpl;
        this.f = str5;
        if (bundle == null) {
            this.g = Bundle.EMPTY;
        } else {
            this.g = bundle;
        }
        this.g.setClassLoader(getClass().getClassLoader());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActionImpl { { actionType: '");
        sb.append(this.a);
        sb.append("' } { objectName: '");
        sb.append(this.b);
        sb.append("' } { objectUrl: '");
        sb.append(this.c);
        sb.append("' } ");
        if (this.d != null) {
            sb.append("{ objectSameAs: '");
            sb.append(this.d);
            sb.append("' } ");
        }
        if (this.e != null) {
            sb.append("{ metadata: '");
            sb.append(this.e.toString());
            sb.append("' } ");
        }
        if (this.f != null) {
            sb.append("{ actionStatus: '");
            sb.append(this.f);
            sb.append("' } ");
        }
        if (!this.g.isEmpty()) {
            sb.append("{ ");
            sb.append(this.g);
            sb.append(" } ");
        }
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, i, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g, false);
        ivx.b(parcel, a2);
    }
}
