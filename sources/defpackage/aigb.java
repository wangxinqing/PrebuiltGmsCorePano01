package defpackage;

import android.location.Location;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.List;

/* renamed from: aigb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aigb extends aifz implements ajbh {
    final /* synthetic */ aigf b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aigb(aigf aigf) {
        super(aigf);
        this.b = aigf;
    }

    public final void E() {
        aigf aigf = this.b;
        aigf.b = 3;
        a(aigf.g);
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
        int a = activityRecognitionResult.a().a();
        if (a == 0 || a == 1) {
            aigf aigf = this.b;
            aigf.b = 1;
            a(aigf.i);
        } else if (a == 2) {
            aigf aigf2 = this.b;
            aigf2.b = 2;
            a(aigf2.g);
        }
    }

    public final void b() {
        aige aige = this.b.j;
        if (aige != null) {
            aicr aicr = (aicr) aige;
            if (!aicr.d && aicr.c) {
                aicr.b.a(26, aicr.a.a);
                aicr.d = true;
                ((aigg) aige).f();
            }
        }
        aigf aigf = this.b;
        aije aije = aigf.c;
        Looper looper = aigf.d;
        aije.a = this;
        aije.b = new qvr(looper);
        this.b.c.b();
        aigf aigf2 = this.b;
        aigf2.b = 0;
        aigf2.m = SystemClock.elapsedRealtime();
    }

    public final void c() {
        this.b.c.e();
        aige aige = this.b.j;
        if (aige != null) {
            aicr aicr = (aicr) aige;
            if (aicr.d) {
                aicr.b.a(27, aicr.a.b);
                aicr.d = false;
                ((aigg) aige).f();
            }
        }
        this.b.a = 0;
    }

    public final void d() {
        a(this.b.g);
    }

    public final void a(List list) {
        if (((double) ((Location) list.get(list.size() - 1)).getSpeed()) >= ayaw.d()) {
            aigf aigf = this.b;
            aigf.b = 4;
            a(aigf.i);
        }
    }
}
