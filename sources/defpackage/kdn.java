package defpackage;

import java.util.Arrays;

/* renamed from: kdn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kdn {
    private static final ith a = new ith("CompletionHandler", "");
    private final ksw b;
    private final kkf c;

    public kdn(ksw ksw, kkf kkf) {
        iva.a((Object) ksw);
        this.b = ksw;
        iva.a((Object) kkf);
        this.c = kkf;
    }

    /* access modifiers changed from: protected */
    public final void a(int i, kdm kdm) {
        String str;
        String str2;
        kdm kdm2 = kdm;
        kdo kdo = kdm2.a;
        if (kdo.c) {
            String str3 = kdm2.f.a.a;
            if (!kdo.d) {
                str = str3;
            } else {
                str = null;
            }
            if (i == 2) {
                String str4 = kdm2.c;
                if (str4 == null) {
                    a.c("CompletionHandler", "Conflict without baseContentHash!");
                }
                str2 = str4;
            } else {
                str2 = null;
            }
            String str5 = "CompletionHandler";
            ksp ksp = new ksp(kdm2.b, str, str3, str2, kdm2.d, kdm2.e, kdo.e, Arrays.asList(new kaj[]{kdm2.h}), i, kdo.f);
            try {
                khq khq = kdm2.f;
                this.c.a(khq, kdm2.g);
                this.b.a(ksp, khq);
            } catch (kcs e) {
                a.c(str5, String.format("Could not get Entry: %s", new Object[]{kdm2.g}), e);
            }
        }
    }
}
