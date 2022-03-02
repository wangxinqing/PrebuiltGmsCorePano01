package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.DeleteFileRequest;
import java.io.File;

/* renamed from: sdv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sdv extends nis {
    private final DeleteFileRequest a;
    private final tbw b;
    private final sdw c;
    private final String d;
    private final see e;

    public sdv(DeleteFileRequest deleteFileRequest, tbw tbw, sdw sdw, String str, see see) {
        super(160, "DeleteFileOperation");
        this.a = deleteFileRequest;
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
        aokq2.d = aomz.a(5);
        aokq2.a |= 4;
        this.c.a((aokq) o.i());
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        Status status;
        Status status2;
        try {
            seh.a(this.a.a, context);
            this.e.a(this.a.a);
            File b2 = ahab.a(context).b(this.a.a);
            if (!b2.exists()) {
                afsh.b("%s: file not found: %s", (Object) "MobStore.DeleteFileOperation", (Object) b2);
                a(6);
                String valueOf = String.valueOf(this.a.a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
                sb.append("File not found: ");
                sb.append(valueOf);
                status2 = new Status(10, sb.toString());
            } else if (b2.isDirectory()) {
                afsh.b("%s: Trying to delete a directory: %s", (Object) "MobStore.DeleteFileOperation", (Object) b2);
                a(6);
                String valueOf2 = String.valueOf(this.a.a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
                sb2.append("Uri is not a file: ");
                sb2.append(valueOf2);
                status2 = new Status(10, sb2.toString());
            } else if (!b2.delete()) {
                afsh.b("%s: Unable to delete file: %s", (Object) "MobStore.DeleteFileOperation", (Object) b2);
                a(9);
                String valueOf3 = String.valueOf(this.a.a);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 23);
                sb3.append("Unable to delete file: ");
                sb3.append(valueOf3);
                status2 = new Status(13, sb3.toString());
            } else {
                a(3);
                status2 = Status.a;
            }
            try {
                this.b.a(status2);
            } catch (RemoteException e2) {
                a(7);
                afsh.b((Throwable) e2, "%s: Client died during DeleteFileOperation", "MobStore.DeleteFileOperation");
            }
        } catch (sef e3) {
            Status status3 = e3.a;
            a(e3.b);
            this.b.a(status3);
        } catch (ahbk e4) {
            status = new Status(10, e4.getMessage());
            a(4);
            this.b.a(status);
        } catch (Throwable th) {
            th = th;
            this.b.a(status);
            throw th;
        }
    }

    public final void a(Status status) {
        afsh.c("%s: onFailure: %s", "MobStore.DeleteFileOperation", status);
        this.b.a(status);
        a(7);
    }
}
