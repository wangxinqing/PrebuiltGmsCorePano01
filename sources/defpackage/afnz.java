package defpackage;

import java.io.IOException;

/* renamed from: afnz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afnz implements aoqb {
    private final afpf a;
    private final boolean b;
    private final afkr c;

    public afnz(afpf afpf, boolean z, afkr afkr) {
        this.a = afpf;
        this.b = z;
        this.c = afkr;
    }

    public final aorr a(Object obj) {
        afpf afpf = this.a;
        boolean z = this.b;
        afkr afkr = this.c;
        if (!((Boolean) obj).booleanValue()) {
            afpf.b.b(1036);
            return aorl.a((Throwable) new IOException("Unable to update file group metadata"));
        }
        if (z) {
            afpf.b.a(1072, afkr.c, afkr.e);
        }
        return aorl.a((Object) null);
    }
}
