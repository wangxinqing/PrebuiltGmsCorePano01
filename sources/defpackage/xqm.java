package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: xqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xqm extends nis {
    private final xvm a;
    private final wtb b;
    private final String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xqm(wtb wtb, Context context, String str) {
        super(208, "OptOutBackupAndSync");
        xvm a2 = xvm.a(context);
        this.a = a2;
        this.b = wtb;
        this.c = str;
    }

    private static void a(aucd aucd) {
        wml.a().a((xld) aucd.i());
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        aucd o = xld.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xld xld = (xld) o.b;
        xld.b = 2;
        xld.a |= 1;
        int b2 = xqi.b(this.c);
        if (o.c) {
            o.c();
            o.c = false;
        }
        xld xld2 = (xld) o.b;
        int i = b2 - 1;
        if (b2 != 0) {
            xld2.d = i;
            xld2.a |= 4;
            boolean b3 = aytd.b();
            if (xqi.a(this.c)) {
                try {
                    this.a.b();
                    if (b3) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        xld xld3 = (xld) o.b;
                        xld3.c = 1;
                        xld3.a |= 2;
                        a(o);
                    }
                    o.i();
                    this.b.d(Status.a);
                } catch (Exception e) {
                    if (b3) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        xld xld4 = (xld) o.b;
                        xld4.c = 0;
                        xld4.a |= 2;
                        a(o);
                    }
                    throw e;
                } catch (Throwable th) {
                    o.i();
                    throw th;
                }
            } else {
                if (b3) {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    xld xld5 = (xld) o.b;
                    xld5.c = 0;
                    xld5.a = 2 | xld5.a;
                    a(o);
                }
                throw new nja(10, String.format("Inelegibile calling package: %s", new Object[]{this.c}));
            }
        } else {
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.b.d(status);
    }
}
