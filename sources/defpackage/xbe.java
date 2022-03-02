package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;

/* renamed from: xbe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xbe implements wlj {
    private final Status a;
    private final ParcelFileDescriptor b;

    public xbe(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = status;
        this.b = parcelFileDescriptor;
    }

    public final Status aO() {
        return this.a;
    }

    public final ParcelFileDescriptor b() {
        return this.b;
    }

    public final void c() {
        ParcelFileDescriptor parcelFileDescriptor = this.b;
        if (parcelFileDescriptor != null) {
            jjt.a(parcelFileDescriptor);
        }
    }
}
