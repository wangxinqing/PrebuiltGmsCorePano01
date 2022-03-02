package defpackage;

import android.os.Process;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xyj implements Runnable {
    final /* synthetic */ yaq a;
    final /* synthetic */ yaq b;
    final /* synthetic */ xyl c;

    public xyj(xyl xyl, yaq yaq, yaq yaq2) {
        this.c = xyl;
        this.a = yaq;
        this.b = yaq2;
    }

    public final void run() {
        xvp xvp;
        Thread thread;
        yao a2;
        Process.setThreadPriority(10);
        try {
            xyl xyl = this.c;
            yaq yaq = this.a;
            yaq yaq2 = this.b;
            ArrayList arrayList = new ArrayList();
            xip.a();
            int intValue = Integer.valueOf((int) ayrj.a.a().l()).intValue();
            while (true) {
                xyl.c.a();
                a2 = yaq.a();
                amzy a3 = a2.a();
                int size = a3.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(a3.get(i));
                    if (arrayList.size() >= intValue) {
                        xyl.a((List) arrayList, yaq2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    xyl.a((List) arrayList, yaq2);
                }
                if (a2.c()) {
                    break;
                }
                yaq2.a(a2.b());
            }
            yaq2.b(a2.b());
            xyl xyl2 = this.c;
            xvp = xyl2.c;
            thread = xyl2.d;
        } catch (xye e) {
            xvp.c(this.c.d);
            this.c.c.a(e.a);
            xyl xyl3 = this.c;
            xvp = xyl3.c;
            thread = xyl3.d;
        } catch (Exception e2) {
            xvp.c(this.c.d);
            this.c.c.a(e2);
            xyl xyl4 = this.c;
            xvp = xyl4.c;
            thread = xyl4.d;
        } catch (Throwable th) {
            xyl xyl5 = this.c;
            xyl5.c.b(xyl5.d);
            this.c.d = null;
            throw th;
        }
        xvp.b(thread);
        this.c.d = null;
    }
}
