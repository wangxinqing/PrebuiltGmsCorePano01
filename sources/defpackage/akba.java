package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: akba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akba {
    private static akba e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new akay(this));
    public akaz c;
    public akaz d;

    private akba() {
    }

    public static akba a() {
        if (e == null) {
            e = new akba();
        }
        return e;
    }

    public final void b() {
        akaz akaz = this.d;
        if (akaz != null) {
            this.c = akaz;
            this.d = null;
            akaj akaj = (akaj) akaz.a.get();
            if (akaj != null) {
                akat.a.sendMessage(akat.a.obtainMessage(0, akaj.a));
            } else {
                this.c = null;
            }
        }
    }

    public final boolean c(akaj akaj) {
        akaz akaz = this.c;
        return akaz != null && akaz.a(akaj);
    }

    public final boolean d(akaj akaj) {
        akaz akaz = this.d;
        return akaz != null && akaz.a(akaj);
    }

    public final void a(akaj akaj) {
        synchronized (this.a) {
            if (c(akaj)) {
                akaz akaz = this.c;
                if (!akaz.c) {
                    akaz.c = true;
                    this.b.removeCallbacksAndMessages(akaz);
                }
            }
        }
    }

    public final void b(akaj akaj) {
        synchronized (this.a) {
            if (c(akaj)) {
                akaz akaz = this.c;
                if (akaz.c) {
                    akaz.c = false;
                    a(akaz);
                }
            }
        }
    }

    public final void a(akaz akaz) {
        int i = akaz.b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.b.removeCallbacksAndMessages(akaz);
            Handler handler = this.b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, akaz), (long) i);
        }
    }

    public final boolean a(akaz akaz, int i) {
        akaj akaj = (akaj) akaz.a.get();
        if (akaj == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(akaz);
        akat.a.sendMessage(akat.a.obtainMessage(1, i, 0, akaj.a));
        return true;
    }
}
