package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;

/* renamed from: abuz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abuz extends nis {
    public final BootstrapOptions a;
    public final ParcelFileDescriptor[] b;
    public final abvc c;
    public final abxq d;
    public final abwu e;
    private final Handler f;

    public abuz(abxq abxq, abvc abvc, BootstrapOptions bootstrapOptions, ParcelFileDescriptor[] parcelFileDescriptorArr, abwu abwu, Handler handler) {
        super(76, "StartDirectTransferOperation");
        this.a = bootstrapOptions;
        this.b = parcelFileDescriptorArr;
        this.e = abwu;
        this.c = abvc;
        this.d = abxq;
        this.f = handler;
    }

    public final void a(Context context) {
        this.f.post(new abuy(this));
    }

    public final void a(Status status) {
        this.d.d(status);
    }
}
