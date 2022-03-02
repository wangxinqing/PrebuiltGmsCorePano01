package defpackage;

import java.io.InvalidObjectException;

/* renamed from: akme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akme {
    public static akmd a(assj assj) {
        int i = 1;
        if (assj.a.size() == 1) {
            asve asve = (asve) assj.a.get(0);
            akmc akmc = new akmc();
            int a = assg.a(assj.b);
            if (a != 0) {
                i = a;
            }
            akmd akmd = new akmd(asve, i, akmc);
            if (akmd.b != null && !akmd.a.isEmpty()) {
                return akmd;
            }
            aklz.a().c("Invalid model");
            throw new InvalidObjectException("Failed to load model");
        }
        throw new InvalidObjectException("No model weights found in proto");
    }
}
