package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Arrays;

/* renamed from: bwa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bwa {
    public final ContextManagerClientInfo a;
    public final int b;
    public final jvm c;
    public final PendingIntent d;

    private bwa(ContextManagerClientInfo contextManagerClientInfo, int i, jvm jvm, PendingIntent pendingIntent) {
        this.a = contextManagerClientInfo;
        this.b = i;
        this.c = jvm;
        this.d = pendingIntent;
    }

    public static bwa a(ContextManagerClientInfo contextManagerClientInfo, PendingIntent pendingIntent) {
        return new bwa(contextManagerClientInfo, 2, (jvm) null, pendingIntent);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof bwa) {
            bwa bwa = (bwa) obj;
            if (a().equals(bwa.a()) && (i = this.b) == bwa.b) {
                if (i == 1) {
                    return this.c.asBinder().equals(bwa.c.asBinder());
                }
                if (i != 2) {
                    return false;
                }
                return this.d.equals(bwa.d);
            }
        }
        return false;
    }

    public final int hashCode() {
        IBinder iBinder;
        Object[] objArr = new Object[4];
        objArr[0] = a();
        objArr[1] = Integer.valueOf(this.b);
        jvm jvm = this.c;
        if (jvm != null) {
            iBinder = jvm.asBinder();
        } else {
            iBinder = null;
        }
        objArr[2] = iBinder;
        objArr[3] = this.d;
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("accName", a());
        a2.a("type", Integer.toString(this.b));
        int i = this.b;
        if (i == 1) {
            a2.a("listener", this.c);
        } else if (i != 2) {
            ((anih) ((anih) bxk.a.b()).a("bwa", "toString", 692, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceListenerConsumer] Unknown type=%s", this.b);
        } else {
            a2.a("p.int", this.d);
        }
        return a2.toString();
    }

    public static bwa a(ContextManagerClientInfo contextManagerClientInfo, jvm jvm) {
        return new bwa(contextManagerClientInfo, 1, jvm, (PendingIntent) null);
    }

    public final bsz a() {
        return this.a.a();
    }
}
