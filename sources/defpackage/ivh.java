package defpackage;

import android.content.Context;
import java.util.Random;
import java.util.Set;

/* renamed from: ivh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ivh {
    private static final Set e = jir.a((Object[]) ((String) iks.f.c()).split(","));
    public final int a;
    public final String b;
    public final iyc c;
    public byte[] d;
    private final Random f = new Random(System.currentTimeMillis());

    public ivh(int i, String str, iyc iyc) {
        this.a = i;
        this.b = str;
        this.c = iyc;
    }

    public final void a(Context context, int i) {
        if (axci.a.a().a() && jij.a(context, false) && this.f.nextDouble() < axci.a.a().b() && !e.contains(this.b)) {
            new jfx(10, new ivg(this, context, i)).start();
        }
    }
}
