package defpackage;

import java.util.concurrent.Callable;

/* renamed from: unh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class unh implements Callable {
    private final uoh a;
    private final unt b;
    private final String c;
    private final int d;

    public unh(uoh uoh, unt unt, String str, int i) {
        this.a = uoh;
        this.b = unt;
        this.c = str;
        this.d = i;
    }

    public final Object call() {
        uoh uoh = this.a;
        unt unt = this.b;
        String str = this.c;
        int i = this.d;
        if (urt.SUCCESS == uoh.f.b(unt)) {
            return urt.SUCCESS;
        }
        throw new RuntimeException(String.format("Failed to connect to Wifi hotspot (%s, %s).", new Object[]{str, Integer.valueOf(i)}));
    }
}
