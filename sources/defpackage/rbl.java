package defpackage;

import com.google.android.gms.auth.UserRecoverableAuthException;
import java.util.concurrent.ExecutionException;

/* renamed from: rbl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rbl {
    private rbl() {
    }

    static aftx a(Exception exc) {
        if (exc instanceof InterruptedException) {
            return aftx.a(auoj.INTERRUPTED_EXCEPTION);
        }
        if (((InterruptedException) a((Throwable) exc, InterruptedException.class)) != null) {
            return aftx.a(auoj.TASK_INTERRUPTED_EXCEPTION);
        }
        if (((afug) a((Throwable) exc, afug.class)) != null) {
            return aftx.a(auoj.SYNC_CONSTRAINTS_NOT_MET_EXCEPTION);
        }
        babk babk = (babk) a((Throwable) exc, babk.class);
        if (babk != null) {
            return aftx.a(auoj.GRPC_STATUS_EXCEPTION, babk.a);
        }
        babl babl = (babl) a((Throwable) exc, babl.class);
        if (babl != null) {
            return aftx.a(auoj.GRPC_STATUS_EXCEPTION, babl.a);
        }
        eif eif = (eif) a((Throwable) exc, eif.class);
        if (eif == null) {
            return aftx.a(auoj.UNCLASSIFIED_EXCEPTION);
        }
        if (eif instanceof ein) {
            return aftx.a(auoj.GOOGLE_PLAY_SERVICES_AVAILABILITY_EXCEPTION);
        }
        if (eif instanceof UserRecoverableAuthException) {
            return aftx.a(auoj.USER_RECOVERABLE_AUTH_EXCEPTION);
        }
        if (eif instanceof eiu) {
            return aftx.a(auoj.USER_RECOVERABLE_NOTIFIED_EXCEPTION);
        }
        return aftx.a(auoj.GOOGLE_AUTH_EXCEPTION);
    }

    private static final Integer a(aunx aunx, Exception exc) {
        aunx aunx2 = aunx.RESULT_UNKNOWN;
        int ordinal = aunx.ordinal();
        if (ordinal == 1) {
            return 0;
        }
        if (ordinal == 2) {
            return 1;
        }
        if (ordinal == 3) {
            return 2;
        }
        if (ordinal != 4 || !ayhd.a.a().h()) {
            return null;
        }
        throw new rbm(exc);
    }

    private static final Integer a(auoa auoa, Exception exc) {
        aunz aunz;
        Integer b;
        auco auco = null;
        if (auoa != null) {
            aftx a = a(exc);
            int i = ((auoj) a.a()).l;
            audr audr = auoa.a;
            Integer valueOf = Integer.valueOf(i);
            if (audr.containsKey(valueOf)) {
                aunz = (aunz) audr.get(valueOf);
            } else {
                aunz = null;
            }
            if (aunz != null) {
                if (a.a() == auoj.GRPC_STATUS_EXCEPTION && (b = a.b()) != null) {
                    int intValue = b.intValue();
                    audr audr2 = aunz.b;
                    Integer valueOf2 = Integer.valueOf(intValue);
                    if (audr2.containsKey(valueOf2)) {
                        aucw aucw = aunz.d;
                        aunx a2 = aunx.a(((Integer) audr2.get(valueOf2)).intValue());
                        auco = a2 == null ? aucw.a : a2;
                    }
                    if (auco != null) {
                        return a((aunx) auco, exc);
                    }
                }
                aunx a3 = aunx.a(aunz.a);
                if (a3 == null) {
                    a3 = aunx.RESULT_UNKNOWN;
                }
                return a(a3, exc);
            }
        }
        return null;
    }

    private static Object a(Throwable th, Class cls) {
        boolean z = false;
        Throwable th2 = th;
        while (th != null) {
            if (cls.isInstance(th)) {
                return cls.cast(th);
            }
            th = th.getCause();
            if (th == th2) {
                return null;
            }
            if (z) {
                amrl.a((Object) th2);
                th2 = th2.getCause();
            }
            z = !z;
        }
        return null;
    }

    static rbl a() {
        return new rbl();
    }

    /* access modifiers changed from: package-private */
    public final int a(auoa auoa, aorr aorr, amqy amqy) {
        Integer num;
        if (rbk.e()) {
            try {
                Object obj = aorr.get();
                if (amqy == null) {
                    return 0;
                }
                Integer num2 = (Integer) amqy.a(obj);
                amrl.a((Object) num2);
                return num2.intValue();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                num = a(auoa, (Exception) e);
                if (num == null) {
                    return 1;
                }
                return num.intValue();
            } catch (ExecutionException e2) {
                num = a(auoa, (Exception) e2);
                if (num == null) {
                    return 2;
                }
                return num.intValue();
            }
        } else {
            try {
                aorr.get();
                return 0;
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                return 1;
            } catch (ExecutionException e4) {
                return !(e4.getCause() instanceof afug) ? 2 : 1;
            }
        }
    }
}
