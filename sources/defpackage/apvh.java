package defpackage;

import android.text.TextUtils;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.model.MfaInfo;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: apvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apvh implements apth {
    public boolean a;
    public String b;
    public String c;
    public long d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public String i;
    public String j;
    public List k;
    public String l;
    private String m;
    private String n;
    private String o;
    private String p;

    public final auef a() {
        return (auef) almy.t.c(7);
    }

    public final boolean b() {
        return !TextUtils.isEmpty(this.l);
    }

    public final DefaultOAuthCredential c() {
        if (TextUtils.isEmpty(this.m) && TextUtils.isEmpty(this.n)) {
            return null;
        }
        String str = this.f;
        String str2 = this.n;
        String str3 = this.m;
        String str4 = this.p;
        String str5 = this.o;
        iva.a(str, (Object) "Must specify a non-empty providerId");
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new DefaultOAuthCredential(str, str2, str3, (VerifyAssertionRequest) null, str4, str5, (String) null);
        }
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        if (audx instanceof almy) {
            almy almy = (almy) audx;
            this.a = almy.g;
            this.b = jlh.b(almy.f);
            this.c = jlh.b(almy.j);
            this.d = almy.k;
            jlh.b(almy.d);
            this.e = jlh.b(almy.b);
            jlh.b(almy.e);
            jlh.b(almy.c);
            this.f = jlh.b(almy.a);
            this.g = jlh.b(almy.m);
            this.h = almy.o;
            this.m = almy.h;
            this.n = almy.l;
            this.i = jlh.b(almy.n);
            this.p = jlh.b(almy.p);
            this.j = jlh.b(almy.q);
            this.k = new ArrayList();
            aucx aucx = almy.s;
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.k.add(MfaInfo.a((alnh) aucx.get(i2)));
            }
            this.l = jlh.b(almy.r);
            this.o = jlh.b(almy.i);
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of VerifyAssertionResponse.");
    }
}
