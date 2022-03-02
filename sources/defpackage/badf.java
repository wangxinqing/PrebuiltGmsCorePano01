package defpackage;

import java.io.InputStream;

/* renamed from: badf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class badf implements baln {
    public final void a(azxx azxx) {
        bagl e = e();
        amrl.a((Object) azxx, (Object) "compressor");
        e.a(azxx);
    }

    /* access modifiers changed from: protected */
    public abstract bade c();

    public final void d(int i) {
        bade c = c();
        synchronized (c.k) {
            c.m += i;
        }
    }

    /* access modifiers changed from: protected */
    public abstract bagl e();

    public final void g() {
        if (!e().b()) {
            e().a();
        }
    }

    public final void a(InputStream inputStream) {
        amrl.a((Object) inputStream, (Object) "message");
        try {
            if (!e().b()) {
                e().a(inputStream);
            }
        } finally {
            bagt.a(inputStream);
        }
    }
}
