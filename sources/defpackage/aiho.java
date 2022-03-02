package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: aiho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiho {
    public final Deque a = new ArrayDeque();

    /* access modifiers changed from: package-private */
    public final void a() {
        this.a.clear();
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i) {
        return !this.a.isEmpty() && i == ((aihn) this.a.getFirst()).b;
    }
}
