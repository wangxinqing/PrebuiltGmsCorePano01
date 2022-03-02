package defpackage;

import android.hardware.location.ContextHubManager;
import android.hardware.location.NanoAppInstanceInfo;
import android.os.Handler;
import java.util.Locale;

/* renamed from: arns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arns extends arnq implements arne, arnh {
    public final long a;
    public final int b;
    public final ContextHubManager c;
    public final arnd d;
    public final Object e = new Object();
    public volatile boolean f;
    public volatile NanoAppInstanceInfo g;
    private final aipf h;

    public arns(long j, int i, ContextHubManager contextHubManager, arnd arnd, aipf aipf, Handler handler) {
        super(handler);
        if (contextHubManager != null) {
            this.a = j;
            this.b = i;
            this.c = contextHubManager;
            this.d = arnd;
            this.h = aipf;
            return;
        }
        throw new IllegalArgumentException("'contextHubManager' cannot be null.");
    }

    public final long a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        Integer num;
        arnr arnr = (arnr) this.d;
        int i = -1;
        if (arnr.n) {
            Integer b2 = arnr.j.b(arnr.f, this);
            if (b2 == null) {
                String valueOf = String.valueOf(Long.toHexString(this.a));
                if (valueOf.length() == 0) {
                    new String("Cannot fetch version for AppId=0x");
                } else {
                    "Cannot fetch version for AppId=0x".concat(valueOf);
                }
            }
            if (b2 != null) {
                i = b2.intValue();
            }
            num = Integer.valueOf(i);
        } else {
            if (!this.f) {
                synchronized (this.e) {
                    if (!this.f) {
                        this.g = this.c.getNanoAppInstanceInfo(this.b);
                        this.f = true;
                    }
                }
            }
            NanoAppInstanceInfo nanoAppInstanceInfo = this.g;
            if (nanoAppInstanceInfo == null) {
                Locale locale = Locale.ENGLISH;
                Object[] objArr = {Long.valueOf(this.a), Integer.valueOf(this.b)};
                num = -1;
            } else {
                num = Integer.valueOf(nanoAppInstanceInfo.getAppVersion());
            }
        }
        return num.intValue();
    }

    public final arnk a(int i, int i2, audx audx) {
        return a(i, i2, audx != null ? audx.k() : null);
    }

    public final void b(arne arne) {
        d(arne);
    }

    public final arnk a(int i, int i2, byte[] bArr) {
        aipf aipf = this.h;
        if (aipf != null && aydr.b()) {
            aipf.a(this, i, 2);
        }
        arnr arnr = (arnr) this.d;
        if (!arnr.n) {
            arnz arnz = arnr.i;
            int i3 = arnr.g;
            int i4 = this.b;
            if (bArr != null && bArr.length > 2044) {
                throw new IllegalArgumentException("Invalid message length, it must be in the range (0,2044 ]");
            }
            arob arob = new arob(arnz, arnz.j, i3, i4, i, i2, bArr);
            arnz.b.execute(arob);
            return arob;
        }
        return arnr.j.a(arnr.f, this, i, i2, bArr);
    }

    public final void b(arne arne, Handler handler) {
        a(32, arne, handler);
    }

    public arns(long j, ContextHubManager contextHubManager, arnd arnd, aipf aipf, Handler handler) {
        super(handler);
        if (contextHubManager == null) {
            throw new IllegalArgumentException("'contextHubManager' cannot be null.");
        } else if (arnd != null) {
            this.a = j;
            this.b = -1;
            this.c = contextHubManager;
            this.d = arnd;
            this.h = aipf;
        } else {
            throw new IllegalArgumentException("'contextHub' cannot be null.");
        }
    }

    public arns(NanoAppInstanceInfo nanoAppInstanceInfo, ContextHubManager contextHubManager, arnd arnd, aipf aipf, Handler handler) {
        super(handler);
        if (contextHubManager != null) {
            long appId = nanoAppInstanceInfo.getAppId();
            int handle = nanoAppInstanceInfo.getHandle();
            this.a = appId;
            this.b = handle;
            this.c = contextHubManager;
            this.d = arnd;
            this.g = nanoAppInstanceInfo;
            this.h = aipf;
            this.f = true;
            return;
        }
        throw new IllegalArgumentException("'contextHubManager' cannot be null.");
    }

    public final void a(arnd arnd, arnh arnh, arnt arnt) {
        a(arnt.a, arnd, arnh, arnt);
    }

    public final void a(arne arne) {
        c(arne);
    }

    public final void a(arne arne, Handler handler) {
        c(arne, handler);
    }
}
