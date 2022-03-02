package defpackage;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import android.os.SystemClock;
import java.io.PrintWriter;
import java.text.Format;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* renamed from: ahyk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahyk {
    public final List a;
    public final LocationManager b;

    public ahyk(Context context, boolean z) {
        this.b = (LocationManager) context.getSystemService("location");
        this.a = z ? new LinkedList() : null;
    }

    public final synchronized void a(String str, int i) {
        List list = this.a;
        if (list != null) {
            list.add(new ahyj(str, SystemClock.elapsedRealtime(), i));
            if (this.a.size() > 100) {
                this.a.remove(0);
            }
        }
    }

    public final void a(String str, String str2, long j, LocationListener locationListener, Looper looper) {
        if ("gps".equals(str2)) {
            a(str, 1);
        }
        if (this.b.getProvider(str2) != null) {
            this.b.requestLocationUpdates(str2, j, 0.0f, locationListener, looper);
        }
    }

    public final void a(String str, boolean z, LocationListener locationListener) {
        if (z) {
            a(str, 2);
        }
        this.b.removeUpdates(locationListener);
    }

    public final synchronized void a(Format format, long j, PrintWriter printWriter) {
        String str;
        if (this.a != null) {
            Date date = new Date(0);
            for (ahyj ahyj : this.a) {
                date.setTime(j);
                date.setTime(date.getTime() + ahyj.b);
                printWriter.print(format.format(date));
                printWriter.print(" @");
                printWriter.print(ahyj.b);
                printWriter.print(" ");
                if (ahyj.a.length() > 2) {
                    str = ahyj.a.substring(0, 2);
                } else {
                    str = ahyj.a;
                }
                printWriter.print(str);
                printWriter.print(": ");
                printWriter.println(ahyj.c - 1);
            }
        }
    }
}
