package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: afsw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afsw implements ahcb {
    public final AtomicLong a = new AtomicLong();
    final /* synthetic */ afsx b;
    public final afvd c;
    private final String d;

    public afsw(afsx afsx, String str, afvd afvd) {
        this.b = afsx;
        this.d = str;
        this.c = afvd;
    }

    public final void a() {
        synchronized (afsx.class) {
            if (this.b.d.containsKey(this.d)) {
                this.b.b.execute(new afsv(this));
            }
        }
    }

    public final void a(int i) {
        this.a.getAndAdd((long) i);
        Object[] objArr = {"DownloadProgressMonitor", this.d, Integer.valueOf(i), Long.valueOf(this.a.get())};
    }
}
