package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DocumentSection extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dsp();
    public static final int a = Integer.parseInt("-1");
    public static final RegisterSectionInfo b;
    public final String c;
    public final RegisterSectionInfo d;
    public final int e;
    public final byte[] f;

    static {
        dtn dtn = new dtn("SsbContext");
        dtn.b = true;
        dtn.a = "blob";
        b = dtn.a();
    }

    public DocumentSection(String str, RegisterSectionInfo registerSectionInfo) {
        this(str, registerSectionInfo, a, (byte[]) null);
    }

    public final String a() {
        int i = this.e;
        if (i != a && dtb.a(i) == null) {
            int i2 = this.e;
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid section type ");
            sb.append(i2);
            return sb.toString();
        } else if (this.c == null || this.f == null) {
            return null;
        } else {
            return "Both content and blobContent set";
        }
    }

    public DocumentSection(String str, RegisterSectionInfo registerSectionInfo, int i, byte[] bArr) {
        boolean z = true;
        if (i != a && dtb.a(i) == null) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid section type ");
        sb.append(i);
        iva.b(z, sb.toString());
        this.c = str;
        this.d = registerSectionInfo;
        this.e = i;
        this.f = bArr;
        String a2 = a();
        if (a2 != null) {
            throw new IllegalArgumentException(a2);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.c, false);
        ivx.a(parcel, 3, this.d, i, false);
        ivx.b(parcel, 4, this.e);
        ivx.a(parcel, 5, this.f, false);
        ivx.b(parcel, a2);
    }

    public DocumentSection(byte[] bArr, RegisterSectionInfo registerSectionInfo) {
        this((String) null, registerSectionInfo, a, bArr);
    }
}
