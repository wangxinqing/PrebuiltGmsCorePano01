package defpackage;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;

/* renamed from: ull  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ull implements Closeable {
    public final String a;
    public final Set b = new ob();

    public ull(String str) {
        this.a = str;
    }

    public abstract InputStream a();

    public final void a(ulk ulk) {
        this.b.add(ulk);
    }

    public abstract OutputStream b();

    /* access modifiers changed from: protected */
    public abstract void c();

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void close() {
        /*
            r3 = this;
            r3.c()     // Catch:{ all -> 0x001a }
            java.util.Set r0 = r3.b
            java.util.Iterator r0 = r0.iterator()
        L_0x0009:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0019
            java.lang.Object r1 = r0.next()
            ulk r1 = (defpackage.ulk) r1
            r1.a()
            goto L_0x0009
        L_0x0019:
            return
        L_0x001a:
            r0 = move-exception
            java.util.Set r1 = r3.b
            java.util.Iterator r1 = r1.iterator()
        L_0x0021:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r1.next()
            ulk r2 = (defpackage.ulk) r2
            r2.a()
            goto L_0x0021
        L_0x0031:
            goto L_0x0033
        L_0x0032:
            throw r0
        L_0x0033:
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ull.close():void");
    }

    public final String toString() {
        return this.a;
    }
}
