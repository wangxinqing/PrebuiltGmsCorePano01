package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.IconCompat;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class IconCompatParcelizer {
    public static IconCompat read(atl atl) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = atl.b(iconCompat.a, 1);
        byte[] bArr = iconCompat.c;
        if (atl.b(2)) {
            bArr = atl.h();
        }
        iconCompat.c = bArr;
        iconCompat.d = atl.b(iconCompat.d, 3);
        iconCompat.e = atl.b(iconCompat.e, 4);
        iconCompat.f = atl.b(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) atl.b((Parcelable) iconCompat.g, 6);
        iconCompat.j = atl.b(iconCompat.j, 7);
        iconCompat.i = PorterDuff.Mode.valueOf(iconCompat.j);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    break;
                } else {
                    byte[] bArr2 = iconCompat.c;
                    iconCompat.b = bArr2;
                    iconCompat.a = 3;
                    iconCompat.e = 0;
                    iconCompat.f = bArr2.length;
                    break;
                }
            case 2:
            case 4:
            case 6:
                iconCompat.b = new String(iconCompat.c, Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.b = iconCompat.c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, atl atl) {
        atl.a(true, true);
        boolean a = atl.a();
        iconCompat.j = iconCompat.i.name();
        switch (iconCompat.a) {
            case -1:
                if (!a) {
                    iconCompat.d = (Parcelable) iconCompat.b;
                    break;
                } else {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
            case 1:
            case 5:
                if (!a) {
                    iconCompat.d = (Parcelable) iconCompat.b;
                    break;
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) iconCompat.b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    iconCompat.c = byteArrayOutputStream.toByteArray();
                    break;
                }
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (i != -1) {
            atl.a(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            atl.c(2);
            atl.a(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            atl.a(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            atl.a(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            atl.a(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            atl.a((Parcelable) colorStateList, 6);
        }
        String str = iconCompat.j;
        if (str != null) {
            atl.a(str, 7);
        }
    }
}
