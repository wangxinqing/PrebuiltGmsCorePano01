package defpackage;

import android.os.Handler;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.data.DeviceStatus;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: abno  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class abno {
    public final iwd a;
    public final Handler b;
    protected final abnn c;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private boolean e = false;
    private abwa f;

    public abno(iwd iwd, Handler handler, abnn abnn) {
        this.a = iwd;
        this.b = handler;
        this.c = abnn;
    }

    /* access modifiers changed from: protected */
    public abstract abox a();

    /* access modifiers changed from: protected */
    public final void a(int i) {
        this.a.a("Packet mode enabled", new Object[0]);
        this.e = true;
        if (this.f == null) {
            this.f = new abwa(new abnm(this), i);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(MessagePayload messagePayload);

    /* access modifiers changed from: protected */
    public BootstrapCompletionResult b() {
        return null;
    }

    public abstract void b(int i);

    /* access modifiers changed from: protected */
    public void c() {
        this.c.a(b());
    }

    /* access modifiers changed from: protected */
    public void d() {
        abox a2 = a();
        if (a2 != null) {
            this.a.a("Disconnecting DeviceMessageSender.", new Object[0]);
            a2.a();
            return;
        }
        this.a.b("DeviceMessageSender has already been disconnected.", new Object[0]);
    }

    public void e() {
        this.e = false;
        this.f = null;
    }

    public final void b(MessagePayload messagePayload) {
        abwa abwa;
        abox a2 = a();
        if (a2 == null) {
            this.a.e("Tried to send message while DeviceMessageSender is null.", new Object[0]);
            b(10563);
            this.c.a(10563);
            return;
        }
        if (azks.b()) {
            this.a.b("Sending %s", messagePayload.c());
        }
        try {
            byte[] h = messagePayload.h();
            if (!this.e || (abwa = this.f) == null) {
                a2.a(h);
                return;
            }
            List<byte[]> a3 = abwa.a(h);
            this.a.a("Encoded message of %d bytes", Integer.valueOf(h.length));
            for (byte[] a4 : a3) {
                a2.a(a4);
            }
        } catch (IOException e2) {
            this.a.e("Error sending MessagePayload.", e2, new Object[0]);
            b(10563);
            this.c.a(10563);
        }
    }

    /* access modifiers changed from: protected */
    public final void c(int i) {
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.a(i);
        b(messagePayload);
    }

    public final void a(byte[] bArr) {
        abwa abwa;
        iwd iwd = this.a;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Received ");
        sb.append(length);
        sb.append(" bytes of data.");
        iwd.a(sb.toString(), new Object[0]);
        if (!this.e || (abwa = this.f) == null) {
            b(bArr);
            return;
        }
        abwa.b(bArr);
        this.a.a("processed data as a packet", new Object[0]);
    }

    /* access modifiers changed from: protected */
    public final void d(int i) {
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.a(3);
        DeviceStatus deviceStatus = new DeviceStatus();
        deviceStatus.a(i);
        messagePayload.a(deviceStatus);
        b(messagePayload);
    }

    public final void b(byte[] bArr) {
        try {
            MessagePayload a2 = acdz.a(bArr);
            if (a2 == null) {
                b(10555);
                this.c.a(10555);
            } else if (abvx.a(a2.c)) {
                int i = a2.c;
                if ((i == 2 || i == 4) && !this.d.getAndSet(true)) {
                    c();
                } else if (i == 1) {
                    b(10564);
                    this.c.a(10564);
                } else if (i == 3) {
                    DeviceStatus deviceStatus = a2.l;
                    b(10575);
                    if (deviceStatus == null) {
                        this.c.a(10575);
                    } else {
                        this.c.a(deviceStatus.a);
                    }
                }
            } else {
                a(a2);
            }
        } catch (acpi e2) {
            b(10589);
            this.c.a(10589);
        }
    }
}
