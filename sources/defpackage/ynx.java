package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: ynx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ynx implements ica, icb, yum {
    private static ynx a;
    private final Context b;
    private final HashMap c = new HashMap();
    private final LinkedList d;
    private final yui e;
    private yuv f;

    private ynx(Context context) {
        yui yui = yuv.a;
        this.b = context.getApplicationContext();
        this.d = new LinkedList();
        this.e = yui;
    }

    public static ynx a(Context context) {
        if (a == null) {
            a = new ynx(context);
        }
        return a;
    }

    public final void a(int i) {
        this.f = null;
    }

    public final void a(ConnectionResult connectionResult) {
        this.f = null;
    }

    public final void g(Bundle bundle) {
        this.f.b(this, ((Integer) ysu.y.c()).intValue(), (String) null);
    }

    public final void a(ConnectionResult connectionResult, yxj yxj, String str) {
        if (yxj != null && connectionResult.b()) {
            int a2 = yxj.a();
            for (int i = 0; i < a2; i++) {
                yxi b2 = yxj.a(i);
                String c2 = b2.c();
                if (this.c.get(c2) == null) {
                    this.c.put(c2, new ynv(c2, b2.a(), b2.b()));
                }
                ynv ynv = (ynv) this.c.get(b2.c());
                int size = this.d.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((ynw) this.d.get(i2)).a(ynv);
                }
            }
            if (str != null) {
                this.f.b(this, ((Integer) ysu.y.c()).intValue(), str);
                return;
            }
            this.f.j();
            this.f = null;
            return;
        }
        this.f.j();
        this.f = null;
    }

    public final void a(ynw ynw) {
        yuv yuv;
        this.d.remove(ynw);
        if (this.d.isEmpty() && (yuv = this.f) != null) {
            if (yuv.l() || this.f.m()) {
                this.f.j();
            }
            this.f = null;
        }
    }

    public final void a(ynw ynw, String str, String str2) {
        ynv ynv = (ynv) this.c.get(str);
        if (ynv == null) {
            if (!this.d.contains(ynw)) {
                this.d.add(ynw);
            }
            if (this.f == null) {
                yuv a2 = ymb.a(this.e, this.b, this, this, str2);
                this.f = a2;
                a2.t();
                return;
            }
            return;
        }
        ynw.a(ynv);
    }
}
