package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.RenameRequest;
import java.io.File;

/* renamed from: seg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class seg extends nis {
    private final RenameRequest a;
    private final tbw b;
    private final sdw c;
    private final String d;
    private final see e;

    public seg(RenameRequest renameRequest, tbw tbw, sdw sdw, String str, see see) {
        super(160, "RenameOperation");
        this.a = renameRequest;
        this.b = tbw;
        this.c = sdw;
        this.d = str;
        this.e = see;
    }

    private final void a(int i) {
        aucd o = aokq.f.o();
        String str = this.d;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aokq aokq = (aokq) o.b;
        str.getClass();
        aokq.a |= 1;
        aokq.b = str;
        aokq.c = aonb.a(i);
        aokq.a |= 2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aokq aokq2 = (aokq) o.b;
        aokq2.d = aomz.a(6);
        aokq2.a |= 4;
        this.c.a((aokq) o.i());
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        Status status;
        Throwable th;
        Status status2;
        Status status3;
        try {
            if (!axsv.a.a().k()) {
                this.b.b(new Status(10, "Feature flag is OFF"));
                a(8);
                return;
            }
            try {
                seh.a(this.a.a, context);
                seh.a(this.a.b, context);
                this.e.a(this.a.a);
                this.e.a(this.a.b);
                File b2 = ahab.a(context).b(this.a.a);
                File b3 = ahab.a(context).b(this.a.b);
                if (!b2.exists()) {
                    afsh.b("%s: file not found: %s", (Object) "MobStore.RenameOperation", (Object) b2);
                    a(6);
                    String valueOf = String.valueOf(this.a.a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
                    sb.append("File not found: ");
                    sb.append(valueOf);
                    status3 = new Status(33500, sb.toString());
                } else if (!b2.renameTo(b3)) {
                    Object[] objArr = {"MobStore.RenameOperation", b2, b3};
                    if (Log.isLoggable("MDD", 4)) {
                        Log.i("MDD", afsh.a("%s: Unable to rename from %s to %s", objArr));
                    }
                    a(12);
                    String valueOf2 = String.valueOf(this.a.a);
                    String valueOf3 = String.valueOf(this.a.b);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21 + String.valueOf(valueOf3).length());
                    sb2.append("Unable to rename ");
                    sb2.append(valueOf2);
                    sb2.append(" to ");
                    sb2.append(valueOf3);
                    status3 = new Status(13, sb2.toString());
                } else {
                    a(3);
                    status3 = Status.a;
                }
                this.b.b(status3);
            } catch (sef e2) {
                status2 = e2.a;
                a(e2.b);
                this.b.b(status2);
            } catch (ahbk e3) {
                status = new Status(10, "Malformed URI");
                a(4);
                this.b.b(status);
            } catch (Throwable th2) {
                Status status4 = status2;
                th = th2;
                status = status4;
                this.b.b(status);
                throw th;
            }
        } catch (RemoteException e4) {
            a(7);
            afsh.b((Throwable) e4, "%s: Client died during RenameOperation", "MobStore.RenameOperation");
        }
    }

    public final void a(Status status) {
        afsh.c("%s: onFailure: %s", "MobStore.RenameOperation", status);
        this.b.b(status);
        a(7);
    }
}
