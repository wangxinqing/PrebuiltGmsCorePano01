package defpackage;

import java.io.IOException;

/* renamed from: afow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afow implements aoqb {
    private final afpf a;

    public afow(afpf afpf) {
        this.a = afpf;
    }

    public final aorr a(Object obj) {
        afpf afpf = this.a;
        if (((Boolean) obj).booleanValue()) {
            return aorl.a((Object) true);
        }
        afpf.b.b(1036);
        return aorl.a((Throwable) new IOException("Failed to commit new group metadata to disk."));
    }
}
