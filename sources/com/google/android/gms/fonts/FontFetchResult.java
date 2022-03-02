package com.google.android.gms.fonts;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FontFetchResult extends AbstractSafeParcelable implements icl {
    public static final Parcelable.Creator CREATOR = new nft();
    private static final Status f = new Status(8, "File missing");
    private static final Status g = new Status(8, "Unable to get FD");
    final int a;
    public final Status b;
    public final String c;
    public final ParcelFileDescriptor d;
    public final FontMatchSpec e;

    public FontFetchResult(int i, Status status, String str, ParcelFileDescriptor parcelFileDescriptor, FontMatchSpec fontMatchSpec) {
        boolean z;
        String str2;
        this.a = i;
        iva.a((Object) status, (Object) "status");
        this.b = status;
        this.c = str;
        this.d = parcelFileDescriptor;
        this.e = fontMatchSpec;
        if (i >= 2) {
            boolean c2 = status.c();
            boolean z2 = false;
            if (fontMatchSpec != null) {
                z = false;
            } else {
                z = true;
            }
            z2 = c2 != z ? true : z2;
            if (!status.c()) {
                str2 = "";
            } else {
                str2 = "not ";
            }
            String valueOf = String.valueOf(status);
            StringBuilder sb = new StringBuilder(str2.length() + 22 + String.valueOf(valueOf).length());
            sb.append("spec must be ");
            sb.append(str2);
            sb.append("null for ");
            sb.append(valueOf);
            iva.a(z2, (Object) sb.toString());
        }
    }

    public static FontFetchResult a(Status status) {
        iva.a((Object) status, (Object) "failureStatus");
        boolean c2 = status.c();
        String valueOf = String.valueOf(status);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("Failure status cannot be successful: ");
        sb.append(valueOf);
        iva.a(!c2, (Object) sb.toString());
        return new FontFetchResult(2, status, (String) null, (ParcelFileDescriptor) null, (FontMatchSpec) null);
    }

    public final Status aO() {
        return this.b;
    }

    public final String toString() {
        return String.format("{%s, %s, %s}", new Object[]{this.b, this.c, this.d});
    }

    public static FontFetchResult a(FontMatchSpec fontMatchSpec, File file) {
        String str;
        iva.a((Object) fontMatchSpec, (Object) "spec");
        iva.a((Object) file, (Object) "file");
        if (!file.exists()) {
            return a(f);
        }
        try {
            ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
            if (!jkr.c()) {
                str = file.getAbsolutePath();
            } else {
                str = null;
            }
            return new FontFetchResult(2, Status.a, str, open, fontMatchSpec);
        } catch (FileNotFoundException e2) {
            return a(g);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.a(parcel, 5, this.e, i, false);
        ivx.b(parcel, a2);
    }
}
