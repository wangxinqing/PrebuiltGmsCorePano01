package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.BluetoothGattException;
import com.google.android.libraries.bluetooth.BluetoothTimeoutException;
import com.google.android.libraries.bluetooth.fastpair.ConnectException;
import com.google.android.libraries.bluetooth.fastpair.CreateBondException;
import com.google.android.libraries.bluetooth.util.BluetoothOperationExecutor$BluetoothOperationTimeoutException;
import java.util.ArrayDeque;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: ttu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ttu {
    public final tgj a = new tgj(3, ttq.a);
    public BluetoothDevice b;
    private final int c = (new Random().nextInt(2147483646) + 1);
    private final int d;
    private final String e;
    private final tgk f;
    private final ArrayDeque g = new ArrayDeque(amzy.a((Object) ttt.f().a()));
    private aucd h = askx.m.o();

    public ttu(String str, String str2, Context context) {
        int i;
        tgk tgk = new tgk(context);
        try {
            i = Integer.parseInt(str, 16);
        } catch (IllegalArgumentException e2) {
            anih anih = (anih) tsp.a.c();
            anih.a((Throwable) e2);
            anih.a("Expected 3-byte hex model ID %s", (Object) str);
            i = 0;
        }
        this.d = i;
        this.e = str2;
        this.f = tgk;
        this.a.c = new ttr(new arxg(context));
    }

    /* access modifiers changed from: package-private */
    public final void a(aspb aspb) {
        tts f2 = ttt.f();
        f2.a(aspb);
        a(f2.a());
    }

    /* access modifiers changed from: package-private */
    public final aucd b(ttt ttt) {
        this.g.push(ttt);
        aucd o = askx.m.o();
        this.h = o;
        return o;
    }

    /* access modifiers changed from: package-private */
    public final void a(Throwable th) {
        if (aymw.d()) {
            if ((th instanceof ExecutionException) && th.getCause() != null) {
                th = th.getCause();
            }
            if ((th instanceof BluetoothException) && (th.getCause() instanceof BluetoothGattException)) {
                th = th.getCause();
            }
            int i = 2;
            if (th instanceof BluetoothGattException) {
                BluetoothGattException bluetoothGattException = (BluetoothGattException) th;
                aucd aucd = this.h;
                askv askv = ((askx) aucd.b).e;
                if (askv == null) {
                    askv = askv.c;
                }
                aucd aucd2 = (aucd) askv.c(5);
                aucd2.a((aucj) askv);
                int i2 = bluetoothGattException.a;
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                askv askv2 = (askv) aucd2.b;
                askv2.a |= 1;
                askv2.b = i2;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                askx askx = (askx) aucd.b;
                askv askv3 = (askv) aucd2.i();
                askx askx2 = askx.m;
                askv3.getClass();
                askx.e = askv3;
                askx.a |= 8;
            } else if (th instanceof CreateBondException) {
                CreateBondException createBondException = (CreateBondException) th;
                aucd aucd3 = this.h;
                askt askt = ((askx) aucd3.b).g;
                if (askt == null) {
                    askt = askt.d;
                }
                aucd aucd4 = (aucd) askt.c(5);
                aucd4.a((aucj) askt);
                int i3 = createBondException.b;
                if (aucd4.c) {
                    aucd4.c();
                    aucd4.c = false;
                }
                askt askt2 = (askt) aucd4.b;
                int i4 = i3 - 1;
                if (i3 != 0) {
                    askt2.b = i4;
                    int i5 = askt2.a | 1;
                    askt2.a = i5;
                    int i6 = createBondException.a;
                    askt2.a = i5 | 2;
                    askt2.c = i6;
                    if (aucd3.c) {
                        aucd3.c();
                        aucd3.c = false;
                    }
                    askx askx3 = (askx) aucd3.b;
                    askt askt3 = (askt) aucd4.i();
                    askx askx4 = askx.m;
                    askt3.getClass();
                    askx3.g = askt3;
                    askx3.a |= 32;
                } else {
                    throw null;
                }
            } else if (th instanceof ConnectException) {
                ConnectException connectException = (ConnectException) th;
                aucd aucd5 = this.h;
                asks asks = ((askx) aucd5.b).h;
                if (asks == null) {
                    asks = asks.d;
                }
                aucd aucd6 = (aucd) asks.c(5);
                aucd6.a((aucj) asks);
                int i7 = connectException.a;
                if (aucd6.c) {
                    aucd6.c();
                    aucd6.c = false;
                }
                asks asks2 = (asks) aucd6.b;
                int i8 = i7 - 1;
                if (i7 != 0) {
                    asks2.b = i8;
                    asks2.a |= 1;
                    if (aucd5.c) {
                        aucd5.c();
                        aucd5.c = false;
                    }
                    askx askx5 = (askx) aucd5.b;
                    asks asks3 = (asks) aucd6.i();
                    askx askx6 = askx.m;
                    asks3.getClass();
                    askx5.h = asks3;
                    askx5.a |= 64;
                } else {
                    throw null;
                }
            } else if (th instanceof aeig) {
                aeig aeig = (aeig) th;
                aucd aucd7 = this.h;
                askr askr = ((askx) aucd7.b).f;
                if (askr == null) {
                    askr = askr.c;
                }
                aucd aucd8 = (aucd) askr.c(5);
                aucd8.a((aucj) askr);
                int i9 = aeig.a;
                if (aucd8.c) {
                    aucd8.c();
                    aucd8.c = false;
                }
                askr askr2 = (askr) aucd8.b;
                int i10 = i9 - 1;
                if (i9 != 0) {
                    askr2.b = i10;
                    askr2.a |= 1;
                    if (aucd7.c) {
                        aucd7.c();
                        aucd7.c = false;
                    }
                    askx askx7 = (askx) aucd7.b;
                    askr askr3 = (askr) aucd8.i();
                    askx askx8 = askx.m;
                    askr3.getClass();
                    askx7.f = askr3;
                    askx7.a |= 16;
                } else {
                    throw null;
                }
            }
            aucd aucd9 = this.h;
            if (th == null) {
                i = 1;
            } else if ((th instanceof TimeoutException) || (th instanceof BluetoothTimeoutException) || (th instanceof BluetoothOperationExecutor$BluetoothOperationTimeoutException)) {
                i = 3;
            } else if (th instanceof InterruptedException) {
                i = 4;
            } else if (th instanceof aeid) {
                i = 5;
            } else if (th instanceof ExecutionException) {
                i = 6;
            } else if (th instanceof aehv) {
                i = 7;
            }
            if (aucd9.c) {
                aucd9.c();
                aucd9.c = false;
            }
            askx askx9 = (askx) aucd9.b;
            askx askx10 = askx.m;
            askx9.d = i - 1;
            askx9.a |= 4;
            b();
        }
    }

    public final void b() {
        int i;
        if (aymw.d()) {
            ttt ttt = (ttt) this.g.pop();
            if (ttt.a() == aspb.UNKNOWN_EVENT_TYPE) {
                ((anih) tsp.a.c()).a("Analytics: Unexpected log without an event code. Logging anyway.");
            }
            BluetoothDevice bluetoothDevice = this.b;
            if (bluetoothDevice != null) {
                aucd aucd = this.h;
                switch (bluetoothDevice.getBondState()) {
                    case 10:
                        i = 11;
                        break;
                    case 11:
                        i = 12;
                        break;
                    case 12:
                        i = 13;
                        break;
                    default:
                        i = 1;
                        break;
                }
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                askx askx = (askx) aucd.b;
                askx askx2 = askx.m;
                askx.c = i - 1;
                askx.a |= 2;
            }
            String str = this.e;
            if (str != null) {
                aucd aucd2 = this.h;
                long a2 = this.f.a(str);
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                askx askx3 = (askx) aucd2.b;
                askx askx4 = askx.m;
                askx3.a |= 128;
                askx3.i = a2;
            }
            aucd aucd3 = this.h;
            aucd o = askw.c.o();
            int d2 = ttt.d();
            if (o.c) {
                o.c();
                o.c = false;
            }
            askw askw = (askw) o.b;
            askw.a |= 1;
            askw.b = d2;
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            askx askx5 = (askx) aucd3.b;
            askw askw2 = (askw) o.i();
            askx askx6 = askx.m;
            askw2.getClass();
            askx5.k = askw2;
            askx5.a |= 512;
            long elapsedRealtime = SystemClock.elapsedRealtime() - ttt.b();
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            askx askx7 = (askx) aucd3.b;
            askx7.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            askx7.j = elapsedRealtime;
            if (aymz.b() && aymw.J()) {
                aucd aucd4 = this.h;
                aucd o2 = asku.c.o();
                int e2 = ttt.e();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                asku asku = (asku) o2.b;
                asku.a |= 1;
                asku.b = e2;
                asku asku2 = (asku) o2.i();
                if (aucd4.c) {
                    aucd4.c();
                    aucd4.c = false;
                }
                askx askx8 = (askx) aucd4.b;
                asku2.getClass();
                askx8.l = asku2;
                askx8.a |= 1024;
            }
            aucd aucd5 = this.h;
            int i2 = this.d;
            if (aucd5.c) {
                aucd5.c();
                aucd5.c = false;
            }
            askx askx9 = (askx) aucd5.b;
            askx9.a = 1 | askx9.a;
            askx9.b = i2;
            askx askx10 = (askx) aucd5.i();
            if (!aynf.b() || !((anih) tsp.a.d()).l()) {
                jjg jjg = tsp.a;
                ttt.a();
            } else {
                ((anih) tsp.a.d()).a("Analytics: Logging event %s %s", (Object) ttt.a(), (Object) tsp.a(askx10));
            }
            this.a.a(askx10, ttt.a().L, this.c);
            if (this.g.isEmpty()) {
                b(aspb.UNKNOWN_EVENT_TYPE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(aspb aspb) {
        tts f2 = ttt.f();
        f2.a(aspb);
        b(f2.a());
    }

    public final void a(ttt ttt) {
        b(ttt);
        Throwable th = ((ttv) ttt).a;
        if (th != null) {
            a(th);
        } else {
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        ttt ttt = (ttt) this.g.peek();
        return (ttt == null || ttt.a() == aspb.UNKNOWN_EVENT_TYPE) ? false : true;
    }
}
