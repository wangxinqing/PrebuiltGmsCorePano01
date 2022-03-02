package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: lyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lyp {
    protected static WeakReference a;
    private hol b;

    lyp() {
    }

    public static synchronized lyp a(Context context) {
        synchronized (lyp.class) {
            if (a != null) {
                if (((lyp) a.get()) != null) {
                    lyp lyp = (lyp) a.get();
                    return lyp;
                }
            }
            lyp lyp2 = new lyp(context);
            a = new WeakReference(lyp2);
            return lyp2;
        }
    }

    public static lyi b(Throwable th) {
        aucd o = lyi.b.o();
        while (th != null) {
            aucd o2 = lyh.e.o();
            String simpleName = th.getClass().getSimpleName();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            lyh lyh = (lyh) o2.b;
            simpleName.getClass();
            lyh.a |= 1;
            lyh.b = simpleName;
            if (th.getMessage() != null) {
                String message = th.getMessage();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                lyh lyh2 = (lyh) o2.b;
                message.getClass();
                lyh2.a |= 2;
                lyh2.c = message;
            }
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                aucd o3 = lyn.g.o();
                if (stackTraceElement.getClassName() != null) {
                    String className = stackTraceElement.getClassName();
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    lyn lyn = (lyn) o3.b;
                    className.getClass();
                    lyn.a |= 1;
                    lyn.b = className;
                }
                if (stackTraceElement.getMethodName() != null) {
                    String methodName = stackTraceElement.getMethodName();
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    lyn lyn2 = (lyn) o3.b;
                    methodName.getClass();
                    lyn2.a |= 2;
                    lyn2.c = methodName;
                }
                if (stackTraceElement.getFileName() != null) {
                    String fileName = stackTraceElement.getFileName();
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    lyn lyn3 = (lyn) o3.b;
                    fileName.getClass();
                    lyn3.a |= 4;
                    lyn3.d = fileName;
                }
                if (!stackTraceElement.isNativeMethod()) {
                    int lineNumber = stackTraceElement.getLineNumber();
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    lyn lyn4 = (lyn) o3.b;
                    lyn4.a |= 8;
                    lyn4.e = lineNumber;
                } else {
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    lyn lyn5 = (lyn) o3.b;
                    lyn5.a |= 16;
                    lyn5.f = true;
                }
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                lyh lyh3 = (lyh) o2.b;
                lyn lyn6 = (lyn) o3.i();
                lyn6.getClass();
                if (!lyh3.d.a()) {
                    lyh3.d = aucj.a(lyh3.d);
                }
                lyh3.d.add(lyn6);
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            lyi lyi = (lyi) o.b;
            lyh lyh4 = (lyh) o2.i();
            lyh4.getClass();
            lyi.a();
            lyi.a.add(lyh4);
            th = th.getCause();
        }
        return (lyi) o.i();
    }

    private lyp(Context context) {
        this.b = new hol(context, "DROIDGUARD", (String) null);
    }

    public final synchronized void a(Throwable th) {
        if (this.b != null) {
            this.b.a(b(th).k()).b();
            return;
        }
        Log.e("DG", "ErrorReporter not initialized");
    }
}
