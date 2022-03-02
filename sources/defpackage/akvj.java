package defpackage;

import java.util.concurrent.Callable;

/* renamed from: akvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akvj implements Callable {
    final /* synthetic */ akvl a;
    private final String b;

    public akvj(akvl akvl, String str) {
        this.a = akvl;
        this.b = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        akhy akhy = null;
        if (this.b != null && azbz.b()) {
            akio akio = this.a.k;
            String str = this.b;
            akjy akjy = (akjy) akio;
            if (!akjy.d) {
                aklz.a();
                return null;
            } else if (str != null) {
                akje akje = (akje) akjy.c.get(str);
                if (akje != null) {
                    akhy = akje.a();
                }
                if (akhy == null) {
                    return akjy.a(akjy.e.a());
                }
                return akjy.a(akhy);
            } else {
                aklz.a().c("Account name cannot be null.");
                return null;
            }
        } else {
            akjy akjy2 = (akjy) this.a.k;
            if (akjy2.d) {
                return akjy2.a(akjy2.e.a());
            }
            aklz.a();
            return null;
        }
    }
}
