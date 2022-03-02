package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import com.android.volley.VolleyError;
import com.google.android.gms.R;

/* renamed from: ynr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ynr implements Runnable {
    public final String a;
    public Bitmap b;
    final /* synthetic */ ynt c;

    public ynr(ynt ynt, String str) {
        this.c = ynt;
        this.a = str;
    }

    public final void run() {
        try {
            String a2 = iqv.a(this.a, this.c.e.getDimensionPixelSize(R.dimen.plus_apps_max_icon_size));
            ynt ynt = this.c;
            byte[] a3 = ynt.b.a(ynt.c, a2);
            if (a3 != null) {
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a3, 0, a3.length, this.c.d);
                this.b = decodeByteArray;
                if (decodeByteArray != null) {
                    Handler handler = this.c.a;
                    handler.sendMessage(handler.obtainMessage(0, this));
                    return;
                }
                Handler handler2 = this.c.a;
                handler2.sendMessage(handler2.obtainMessage(1, this));
                return;
            }
            Handler handler3 = this.c.a;
            handler3.sendMessage(handler3.obtainMessage(1, this));
        } catch (VolleyError e) {
            Handler handler4 = this.c.a;
            handler4.sendMessage(handler4.obtainMessage(1, this));
        }
    }
}
