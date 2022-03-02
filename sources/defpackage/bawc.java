package defpackage;

import android.net.TrafficStats;
import android.util.Log;
import com.android.volley.toolbox.HttpClientStack;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* renamed from: bawc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bawc extends bawg {
    public static final String a = bawc.class.getSimpleName();
    public final bavz b;
    public final Executor c;
    public final String d;
    public final Map e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final List f = new ArrayList();
    public final AtomicReference g = new AtomicReference(0);
    public final boolean h;
    public String i;
    public bawl j;
    public Executor k;
    public volatile int l = -1;
    public String m;
    public ReadableByteChannel n;
    public bawj o;
    public String p;
    public HttpURLConnection q;
    public bavb r;
    private final AtomicBoolean s = new AtomicBoolean(false);

    public bawc(UrlRequest.Callback callback, Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i2, boolean z3, int i3) {
        if (str == null) {
            throw new NullPointerException("URL is required");
        } else if (callback == null) {
            throw new NullPointerException("Listener is required");
        } else if (executor == null) {
            throw new NullPointerException("Executor is required");
        } else if (executor2 != null) {
            this.h = z;
            this.b = new bavz(this, callback, executor2);
            this.c = new bawb(new bavi(executor, !z2 ? TrafficStats.getThreadStatsTag() : i2, z3, i3));
            this.m = str;
            this.d = str2;
        } else {
            throw new NullPointerException("userExecutor is required");
        }
    }

    private final void f() {
        int intValue = ((Integer) this.g.get()).intValue();
        if (intValue != 0) {
            throw new IllegalStateException("Request is already started. State is: " + intValue);
        }
    }

    public final Runnable a(bawd bawd) {
        return new bavq(this, bawd);
    }

    public final Runnable b(bawd bawd) {
        return new bavd(this, bawd);
    }

    public final void c() {
        this.c.execute(a((bawd) new bavp(this)));
    }

    public final void cancel() {
        int intValue = ((Integer) this.g.getAndSet(8)).intValue();
        if (intValue == 1 || intValue == 2 || intValue == 3 || intValue == 4 || intValue == 5) {
            d();
            b();
            bavz bavz = this.b;
            bawj bawj = this.o;
            bavz.d.e();
            bavz.b.execute(new bavw(bavz, bawj));
        }
    }

    public final void d() {
        this.c.execute(new bavg(this));
    }

    public final void e() {
        this.c.execute(new bavh(this));
    }

    public final void followRedirect() {
        a(3, 1, new bavk(this));
    }

    public final void getStatus(UrlRequest.StatusListener statusListener) {
        int intValue = ((Integer) this.g.get()).intValue();
        int i2 = this.l;
        switch (intValue) {
            case 0:
            case 6:
            case 7:
            case 8:
                i2 = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i2 = 0;
                break;
            case 5:
                i2 = 14;
                break;
            default:
                throw new IllegalStateException("Switch is exhaustive: " + intValue);
        }
        this.b.b.execute(new bavs(new bawn(statusListener), i2));
    }

    public final boolean isDone() {
        int intValue = ((Integer) this.g.get()).intValue();
        return intValue == 7 || intValue == 6 || intValue == 8;
    }

    public final void start() {
        this.l = 10;
        a(0, 1, new bavj(this));
    }

    public final void a() {
        this.l = 13;
        this.c.execute(a((bawd) new bavl(this)));
    }

    public final void b() {
        if (this.j != null && this.s.compareAndSet(false, true)) {
            try {
                this.k.execute(b(new bavm(this)));
            } catch (RejectedExecutionException e2) {
                Log.e(a, "Exception when closing uploadDataProvider", e2);
            }
        }
    }

    public final void read(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        } else if (byteBuffer.hasRemaining()) {
            a(4, 5, new bavf(this, byteBuffer));
        } else {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
    }

    public final void a(int i2, int i3, Runnable runnable) {
        if (!this.g.compareAndSet(Integer.valueOf(i2), Integer.valueOf(i3))) {
            int intValue = ((Integer) this.g.get()).intValue();
            if (intValue != 8 && intValue != 6) {
                throw new IllegalStateException("Invalid state transition - expected " + i2 + " but was " + intValue);
            }
            return;
        }
        runnable.run();
    }

    public final void a(String str) {
        f();
        if ("OPTIONS".equalsIgnoreCase(str) || "GET".equalsIgnoreCase(str) || "HEAD".equalsIgnoreCase(str) || "POST".equalsIgnoreCase(str) || "PUT".equalsIgnoreCase(str) || "DELETE".equalsIgnoreCase(str) || "TRACE".equalsIgnoreCase(str) || HttpClientStack.HttpPatch.METHOD_NAME.equalsIgnoreCase(str)) {
            this.i = str;
            return;
        }
        throw new IllegalArgumentException("Invalid http method " + str);
    }

    public final void a(String str, String str2) {
        f();
        int i2 = 0;
        while (true) {
            if (i2 < str.length()) {
                char charAt = str.charAt(i2);
                if (!(charAt == ',' || charAt == '/' || charAt == '{' || charAt == '}')) {
                    switch (charAt) {
                        case '\'':
                        case '(':
                        case ')':
                            break;
                        default:
                            switch (charAt) {
                                case ':':
                                case ';':
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    break;
                                default:
                                    switch (charAt) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                            break;
                                        default:
                                            if (!Character.isISOControl(charAt) && !Character.isWhitespace(charAt)) {
                                                i2++;
                                            }
                                    }
                            }
                    }
                }
            } else if (!str2.contains("\r\n")) {
                if (this.e.containsKey(str)) {
                    this.e.remove(str);
                }
                this.e.put(str, str2);
                return;
            }
        }
        throw new IllegalArgumentException("Invalid header " + str + "=" + str2);
    }

    public final void a(Throwable th) {
        a((CronetException) new bauk("Exception received from UploadDataProvider", th));
    }

    public final void a(CronetException cronetException) {
        int intValue;
        do {
            intValue = ((Integer) this.g.get()).intValue();
            if (intValue == 0) {
                throw new IllegalStateException("Can't enter error state before start");
            } else if (intValue == 6 || intValue == 7 || intValue == 8) {
                return;
            }
        } while (!this.g.compareAndSet(Integer.valueOf(intValue), 6));
        d();
        b();
        bavz bavz = this.b;
        bawj bawj = this.o;
        bavz.d.e();
        bavy bavy = new bavy(bavz, bawj, cronetException);
        try {
            bavz.b.execute(bavy);
        } catch (InlineExecutionProhibitedException e2) {
            Executor executor = bavz.c;
            if (executor != null) {
                executor.execute(bavy);
            }
        }
    }

    public final void a(UploadDataProvider uploadDataProvider, Executor executor) {
        if (this.e.containsKey("Content-Type")) {
            f();
            if (this.i == null) {
                this.i = "POST";
            }
            this.j = new bawl(uploadDataProvider);
            if (!this.h) {
                this.k = new bawf(executor);
            } else {
                this.k = executor;
            }
        } else {
            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        }
    }
}
