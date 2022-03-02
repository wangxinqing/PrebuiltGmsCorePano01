package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: aopr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aopr extends aoqv implements Runnable {
    aorr a;
    Object b;

    public aopr(aorr aorr, Object obj) {
        amrl.a((Object) aorr);
        this.a = aorr;
        amrl.a(obj);
        this.b = obj;
    }

    public static aorr a(aorr aorr, amqy amqy, Executor executor) {
        amrl.a((Object) amqy);
        aopq aopq = new aopq(aorr, amqy);
        aorr.a(aopq, aosd.a(executor, aopq));
        return aopq;
    }

    public abstract Object a(Object obj, Object obj2);

    public abstract void a(Object obj);

    /* access modifiers changed from: protected */
    public final String aK() {
        String str;
        aorr aorr = this.a;
        Object obj = this.b;
        String aK = super.aK();
        if (aorr != null) {
            String valueOf = String.valueOf(aorr);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (obj != null) {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf2).length());
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(valueOf2);
            sb2.append("]");
            return sb2.toString();
        } else if (aK == null) {
            return null;
        } else {
            String valueOf3 = String.valueOf(str);
            return aK.length() == 0 ? new String(valueOf3) : valueOf3.concat(aK);
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        a((Future) this.a);
        this.a = null;
        this.b = null;
    }

    public final void run() {
        aorr aorr = this.a;
        Object obj = this.b;
        boolean z = true;
        boolean isCancelled = isCancelled() | (aorr == null);
        if (obj != null) {
            z = false;
        }
        if (!isCancelled && !z) {
            this.a = null;
            if (aorr.isCancelled()) {
                b(aorr);
                return;
            }
            try {
                try {
                    Object a2 = a(obj, aorl.a((Future) aorr));
                    this.b = null;
                    a(a2);
                } catch (Throwable th) {
                    this.b = null;
                    throw th;
                }
            } catch (CancellationException e) {
                cancel(false);
            } catch (ExecutionException e2) {
                a(e2.getCause());
            } catch (RuntimeException e3) {
                a((Throwable) e3);
            } catch (Error e4) {
                a((Throwable) e4);
            }
        }
    }

    public static aorr a(aorr aorr, aoqb aoqb, Executor executor) {
        amrl.a((Object) executor);
        aopp aopp = new aopp(aorr, aoqb);
        aorr.a(aopp, aosd.a(executor, aopp));
        return aopp;
    }
}
