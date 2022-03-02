package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: acgt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acgt extends abxg implements niz {
    private final acgh a;
    private final nix b;

    public acgt(LifecycleSynchronizer lifecycleSynchronizer, Context context, String str, boolean z) {
        this.b = nix.a(context, lifecycleSynchronizer, acdx.a());
        acad acad = new acad(context);
        acad.a(str, z);
        this.a = new acgh(context, 200, acad);
    }

    public final void a(abxe abxe) {
    }

    public final void a(abxe abxe, abxk abxk) {
    }

    public final void a(abxe abxe, Bundle bundle) {
    }

    public final void a(abxe abxe, BootstrapConfigurations bootstrapConfigurations) {
    }

    public final void a(abxe abxe, BootstrapConfigurations bootstrapConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, abwu abwu) {
    }

    public final void a(abxe abxe, D2DDevice d2DDevice, BootstrapConfigurations bootstrapConfigurations, abwy abwy) {
    }

    public final void a(abxe abxe, D2DDevice d2DDevice, String str, abxb abxb) {
    }

    public final void a(abxe abxe, String str) {
    }

    public final void a(ConnectParams connectParams) {
    }

    public final void b(abxe abxe) {
    }

    public final void b(abxe abxe, Bundle bundle) {
    }

    public final void c(abxe abxe) {
    }

    public final void d(abxe abxe) {
    }

    public final void b(acgz acgz, HandshakeData handshakeData) {
        this.b.a(new acgq(acgz, this.a, handshakeData));
    }

    public final void a(acgz acgz) {
        this.b.a(new acgr(acgz, this.a));
    }

    public final void a(acgz acgz, HandshakeData handshakeData) {
        this.b.a(new acgs(acgz, handshakeData, this.a));
    }
}
