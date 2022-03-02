package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: aknt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aknt implements aknx {
    private final List a;

    public aknt(aknx... aknxArr) {
        this.a = Arrays.asList(aknxArr);
    }

    public final ou a(akln akln) {
        ou ouVar = new ou();
        for (aknx a2 : this.a) {
            ouVar.a(a2.a(akln));
        }
        return ouVar;
    }
}
