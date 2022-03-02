package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.BackupAndSyncSuggestion;

/* renamed from: xqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xqk extends nis {
    private final xvo a;
    private final wtb b;
    private final String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xqk(wtb wtb, Context context, String str) {
        super(208, "GetBackupAndSyncSuggestion");
        xvo xvo = new xvo(context);
        this.c = str;
        this.a = xvo;
        this.b = wtb;
    }

    private static final void a(aucd aucd) {
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
        xld.b = 4;
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
                    wtb wtb = this.b;
                    Status status = Status.a;
                    xvo xvo = this.a;
                    int b4 = xvo.b();
                    if (!xvo.c() || !xvo.d()) {
                        int a2 = xvo.a();
                        if (!xvo.d()) {
                            if (xvo.a(b4, a2)) {
                            }
                            b4 = 0;
                        }
                        if (!xvo.c()) {
                            if (b4 > a2) {
                                b4 -= a2;
                            }
                            b4 = 0;
                        }
                    }
                    wtb.a(status, new BackupAndSyncSuggestion(b4));
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
                    if (!ayta.a.a().a() || !(e instanceof SecurityException)) {
                        throw e;
                    }
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                    sb.append("Error when reading contact count.");
                    sb.append(valueOf);
                    throw new nja(8, sb.toString());
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
                    xld5.a |= 2;
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
        this.b.a(status, (BackupAndSyncSuggestion) null);
    }
}
