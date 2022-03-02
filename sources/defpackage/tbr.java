package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

/* renamed from: tbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tbr extends FileInputStream implements ahbn, ahav {
    private final ParcelFileDescriptor a;

    public tbr(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor.getFileDescriptor());
        this.a = parcelFileDescriptor;
    }

    public final Long a() {
        return Long.valueOf(this.a.getStatSize());
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
