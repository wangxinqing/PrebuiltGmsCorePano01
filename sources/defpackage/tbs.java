package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* renamed from: tbs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tbs extends FileOutputStream implements ahbo, ahav {
    private final ParcelFileDescriptor a;

    public tbs(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor.getFileDescriptor());
        this.a = parcelFileDescriptor;
    }

    public final void a() {
        getFD().sync();
    }

    public final FileChannel b() {
        return getChannel();
    }

    public final void close() {
        try {
            super.close();
        } finally {
            this.a.close();
        }
    }
}
