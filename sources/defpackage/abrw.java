package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;

/* renamed from: abrw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abrw extends nis {
    public final abxe a;
    public final absf b;
    public final BootstrapConfigurations c;
    public final ParcelFileDescriptor[] d;
    public final abwu e;
    private final Handler f;

    public abrw(abxe abxe, BootstrapConfigurations bootstrapConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, abwu abwu, absf absf, Handler handler) {
        super(75, "StartDirectTransferOperation");
        this.a = abxe;
        this.b = absf;
        this.c = bootstrapConfigurations;
        this.d = parcelFileDescriptorArr;
        this.e = abwu;
        this.f = handler;
    }

    public final void a(Context context) {
        this.f.post(new abrv(this));
    }

    public final void a(Status status) {
        this.a.i(status);
    }
}
