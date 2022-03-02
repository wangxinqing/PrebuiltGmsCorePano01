package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: aiyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiyz implements arne, arnb {
    public final arnd a;
    public jfp b;
    jfo c;
    public aiyy d;
    public aiyy e;
    private final ReadWriteLock f = new ReentrantReadWriteLock();
    private final ajbg g;
    private final aicn h;
    private arnh i;

    public aiyz(arnd arnd, ajbg ajbg, aicn aicn) {
        this.a = arnd;
        this.g = ajbg;
        this.h = aicn;
    }

    public final int a() {
        try {
            this.f.readLock().lock();
            arnh arnh = this.i;
            if (arnh != null) {
                return arnh.c();
            }
            this.f.readLock().unlock();
            return -1;
        } finally {
            this.f.readLock().unlock();
        }
    }

    public final void b(int i2) {
    }

    /* JADX INFO: finally extract failed */
    public final void be() {
        try {
            this.f.writeLock().lock();
            arnh a2 = this.a.a(5147455389092024331L);
            this.i = a2;
            if (a2 != null) {
                a2.a(this, this.c);
                this.f.writeLock().unlock();
                aiyy aiyy = this.e;
                if (aiyy != null) {
                    aiys aiys = (aiys) aiyy;
                    aiys.d();
                    aiys.c();
                }
                if (this.d != null) {
                    this.g.a((Runnable) new aiyw(this));
                    return;
                }
                return;
            }
            this.f.writeLock().unlock();
        } catch (Throwable th) {
            this.f.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void a(int i2) {
        try {
            this.f.writeLock().lock();
            arnh arnh = this.i;
            if (arnh != null) {
                arnh.b(this);
                this.i = null;
            }
            this.f.writeLock().unlock();
            aiyy aiyy = this.e;
            if (aiyy != null && i2 == 2) {
                ((aiys) aiyy).d();
            }
            if (this.d != null) {
                this.g.a((Runnable) new aiyx(this, i2));
            }
        } catch (Throwable th) {
            this.f.writeLock().unlock();
            throw th;
        }
    }

    public final void a(arnd arnd, arnh arnh, arnt arnt) {
        try {
            this.f.readLock().lock();
            if (arnh != null) {
                if (arnh.a() == 5147455389092024331L) {
                    this.f.readLock().unlock();
                    aiyy aiyy = this.e;
                    if (aiyy != null && armf.a(arnt.a) == 114) {
                        aiys aiys = (aiys) aiyy;
                        aiys.a.lock();
                        try {
                            if (((aiys) aiyy).c == null) {
                                aucu aucu = new aucu(((aril) arnt.a((auef) aril.f.c(7))).b, aril.c);
                                int[] e2 = ((aiys) aiyy).e();
                                int length = e2.length;
                                boolean z = false;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < length) {
                                        if (!aucu.contains(aiyu.a(e2[i2]))) {
                                            break;
                                        }
                                        i2++;
                                    } else {
                                        z = true;
                                        break;
                                    }
                                }
                                ((aiys) aiyy).c = Boolean.valueOf(z);
                                ((aiys) aiyy).d = aucu;
                                ((aiys) aiyy).b.signalAll();
                            }
                        } finally {
                            aiys.a.unlock();
                        }
                    }
                    if (this.d != null) {
                        this.g.a((Runnable) new aiyv(this, arnt));
                    }
                }
            }
        } finally {
            this.f.readLock().unlock();
        }
    }

    public final boolean a(arij arij) {
        ReadWriteLock readWriteLock;
        try {
            this.f.readLock().lock();
            arnh arnh = this.i;
            if (arnh != null) {
                arnk a2 = arnh.a(112, 1, (audx) arij);
                if (a2 != null) {
                    int intValue = ((Integer) a2.get(1, TimeUnit.SECONDS)).intValue();
                    if (intValue != 0) {
                        StringBuilder sb = new StringBuilder(61);
                        sb.append("Failed to send message to nanoapp: request result=");
                        sb.append(intValue);
                        sb.toString();
                    } else {
                        this.f.readLock().unlock();
                        return true;
                    }
                }
                this.h.a(aico.CHRE_AR_MSG_FAILURE);
                readWriteLock = this.f;
            } else {
                readWriteLock = this.f;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() == 0) {
                new String("Failed to send message to nanoapp: ");
            } else {
                "Failed to send message to nanoapp: ".concat(valueOf);
            }
        } catch (Throwable th) {
            this.f.readLock().unlock();
            throw th;
        }
        readWriteLock.readLock().unlock();
        return false;
    }
}
