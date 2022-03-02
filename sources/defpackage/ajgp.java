package defpackage;

import android.os.Message;

/* renamed from: ajgp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajgp extends ajgs {
    private int a = 0;
    private final ajgo b;

    static {
        jjg.a("QStage");
    }

    public ajgp(String str, ajgo ajgo) {
        super(str);
        this.b = ajgo;
    }

    public final void a() {
        this.b.b();
        this.b.g.a();
    }

    public final void b() {
        this.b.c();
        this.a = 0;
    }

    public final boolean a(Message message) {
        int i = message.what;
        ajgo ajgo = this.b;
        if (i != ajgo.g.a) {
            return false;
        }
        int a2 = ajgo.a();
        if (a2 != this.a) {
            if (a2 == 1) {
                this.h.b();
            } else if (a2 == 2) {
                this.h.a((ajgs) this);
            } else if (a2 == 3) {
                e();
            }
            this.a = a2;
        }
        return true;
    }
}
