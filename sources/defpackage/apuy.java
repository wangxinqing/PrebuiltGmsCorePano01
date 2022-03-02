package defpackage;

import com.google.firebase.auth.api.model.ProviderUserInfoList;

/* renamed from: apuy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apuy implements apth {
    public String a;
    public ProviderUserInfoList b;
    public String c;
    public String d;
    public long e;

    public final auef a() {
        return (auef) almq.i.c(7);
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        if (audx instanceof almq) {
            almq almq = (almq) audx;
            this.a = jlh.b(almq.a);
            jlh.b(almq.h);
            jlh.b(almq.b);
            jlh.b(almq.e);
            this.b = ProviderUserInfoList.a(almq.d);
            this.c = jlh.b(almq.c);
            this.d = jlh.b(almq.f);
            this.e = almq.g;
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of SetAccountInfoResponse.");
    }
}
