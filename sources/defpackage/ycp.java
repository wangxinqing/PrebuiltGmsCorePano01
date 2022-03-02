package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ycp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ycp {
    public static final ycp a = new ycp();
    public static final AtomicInteger b = new AtomicInteger();

    public static void a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            int i = Build.VERSION.SDK_INT;
            int fd = parcelFileDescriptor.getFd();
            StringBuilder sb = new StringBuilder(11);
            sb.append(fd);
            sb.toString();
        }
    }

    public final yco[] a() {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        yco[] ycoArr = new yco[2];
        for (int i = 0; i < 2; i++) {
            ycoArr[i] = new yco(createPipe[i]);
        }
        return ycoArr;
    }
}
