package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: pdw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pdw implements pjl {
    private final ifu a;
    private final byte[] b;
    private final aeqd c;

    public pdw(ifu ifu, byte[] bArr, aeqd aeqd) {
        this.a = ifu;
        this.b = bArr;
        this.c = aeqd;
    }

    public final void a() {
        try {
            this.c.h = (auke) aucj.a((aucj) auke.b, this.b);
            this.a.a(Status.a);
        } catch (auda e) {
            this.a.a(pku.a(getClass().getSimpleName(), "Serialized ChannelConfigList cannot be parsed."));
        }
    }

    public final void a(Status status) {
        this.a.a(status);
    }
}
