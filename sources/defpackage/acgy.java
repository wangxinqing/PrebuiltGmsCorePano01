package defpackage;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: acgy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acgy extends abxs implements niz {
    private final acgh a;
    private final nix b;

    public acgy(LifecycleSynchronizer lifecycleSynchronizer, Context context, String str, boolean z) {
        nix a2 = nix.a(context, lifecycleSynchronizer, acdx.a());
        acad acad = new acad(context);
        acad.a(str, z);
        this.a = new acgh(context, 100, acad);
        this.b = a2;
    }

    public final String a(BootstrapOptions bootstrapOptions) {
        return "";
    }

    public final void a(abxq abxq) {
    }

    public final void a(abxq abxq, abxn abxn) {
    }

    public final void a(abxq abxq, BootstrapOptions bootstrapOptions, abxn abxn) {
    }

    public final void a(abxq abxq, BootstrapOptions bootstrapOptions, ParcelFileDescriptor[] parcelFileDescriptorArr, abwu abwu) {
    }

    public final void b(abxq abxq) {
    }

    public final void c(abxq abxq) {
    }

    public final void d(abxq abxq) {
    }

    public final void e(abxq abxq) {
    }

    public final void f(abxq abxq) {
    }

    public final void b(acgz acgz) {
        this.b.a(new acgx(acgz, this.a));
    }

    public final void b(acgz acgz, HandshakeData handshakeData) {
        this.b.a(new acgu(acgz, this.a, handshakeData));
    }

    public final void a(acgz acgz) {
        this.b.a(new acgv(acgz, this.a));
    }

    public final void a(acgz acgz, HandshakeData handshakeData) {
        this.b.a(new acgw(acgz, this.a, handshakeData));
    }
}
