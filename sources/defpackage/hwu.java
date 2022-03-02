package defpackage;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hwu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hwu {
    public Account a;
    public ArrayList b;
    public String c;
    public boolean d = false;
    public String e;
    public int f = 0;
    public String g;
    public hww h;
    private ArrayList i;
    private boolean j = false;
    private boolean k = false;

    public final hwx a() {
        boolean z;
        if (!this.k) {
            boolean z2 = true;
            if (this.g == null) {
                z = true;
            } else {
                z = false;
            }
            iva.b(z, "We only support hostedDomain filter for account chip styled account picker");
            if (this.h != null) {
                z2 = false;
            }
            iva.b(z2, "Consent is only valid for account chip styled account picker");
        }
        hwx hwx = new hwx();
        hwx.c = this.i;
        hwx.b = this.b;
        hwx.d = this.j;
        hwx.j = this.h;
        hwx.h = this.g;
        hwx.a = this.a;
        hwx.f = this.d;
        hwx.k = this.e;
        hwx.g = this.f;
        hwx.e = this.c;
        hwx.i = this.k;
        return hwx;
    }

    public final void b() {
        this.j = true;
    }

    public final void c() {
        this.k = true;
    }

    public final void a(List list) {
        this.i = list != null ? new ArrayList(list) : null;
    }
}
