package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: uen  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uen extends ugz {
    private final idg a;

    public uen(idg idg) {
        iva.a((Object) idg);
        this.a = idg;
    }

    public final void a(int i) {
        Status b = ueq.b(i);
        if (b.c()) {
            this.a.a((Object) b);
        } else {
            this.a.a(b);
        }
    }
}
