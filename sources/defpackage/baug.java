package defpackage;

import android.os.ParcelFileDescriptor;
import java.nio.channels.FileChannel;

/* renamed from: baug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baug implements baui {
    final /* synthetic */ ParcelFileDescriptor a;

    public baug(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    public final FileChannel a() {
        if (this.a.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(this.a).getChannel();
        }
        this.a.close();
        throw new IllegalArgumentException("Not a file: " + this.a);
    }
}
