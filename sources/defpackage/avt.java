package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: avt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avt {
    private final List a = new ArrayList();

    public final void a(Path path) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            bbb.a(path, (awk) this.a.get(size));
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(awk awk) {
        this.a.add(awk);
    }
}
