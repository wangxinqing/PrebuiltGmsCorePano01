package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: ajex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajex extends ajgs implements ajeu {
    public ajfk a;
    private final ajfq b;
    private final jiq c;
    private ajgx d;
    private final ajeg e;

    public ajex(ajfq ajfq, jiq jiq, ajeg ajeg) {
        super("Mon");
        this.b = ajfq;
        this.c = jiq;
        this.e = ajeg;
    }

    public final void a() {
        Sensor defaultSensor;
        if (this.b.i()) {
            jjg jjg = ajfj.a;
            if (this.d == null) {
                if (!ayek.y()) {
                    this.d = new ajgw(ayek.p());
                } else {
                    this.d = ajgn.a("ea_q_s", this.c, ayek.a.a().seismicShakeThrottlerConfig(), (Executor) new jls((Handler) this.h.b));
                }
            }
            ajeg ajeg = this.e;
            ajfj ajfj = ajeg.a;
            ajfk ajfk = new ajfk(ajfj.b, ajfj.d, ajeg.b, ajfj.c.a(7));
            this.a = ajfk;
            ajfk.e = (SensorManager) ajfk.a.getSystemService("sensor");
            SensorManager sensorManager = ajfk.e;
            if (sensorManager != null && (defaultSensor = sensorManager.getDefaultSensor(1)) != null) {
                qvr qvr = new qvr(ajfk.b.getLooper());
                try {
                    boolean registerListener = ajfk.e.registerListener(ajfk, defaultSensor, (int) (TimeUnit.SECONDS.toMicros(1) / ayek.e()), qvr);
                } catch (IllegalStateException e2) {
                }
            }
        }
    }

    public final void b() {
        ajfk ajfk = this.a;
        if (ajfk != null) {
            SensorManager sensorManager = ajfk.e;
            if (sensorManager != null) {
                sensorManager.unregisterListener(ajfk);
            }
            this.a = null;
        }
    }

    public final arus f() {
        ajfk ajfk = this.a;
        if (ajfk != null) {
            return ajfk.c;
        }
        return null;
    }

    public final boolean a(Message message) {
        int i = message.what;
        if (i == 7) {
            jjg jjg = ajfj.a;
            if (!this.d.a(new ajew(this, message))) {
                this.h.b.a(9);
            }
            return false;
        } else if (i == 12 || !this.h.b.hasMessages(10)) {
            return false;
        } else {
            Message obtainMessage = this.h.b.obtainMessage(message.what);
            obtainMessage.setData(message.getData());
            this.h.b.sendMessageDelayed(obtainMessage, ayek.o() / 2);
            jjg jjg2 = ajfj.a;
            int i2 = message.what;
            return true;
        }
    }
}
