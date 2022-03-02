package defpackage;

import java.util.logging.Level;

/* renamed from: anjy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anjy extends aniy {
    private final anjw a;
    private final anka b;
    private final anjx c;
    private final anix d;

    public anjy() {
        anjw anjw = (anjw) ankt.a("flogger.backend_factory", anjw.class);
        this.a = anjw == null ? ankb.a : anjw;
        anka anka = (anka) ankt.a("flogger.logging_context", anka.class);
        this.b = anka == null ? anjz.a : anka;
        anjx anjx = (anjx) ankt.a("flogger.clock", anjx.class);
        this.c = anjx == null ? ankd.a : anjx;
        this.d = ankc.a;
    }

    /* access modifiers changed from: protected */
    public final anis b(String str) {
        return this.a.a(str);
    }

    /* access modifiers changed from: protected */
    public final anix b() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public final anjc d() {
        return this.b.a();
    }

    /* access modifiers changed from: protected */
    public final long f() {
        return this.c.a();
    }

    /* access modifiers changed from: protected */
    public final String h() {
        String name = getClass().getName();
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.b);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(name).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Platform: ");
        sb.append(name);
        sb.append("\nBackendFactory: ");
        sb.append(valueOf);
        sb.append("\nClock: ");
        sb.append(valueOf2);
        sb.append("\nLoggingContext: ");
        sb.append(valueOf3);
        sb.append("\nLogCallerFinder: ");
        sb.append(valueOf4);
        sb.append("\n");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final boolean b(String str, Level level, boolean z) {
        return this.b.b();
    }
}
