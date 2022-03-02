package defpackage;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* renamed from: ajbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajbx implements aizn, ajpi {
    public final ajbz a;
    public final ajcc b;
    public final ajcc c;
    public final ajcc d;
    public final ajcc e;
    public final aizy f;
    public boolean g;

    public ajbx(aizy aizy, ajaa ajaa) {
        ajbz ajbz = new ajbz(ajaa, aizy.d(), aizy.c());
        this.f = aizy;
        this.a = ajbz;
        long c2 = aizy.c();
        File i = ajbz.f.i();
        if (i == null) {
            ajbz.b(c2);
        } else {
            BufferedInputStream bufferedInputStream = null;
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(new File(i, "cp_state")));
                try {
                    DataInputStream dataInputStream = new DataInputStream(bufferedInputStream2);
                    if (dataInputStream.readUnsignedShort() == 1) {
                        aqek a2 = ajqx.a((InputStream) dataInputStream, ajck.bR);
                        long c3 = a2.c(1);
                        long c4 = a2.c(2);
                        if (c4 > 0) {
                            aqek e2 = a2.e(3);
                            aqek e3 = a2.e(4);
                            aqek e4 = a2.e(5);
                            aqek e5 = a2.e(6);
                            ajbz.b.a(c2, c3, c4, e2);
                            ajbz.c.a(c2, c3, c4, e3);
                            ajbz.d.a(c2, c3, c4, e4);
                            ajbz.e.a(c2, c3, c4, e5);
                        } else {
                            ajbz.b(c2);
                        }
                    } else {
                        ajbz.b(c2);
                    }
                } catch (IOException e6) {
                    ajbz.b(c2);
                } catch (Exception e7) {
                    try {
                        ajbz.b(c2);
                    } catch (FileNotFoundException e8) {
                        bufferedInputStream = bufferedInputStream2;
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        ajbz.a((Closeable) bufferedInputStream);
                        throw th;
                    }
                }
                ajbz.a((Closeable) bufferedInputStream2);
                ajbz.a((Closeable) bufferedInputStream2);
            } catch (FileNotFoundException e9) {
                try {
                    ajbz.b(c2);
                    ajbz.a((Closeable) bufferedInputStream);
                    ajbz.a(c2);
                    this.b = ajbz.b;
                    this.c = ajbz.c;
                    this.d = ajbz.d;
                    this.e = ajbz.e;
                    this.g = true;
                    Locale locale = Locale.ENGLISH;
                    new Object[1][0] = this.b;
                    Locale locale2 = Locale.ENGLISH;
                    new Object[1][0] = this.c;
                    Locale locale3 = Locale.ENGLISH;
                    new Object[1][0] = this.d;
                    Locale locale4 = Locale.ENGLISH;
                    new Object[1][0] = this.e;
                } catch (Throwable th2) {
                    th = th2;
                    ajbz.a((Closeable) bufferedInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                ajbz.a((Closeable) bufferedInputStream);
                throw th;
            }
        }
        ajbz.a(c2);
        this.b = ajbz.b;
        this.c = ajbz.c;
        this.d = ajbz.d;
        this.e = ajbz.e;
        this.g = true;
        Locale locale5 = Locale.ENGLISH;
        new Object[1][0] = this.b;
        Locale locale22 = Locale.ENGLISH;
        new Object[1][0] = this.c;
        Locale locale32 = Locale.ENGLISH;
        new Object[1][0] = this.d;
        Locale locale42 = Locale.ENGLISH;
        new Object[1][0] = this.e;
    }

    public final void a() {
        this.b.c();
        this.c.c();
        this.d.c();
    }

    public final synchronized void a(boolean z) {
        this.g = z;
    }

    public final synchronized void b(long j) {
        if (this.g) {
            long c2 = this.f.c();
            this.b.b(j, c2);
            Locale locale = Locale.ENGLISH;
            Object[] objArr = {Long.valueOf(j), this.b};
            this.a.a(c2);
            return;
        }
        Locale locale2 = Locale.ENGLISH;
        new Object[1][0] = Long.valueOf(j);
    }

    public final void a(aqek aqek, long j) {
        aqek aqek2;
        aqek a2 = this.b.a();
        aqek a3 = this.c.a();
        aqek a4 = this.d.a();
        if (a2 == null && a3 == null && a4 == null) {
            aqek2 = null;
        } else {
            aqek aqek3 = new aqek(ajck.at);
            if (a2 != null) {
                aqek3.b(1, (Object) a2);
            }
            if (a3 != null) {
                aqek3.b(2, (Object) a3);
            }
            if (a4 != null) {
                aqek3.b(3, (Object) a4);
            }
            aqek2 = aqek3;
        }
        if (aqek2 != null) {
            aqek.b(13, (Object) aqek2);
        }
    }

    public final void a(aucd aucd, long j) {
        artr b2 = this.b.b();
        artr b3 = this.c.b();
        artr b4 = this.d.b();
        if (b2 != null && b3 != null && b4 != null) {
            aucd o = artk.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            artk artk = (artk) o.b;
            b2.getClass();
            artk.b = b2;
            int i = artk.a | 1;
            artk.a = i;
            b3.getClass();
            artk.c = b3;
            int i2 = i | 2;
            artk.a = i2;
            b4.getClass();
            artk.d = b4;
            artk.a = i2 | 4;
            artk artk2 = (artk) o.i();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            artq artq = (artq) aucd.b;
            artq artq2 = artq.i;
            artk2.getClass();
            artq.f = artk2;
            artq.a |= 1024;
        }
    }

    public final synchronized boolean a(long j) {
        if (this.g) {
            boolean a2 = this.b.a(j, this.f.c(), true);
            Locale locale = Locale.ENGLISH;
            Object[] objArr = {Boolean.valueOf(a2), Long.valueOf(j), this.b};
            return a2;
        }
        Locale locale2 = Locale.ENGLISH;
        new Object[1][0] = Long.valueOf(j);
        return true;
    }
}
