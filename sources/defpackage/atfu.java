package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.concurrent.Semaphore;

/* renamed from: atfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atfu extends atgh {
    public final Semaphore a = new Semaphore(0);
    public atft b;
    private final String d;
    private final String e;
    private final String f;

    public atfu(String str, String str2, String str3) {
        atfy.a(str, "apiKey");
        this.d = str;
        atfy.a(str2, "packageName");
        this.e = str2;
        atfy.a(str3, "certFingerprint");
        this.f = str3;
        synchronized (this) {
            this.b = null;
        }
    }

    public final int a() {
        return 132;
    }

    public final boolean b() {
        return true;
    }

    public final void c() {
        super.c();
        this.a.release();
    }

    public final void a(DataOutputStream dataOutputStream) {
        aucd o = avxl.e.o();
        String str = this.d;
        if (o.c) {
            o.c();
            o.c = false;
        }
        avxl avxl = (avxl) o.b;
        str.getClass();
        int i = avxl.a | 1;
        avxl.a = i;
        avxl.b = str;
        String str2 = this.e;
        str2.getClass();
        int i2 = i | 2;
        avxl.a = i2;
        avxl.c = str2;
        String str3 = this.f;
        str3.getClass();
        avxl.a = i2 | 4;
        avxl.d = str3;
        atfz.a((OutputStream) dataOutputStream, (audx) (avxl) o.i());
    }

    public final boolean a(DataInputStream dataInputStream) {
        int a2;
        String str;
        Long l;
        avxo avxo = (avxo) atfz.a((auef) avxo.f.c(7), dataInputStream);
        Long l2 = null;
        if ((avxo.a & 1) == 0 || !((a2 = avxn.a(avxo.b)) == 0 || a2 == 1)) {
            synchronized (this) {
                this.b = new atft(false, (String) null, (Long) null, (Long) null);
            }
        } else {
            int i = avxo.a;
            if ((i & 2) != 0) {
                str = avxo.c;
            } else {
                str = null;
            }
            if ((i & 4) != 0) {
                l = Long.valueOf(avxo.d);
            } else {
                l = null;
            }
            if ((avxo.a & 8) != 0) {
                l2 = Long.valueOf(avxo.e);
            }
            synchronized (this) {
                this.b = new atft(true, str, l, l2);
            }
        }
        return true;
    }
}
