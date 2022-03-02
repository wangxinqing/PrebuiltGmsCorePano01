package defpackage;

import android.os.Process;

/* renamed from: yaj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yaj implements Runnable {
    final /* synthetic */ yak a;

    public yaj(yak yak) {
        this.a = yak;
    }

    public final void run() {
        xvp xvp;
        Thread thread;
        Process.setThreadPriority(10);
        try {
            yak yak = this.a;
            yak.b.a(yak.c);
            yak yak2 = this.a;
            xvp = yak2.d;
            thread = yak2.a;
        } catch (xye e) {
            xvp.c(this.a.a);
            this.a.d.a(e.a);
            yak yak3 = this.a;
            xvp = yak3.d;
            thread = yak3.a;
        } catch (Exception e2) {
            xvp.c(this.a.a);
            this.a.d.a(e2);
            yak yak4 = this.a;
            xvp = yak4.d;
            thread = yak4.a;
        } catch (Throwable th) {
            yak yak5 = this.a;
            yak5.d.b(yak5.a);
            this.a.a = null;
            throw th;
        }
        xvp.b(thread);
        this.a.a = null;
    }
}
