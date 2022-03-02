package defpackage;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* renamed from: bmd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bmd implements Runnable {
    public final Intent a;
    public final IntentOperation b;
    public final bmi c;
    public final boolean d;
    public final Object e;
    public final long f;
    final /* synthetic */ bme g;

    public bmd(bme bme, Intent intent, IntentOperation intentOperation, bmi bmi, boolean z, Object obj, long j) {
        this.g = bme;
        this.a = intent;
        this.b = intentOperation;
        this.c = bmi;
        this.d = z;
        this.e = obj;
        this.f = j;
    }

    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        bme bme = this.g;
        bmh bmh = bme.a;
        Intent intent = new Intent(this.a);
        try {
            bmi bmi = this.c;
            IntentOperation intentOperation = this.b;
            boolean z6 = true;
            int i = bmh.a & 1;
            amtf.a(!bmi.f.f.isHeldByCurrentThread());
            synchronized (bmi.c) {
                synchronized (bmi) {
                    if (bmi.e <= 0 || bmi.d != intentOperation) {
                        z = false;
                    } else {
                        z = true;
                    }
                    amtf.a(z);
                }
                intent.setExtrasClassLoader(intentOperation.getClassLoader());
                if (i == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                intentOperation.onHandleIntent(intent, z2);
            }
            Object obj = this.e;
            if (obj != null) {
                this.g.f.d.e.a(obj);
            }
            bmi bmi2 = this.c;
            IntentOperation intentOperation2 = this.b;
            amtf.a(!bmi2.f.f.isHeldByCurrentThread());
            synchronized (bmi2.c) {
                synchronized (bmi2) {
                    if (bmi2.e <= 0 || bmi2.d != intentOperation2) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    amtf.a(z3);
                    int i2 = bmi2.e - 1;
                    bmi2.e = i2;
                    if (i2 == 0) {
                        bmi2.d = null;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    bmi2.f.l.a(intentOperation2);
                }
            }
            this.g.f.d.f.lock();
            try {
                if (this.g.f.b.peek() == bme) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                amtf.a(z5);
                if (this.d) {
                    bmh.b();
                }
                bme.c--;
                if (!bme.b.isEmpty()) {
                    bme.f.a();
                } else if (bme.e && bme.c == 0) {
                    bme.f.b();
                }
                if (this.g.f.d.h <= 0) {
                    z6 = false;
                }
                amtf.a(z6);
                bml.a(this.g.f.d);
                this.g.f.d.l.a();
            } finally {
                this.g.f.d.f.unlock();
            }
        } catch (RuntimeException e2) {
            try {
                if (this.g.f.d.m) {
                    bmi bmi3 = this.c;
                    String a2 = bml.a(bmi3.a, bmi3.b.getName());
                    this.g.f.d.f.lock();
                    this.g.f.d.l.a(bmh, a2);
                    this.g.f.d.f.unlock();
                }
                throw e2;
            } catch (Throwable th) {
                this.g.f.d.f.unlock();
                throw th;
            }
        }
    }
}
