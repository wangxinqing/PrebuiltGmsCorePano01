package defpackage;

import android.os.SystemClock;

/* renamed from: aiil  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiil {
    final aiim a;
    final aiim b;
    public int c;

    public aiil(arce arce) {
        this.a = new aiim(arce);
        this.b = new aiim(arce);
        a(1, false);
    }

    public final void a(int i) {
        a(i, true);
    }

    public final arce b(int i) {
        return i != 2 ? this.b : this.a;
    }

    public final void a(int i, boolean z) {
        if (this.c != i) {
            this.c = i;
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000000;
            if (this.c == 2) {
                aiim aiim = this.a;
                aiim.a = true;
                this.b.a = false;
                if (z) {
                    aiim.a(elapsedRealtime);
                    return;
                }
                return;
            }
            this.a.a = false;
            aiim aiim2 = this.b;
            aiim2.a = true;
            if (z) {
                aiim2.a(elapsedRealtime);
            }
        }
    }
}
