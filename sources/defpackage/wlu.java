package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.FileInputStream;

/* renamed from: wlu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wlu {
    public static Bitmap a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
        try {
            return BitmapFactory.decodeStream(fileInputStream);
        } finally {
            jjt.a((Closeable) fileInputStream);
        }
    }
}
