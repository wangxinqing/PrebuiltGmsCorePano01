package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.smartdevice.d2d.data.DeviceStatus;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.utils.ProxyResultReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: abnu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class abnu implements acpr, abwl {
    public static final acpz a = acqa.a("D2D", "BaseDirectTransferController");
    public final ExecutorService b = jfm.a(9);
    public abwj c;
    public abwi d = abwi.a;
    public boolean e = false;
    protected final Handler f;
    public abwa g;
    private final Executor h;
    private final aora i;
    private final aora j = new abnr(this);
    private final Runnable k = new abns(this);

    public abnu(Handler handler) {
        this.f = handler;
        this.h = new jls(handler);
        this.i = new abnp(this);
    }

    static ResultReceiver a(Bundle bundle, String str) {
        bundle.setClassLoader(ProxyResultReceiver.class.getClassLoader());
        return (ResultReceiver) bundle.getParcelable(str);
    }

    private final aorr d(byte[] bArr) {
        abwa abwa;
        acpv e2 = e();
        if (!this.e || (abwa = this.g) == null) {
            return e2.a(bArr);
        }
        List<byte[]> a2 = abwa.a(bArr);
        a.a("Split message of %d bytes into %d packets", Integer.valueOf(bArr.length), Integer.valueOf(a2.size()));
        ArrayList arrayList = new ArrayList();
        for (byte[] a3 : a2) {
            arrayList.add(e2.a(a3));
        }
        return aorl.a((Iterable) arrayList);
    }

    /* access modifiers changed from: protected */
    public abstract void a(int i2, String str);

    /* access modifiers changed from: protected */
    public abstract void a(MessagePayload messagePayload);

    public final void b() {
        this.c = null;
    }

    /* access modifiers changed from: protected */
    public abstract void c();

    /* access modifiers changed from: protected */
    public final void c(int i2) {
        this.e = true;
        if (this.g == null) {
            this.g = new abwa(new abnt(this), i2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void d();

    /* access modifiers changed from: protected */
    public abstract acpv e();

    public void a() {
        b();
        this.e = false;
        this.g = null;
    }

    /* access modifiers changed from: protected */
    public final void b(int i2) {
        int i3;
        if (i2 == 10564) {
            i3 = 1;
        } else {
            i3 = 3;
        }
        DeviceStatus deviceStatus = new DeviceStatus();
        deviceStatus.a(i2);
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.a(i3);
        messagePayload.a(deviceStatus);
        b(messagePayload);
    }

    public final void c(byte[] bArr) {
        boolean z;
        byte[] bArr2;
        abwj abwj = this.c;
        if (abwj != null) {
            if (bArr.length != 0) {
                MessagePayload messagePayload = new MessagePayload();
                try {
                    messagePayload.e(bArr);
                    z = messagePayload.b > 0;
                } catch (acpi e2) {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!abwj.e && z && (abwj.b.d & 1) != 0) {
                a.d("A bootstrap message was sent during the encryption phase. As unencrypted communications are supported, we are aborting the encryption process.", new Object[0]);
                b();
                d();
            } else {
                Future future = abwj.d;
                abwi abwi = null;
                if (future != null) {
                    future.cancel(true);
                    abwj.d = null;
                }
                try {
                    abwk abwk = abwj.b;
                    if (abwk.e >= 0) {
                        abwn abwn = abwk.f;
                        if (abwn != null) {
                            if (abwn.f != null) {
                                if (abwn.d == 11) {
                                    if (Arrays.equals(bArr, abwn.b)) {
                                        abwi = new abwm(abwn.f);
                                    } else {
                                        String arrays = Arrays.toString(abwn.b);
                                        String arrays2 = Arrays.toString(bArr);
                                        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 88 + String.valueOf(arrays2).length());
                                        sb.append("Unexpected message during final step of Ukey2HandshakeHandler. Expected: ");
                                        sb.append(arrays);
                                        sb.append(" but recieved: ");
                                        sb.append(arrays2);
                                        String sb2 = sb.toString();
                                        abwn.a.e(sb2, new Object[0]);
                                        throw new SecurityException(sb2);
                                    }
                                }
                            }
                            if (abwn.e.d() == 1) {
                                abwn.e.a(bArr);
                                if (abwn.e.d() == 1) {
                                    bArr2 = abwn.e.a();
                                    if (abwn.e.d() == 1) {
                                        abwn.c.a(bArr2);
                                    }
                                } else {
                                    bArr2 = null;
                                }
                                abwn.e.a(4);
                                abwn.e.b();
                                abwn.f = abwn.e.c();
                                if (bArr2 != null) {
                                    abwn.c.a(bArr2);
                                }
                                if (abwn.d == 12) {
                                    abwn.c.a(abwn.b);
                                    abwi = new abwm(abwn.f);
                                }
                            }
                        } else {
                            throw new ausp("Unexpected message");
                        }
                    } else if (bArr.length == 1) {
                        int highestOneBit = Integer.highestOneBit(bArr[0] & abwk.d);
                        abwk.e = highestOneBit;
                        if (abwk.c == 11) {
                            abwk.b.a(new byte[]{(byte) highestOneBit});
                        }
                        int i2 = abwk.e;
                        if (i2 == 1) {
                            abwk.a.a("Negotiated no encryption", new Object[0]);
                            abwi = abwi.a;
                        } else if (i2 == 8) {
                            abwk.a.a("Negotiated and starting Ukey2 encryption", new Object[0]);
                            abwk.f = new abwn(abwk.b, abwk.c);
                            abwn abwn2 = abwk.f;
                            if (abwn2.d == 11) {
                                abwn2.e = auta.a(ausy.a);
                                abwn2.c.a(abwn2.e.a());
                            } else {
                                abwn2.e = auta.b(ausy.a);
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder(35);
                            sb3.append("Unknown encryption type ");
                            sb3.append(i2);
                            throw new ausp(sb3.toString());
                        }
                    } else {
                        throw new ausp("Expected first encryption message to be one byte in length");
                    }
                } catch (ausp | ausx e3) {
                    abwj.e = true;
                    aora aora = abwj.c;
                    if (aora != null) {
                        aora.a(e3);
                    }
                }
                if (abwi != null) {
                    abwj.e = true;
                    aora aora2 = abwj.c;
                    if (aora2 != null) {
                        aora2.a((Object) abwi);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        try {
            try {
                MessagePayload a2 = acdz.a(this.d.b(bArr));
                if (a2 == null) {
                    a.e("MessagePayload is null", new Object[0]);
                    a(10555, "MessagePayload is null");
                    return;
                }
                if (azks.b()) {
                    a.a("Received %s", a2.c());
                } else {
                    acpz acpz = a;
                    String valueOf = String.valueOf(a2);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 15);
                    sb4.append("Received data! ");
                    sb4.append(valueOf);
                    acpz.a(sb4.toString(), new Object[0]);
                }
                if (abvx.a(a2.c)) {
                    int i3 = a2.c;
                    if (i3 == 2) {
                        c();
                    } else if (i3 == 1) {
                        a(10564, "Bootstrap canceled");
                    } else if (i3 != 3) {
                        acpz acpz2 = a;
                        StringBuilder sb5 = new StringBuilder(45);
                        sb5.append("Unknown state from remote device: ");
                        sb5.append(i3);
                        acpz2.e(sb5.toString(), new Object[0]);
                        a(10575, "Unknown remote device error");
                    } else {
                        a(10575, "Remote device error");
                    }
                } else {
                    a(a2);
                }
            } catch (acpi e4) {
                a(10589, e4.toString());
            }
        } catch (SecurityException e5) {
            a(10587, e5.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.a(i2);
        b(messagePayload);
    }

    /* access modifiers changed from: protected */
    public final void a(abwj abwj, boolean z) {
        this.c = abwj;
        abwj.c = this.j;
        abwj.e = false;
        abwk abwk = abwj.b;
        if (abwk.c == 12) {
            abwk.b.a(new byte[]{abwk.d});
        }
        if (z) {
            Runnable runnable = this.k;
            long q = azlf.a.a().q();
            abwj.d = abwj.a.schedule(runnable, (long) ((int) q), TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(MessagePayload messagePayload) {
        if (azks.b()) {
            a.b("Sending %s", messagePayload.c());
        }
        a(messagePayload.h());
    }

    public void b(byte[] bArr) {
        this.f.post(new abnq(this, bArr));
    }

    /* access modifiers changed from: package-private */
    public final void a(aora aora, MessagePayload... messagePayloadArr) {
        ArrayList arrayList = new ArrayList();
        int length = messagePayloadArr.length;
        int i2 = 0;
        while (i2 < length) {
            MessagePayload messagePayload = messagePayloadArr[i2];
            if (azks.b()) {
                a.b("Sending %s", messagePayload.c());
            }
            try {
                arrayList.add(d(this.d.a(messagePayload.h())));
                i2++;
            } catch (SecurityException e2) {
                a.e("Error encrypting MessagePayload.", e2, new Object[0]);
                a(10588, "Error encrypting MessagePayload.");
                return;
            }
        }
        aorl.a(aorl.a((Iterable) arrayList), aora, this.h);
    }

    public final void a(String str) {
        a.a("pipe read error %s", str);
        String valueOf = String.valueOf(str);
        a(10576, valueOf.length() == 0 ? new String("Error thrown in the reading pipe: ") : "Error thrown in the reading pipe: ".concat(valueOf));
    }

    public void a(byte[] bArr) {
        try {
            aorl.a(d(this.d.a(bArr)), this.i, this.h);
        } catch (SecurityException e2) {
            a.e("Error encrypting MessagePayload.", e2, new Object[0]);
            a(10588, "Error encrypting MessagePayload.");
        }
    }
}
