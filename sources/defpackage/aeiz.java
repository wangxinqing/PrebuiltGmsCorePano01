package defpackage;

import android.bluetooth.BluetoothGatt;
import android.os.Build;
import com.google.android.libraries.bluetooth.BluetoothException;
import java.util.Locale;

/* renamed from: aeiz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeiz extends aekj {
    final /* synthetic */ aejw a;
    final /* synthetic */ aejb b;
    final /* synthetic */ aejf c;
    private final Object d = new Object();
    private boolean e = false;
    private aejx f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aeiz(aejf aejf, Object[] objArr, aejw aejw, aejb aejb) {
        super(objArr);
        this.c = aejf;
        this.a = aejw;
        this.b = aejb;
    }

    public final void a() {
        synchronized (this.d) {
            if (!this.e) {
                aejx aejx = null;
                if (Build.VERSION.SDK_INT < 23) {
                    aejw aejw = this.a;
                    BluetoothGatt connectGatt = aejw.a.connectGatt(this.c.d, this.b.a(), this.c.b.b);
                    if (connectGatt != null) {
                        aejx = aejx.a(connectGatt);
                    }
                } else {
                    aejw aejw2 = this.a;
                    BluetoothGatt connectGatt2 = aejw2.a.connectGatt(this.c.d, this.b.a(), this.c.b.b, 2);
                    if (connectGatt2 != null) {
                        aejx = aejx.a(connectGatt2);
                    }
                }
                if (aejx != null) {
                    try {
                        amri c2 = this.b.c();
                        if (c2.a()) {
                            int intValue = ((Integer) c2.b()).intValue();
                            long currentTimeMillis = System.currentTimeMillis();
                            while (!aejx.a(intValue)) {
                                if (System.currentTimeMillis() - currentTimeMillis <= this.b.b()) {
                                    Thread.sleep(5);
                                } else {
                                    throw new BluetoothException(String.format(Locale.US, "Failed to set connectionPriority after %dms.", new Object[]{Long.valueOf(this.b.b())}));
                                }
                            }
                        }
                        this.c.c.put(aejx, new aeiy(aejx, this.c.e, this.b));
                        this.f = aejx;
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        throw new BluetoothException("connect() operation interrupted.");
                    } catch (Exception e3) {
                        aejx.d();
                        aejx.e();
                        throw e3;
                    }
                } else {
                    throw new BluetoothException("connectGatt() returned null.");
                }
            }
        }
    }

    public final void c() {
        synchronized (this.d) {
            if (!this.e) {
                this.e = true;
                aejx aejx = this.f;
                if (aejx != null) {
                    this.c.c.remove(aejx);
                    aejx.d();
                    aejx.e();
                }
            }
        }
    }
}
