package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.util.Log;
import com.android.volley.VolleyError;

/* renamed from: ynj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ynj implements Runnable {
    public final yxi a;
    public Bitmap b;
    final /* synthetic */ ynl c;
    private final String d;

    public ynj(ynl ynl, yxi yxi, String str) {
        this.c = ynl;
        this.a = yxi;
        this.d = str;
    }

    public final void run() {
        try {
            ynl ynl = this.c;
            byte[] a2 = ynl.b.a(ynl.c, this.d);
            if (a2 != null) {
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a2, 0, a2.length, this.c.d);
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
        } catch (NullPointerException e2) {
            String valueOf = String.valueOf(this.d);
            Log.e("ListAppsImageManager", valueOf.length() == 0 ? new String("Malformed image URL: ") : "Malformed image URL: ".concat(valueOf));
            Handler handler5 = this.c.a;
            handler5.sendMessage(handler5.obtainMessage(1, this));
        }
    }
}
