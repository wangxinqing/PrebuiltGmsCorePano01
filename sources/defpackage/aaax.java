package defpackage;

import android.net.Uri;
import android.util.Log;

/* renamed from: aaax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaax implements Runnable {
    private final aabi a;
    private final int b;
    private final nxn c;
    private final aabq d;
    private final qyl e;
    private final qvz f;
    private final Uri g;
    private final int h;

    public aaax(int i, aabi aabi, nxn nxn, aabq aabq, qyl qyl, qvz qvz, Uri uri, int i2) {
        this.b = i;
        this.a = aabi;
        this.c = nxn;
        this.d = aabq;
        this.e = qyl;
        this.f = qvz;
        this.g = uri;
        this.h = i2;
    }

    public static aaax a(aabi aabi, nxn nxn) {
        return new aaax(5, aabi, nxn, (aabq) null, (qyl) null, (qvz) null, (Uri) null, -1);
    }

    static aaax b(aabi aabi, nxn nxn) {
        return new aaax(6, aabi, nxn, (aabq) null, (qyl) null, (qvz) null, (Uri) null, -1);
    }

    public final void run() {
        switch (this.b) {
            case 1:
                this.a.a();
                return;
            case 2:
                aabq aabq = this.d;
                if (aabq != null && aaaz.b(aabq)) {
                    this.a.a(this.d);
                    return;
                }
                String valueOf = String.valueOf(this.d);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
                sb.append("Running in whitelist mode. Ignoring task: ");
                sb.append(valueOf);
                Log.w("NetworkScheduler", sb.toString());
                return;
            case 3:
                this.a.a(this.e);
                return;
            case 4:
                this.a.b(this.e);
                return;
            case 5:
                this.a.a(this.c);
                return;
            case 6:
                this.a.b(this.c);
                return;
            case 7:
                this.a.a(this.f, this.g, this.h);
                return;
            default:
                this.a.a(this.h);
                return;
        }
    }
}
