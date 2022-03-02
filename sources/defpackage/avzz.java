package defpackage;

import java.io.IOException;

/* renamed from: avzz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class avzz extends bati {
    private boolean a;

    public avzz(batz batz) {
        super(batz);
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    public final void close() {
        if (!this.a) {
            try {
                this.b.close();
            } catch (IOException e) {
                this.a = true;
                a();
            }
        }
    }

    public final void flush() {
        if (!this.a) {
            try {
                this.b.flush();
            } catch (IOException e) {
                this.a = true;
                a();
            }
        }
    }

    public final void a(batd batd, long j) {
        if (!this.a) {
            try {
                this.b.a(batd, j);
            } catch (IOException e) {
                this.a = true;
                a();
            }
        } else {
            batd.h(j);
        }
    }
}
