package defpackage;

import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: irb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class irb implements awdt {
    private final ira a;

    public irb(ira ira) {
        this.a = ira;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        GetServiceRequest getServiceRequest = this.a.a;
        awdx.a((Object) getServiceRequest, "Cannot return null from a non-@Nullable @Provides method");
        return getServiceRequest;
    }
}
