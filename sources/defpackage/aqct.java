package defpackage;

import java.util.Collection;
import java.util.logging.Level;

/* renamed from: aqct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqct extends anjf {
    private final Collection a;

    public aqct(String str, Collection collection) {
        super(str);
        this.a = collection;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List, java.util.Collection] */
    public final void a(anir anir) {
        ? r0 = this.a;
        int size = r0.size();
        for (int i = 0; i < size; i++) {
            anis anis = (anis) r0.get(i);
            if (anir.j() || anis.a(anir.c())) {
                anis.a(anir);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List, java.util.Collection] */
    public final boolean a(Level level) {
        ? r0 = this.a;
        int size = r0.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((anis) r0.get(i)).a(level)) {
                return true;
            }
            i = i2;
        }
        return false;
    }
}
