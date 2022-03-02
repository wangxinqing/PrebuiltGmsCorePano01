package defpackage;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.location.places.PlacesClientIdentifier;

/* renamed from: bwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bwp extends nis implements Runnable {
    public final bun a;
    public bvp b;

    public bwp(String str) {
        this(str, (bun) null);
    }

    protected static acwa a(ContextManagerClientInfo contextManagerClientInfo) {
        new Object[1][0] = contextManagerClientInfo;
        Context f = cbi.f();
        riq riq = new riq();
        riq.a = contextManagerClientInfo.b;
        riq.b = contextManagerClientInfo.d;
        return rij.a(f, riq.a()).a((ihb) new rhu(new PlacesClientIdentifier(contextManagerClientInfo.b, contextManagerClientInfo.d)));
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public void b(int i) {
    }

    public final void run() {
        if (cbi.k().b()) {
            a();
            return;
        }
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
        sb.append("Should be running on the EventHandler thread ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    public bwp(String str, bun bun) {
        super(47, str);
        this.a = bun;
    }

    protected static void a(DataHolder dataHolder, jxf jxf, ContextManagerClientInfo contextManagerClientInfo) {
        boolean z = jxf instanceof jwz;
        Object[] objArr = {Boolean.valueOf(contextManagerClientInfo.c()), Integer.valueOf(contextManagerClientInfo.j), Integer.valueOf(Process.myPid()), Boolean.valueOf(z)};
        if (!z) {
            dataHolder.close();
        }
    }

    public final bvp a(String str) {
        bvp bvp = this.b;
        if (str == null) {
            return new bvp(bvp.a, bvp.g, bvp.b);
        }
        String str2 = bvp.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + str.length());
        sb.append(str2);
        sb.append("+");
        sb.append(str);
        return new bvp(sb.toString(), bvp.g, bvp.b);
    }

    public final void a(long j, bvp bvp) {
        this.b = bvp;
        cbi.k().a(this, j, this.b);
    }

    /* access modifiers changed from: package-private */
    public final void a(acwa acwa) {
        acwa.a(cbi.k().a(bvq.a("ControllerOperation_finalizeTask")), (acvp) new bwo(this, "[ControllerOperation] tasks finished", new Object[0]));
    }

    public final void a(Context context) {
        if (awuz.a.a().y()) {
            clj D = cbi.D();
            if (D != null) {
                D.a(this.b);
                this.b.b();
            }
            a();
            if (D != null) {
                this.b.c();
                D.b(this.b);
                return;
            }
            return;
        }
        a();
    }

    public final void a(bvp bvp) {
        this.b = bvp;
        cbi.k().a(this, this.b);
    }

    public final void a(Status status) {
        ((anih) ((anih) bxk.a.c()).a("bwp", "a", 90, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ControllerOperation] Operations failed with status %s", (Object) status);
    }
}
