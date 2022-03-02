package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Semaphore;

/* renamed from: ahcf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahcf implements agzr {
    public boolean a;
    private final boolean b;

    public ahcf(boolean z) {
        this.b = z;
    }

    public static ahcf a() {
        return new ahcf(false);
    }

    public final /* bridge */ /* synthetic */ Object a(agzq agzq) {
        ahbh ahbh;
        Closeable closeable;
        ahbg ahbg;
        ahbm a2;
        Uri build = agzq.e.buildUpon().path(String.valueOf(agzq.f.getPath()).concat(".lock")).fragment("").build();
        if (this.a) {
            ahbj b2 = agzq.b.b();
            if (b2.a()) {
                Semaphore a3 = b2.a(build.toString());
                if (!a3.tryAcquire()) {
                    a3 = null;
                }
                ahbi ahbi = new ahbi(a3);
                try {
                    if (ahbi.a != null) {
                        ahbh = new ahbh(ahbi.a());
                        ahbi.close();
                    } else {
                        ahbi.close();
                    }
                } catch (Throwable th) {
                    apev.a(th, th);
                }
            }
            ahbh = null;
        } else {
            ahbj b3 = agzq.b.b();
            if (b3.a()) {
                Semaphore a4 = b3.a(build.toString());
                try {
                    a4.acquire();
                    ahbi ahbi2 = new ahbi(a4);
                    try {
                        ahbh = new ahbh(ahbi2.a());
                        ahbi2.close();
                    } catch (Throwable th2) {
                        apev.a(th, th2);
                    }
                } catch (InterruptedException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                    sb.append("semaphore not acquired: ");
                    sb.append(valueOf);
                    throw new InterruptedIOException(sb.toString());
                }
            } else {
                throw new ahbp("Couldn't acquire lock");
            }
        }
        ahbm a5 = ahbm.a(ahbh);
        try {
            if (a5.a != null) {
                if (this.b) {
                    closeable = agzq.b.b(build);
                } else {
                    closeable = agzq.b.c(build);
                }
                ahbm a6 = ahbm.a(closeable);
                try {
                    Closeable closeable2 = a6.a;
                    if (closeable2 instanceof ahav) {
                        FileChannel b4 = ((ahav) closeable2).b();
                        if (!this.a) {
                            agzq.b.b();
                            ahbg = new ahbg(b4.lock(0, Long.MAX_VALUE, this.b));
                        } else {
                            agzq.b.b();
                            try {
                                FileLock tryLock = b4.tryLock(0, Long.MAX_VALUE, this.b);
                                ahbg = tryLock != null ? new ahbg(tryLock) : null;
                            } catch (IOException e2) {
                                ahbg = null;
                            }
                        }
                        a2 = ahbm.a(ahbg);
                        if (a2.a != null) {
                            ahce ahce = new ahce(a5.a(), a6.a(), a2.a());
                            a2.close();
                            a6.close();
                            a5.close();
                            return ahce;
                        }
                        a2.close();
                        a6.close();
                    } else {
                        throw new IOException("Lock stream not convertible to FileChannel");
                    }
                } catch (Throwable th3) {
                    a6.close();
                    throw th3;
                }
            }
            a5.close();
            return null;
        } catch (Throwable th4) {
            try {
                a5.close();
            } catch (Throwable th5) {
                apev.a(th4, th5);
            }
            throw th4;
        }
        throw th;
        throw th;
        throw th;
    }
}
