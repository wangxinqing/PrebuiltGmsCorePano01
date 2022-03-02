package defpackage;

import com.google.firebase.auth.api.model.MfaInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: apua  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apua implements apth {
    public String a;
    public String b;
    public boolean c;
    public long d;
    public List e;
    public String f;

    public final auef a() {
        return (auef) alma.i.c(7);
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        if (audx instanceof alma) {
            alma alma = (alma) audx;
            jlh.b(alma.e);
            jlh.b(alma.b);
            this.a = jlh.b(alma.a);
            this.b = jlh.b(alma.c);
            this.c = alma.f;
            this.d = alma.d;
            this.e = new ArrayList();
            aucx aucx = alma.h;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                this.e.add(MfaInfo.a((alnh) aucx.get(i)));
            }
            this.f = alma.g;
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of EmailLinkSigninResponse.");
    }
}
