package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.directtransfer.DirectTransferOptions;

/* renamed from: acfc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acfc extends nis {
    public final DirectTransferOptions a;
    public final ParcelFileDescriptor[] b;
    public final abvc c;
    public final acfg d;
    public final abwu e;
    private final Handler f;

    public acfc(acfg acfg, abvc abvc, DirectTransferOptions directTransferOptions, ParcelFileDescriptor[] parcelFileDescriptorArr, abwu abwu, Handler handler) {
        super(211, "StartDirectTransferOperation");
        this.a = directTransferOptions;
        this.b = parcelFileDescriptorArr;
        this.e = abwu;
        this.c = abvc;
        this.d = acfg;
        this.f = handler;
    }

    public final void a(Context context) {
        this.f.post(new acfb(this));
    }

    public final void a(Status status) {
        this.d.a(status);
    }
}
