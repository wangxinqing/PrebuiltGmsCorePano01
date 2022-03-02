package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: xqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class xqg extends nis {
    private amsn Dl;
    private final Set Dm;
    private final boolean Dr;
    public final itp h;
    protected final String i;
    protected final int j;
    public final String k;
    public final String l;
    public boolean o;
    public boolean p;
    public final Set q;
    protected wmi r;

    public xqg(String str, int i2, String str2, String str3) {
        this(str, i2, str2, str3, (byte[]) null);
    }

    public final void a(Context context) {
        try {
            if (!this.Dr || wmi.a(this.k) != 1) {
                b(context);
            } else {
                wmi wmi = new wmi(this.k);
                this.r = wmi;
                wmi.b = this.l;
                wmi.c = this.i;
                wmi.b(1, 0);
                b(context);
                this.r.a(wml.b(2, this.Dl.a(TimeUnit.MICROSECONDS)));
                wmi wmi2 = this.r;
                wmi2.a.a(1, wmi2.q, wmi2.b, wmi2.c, wmi2.r, wmi2.e, wmi2.u, wmi2.d, (xlx) null, (xlp) null, (xma) null, ayuq.a.a().c());
                this.Dl.e();
            }
        } finally {
            b(this.o);
        }
    }

    public final void a(Status status) {
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
    }

    public abstract void b(Context context);

    public final void b(boolean z) {
        if (!z) {
            for (yco a : this.q) {
                Log.w("PipeCreator", "This log should only show up during unit tests.");
                a.a(false);
            }
        } else {
            for (DataHolder close : this.Dm) {
                close.close();
            }
            for (yco close2 : this.q) {
                close2.close();
            }
        }
        a(z);
    }

    protected xqg(String str, int i2, String str2, String str3, byte[] bArr) {
        super(5, str3);
        boolean z = false;
        this.o = false;
        this.p = false;
        this.Dm = new HashSet();
        this.q = new HashSet();
        iva.c(str);
        iva.b(i2 != 0 ? true : z);
        this.i = str;
        this.j = i2;
        this.k = str3;
        this.l = str2;
        boolean c = ayuq.c();
        this.Dr = c;
        if (c) {
            this.Dl = amsn.b(ampt.a);
        }
        this.h = new xqf(this);
    }

    public final void a(DataHolder dataHolder) {
        if (dataHolder != null) {
            this.Dm.add(dataHolder);
        }
    }
}
