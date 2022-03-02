package com.google.android.gms.nearby.sharing;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class FileAttachment extends Attachment {
    public static final Parcelable.Creator CREATOR = new vjb();
    public final String a;
    public final int b;
    public final long c;
    public final Uri d;
    public final Bundle e;
    public final String f;

    public FileAttachment(String str, int i, long j, Uri uri, Bundle bundle, String str2) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = uri;
        this.e = bundle;
        this.f = str2;
    }

    public final long a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FileAttachment) {
            FileAttachment fileAttachment = (FileAttachment) obj;
            return ius.a(this.a, fileAttachment.a) && ius.a(Integer.valueOf(this.b), Integer.valueOf(fileAttachment.b)) && ius.a(Long.valueOf(this.c), Long.valueOf(fileAttachment.c)) && ius.a(this.d, fileAttachment.d) && ius.a(this.f, fileAttachment.f);
        }
    }

    public final int f() {
        return 2;
    }

    public final int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.a;
        objArr[1] = Integer.valueOf(this.b);
        objArr[2] = Long.valueOf(this.c);
        int i = this.d;
        objArr[3] = i;
        if (this.f == null) {
            i = 0;
        }
        objArr[4] = i;
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        return String.format(Locale.US, "FileAttachment<fileName: %s, type: %s, size: %s, uri: %s, mimeType: %s>", new Object[]{this.a, Integer.valueOf(this.b), Long.valueOf(this.c), this.d, this.f});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.b(parcel, a2);
    }
}
