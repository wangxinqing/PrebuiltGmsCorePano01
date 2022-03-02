package com.google.android.gms.appdatasearch;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UsageInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dup();
    public final DocumentId a;
    public final long b;
    public int c;
    public final String d;
    public final DocumentContents e;
    public final boolean f;
    int g;
    public int h;
    public final String i;

    public UsageInfo(DocumentId documentId, long j, int i2, String str, DocumentContents documentContents, boolean z, int i3, int i4, String str2) {
        this.a = documentId;
        this.b = j;
        this.c = i2;
        this.d = str;
        this.e = documentContents;
        this.f = z;
        this.g = i3;
        this.h = i4;
        this.i = str2;
    }

    public static DocumentSection a(Uri uri) {
        String uri2 = uri.toString();
        dtn dtn = new dtn("web_url");
        dtn.b = true;
        dtn.f = "url";
        return new DocumentSection(uri2, dtn.a());
    }

    public final String toString() {
        return String.format(Locale.US, "UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.h)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i2, false);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, i2, false);
        ivx.a(parcel, 6, this.f);
        ivx.b(parcel, 7, this.g);
        ivx.b(parcel, 8, this.h);
        ivx.a(parcel, 9, this.i, false);
        ivx.b(parcel, a2);
    }

    public static DocumentSection a(String str) {
        dtn dtn = new dtn("title");
        dtn.d = true;
        dtn.f = "name";
        return new DocumentSection(str, dtn.a());
    }

    public static DocumentSection a(String str, String str2) {
        dtn dtn = new dtn(str);
        dtn.b = true;
        return new DocumentSection(str2, dtn.a());
    }
}
