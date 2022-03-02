package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothSocket;
import android.os.Looper;
import com.google.android.gms.R;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;
import java.io.IOException;
import java.security.SignatureException;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* renamed from: gkr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gkr extends gkn {
    private static final iwd b = new iwd("D2D", "BluetoothConnectionCreationTask");
    final /* synthetic */ SourceChimeraActivity a;
    private final BluetoothAdapter c;
    private final UUID d;
    private final String e;
    private BluetoothSocket f;
    private boolean g = false;

    public gkr(SourceChimeraActivity sourceChimeraActivity, BluetoothAdapter bluetoothAdapter, UUID uuid, String str) {
        this.a = sourceChimeraActivity;
        iva.a((Object) bluetoothAdapter);
        this.c = bluetoothAdapter;
        iva.a((Object) uuid);
        this.d = uuid;
        iva.c(str);
        this.e = str;
    }

    public final void a() {
        BluetoothSocket bluetoothSocket;
        if (!this.g && (bluetoothSocket = this.f) != null) {
            try {
                bluetoothSocket.close();
            } catch (IOException e2) {
                b.a((Throwable) e2);
            }
        }
    }

    public final void run() {
        try {
            this.f = this.c.getRemoteDevice(this.e).createInsecureRfcommSocketToServiceRecord(this.d);
            b.b("Creating Bluetooth connection....", new Object[0]);
            this.f.connect();
            b.b("Created Bluetooth connection.", new Object[0]);
            this.g = true;
            a(new gkq(this.f));
        } catch (IOException e2) {
            b.d("Failed to create Bluetooth connection.", e2, new Object[0]);
            a();
            this.a.finish();
        }
    }

    public final void a(gkq gkq) {
        SourceChimeraActivity.a.b("Bluetooth connection created.", new Object[0]);
        SourceChimeraActivity sourceChimeraActivity = this.a;
        sourceChimeraActivity.o = gkq;
        String name = sourceChimeraActivity.c.getRemoteDevice(sourceChimeraActivity.k.c).getName();
        if (name == null) {
            name = this.a.getString(R.string.auth_d2d_source_unknown_device_name);
        }
        aucd o = gkt.h.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        gkt.a((gkt) o.b);
        SourceChimeraActivity sourceChimeraActivity2 = this.a;
        if (sourceChimeraActivity2.d) {
            if (!sourceChimeraActivity2.f) {
                String string = sourceChimeraActivity2.getString(R.string.auth_d2d_target_wait_progress_message);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                gkt gkt = (gkt) o.b;
                string.getClass();
                gkt.a |= 2;
                gkt.b = string;
            } else {
                String string2 = sourceChimeraActivity2.getString(R.string.auth_d2d_target_tap_progress_message);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                gkt gkt2 = (gkt) o.b;
                string2.getClass();
                gkt2.a |= 2;
                gkt2.b = string2;
            }
        } else if (sourceChimeraActivity2.e) {
            String string3 = sourceChimeraActivity2.getString(R.string.auth_d2d_target_unlock_progress_message);
            if (o.c) {
                o.c();
                o.c = false;
            }
            gkt gkt3 = (gkt) o.b;
            string3.getClass();
            gkt3.a |= 2;
            gkt3.b = string3;
        } else {
            String string4 = sourceChimeraActivity2.getString(R.string.auth_d2d_target_tap_progress_message);
            if (o.c) {
                o.c();
                o.c = false;
            }
            gkt gkt4 = (gkt) o.b;
            string4.getClass();
            gkt4.a |= 2;
            gkt4.b = string4;
        }
        try {
            SourceChimeraActivity sourceChimeraActivity3 = this.a;
            gjy gjy = sourceChimeraActivity3.t;
            sourceChimeraActivity3.s = gkb.a(sourceChimeraActivity3.o, new gkm(sourceChimeraActivity3, name), this.a.k.d.k(), (gkt) o.i());
        } catch (SignatureException e2) {
            SourceChimeraActivity.a.a((Throwable) e2);
            this.a.finish();
        } catch (ausp e3) {
            SourceChimeraActivity.a.a((Throwable) e3);
            this.a.finish();
        }
        try {
            if (!((Boolean) this.a.l.get()).booleanValue()) {
                this.a.d();
                return;
            }
            new qvr(Looper.getMainLooper()).postDelayed(new gkj(this.a), ent.w());
        } catch (InterruptedException | ExecutionException e4) {
            SourceChimeraActivity.a.e("Exception while waiting for OK.", e4, new Object[0]);
        }
    }
}
