package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: kit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class kit {
    private static final ith h = new ith("DownloadTask", "");
    public final AtomicInteger a = new AtomicInteger();
    protected final String b;
    protected final khq c;
    protected final kin d;
    protected final lht e;
    public volatile kie f = null;
    public volatile String g = null;
    private final Context i;
    private final khw j;

    public kit(kin kin, khq khq, String str, Context context, khw khw, lht lht) {
        this.d = kin;
        this.c = khq;
        this.b = str;
        this.i = context;
        this.j = khw;
        this.e = lht;
    }

    private static final int a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e2) {
            throw new kio((Exception) e2, true);
        }
    }

    protected static int a(kio kio) {
        if (kio.b) {
            switch (kio.a) {
                case 400:
                case 401:
                case 403:
                case 404:
                    break;
                default:
                    return 8;
            }
        }
        return 5;
    }

    public abstract boolean a();

    public final void b() {
        this.e.d();
    }

    public abstract kie c();

    public abstract long d();

    /* access modifiers changed from: protected */
    public String e() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final lib f() {
        try {
            return this.e.a().a(new URL(this.b));
        } catch (lhp e2) {
            throw e2;
        } catch (MalformedURLException e3) {
            throw new kio((Exception) e3, false);
        } catch (IOException e4) {
            throw new kio((Exception) e4, true);
        }
    }

    private final izw a(HttpURLConnection httpURLConnection, ClientContext clientContext, kie kie) {
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(0);
        if (kie != null) {
            httpURLConnection.setRequestProperty("Range", new kjc(kie.b().b, -1).a());
        }
        try {
            return kht.a(httpURLConnection, clientContext, this.i);
        } catch (IOException e2) {
            throw new kio((Exception) e2, false);
        }
    }

    private final kie a(lib lib, kie kie) {
        long j2;
        long j3;
        long j4;
        kie kie2 = kie;
        HttpURLConnection a2 = lib.a();
        int a3 = a(a2);
        h.a("Processing response. Status code: %s", Integer.valueOf(a3));
        if (a3 == 200) {
            try {
                this.f = c();
                this.g = e();
                j2 = (long) a2.getContentLength();
                j3 = 0;
            } catch (IOException e2) {
                throw new kio((Exception) e2, false);
            }
        } else if (a3 != 206) {
            throw new kio(a3);
        } else if (kie2 != null) {
            this.f = kie2;
            this.g = e();
            String headerField = a2.getHeaderField("Content-Range");
            if (headerField != null) {
                try {
                    kjc a4 = kjc.a(headerField);
                    j3 = a4.c;
                    j2 = a4.d + 1;
                } catch (ParseException e3) {
                    throw new kio((Exception) e3, false);
                }
            } else {
                throw new kio("Partial response is missing range header.", true);
            }
        } else {
            throw new kio("Server returned partial content but full content was requested.", true);
        }
        if (j2 < 0) {
            long d2 = d();
            h.a("Falling back to expected size from metadata: %s", Long.valueOf(d2));
            j4 = d2;
        } else {
            j4 = j2;
        }
        ith ith = h;
        Long valueOf = Long.valueOf(j4);
        ith.a("Initial bytes completed: %s. Expected size: %s", Long.valueOf(j3), valueOf);
        try {
            InputStream inputStream = a2.getInputStream();
            kic b2 = this.f.b();
            long j5 = b2.b;
            if (j3 <= j5) {
                if (j4 > 0) {
                    if (j4 <= j5) {
                        h.a("Bytes written (%d) exceeds or is same as expected size (%d)", Long.valueOf(j5), valueOf);
                    } else {
                        this.j.a(j4 - j5);
                    }
                }
                kiy kiy = new kiy(b2, this.d, j4, j3, lib.b());
                while (j3 < j5) {
                    try {
                        j3 += inputStream.skip(j5 - j3);
                    } catch (lhp e4) {
                        throw e4;
                    } catch (IOException e5) {
                        throw new kio((Exception) e5, true);
                    }
                }
                jjt.a(inputStream, kiy, false);
                return this.f;
            }
            throw new kio("Range response starts after requested start.", false);
        } catch (IOException e6) {
            throw new kio((Exception) e6, true);
        }
    }

    /* access modifiers changed from: protected */
    public final kie a(kie kie) {
        if (!this.e.e()) {
            ClientContext a2 = this.c.a(this.i);
            lib f2 = f();
            try {
                izw a3 = a(f2.a(), a2, kie);
                h.a("Executing download request. URI: %s", this.b);
                if (a(f2.a()) == 401) {
                    h.b("Received UNAUTHORIZED response code. Invalidating token and trying to connect again.");
                    a3.c(this.i);
                    f2.close();
                    f2 = f();
                    try {
                        a(f2.a(), a2, kie);
                    } catch (Throwable th) {
                        th = th;
                        f2.close();
                        throw th;
                    }
                }
                kie a4 = a(f2, kie);
                f2.close();
                return a4;
            } catch (Throwable th2) {
                th = th2;
                f2.close();
                throw th;
            }
        } else {
            throw new lhp("Transfer is canceled");
        }
    }
}
