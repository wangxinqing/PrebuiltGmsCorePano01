package defpackage;

import android.content.Context;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.NetworkLocationStatus;
import java.util.List;

/* renamed from: aigf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aigf implements aifv {
    public int a = 0;
    public int b = 0;
    public final aije c;
    public final Looper d;
    public final aifw e;
    public final aifz f = new aiga(this);
    public final aifz g = new aigd(this);
    public final aifz h = new aigb(this);
    public final aifz i = new aigc(this);
    public aige j;
    public aifz k = this.f;
    public boolean l = false;
    public long m = -1;
    public long n = 0;

    public aigf(Context context, Looper looper) {
        aifw aifw = new aifw(looper, context);
        int i2 = Build.VERSION.SDK_INT;
        aije aije = new aije(new ajbr((SensorManager) context.getSystemService("sensor"), axwx.o()));
        this.e = aifw;
        this.c = aije;
        this.d = looper;
    }

    public static final boolean a(Location location) {
        return ((double) location.getSpeed()) >= ayaw.d();
    }

    public final void a(List list) {
    }

    public final void a(NetworkLocationStatus[] networkLocationStatusArr) {
    }

    public final void b(List list) {
        if (!list.isEmpty()) {
            this.k.a(list);
        }
    }

    public final void d() {
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
        this.k.a(activityRecognitionResult);
    }
}
