package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ahhu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahhu {
    public final Executor a;
    public final amzt b = amzy.j();
    public final amzt c = amzy.j();

    public ahhu(Executor executor) {
        this.a = executor;
    }

    public final void a(int i, String str) {
        String[] split = str.split("#");
        amrl.a(split.length == 2);
        this.b.c(new ahht(i, split[0], split[1]));
    }

    public final void b(int i, String str) {
        String[] split = str.split("#");
        amrl.a(split.length == 2);
        this.b.c(new ahhs(i, split[0], split[1]));
    }
}
