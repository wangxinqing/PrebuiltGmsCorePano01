package com.google.android.gms.common.download;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class DownloadDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ipn();
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;

    public DownloadDetails(ipm ipm) {
        boolean z;
        long j = ipm.c;
        boolean z2 = true;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder(58);
        sb.append("sizeBytes (");
        sb.append(j);
        sb.append(") must be greater than zero");
        iva.b(z, sb.toString());
        int i = ipm.f;
        int i2 = ipm.g;
        z2 = i > i2 ? false : z2;
        StringBuilder sb2 = new StringBuilder(88);
        sb2.append("The minVersion (");
        sb2.append(i);
        sb2.append(") must be less than or equal to the maxVersion (");
        sb2.append(i2);
        sb2.append(").");
        iva.b(z2, sb2.toString());
        String str = ipm.a;
        iva.a((Object) str);
        this.a = str;
        String str2 = ipm.b;
        iva.a((Object) str2);
        this.b = str2;
        this.c = ipm.c;
        String str3 = ipm.d;
        iva.a((Object) str3);
        this.d = str3;
        this.e = ipm.e;
        this.f = ipm.f;
        this.g = ipm.g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DownloadDetails)) {
            return false;
        }
        DownloadDetails downloadDetails = (DownloadDetails) obj;
        if (!this.a.equals(downloadDetails.a) || !this.b.equals(downloadDetails.b) || this.c != downloadDetails.c || !this.d.equals(downloadDetails.d)) {
            return false;
        }
        String str = this.e;
        return ((str == null && downloadDetails.e == null) || str.equals(downloadDetails.e)) && this.f == downloadDetails.f && this.g == downloadDetails.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), Integer.valueOf(this.g)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d, false);
        ivx.a(parcel, 6, this.e, false);
        ivx.b(parcel, 7, this.f);
        ivx.b(parcel, 8, this.g);
        ivx.b(parcel, a2);
    }

    @Deprecated
    public DownloadDetails(String str, String str2, long j, String str3, String str4, int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder(88);
        sb.append("The minVersion (");
        sb.append(i);
        sb.append(") must be less than or equal to the maxVersion (");
        sb.append(i2);
        sb.append(").");
        iva.b(z, sb.toString());
        z2 = j <= 0 ? false : z2;
        StringBuilder sb2 = new StringBuilder(58);
        sb2.append("sizeBytes (");
        sb2.append(j);
        sb2.append(") must be greater than zero");
        iva.b(z2, sb2.toString());
        iva.a((Object) str);
        this.a = str;
        iva.a((Object) str2);
        this.b = str2;
        this.c = j;
        iva.a((Object) str3);
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = i2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DownloadDetails(org.json.JSONObject r11) {
        /*
            r10 = this;
            java.lang.String r0 = "filename"
            java.lang.String r2 = r11.getString(r0)
            java.lang.String r0 = "url"
            java.lang.String r3 = r11.getString(r0)
            java.lang.String r0 = "sizeBytes"
            long r4 = r11.getLong(r0)
            java.lang.String r0 = "sha1"
            java.lang.String r6 = r11.getString(r0)
            java.lang.String r0 = "destination"
            boolean r1 = r11.has(r0)
            if (r1 == 0) goto L_0x0026
            java.lang.String r0 = r11.getString(r0)
            r7 = r0
            goto L_0x0028
        L_0x0026:
            r0 = 0
            r7 = r0
        L_0x0028:
            java.lang.String r0 = "minVersion"
            boolean r1 = r11.has(r0)
            if (r1 == 0) goto L_0x0037
            int r0 = r11.getInt(r0)
            r8 = r0
            goto L_0x0039
        L_0x0037:
            r0 = 0
            r8 = 0
        L_0x0039:
            java.lang.String r0 = "maxVersion"
            boolean r1 = r11.has(r0)
            if (r1 == 0) goto L_0x0048
            int r11 = r11.getInt(r0)
            r9 = r11
            goto L_0x004e
        L_0x0048:
            r11 = 2147483647(0x7fffffff, float:NaN)
            r9 = 2147483647(0x7fffffff, float:NaN)
        L_0x004e:
            r1 = r10
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.download.DownloadDetails.<init>(org.json.JSONObject):void");
    }
}
