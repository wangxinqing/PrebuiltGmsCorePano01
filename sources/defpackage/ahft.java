package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ahft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahft implements aoqb {
    private final ahfu a;
    private final aoqb b;
    private final Executor c;

    public ahft(ahfu ahfu, aoqb aoqb, Executor executor) {
        this.a = ahfu;
        this.b = aoqb;
        this.c = executor;
    }

    public final aorr a(Object obj) {
        ahfu ahfu = this.a;
        Void voidR = (Void) obj;
        return ahfu.a.b.a(this.b, this.c);
    }
}
